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

	JTextArea jta_display;// ���â

	JTextField jtf_address;// �ּ�â

	JTextField jtf_message;// �Է�â

	Font font = new Font("����ü", Font.BOLD, 20);

	String user_name = "����";// ��ȭ��

	// UDP Socket
	MulticastSocket client;

	// ���Ը���� ����� ��ü
	JList<String> jlist_group;
	// ���Ե� �׷����� ������ ��ü
	List<String> group_list = new ArrayList<String>();

	public MyMain_UDP_Multicast() {
		// TODO Auto-generated constructor stub
		// Ÿ��Ʋ
		super("MultiCast");

		// ���â �ʱ�ȭ
		init_display();

		// �Է�â �ʱ�ȭ
		init_input();

		// ���Ը��â �ʱ�ȭ
		init_group_list();

		// Ű���� �̺�Ʈ �ʱ�ȭ
		init_key_event();

		// ���� �ʱ�ȭ
		init_socket();

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

	private void init_group_list() {
		// TODO Auto-generated method stub

		jlist_group = new JList<String>();

		JScrollPane jsp = new JScrollPane(jlist_group);
		jsp.setPreferredSize(new Dimension(120, 0));
		this.add(jsp, "East");

		jlist_group.setFont(font);

//		String[] ar = { "224.0.0.2", "224.0.0.3", "224.0.0.4" };
//		jlist_group.setListData(ar);

//		// ���콺 �̺�Ʈ ���
//		jlist_group.addMouseListener(new MouseAdapter()
//
//		{
//			@Override
//			public void mousePressed(MouseEvent e) {
//				// TODO Auto-generated method stub
//
//				// Jlist ���� ������ �� ���
//
//				String ip = jlist_group.getSelectedValue();
//
//				// �ּ�â�� �ֱ�
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

			// ���ſ� ������ �Ҵ�
			new Thread() {
				public void run() {
					// ���Ŵ��
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
				// ���Ź��� ��ü �غ�
				byte[] read_buff = new byte[512];
				DatagramPacket dp = new DatagramPacket(read_buff, read_buff.length);
				client.receive(dp);
				// ���ŵ����� ����
				byte[] data = dp.getData();

				String read_data = new String(data).trim();
				// read_data = "ȫ�浿#�ȳ��ϼ���"
				String[] data_array = read_data.split("#");
				// 0 1
				// data_array = {"ȫ�浿","�ȳ��ϼ���"};
				String display_message = String.format("[%s]�� ����:\r\n  %s\r\n", data_array[0], data_array[1]);

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
				// ����Ű�� ������
				if (key == KeyEvent.VK_ENTER) {
					my_send_message();
				}
			}
		};
		// �޽���â���� Ű�������� adapteró�� ��ħ
		jtf_message.addKeyListener(adapter);

	}

	protected void my_send_message() {
		// TODO Auto-generated method stub
		// �Էµ� �޽ñ� �о���� + ��������
		String message = jtf_message.getText().trim();

		// �޽����� ���������
		if (message.isEmpty()) {
			jtf_message.setText("");// �Է�â ����
			return;
		}

		// ���۸޽��� ����: "ȫ�浿#�ȳ��ϼ���"
		String send_data = String.format("%s#%s", user_name, message);

		try {
			// ������ �ּ� ���ϱ�
			String ip = jtf_address.getText().trim();
			// "255.255.255.255"
			InetAddress ia = InetAddress.getByName(ip);
			// String->byte[]
			byte[] send_bytes = send_data.getBytes();

			// ������ ������ ����
			DatagramPacket dp = new DatagramPacket(send_bytes, send_bytes.length, ia, 7000);

			// ����
			client.send(dp);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// �Է¸޽��� ���
		// System.out.println(send_data);
		// jta_display.append(send_data + "\r\n");
		// Text �Է���ġ : caret
		// ��ü��������
		// int position = jta_display.getDocument().getLength();
		// jta_display.setCaretPosition(position);

		// �Է�â ����
		jtf_message.setText("");
	}

	private void init_input() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel(new GridLayout(3, 1));
		this.add(p, "South");

		jtf_address = new JTextField("224.0.0.2");

		// ����/Ż���ư
		JPanel p1 = new JPanel(new GridLayout(1, 2));
		JButton jbt_join = new JButton("����");
		JButton jbt_leave = new JButton("Ż��");
		p1.add(jbt_join);
		p1.add(jbt_leave);

		jtf_message = new JTextField();

		// font����
		jtf_address.setFont(font);
		jtf_message.setFont(font);

		p.add(jtf_address);// 1��
		p.add(p1); // 2��
		p.add(jtf_message);// 3��

		// ��ư�̺�Ʈ
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
			// �ּ� ������
			String ip = jtf_address.getText().trim();
			if (ip.isEmpty())
				return;

			// ���Կ���üũ
			if (!group_list.contains(ip)) {
				JOptionPane.showMessageDialog(this, "Ż���� �ּҰ� �����ϴ�");
				return;
			}
			// String ���� IP=> InetAddress
			InetAddress ia = InetAddress.getByName(ip);
			// Ż��
			client.leaveGroup(ia);

			// ArrayList
			group_list.remove(ip);

			// JList����
			my_update_group_list();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	protected void on_join_group() {
		// TODO Auto-generated method stub
		try {
			// �����ּ� ������
			String ip = jtf_address.getText().trim();
			if (ip.isEmpty())
				return;

			// ���Կ���üũ
			if (group_list.contains(ip)) {
				JOptionPane.showMessageDialog(this, "�̹� ���Ե� �ּ��Դϴ�");
				return;
			}
			// String ���� IP=> InetAddress
			InetAddress ia = InetAddress.getByName(ip);
			// ����
			client.joinGroup(ia);

			// ArrayList
			group_list.add(ip);

			// JList����
			my_update_group_list();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	private void my_update_group_list() {
		// TODO Auto-generated method stub
		// ArrayList -> Array����
		String[] group_array = new String[group_list.size()];
		group_list.toArray(group_array);

		jlist_group.setListData(group_array);

	}

	private void init_display() {
		// TODO Auto-generated method stub
		jta_display = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta_display);

		jsp.setPreferredSize(new Dimension(400, 400));

		// font����
		jta_display.setFont(font);

		// �б�����
		jta_display.setEditable(false);

		this.add(jsp, "Center");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_UDP_Multicast();
	}
}