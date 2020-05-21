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

	JTextArea jta_display; // ���â
	JTextField jtf_message;// �����ڼ�
	JButton jbt_connect; // ���� ��ư

	Boolean bConnect = false; // ���� ���� Ȯ��
	String user_name = "�εε���";
	Socket client;

	JList<String> jlist_user; // �����ڸ��

	Font font = new Font("����ü", Font.BOLD, 18);

	public MyMain_MultiChatClient() {
		// TODO Auto-generated constructor stub
		// Ÿ��Ʋ
		super("TCP��ƼŬ���̾�Ʈ");

		// ���â �ʱ�ȭ
		init_display();

		// �Է�â �ʱ�ȭ
		init_input();

		// �����ڼ� �ʱ�ȭ
//		init_user_count();

		// �����ڸ�� �ʱ�ȭ
		init_user_list();

		// ��ġ
		super.setLocation(100, 100);

		// ũ��
		pack();
		// super.setSize(300, 300);

		// �������
		super.setVisible(true);

		// ����
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_input() {
		// TODO Auto-generated method stub

		JPanel p = new JPanel(new BorderLayout());

		jtf_message = new JTextField();
		jbt_connect = new JButton("����");

		jbt_connect.setPreferredSize(new Dimension(150, 0));

		p.add(jtf_message, "Center");
		p.add(jbt_connect, "East");

		this.add(p, "South");

		// ����, �Ǵ� ���� ���� ��ư�� ������
		jbt_connect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				bConnect = !bConnect;
				if (bConnect) { // ���� true
					on_connect();

				} else { // ���� false
					on_close();
				}

				// ��ư ĸ�� ����

				jbt_connect.setText(bConnect ? "����" : "����");
			}
		});

	}

	protected void on_close() { // ����
		// TODO Auto-generated method stub
		try {
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void on_connect() { // ����
		// TODO Auto-generated method stub
//		client = new Socket("localhost", 8500);
		try {
			client = new Socket("192.168.7.224", 8500);

			// ���� �޽��� ����
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
//		JLabel jlb_title = new JLabel("�����ڼ�:", JLabel.RIGHT);
//		jlb_title.setFont(font);
//
//		jtf_user_count = new JTextField("0");
//		jtf_user_count.setFont(font);
//		jtf_user_count.setHorizontalAlignment(JTextField.CENTER);
//
//		JLabel jlb_count = new JLabel("(��)");
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

		// font����
		jta_display.setFont(font);
		// �б�����
		jta_display.setEditable(false);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_MultiChatClient();
	}
}