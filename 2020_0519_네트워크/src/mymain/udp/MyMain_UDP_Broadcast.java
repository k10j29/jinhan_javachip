package mymain.udp;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyMain_UDP_Broadcast extends JFrame {

	JTextArea jta_display; // 출력창

	JTextField jtf_address; // 주소창

	JTextField jtf_message; // 입력창

	Font font = new Font("굴림체", Font.BOLD, 20);

	String user_name = "진한"; // 대화명 아이디

	// UDP 형 소켓
	DatagramSocket client;

	public MyMain_UDP_Broadcast() {
		// 윈도우 타이틀
		super("Broad casting");

		init_display(); // 출력창 초기화

		init_input(); // 입력창 초기화

		init_key_event(); // 키이벤트 초기화

		init_socket(); // 소켓 초기화

		// 위치
		super.setLocation(100, 100);

		// 크기
		pack();

		// 보여줘라
		super.setVisible(true);
		// 종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void init_socket() {
		// TODO Auto-generated method stub
		// host 인자
		try {
			// Port
			client = new DatagramSocket(6000);

			// 수신용 쓰레드 할당
			new Thread() {
				public void run() {
					my_read_message();

				}

			}.start();

			/*
			 * class MyThread extends Thread{
			 * 
			 * } new MyThread().start();
			 */

		} catch (Exception e) { // 할당못받으면 어떡할래?
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void my_read_message() { // 데이터 받는애
										// 는 위 수신용 쓰레드에서 받아서 처리

		while (true) {

			// 수신받을 객체 준비
			try {
				byte[] read_buff = new byte[512];
				DatagramPacket dp = new DatagramPacket(read_buff, read_buff.length);
				client.receive(dp);

				// 수신데이터 읽어오기
				byte[] data = dp.getData();

				String read_data = new String(data).trim();

				String[] data_array = read_data.split("#");

				String display_message = String.format("[%s]님 말씀:\r\n  %s\r\n", data_array[0], data_array[1]);

				jta_display.append(read_data + "\r\n");

				int position = jta_display.getDocument().getLength();
				jta_display.setCaretPosition(position);

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
		// jtf_message 에서 키가 눌리면 keyadapter 에게 처리 위임
		jtf_message.addKeyListener(adapter);

	}

	protected void my_send_message() { // 내부익명 클라스
		// TODO Auto-generated method stub
		String message = jtf_message.getText().trim(); // 메세지를 읽어오고 + 공백 제거 (트림)

		if (message.isEmpty()) { // 메세지가 비어있으면
			jtf_message.setText(""); // 입력창 비우기
			return;

		}

		// 전송메시지 포장 : "진한#안녕하세요"

		String send_data = String.format("%s#%s", user_name, message);

		try {
			// 목적지 주소 구하기
			String ip = jtf_address.getText().trim();
			InetAddress ia = InetAddress.getByName(ip);

			byte[] send_bytes = send_data.getBytes();
			DatagramPacket dp = new DatagramPacket(send_bytes, send_bytes.length, ia, 6000);

			// 전송

			client.send(dp);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// System.out.println(send_data); // 입력메시지 출력 확인

		// jta_display.append(send_data + "\r\n");

		// caret Text 입력 위치 (커서)

		// int position = jta_display.getDocument().getLength(); // 전체 문서 길이
		// jta_display.setCaretPosition(position);

		jtf_message.setText(""); // 마지막에도 입력창 비우기 한번 하기~ (입력하고나서 입력창 비우기)

	}

	private void init_input() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel(new GridLayout(2, 1));
		this.add(p, "South");
		jtf_address = new JTextField("255.255.255.255");
		jtf_message = new JTextField();

		// Font 설정
		jtf_address.setFont(font);
		jtf_message.setFont(font);

		p.add(jtf_address);
		p.add(jtf_message);

	}

	private void init_display() {
		// TODO Auto-generated method stub
		jta_display = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta_display);

		jsp.setPreferredSize(new Dimension(400, 400));

		// Font 적용
		jta_display.setFont(font);

		// 읽기전용 으로 설정
		jta_display.setEditable(false); // 편집 불가

		this.add(jsp, "Center");
	}

	public static void main(String[] args) {

		new MyMain_UDP_Broadcast();

	}

}