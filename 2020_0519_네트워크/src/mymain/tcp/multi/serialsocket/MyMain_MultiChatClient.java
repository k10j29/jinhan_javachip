package mymain.tcp.multi.serialsocket;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyMain_MultiChatClient extends JFrame {

	JTextArea jta_display; // ���â

	JTextField jtf_message; // �޽��� â

	JButton jbt_connect; // �����ư
	boolean bConnect = false;// �������
	String user_name = "Font.BOLD, 18";
//			"�����ϰ� ������ ����Ǿ� ������ ������ �̿��Ͽ� ���� ������ �˼��ִ�.";

	Socket client;

	ObjectOutputStream oos = null;
	ObjectInputStream ois = null;

	JList<String> jlist_user; // �����ڸ��

	Font font = new Font("����ü", Font.BOLD, 18);

	JPanel grimPan;
	Image memPan;

	int thick = 5;
	int color = Color.red.getRGB();

	public MyMain_MultiChatClient() {
		// TODO Auto-generated constructor stub
		// Ÿ��Ʋ
		super("TCP��Ƽ Ŭ���̾�Ʈ");

		// ���â �ʱ�ȭ
		init_display();

		// �׸��� �ʱ�ȭ
		init_grimPan();

		// �Է�â �ʱ�ȭ
		init_input();

		// Ű���� �̺�Ʈó��:�Է�â����..
		init_key_event();

		// ���콺 �̺�Ʈ
		init_mouse_event();

		// �����ڸ�� �ʱ�ȭ
		init_user_list();

		// ��ġ
		super.setLocation(100, 100);

		// ũ��
		setResizable(false);
		pack();
		// super.setSize(300, 300);

		// �������
		super.setVisible(true);

		// ����
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// �׸��� ���� �޸𸮻���
		memPan = grimPan.createImage(400, 400);

	}

	private void init_mouse_event() {
		// TODO Auto-generated method stub
		grimPan.addMouseMotionListener(new MouseAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub

				// ������ �ȵǾ������� ������.
				if (bConnect == false)
					return;

				Point pt = e.getPoint();

				try {

					Data data = new Data();
					data.data_kind = Data.DRAW;
					data.x = pt.x;
					data.y = pt.y;
					data.thick = thick;
					data.color = color;

					oos.writeObject(data);

				} catch (Exception e2) {
					// TODO: handle exception
				}

//				Graphics g = memPan.getGraphics();
//				Color line_color = new Color(color);
//				g.setColor(line_color);
//
//				g.fillOval(pt.x - thick / 2, pt.y - thick / 2, thick, thick);
//				grimPan.repaint();

			}

		});

	}

	private void init_grimPan() {
		// TODO Auto-generated method stub

		grimPan = new JPanel() {

			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub

				// �޸𸮿� �׸� �̹��� > ȭ�鿡 ����
				g.drawImage(memPan, 0, 0, this);
			}

		};
		grimPan.setPreferredSize(new Dimension(400, 400));
		this.add(grimPan, "West");
	}

	private void init_key_event() {
		// TODO Auto-generated method stub
		jtf_message.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				// ����Ű�� ���͸�..
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					my_send_message();
				}
			}
		});
	}

	protected void my_send_message() {
		// TODO Auto-generated method stub
		// ����Ǿ����� ������ ������...
		if (bConnect == false) {
			JOptionPane.showMessageDialog(this, "������� �ʾҽ��ϴ�");
			jtf_message.setText("");// �޽���â �����
			return;
		}

		String message = jtf_message.getText().trim();
		if (message.isEmpty()) {// �Է°��� ��������� ������
			jtf_message.setText("");// �޽���â �����
			return;
		}

		try {
			// ����
			Data data = new Data();
			data.data_kind = Data.MSG;
			data.user_name = user_name;
			data.message = message;

			oos.writeObject(data);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		// ���� �Է°� �����
		jtf_message.setText("");

	}

	private void init_input() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel(new BorderLayout());

		jtf_message = new JTextField();// �޽��� â
		jbt_connect = new JButton("����");

		jbt_connect.setPreferredSize(new Dimension(150, 0));

		JPanel p1 = new JPanel(new GridLayout(1, 3));
		p1.setPreferredSize(new Dimension(400, 0));

		p.add(p1, "West");
		p.add(jtf_message, "Center");
		p.add(jbt_connect, "East");

		this.add(p, "South");

		// ����(����)��ư�� ������
		jbt_connect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				bConnect = !bConnect;
				if (bConnect) { // ����
					on_connect();
				} else {// ����
					on_close();
				}

				// ��ư ĸ�� ����
				jbt_connect.setText(bConnect ? "����" : "����");

			}
		});

		// p1 �гο� �׸��� ���� �޴��ֱ�
		Integer[] thick_array = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 600 };
		JComboBox<Integer> jcb_thick = new JComboBox<Integer>(thick_array);

		p1.add(jcb_thick);

		JButton jbt_color = new JButton("������");
		p1.add(jbt_color);

		JButton jbt_clear = new JButton("���찳");
		p1.add(jbt_clear);

		jcb_thick.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				// System.out.println(e);

				if (e.getStateChange() == ItemEvent.SELECTED) {
					thick = (int) jcb_thick.getSelectedItem();
					// System.out.println(thick);
					// System.out.println(e);
				}

			}
		});

		// �����ư
		jbt_color.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Color current_color = new Color(color);
				Color select_color = JColorChooser.showDialog(MyMain_MultiChatClient.this, "������ �����ϼ���", current_color);

				if (select_color != null)
					color = select_color.getRGB();
			}
		});

		// ������ư
		jbt_clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Graphics g = memPan.getGraphics();

				// �޸𸮱׸��� ����⸦ �ϰ� > ȭ�� �׸������� �����ض�.
				g.clearRect(0, 0, 400, 400);
				grimPan.repaint();

			}
		});

	}

	protected void on_close() {
		// TODO Auto-generated method stub
		try {
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void on_connect() {
		// TODO Auto-generated method stub

		try {
			// client = new Socket("localhost", 8500);
			client = new Socket(ServerInfo.HOST, ServerInfo.PORT);

			oos = new ObjectOutputStream(client.getOutputStream());
			ois = new ObjectInputStream(client.getInputStream());

			// ����޽��� ���� : "IN#ȫ�浿\n"
//			String send_data = String.format("IN#%s\n", user_name);
//			client.getOutputStream().write(send_data.getBytes());

			Data data = new Data();
			data.data_kind = Data.IN; // ���嵥��Ÿ
			data.user_name = user_name; // �����ڸ�
			oos.writeObject(data);

			// ������ ����
			my_read_message();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// BufferedReader br = null;

	private void my_read_message() {
		// TODO Auto-generated method stub

		// ���Ž�Ʈ�� ����

		// ���ſ� ������ ����/����
		new Thread() {

			public void run() {

				while (true) {

					try {
						// String readStr = br.readLine();

						// ��ü ���� (�� ����ȭ)
						Data data = (Data) ois.readObject();

						// ����: close()
						if (data == null)
							break;

						if (data.data_kind == Data.IN) {
							String display_message = String.format("����[%s]�� ����", data.user_name);
							// ä�����â�� ���
							my_display_message(display_message);

						} else if (data.data_kind == Data.OUT) {
							String display_message = String.format("����[%s]�� ����", data.user_name);

							my_display_message(display_message);

						} else if (data.data_kind == Data.LIST) {
							// System.out.println(readStr);
							my_update_user_list(data.userList);

						} else if (data.data_kind == Data.MSG) {

							String display_message = String.format("[%s]�� ���� : \r\n %s", data.user_name, data.message);

							my_display_message(display_message);

						} else if (data.data_kind == Data.DRAW) {
//							msg_array = { "DRAW", pt.x, pt.y, thick, thick, color };

							try {

//								int x = Integer.parseInt(msg_array[1]);
//								int y = Integer.parseInt(msg_array[2]);
//								int t = Integer.parseInt(msg_array[3]);
//								int c = Integer.parseInt(msg_array[4]);

								Graphics g = memPan.getGraphics();

								Color line_color = new Color(data.color);

								g.setColor(line_color);

								g.fillOval(data.x - data.thick / 2, data.y - data.thick / 2, data.thick, data.thick);

								grimPan.repaint();

							} catch (Exception e2) {
								// TODO: handle exception
							}

						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						// e.printStackTrace();
						// ������ ����Ǿ��� ��
						break;
					}
				} // end-while

				// ����

				bConnect = false;
				jbt_connect.setText("����");

				// �����ڸ�� �ʱ�ȭ
				String[] empty_array = new String[0];
				jlist_user.setListData(empty_array);

				my_display_message("������ ������ ���������ϴ�");

			}

		}.start();

	}

	protected void my_update_user_list(List<String> userList) {

		String[] user_array = new String[userList.size()];
		userList.toArray(user_array);

		jlist_user.setListData(user_array);
	}

	protected void my_display_message(String display_message) {
		// TODO Auto-generated method stub
		jta_display.append(display_message + "\r\n");
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