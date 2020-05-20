package mymain.udp;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyMain_UDP_Multicast extends JFrame {

	JTextArea jta_display;// 출력창

	JTextField jtf_address;// 주소창

	JTextField jtf_message;// 입력창

	Font font = new Font("굴림체", Font.BOLD, 20);

	String user_name = "진한";// 대화명

	// UDP Socket
	MulticastSocket client;

	// 가입목록을 출력할 객체
	JList<String> jlist_group;
	// 가입된 그룹목록을 저장할 객체
	List<String> group_list = new ArrayList<String>();

	public MyMain_UDP_Multicast() {
		// TODO Auto-generated constructor stub
		// 타이틀
		super("MultiCast");

		// 출력창 초기화
		init_display();

		// 입력창 초기화
		init_input();

		// 가입목록창 초기화
		init_group_list();

		// 키보드 이벤트 초기화
		init_key_event();

		// 소켓 초기화
		init_socket();

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

	private void init_group_list() {
		// TODO Auto-generated method stub

		jlist_group = new JList<String>();

		JScrollPane jsp = new JScrollPane(jlist_group);
		jsp.setPreferredSize(new Dimension(120, 0));
		this.add(jsp, "East");

		jlist_group.setFont(font);

//		String[] ar = { "224.0.0.2", "224.0.0.3", "224.0.0.4" };
//		jlist_group.setListData(ar);

//		// 마우스 이벤트 등록
//		jlist_group.addMouseListener(new MouseAdapter()
//
//		{
//			@Override
//			public void mousePressed(MouseEvent e) {
//				// TODO Auto-generated method stub
//
//				// Jlist 에서 선택한 값 얻기
//
//				String ip = jlist_group.getSelectedValue();
//
//				// 주소창에 넣기
//
//				jtf_address.setText(ip);
//
//			}
//
//		});

	}

	private void init_socket() {
		// TODO Auto-generated method stub

		try {
			// port
			client = new MulticastSocket(7000);
			/*
			 * class MyThread extends Thread{
			 * 
			 * @Override public void run() { // TODO Auto-generated method stub super.run();
			 * } } new MyThread().start();
			 */

			// 수신용 쓰레드 할당
			new Thread() {
				public void run() {
					// 수신대기
					my_read_message();

				}
			}.start();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void my_read_message() {
		// TODO Auto-generated method stub
		while (true) {

			try {
				// 수신받을 객체 준비
				byte[] read_buff = new byte[512];
				DatagramPacket dp = new DatagramPacket(read_buff, read_buff.length);
				client.receive(dp);
				// 수신데이터 추출
				byte[] data = dp.getData();

				String read_data = new String(data).trim();
				// read_data = "홍길동#안녕하세요"
				String[] data_array = read_data.split("#");
				// 0 1
				// data_array = {"홍길동","안녕하세요"};
				String display_message = String.format("[%s]님 말씀:\r\n  %s\r\n", data_array[0], data_array[1]);

				jta_display.append(display_message);

				int position = jta_display.getDocument().getLength();
				jta_display.setCaretPosition(position);

				// Server Monitoring...
				InetAddress ia = dp.getAddress();
				System.out.printf("[%s]: %s\n", ia.getHostAddress(), read_data);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	private void init_key_event() {
		// TODO Auto-generated method stub
		KeyAdapter adapter = new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int key = e.getKeyCode();
				// 엔터키가 눌리면
				if (key == KeyEvent.VK_ENTER) {
					my_send_message();
				}
			}
		};
		// 메시지창에서 키가눌리면 adapter처리 위침
		jtf_message.addKeyListener(adapter);

	}

	protected void my_send_message() {
		// TODO Auto-generated method stub
		// 입력된 메시기 읽어오기 + 공백제거
		String message = jtf_message.getText().trim();

		// 메시지가 비어있으면
		if (message.isEmpty()) {
			jtf_message.setText("");// 입력창 비우기
			return;
		}

		// 전송메시지 포장: "홍길동#안녕하세요"
		String send_data = String.format("%s#%s", user_name, message);

		try {
			// 목적지 주소 구하기
			String ip = jtf_address.getText().trim();
			// "255.255.255.255"
			InetAddress ia = InetAddress.getByName(ip);
			// String->byte[]
			byte[] send_bytes = send_data.getBytes();

			// 전송할 데이터 포장
			DatagramPacket dp = new DatagramPacket(send_bytes, send_bytes.length, ia, 7000);

			// 전송
			client.send(dp);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 입력메시지 출력
		// System.out.println(send_data);
		// jta_display.append(send_data + "\r\n");
		// Text 입력위치 : caret
		// 전체문서길이
		// int position = jta_display.getDocument().getLength();
		// jta_display.setCaretPosition(position);

		// 입력창 비우기
		jtf_message.setText("");
	}

	private void init_input() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel(new GridLayout(3, 1));
		this.add(p, "South");

		jtf_address = new JTextField("224.0.0.2");

		// 가입/탈퇴버튼
		JPanel p1 = new JPanel(new GridLayout(1, 2));
		JButton jbt_join = new JButton("가입");
		JButton jbt_leave = new JButton("탈퇴");
		p1.add(jbt_join);
		p1.add(jbt_leave);

		jtf_message = new JTextField();

		// font설정
		jtf_address.setFont(font);
		jtf_message.setFont(font);

		p.add(jtf_address);// 1줄
		p.add(p1); // 2줄
		p.add(jtf_message);// 3줄

		// 버튼이벤트
		jbt_join.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				on_join_group();
			}
		});

		jbt_leave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				on_leave_group();
			}
		});

	}

	protected void on_leave_group() {
		// TODO Auto-generated method stub
		try {
			// 주소 얻어오기
			String ip = jtf_address.getText().trim();
			if (ip.isEmpty())
				return;

			// 가입여부체크
			if (!group_list.contains(ip)) {
				JOptionPane.showMessageDialog(this, "탈퇴할 주소가 없습니다");
				return;
			}
			// String 형식 IP=> InetAddress
			InetAddress ia = InetAddress.getByName(ip);
			// 탈퇴
			client.leaveGroup(ia);

			// ArrayList
			group_list.remove(ip);

			// JList갱신
			my_update_group_list();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	protected void on_join_group() {
		// TODO Auto-generated method stub
		try {
			// 가입주소 얻어오기
			String ip = jtf_address.getText().trim();
			if (ip.isEmpty())
				return;

			// 가입여부체크
			if (group_list.contains(ip)) {
				JOptionPane.showMessageDialog(this, "이미 가입된 주소입니다");
				return;
			}
			// String 형식 IP=> InetAddress
			InetAddress ia = InetAddress.getByName(ip);
			// 가입
			client.joinGroup(ia);

			// ArrayList
			group_list.add(ip);

			// JList갱신
			my_update_group_list();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	private void my_update_group_list() {
		// TODO Auto-generated method stub
		// ArrayList -> Array추출
		String[] group_array = new String[group_list.size()];
		group_list.toArray(group_array);

		jlist_group.setListData(group_array);

	}

	private void init_display() {
		// TODO Auto-generated method stub
		jta_display = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta_display);

		jsp.setPreferredSize(new Dimension(400, 400));

		// font적용
		jta_display.setFont(font);

		// 읽기전용
		jta_display.setEditable(false);

		this.add(jsp, "Center");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_UDP_Multicast();
	}
}