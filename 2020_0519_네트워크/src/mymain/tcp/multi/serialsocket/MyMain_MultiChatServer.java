package mymain.tcp.multi.serialsocket;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
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

	JTextArea jta_display; // ���â
	JTextField jtf_user_count;// �����ڼ�
	JList<String> jlist_user; // �����ڸ��

	Font font = new Font("����ü", Font.BOLD, 18);

	// ��������
	ServerSocket server;

	// �ڼ����� ������ ���ž����� ��ü�� ���� �÷���
	List<ReadThread> socketList = new ArrayList<ReadThread>();

	// �����ڸ�� ������ ��ü
	List<String> userList = new ArrayList<String>();

	// ������ ����ȭ ������ü
	Object syncObj = new Object();

	public MyMain_MultiChatServer() {
		// TODO Auto-generated constructor stub
		// Ÿ��Ʋ
		super("TCP��Ƽ����");

		// ���â �ʱ�ȭ
		init_display();

		// �����ڼ� �ʱ�ȭ
		init_user_count();

		// �����ڸ�� �ʱ�ȭ
		init_user_list();

		// ���� �ʱ�ȭ
		init_server();

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

	private void init_server() {
		// TODO Auto-generated method stub
		try {

			server = new ServerSocket(ServerInfo.PORT);

			// ��� ������ ����/����
			new Thread() {
				public void run() {
					while (true) {

						try {
							// �����û->�ڼ��ϻ���->����
							Socket child = server.accept();

							synchronized (syncObj) {
								// ���ſ뾲���� ��ü����
								ReadThread rt = new ReadThread(child);
								rt.start();
								socketList.add(rt);
								// �����ڼ� �����ϴ� �޼ҵ�
								my_update_user_count();
							}

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}.start();

			my_display_message("���� ������...");

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

		JLabel jlb_title = new JLabel("�����ڼ�:", JLabel.RIGHT);
		jlb_title.setFont(font);

		jtf_user_count = new JTextField("0");
		jtf_user_count.setFont(font);
		jtf_user_count.setHorizontalAlignment(JTextField.CENTER);

		JLabel jlb_count = new JLabel("(��)");
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

		// font����
		jta_display.setFont(font);
		// �б�����
		jta_display.setEditable(false);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_MultiChatServer();
	}

//ReadThread Inner Type���� ����
	class ReadThread extends Thread {

		Socket child;

		// �ش������ ������ ��ü ������ �б����ؼ� ����

		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;

		public ReadThread(Socket child) {
			super();
			this.child = child;

			try {

				// Client �� server �� ������ Cross �� �ؾ��Ѵ�

//				1 - ObjectOutputStream oos = null;
//				2 - ObjectInputStream ois = null;

//				2 - ois = new ObjectInputStream(child.getInputStream());
//				1 - oos = new ObjectOutputStream(child.getOutputStream());

				ois = new ObjectInputStream(child.getInputStream());
				oos = new ObjectOutputStream(child.getOutputStream());

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

					// String readStr = br.readLine();

					// ���ķ� ���޵� �����͸� -> ������ȭ �ޱ�
					Data data = (Data) ois.readObject();

					// ���� ������ close�Ǹ� �߻�(��������)
					if (data == null) {
						// System.out.println("--��������--");
						break;
					}

					// ���� �����
					InetAddress ia = child.getInetAddress();
					String monitor_message = String.format("[%s] [%d] [%s] [%s] [%d, %d] [%d]",

							ia.getHostAddress(), 
							data.data_kind, 
							data.user_name, 
							data.message, 
							data.x, 
							data.y,
							data.thick

					);
					my_display_message(monitor_message);

//					//Client ���� ���� ����
//					Data data = new Data();
//					data.data_kind = Data.IN;
//					data.user_name=" ȫ�浿";

					if (data.data_kind == Data.IN) {
						// ����ó��
						synchronized (syncObj) {
							userList.add(data.user_name);
							// ������ ��� ����
							my_update_user_list();

							// ��� �����ڿ��� �޽��� ����
							my_send_message_all(data);

							// �����ڸ�� ����
							my_send_user_list();

						}
					} else if (data.data_kind == Data.MSG) {
						// ä�ó����̸�...
						synchronized (syncObj) {
							String[] bad_str = { "�ٺ�", "����", "�˰�", "��û��" };
							// �弳 ���͸�...
							String message = data.message;
							for (String bad : bad_str) {
								message = message.replaceAll(bad, "***");
							}
							data.message = message;

							// ��� �����ڿ��� �޽��� ����
							my_send_message_all(data);
						}

					} else if (data.data_kind == Data.DRAW) {

						synchronized (syncObj) {

							my_send_message_all(data);

						}

					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					// System.out.println("--����������--");
					break;
				}

			} // end-while

			// �����Ȳ..
			// socketList�� userList�� ��ġ�� ����
			synchronized (syncObj) {
				// ���� ��ü�� ���° �ֳ�?
				int index = socketList.indexOf(this);

				// ������ �г���
				String del_user_name = userList.get(index);

				// ����ڸ� ����
				userList.remove(index);
				my_update_user_list();

				socketList.remove(index);
				my_update_user_count();

				// ����޽����� ��� �����ڿ��� ����
				Data data = new Data();
				data.data_kind = Data.OUT;
				data.user_name = del_user_name;

				my_send_message_all(data);

				// ���� �����

				String str = String.format("[����] : %s ", del_user_name);
				my_display_message(str);

			}

		}

	}

	public void my_update_user_list() {
		// TODO Auto-generated method stub
		String[] user_array = new String[userList.size()];
		userList.toArray(user_array);
		jlist_user.setListData(user_array);

	}

	public void my_send_user_list() {

		Data data = new Data();
		data.data_kind = Data.LIST; // ����� ��� �Ѿ��~
		data.userList = userList;

		my_send_message_all(data);

	}

	public void my_send_message_all(Data data) {
		// TODO Auto-generated method stub
		for (int i = 0; i < socketList.size(); i++) {
			ReadThread rt = socketList.get(i);

			try {
				// ��ü (data) ����
				rt.oos.writeObject(data);

			} catch (Exception e) {
				// TODO: handle exception
				// e.printStackTrace();
			}

		}

	}

}
