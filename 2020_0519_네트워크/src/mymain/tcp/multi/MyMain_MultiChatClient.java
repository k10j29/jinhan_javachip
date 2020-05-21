package mymain.tcp.multi;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyMain_MultiChatClient extends JFrame {

	JTextArea jta_display; // 출력창
	JTextField jtf_message;// 접속자수
	JButton jbt_connect; // 연결 버튼

	Boolean bConnect = false; // 연결 상태 확인
	String user_name = "두두둥장";
	Socket client;

	JList<String> jlist_user; // 접속자목록

	Font font = new Font("굴림체", Font.BOLD, 18);

	public MyMain_MultiChatClient() {
		// TODO Auto-generated constructor stub
		// 타이틀
		super("TCP멀티클라이언트");

		// 출력창 초기화
		init_display();

		// 입력창 초기화
		init_input();

		// 접속자수 초기화
//		init_user_count();

		// 접속자목록 초기화
		init_user_list();

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

	private void init_input() {
		// TODO Auto-generated method stub

		JPanel p = new JPanel(new BorderLayout());

		jtf_message = new JTextField();
		jbt_connect = new JButton("연결");

		jbt_connect.setPreferredSize(new Dimension(150, 0));

		p.add(jtf_message, "Center");
		p.add(jbt_connect, "East");

		this.add(p, "South");

		// 연결, 또는 연결 끊기 버튼을 누르면
		jbt_connect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				bConnect = !bConnect;
				if (bConnect) { // 연결 true
					on_connect();

				} else { // 끊기 false
					on_close();
				}

				// 버튼 캡션 변경

				jbt_connect.setText(bConnect ? "끊기" : "연결");
			}
		});

	}

	protected void on_close() { // 끊기
		// TODO Auto-generated method stub
		try {
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void on_connect() { // 연결
		// TODO Auto-generated method stub
//		client = new Socket("localhost", 8500);
		try {
			client = new Socket("192.168.7.224", 8500);

			// 입장 메시지 전달
			String send_data = String.format("IN#%s\n", user_name);
			client.getOutputStream().write(send_data.getBytes());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void init_user_list() {
		// TODO Auto-generated method stub
		jlist_user = new JList<String>();
		JScrollPane jsp = new JScrollPane(jlist_user);

		jsp.setPreferredSize(new Dimension(150, 0));

		jlist_user.setFont(font);

		this.add(jsp, "East");

	}

//	private void init_user_count() {
//		// TODO Auto-generated method stub
//		JPanel p = new JPanel(new GridLayout(1, 3));
//
//		JLabel jlb_title = new JLabel("접속자수:", JLabel.RIGHT);
//		jlb_title.setFont(font);
//
//		jtf_user_count = new JTextField("0");
//		jtf_user_count.setFont(font);
//		jtf_user_count.setHorizontalAlignment(JTextField.CENTER);
//
//		JLabel jlb_count = new JLabel("(명)");
//		jlb_count.setFont(font);
//
//		p.add(jlb_title);
//		p.add(jtf_user_count);
//		p.add(jlb_count);
//
//		this.add(p, "South");
//	}

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
		new MyMain_MultiChatClient();
	}
}