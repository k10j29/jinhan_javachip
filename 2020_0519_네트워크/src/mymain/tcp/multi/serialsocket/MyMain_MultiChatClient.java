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

	JTextArea jta_display; // 출력창

	JTextField jtf_message; // 메시지 창

	JButton jbt_connect; // 연결버튼
	boolean bConnect = false;// 연결상태
	String user_name = "Font.BOLD, 18";
//			"소켓하고 소켓이 연결되어 있으면 소켓을 이용하여 상대방 정보를 알수있다.";

	Socket client;

	ObjectOutputStream oos = null;
	ObjectInputStream ois = null;

	JList<String> jlist_user; // 접속자목록

	Font font = new Font("굴림체", Font.BOLD, 18);

	JPanel grimPan;
	Image memPan;

	int thick = 5;
	int color = Color.red.getRGB();

	public MyMain_MultiChatClient() {
		// TODO Auto-generated constructor stub
		// 타이틀
		super("TCP멀티 클라이언트");

		// 출력창 초기화
		init_display();

		// 그림판 초기화
		init_grimPan();

		// 입력창 초기화
		init_input();

		// 키보드 이벤트처리:입력창에서..
		init_key_event();

		// 마우스 이벤트
		init_mouse_event();

		// 접속자목록 초기화
		init_user_list();

		// 위치
		super.setLocation(100, 100);

		// 크기
		setResizable(false);
		pack();
		// super.setSize(300, 300);

		// 보여줘라
		super.setVisible(true);

		// 종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 그림판 생성 메모리상의
		memPan = grimPan.createImage(400, 400);

	}

	private void init_mouse_event() {
		// TODO Auto-generated method stub
		grimPan.addMouseMotionListener(new MouseAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub

				// 연결이 안되어있으면 끝내라.
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

				// 메모리에 그림 이미지 > 화면에 복사
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
				// 눌린키가 엔터면..
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					my_send_message();
				}
			}
		});
	}

	protected void my_send_message() {
		// TODO Auto-generated method stub
		// 연결되어있지 않으면 끝내라...
		if (bConnect == false) {
			JOptionPane.showMessageDialog(this, "연결되지 않았습니다");
			jtf_message.setText("");// 메시지창 지우기
			return;
		}

		String message = jtf_message.getText().trim();
		if (message.isEmpty()) {// 입력값이 비어있으면 끝내라
			jtf_message.setText("");// 메시지창 지우기
			return;
		}

		try {
			// 전송
			Data data = new Data();
			data.data_kind = Data.MSG;
			data.user_name = user_name;
			data.message = message;

			oos.writeObject(data);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		// 이전 입력값 지우기
		jtf_message.setText("");

	}

	private void init_input() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel(new BorderLayout());

		jtf_message = new JTextField();// 메시지 창
		jbt_connect = new JButton("연결");

		jbt_connect.setPreferredSize(new Dimension(150, 0));

		JPanel p1 = new JPanel(new GridLayout(1, 3));
		p1.setPreferredSize(new Dimension(400, 0));

		p.add(p1, "West");
		p.add(jtf_message, "Center");
		p.add(jbt_connect, "East");

		this.add(p, "South");

		// 연결(끊기)버튼을 누를면
		jbt_connect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				bConnect = !bConnect;
				if (bConnect) { // 연결
					on_connect();
				} else {// 끊기
					on_close();
				}

				// 버튼 캡션 변경
				jbt_connect.setText(bConnect ? "끊기" : "연결");

			}
		});

		// p1 패널에 그림판 관련 메뉴넣기
		Integer[] thick_array = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 600 };
		JComboBox<Integer> jcb_thick = new JComboBox<Integer>(thick_array);

		p1.add(jcb_thick);

		JButton jbt_color = new JButton("선색상");
		p1.add(jbt_color);

		JButton jbt_clear = new JButton("지우개");
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

		// 색상버튼
		jbt_color.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Color current_color = new Color(color);
				Color select_color = JColorChooser.showDialog(MyMain_MultiChatClient.this, "색상을 선택하세요", current_color);

				if (select_color != null)
					color = select_color.getRGB();
			}
		});

		// 지우기버튼
		jbt_clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Graphics g = memPan.getGraphics();

				// 메모리그림판 지우기를 하고 > 화면 그림판으로 복사해라.
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

			// 입장메시지 전송 : "IN#홍길동\n"
//			String send_data = String.format("IN#%s\n", user_name);
//			client.getOutputStream().write(send_data.getBytes());

			Data data = new Data();
			data.data_kind = Data.IN; // 입장데이타
			data.user_name = user_name; // 입장자명
			oos.writeObject(data);

			// 데이터 수신
			my_read_message();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// BufferedReader br = null;

	private void my_read_message() {
		// TODO Auto-generated method stub

		// 수신스트림 필터

		// 수신용 쓰레드 생성/구동
		new Thread() {

			public void run() {

				while (true) {

					try {
						// String readStr = br.readLine();

						// 객체 수신 (역 직렬화)
						Data data = (Data) ois.readObject();

						// 정상: close()
						if (data == null)
							break;

						if (data.data_kind == Data.IN) {
							String display_message = String.format("▶▶[%s]님 입장", data.user_name);
							// 채팅출력창에 출력
							my_display_message(display_message);

						} else if (data.data_kind == Data.OUT) {
							String display_message = String.format("◀◀[%s]님 퇴장", data.user_name);

							my_display_message(display_message);

						} else if (data.data_kind == Data.LIST) {
							// System.out.println(readStr);
							my_update_user_list(data.userList);

						} else if (data.data_kind == Data.MSG) {

							String display_message = String.format("[%s]님 말씀 : \r\n %s", data.user_name, data.message);

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
						// 비정상 종료되었을 때
						break;
					}
				} // end-while

				// 종료

				bConnect = false;
				jbt_connect.setText("연결");

				// 접속자목록 초기화
				String[] empty_array = new String[0];
				jlist_user.setListData(empty_array);

				my_display_message("서버와 연결이 끊어졌습니다");

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