package mymain.tcp.multi;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyMain_MultiChatServer extends JFrame {

	JTextArea jta_display; // 출력창
	JTextField jtf_user_count;// 접속자수
	JList<String> jlist_user; // 접속자목록

	Font font = new Font("굴림체", Font.BOLD, 18);

	// 서버소켓
	ServerSocket server;

	// 자소켓을 포함한 수신쓰레드 객체를 담을 컬랙션
	List<ReadThread> socketList = new ArrayList<ReadThread>();

	// 접속자목록 저장할 객체
	List<String> userList = new ArrayList<String>();

	public MyMain_MultiChatServer() {
		// TODO Auto-generated constructor stub
		// 타이틀
		super("TCP멀티서버");

		// 출력창 초기화
		init_display();

		// 접속자수 초기화
		init_user_count();

		// 접속자목록 초기화
		init_user_list();

		// 서버 초기화
		init_server();

		// 위치
		super.setLocation(100, 100);

		// 크기
		pack();
		// super.setSize(300, 300);

		// 보여줘라
		super.setVisible(true);

		// 종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_server() {
		// TODO Auto-generated method stub
		try {

			server = new ServerSocket(8500);

			// 대기 쓰레드 생성/구동
			new Thread() {
				public void run() {
					while (true) {

						try {
							// 연결요청->자소켓생성->연결
							Socket child = server.accept();

							// 수신용쓰레드 객체생성
							ReadThread rt = new ReadThread(child);
							rt.start();

							socketList.add(rt);
							// 접속자수 갱신하는 메소드
							my_update_user_count();

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}.start();

			my_display_message("서버 구동중...");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	protected void my_update_user_count() {
		// TODO Auto-generated method stub
		jtf_user_count.setText(socketList.size() + "");

	}

	private void my_display_message(String message) {
		// TODO Auto-generated method stub
		jta_display.append(message + "\r\n");

		int position = jta_display.getDocument().getLength();
		jta_display.setCaretPosition(position);

	}

	private void init_user_list() {
		// TODO Auto-generated method stub
		jlist_user = new JList<String>();
		JScrollPane jsp = new JScrollPane(jlist_user);

		jsp.setPreferredSize(new Dimension(150, 0));

		jlist_user.setFont(font);

		this.add(jsp, "East");

	}

	private void init_user_count() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel(new GridLayout(1, 3));

		JLabel jlb_title = new JLabel("접속자수:", JLabel.RIGHT);
		jlb_title.setFont(font);

		jtf_user_count = new JTextField("0");
		jtf_user_count.setFont(font);
		jtf_user_count.setHorizontalAlignment(JTextField.CENTER);

		JLabel jlb_count = new JLabel("(명)");
		jlb_count.setFont(font);

		p.add(jlb_title);
		p.add(jtf_user_count);
		p.add(jlb_count);

		this.add(p, "South");
	}

	private void init_display() {
		// TODO Auto-generated method stub
		jta_display = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta_display);

		jsp.setPreferredSize(new Dimension(400, 400));

		this.add(jsp, "Center");

		// font설정
		jta_display.setFont(font);
		// 읽기전용
		jta_display.setEditable(false);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_MultiChatServer();
	}

//ReadThread Inner Type으로 선언
	class ReadThread extends Thread {

		Socket child;

		// 해당소켓이 읽을때 line단위로 읽기위해서 선언
		BufferedReader br = null;

		public ReadThread(Socket child) {
			super();
			this.child = child;

			try {
				// InputStream->InputStreamReader
				InputStreamReader isr = new InputStreamReader(child.getInputStream());
				// InputStreamReader->BufferedReader
				br = new BufferedReader(isr);

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (true) {

				try {

					String readStr = br.readLine();

					// 상대방 소켓이 close되면 발생(정상종료)
					if (readStr == null) {
						// System.out.println("--정상종료--");
						break;
					}

					// 서버 모니터
					my_display_message(readStr);

					// 입장시 : readStr = "IN#홍길동"
					String[] msg_array = readStr.split("#");
					// 0 1
					// msg_array = { "IN", "홍길동"};
					if (msg_array[0].equals("IN")) {
						userList.add(msg_array[1]);
						// 접속자 목록 갱신
						my_update_user_list();
					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					// System.out.println("--비정상종료--");
					break;
				}

			} // end-while

			// 퇴장상황..
			// socket , user 리스트 위치가 동일함

			int index = socketList.indexOf(this);

			// 나간 사람 이름 얻어내기
			String del_user_name = userList.get(index);

			// 사용자 퇴장시키기 (사용자명 삭제)
			userList.remove(index);

			my_update_user_list();

			socketList.remove(this);
			my_update_user_count();

		}

	}

	public void my_update_user_list() {
		// TODO Auto-generated method stub
		String[] user_array = new String[userList.size()];
		userList.toArray(user_array);
		jlist_user.setListData(user_array);

	}

}