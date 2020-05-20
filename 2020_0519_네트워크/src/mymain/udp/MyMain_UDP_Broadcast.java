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

	JTextArea jta_display; // ���â

	JTextField jtf_address; // �ּ�â

	JTextField jtf_message; // �Է�â

	Font font = new Font("����ü", Font.BOLD, 20);

	String user_name = "����"; // ��ȭ�� ���̵�

	// UDP �� ����
	DatagramSocket client;

	public MyMain_UDP_Broadcast() {
		// ������ Ÿ��Ʋ
		super("Broad casting");

		init_display(); // ���â �ʱ�ȭ

		init_input(); // �Է�â �ʱ�ȭ

		init_key_event(); // Ű�̺�Ʈ �ʱ�ȭ

		init_socket(); // ���� �ʱ�ȭ

		// ��ġ
		super.setLocation(100, 100);

		// ũ��
		pack();

		// �������
		super.setVisible(true);
		// ����
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void init_socket() {
		// TODO Auto-generated method stub
		// host ����
		try {
			// Port
			client = new DatagramSocket(6000);

			// ���ſ� ������ �Ҵ�
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

		} catch (Exception e) { // �Ҵ�������� ��ҷ�?
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void my_read_message() { // ������ �޴¾�
										// �� �� ���ſ� �����忡�� �޾Ƽ� ó��

		while (true) {

			// ���Ź��� ��ü �غ�
			try {
				byte[] read_buff = new byte[512];
				DatagramPacket dp = new DatagramPacket(read_buff, read_buff.length);
				client.receive(dp);

				// ���ŵ����� �о����
				byte[] data = dp.getData();

				String read_data = new String(data).trim();

				String[] data_array = read_data.split("#");

				String display_message = String.format("[%s]�� ����:\r\n  %s\r\n", data_array[0], data_array[1]);

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
				// ����Ű�� ������
				if (key == KeyEvent.VK_ENTER) {
					my_send_message();
				}

			}
		};
		// jtf_message ���� Ű�� ������ keyadapter ���� ó�� ����
		jtf_message.addKeyListener(adapter);

	}

	protected void my_send_message() { // �����͸� Ŭ��
		// TODO Auto-generated method stub
		String message = jtf_message.getText().trim(); // �޼����� �о���� + ���� ���� (Ʈ��)

		if (message.isEmpty()) { // �޼����� ���������
			jtf_message.setText(""); // �Է�â ����
			return;

		}

		// ���۸޽��� ���� : "����#�ȳ��ϼ���"

		String send_data = String.format("%s#%s", user_name, message);

		try {
			// ������ �ּ� ���ϱ�
			String ip = jtf_address.getText().trim();
			InetAddress ia = InetAddress.getByName(ip);

			byte[] send_bytes = send_data.getBytes();
			DatagramPacket dp = new DatagramPacket(send_bytes, send_bytes.length, ia, 6000);

			// ����

			client.send(dp);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// System.out.println(send_data); // �Է¸޽��� ��� Ȯ��

		// jta_display.append(send_data + "\r\n");

		// caret Text �Է� ��ġ (Ŀ��)

		// int position = jta_display.getDocument().getLength(); // ��ü ���� ����
		// jta_display.setCaretPosition(position);

		jtf_message.setText(""); // ���������� �Է�â ���� �ѹ� �ϱ�~ (�Է��ϰ��� �Է�â ����)

	}

	private void init_input() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel(new GridLayout(2, 1));
		this.add(p, "South");
		jtf_address = new JTextField("255.255.255.255");
		jtf_message = new JTextField();

		// Font ����
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

		// Font ����
		jta_display.setFont(font);

		// �б����� ���� ����
		jta_display.setEditable(false); // ���� �Ұ�

		this.add(jsp, "Center");
	}

	public static void main(String[] args) {

		new MyMain_UDP_Broadcast();

	}

}