package mymain.tcp.multi;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyMain_MultiChatClient2 extends JFrame {

	
	JTextArea  jta_display;   //출력창
	
	JTextField jtf_message;   //메시지 창

	
	JButton    jbt_connect;   //연결버튼
	boolean    bConnect = false;//연결상태
	String user_name = "홍길동";
	
	Socket client;
	
	
	
	JList<String> jlist_user; //접속자목록
	
	Font font = new Font("굴림체",Font.BOLD,18);
	
	
	public MyMain_MultiChatClient2() {
		// TODO Auto-generated constructor stub
		//타이틀
		super("TCP멀티 클라이언트");
		
		//출력창 초기화
		init_display();
		
		//입력창 초기화
		init_input();
				
		
		//접속자목록 초기화
		init_user_list();
		
		

		//위치
		super.setLocation(100, 100);

		//크기
		pack();
		//super.setSize(300, 300);

		//보여줘라
		super.setVisible(true);

		//종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_input() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel(new BorderLayout());
		
		jtf_message = new JTextField();//메시지 창
		jbt_connect = new JButton("연결");
		
		jbt_connect.setPreferredSize(new Dimension(150, 0));
		
		p.add(jtf_message,"Center");
		p.add(jbt_connect,"East");
				
		
		this.add(p,"South");
		
        //연결(끊기)버튼을 누를면		
		jbt_connect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				bConnect = !bConnect;
				if(bConnect) { //연결
					on_connect();
				}else {//끊기
					on_close();
				}
				
				//버튼 캡션 변경
				jbt_connect.setText(bConnect?"끊기":"연결");
				
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
			//client = new Socket("localhost", 8500);
			client = new Socket("192.168.7.223", 8500);
			
			//입장메시지 전송 :   "IN#홍길동\n"
			String send_data = String.format("IN#%s\n", user_name);
			client.getOutputStream().write(send_data.getBytes());
			
			//데이터 수신
			my_read_message();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	BufferedReader br=null;
	private void my_read_message() {
		// TODO Auto-generated method stub
		
		//수신스트림 필터
		try {
			InputStreamReader isr = new InputStreamReader(client.getInputStream());
			br = new BufferedReader(isr);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//수신용 쓰레드 생성/구동
		new Thread() {
			
			public void run() {
				
				while(true) {
					
					try {
						String readStr = br.readLine();
						//정상: close()
						if(readStr==null)break;
						
						String [] msg_array = readStr.split("#");
						//입장 : "IN#홍길동"
						//퇴장 : "OUT#홍길동"
						//                0         1 
						// msg_array = { "IN" , "홍길동"};
						// msg_array = { "OUT", "홍길동"};
						if(msg_array[0].equals("IN")) {
							String display_message 
							  = String.format("▶▶[%s]님 입장", msg_array[1]);
							//채팅출력창에 출력
							my_display_message(display_message);
							
						}else if(msg_array[0].equals("OUT")) {
							String display_message 
							  = String.format("◀◀[%s]님 퇴장", msg_array[1]);
							
							my_display_message(display_message);
						}
						
						
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
						//비정상 종료되었을 때
						break;
					}
				}//end-while
				
				//종료
				
			}
			
		}.start();
		
	}

	protected void my_display_message(String display_message) {
		// TODO Auto-generated method stub
		jta_display.append(display_message+"\r\n");
		int position = jta_display.getDocument().getLength();
		jta_display.setCaretPosition(position);
		
	}

	private void init_user_list() {
		// TODO Auto-generated method stub
		jlist_user = new JList<String>();
		JScrollPane jsp = new JScrollPane(jlist_user);

		jsp.setPreferredSize(new Dimension(150,0));
		
		jlist_user.setFont(font);
		
		this.add(jsp,"East");
				
	}

	

	private void init_display() {
		// TODO Auto-generated method stub
		jta_display = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta_display);
		
		jsp.setPreferredSize(new Dimension(400, 400));
		
		this.add(jsp,"Center");
		
		//font설정
		jta_display.setFont(font);
		//읽기전용
		jta_display.setEditable(false);
		
				
	}

	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_MultiChatClient();
	}
}