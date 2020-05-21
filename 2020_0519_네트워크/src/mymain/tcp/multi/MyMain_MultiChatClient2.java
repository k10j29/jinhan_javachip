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

	
	JTextArea  jta_display;   //���â
	
	JTextField jtf_message;   //�޽��� â

	
	JButton    jbt_connect;   //�����ư
	boolean    bConnect = false;//�������
	String user_name = "ȫ�浿";
	
	Socket client;
	
	
	
	JList<String> jlist_user; //�����ڸ��
	
	Font font = new Font("����ü",Font.BOLD,18);
	
	
	public MyMain_MultiChatClient2() {
		// TODO Auto-generated constructor stub
		//Ÿ��Ʋ
		super("TCP��Ƽ Ŭ���̾�Ʈ");
		
		//���â �ʱ�ȭ
		init_display();
		
		//�Է�â �ʱ�ȭ
		init_input();
				
		
		//�����ڸ�� �ʱ�ȭ
		init_user_list();
		
		

		//��ġ
		super.setLocation(100, 100);

		//ũ��
		pack();
		//super.setSize(300, 300);

		//�������
		super.setVisible(true);

		//����
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_input() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel(new BorderLayout());
		
		jtf_message = new JTextField();//�޽��� â
		jbt_connect = new JButton("����");
		
		jbt_connect.setPreferredSize(new Dimension(150, 0));
		
		p.add(jtf_message,"Center");
		p.add(jbt_connect,"East");
				
		
		this.add(p,"South");
		
        //����(����)��ư�� ������		
		jbt_connect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				bConnect = !bConnect;
				if(bConnect) { //����
					on_connect();
				}else {//����
					on_close();
				}
				
				//��ư ĸ�� ����
				jbt_connect.setText(bConnect?"����":"����");
				
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
			
			//����޽��� ���� :   "IN#ȫ�浿\n"
			String send_data = String.format("IN#%s\n", user_name);
			client.getOutputStream().write(send_data.getBytes());
			
			//������ ����
			my_read_message();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	BufferedReader br=null;
	private void my_read_message() {
		// TODO Auto-generated method stub
		
		//���Ž�Ʈ�� ����
		try {
			InputStreamReader isr = new InputStreamReader(client.getInputStream());
			br = new BufferedReader(isr);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//���ſ� ������ ����/����
		new Thread() {
			
			public void run() {
				
				while(true) {
					
					try {
						String readStr = br.readLine();
						//����: close()
						if(readStr==null)break;
						
						String [] msg_array = readStr.split("#");
						//���� : "IN#ȫ�浿"
						//���� : "OUT#ȫ�浿"
						//                0         1 
						// msg_array = { "IN" , "ȫ�浿"};
						// msg_array = { "OUT", "ȫ�浿"};
						if(msg_array[0].equals("IN")) {
							String display_message 
							  = String.format("����[%s]�� ����", msg_array[1]);
							//ä�����â�� ���
							my_display_message(display_message);
							
						}else if(msg_array[0].equals("OUT")) {
							String display_message 
							  = String.format("����[%s]�� ����", msg_array[1]);
							
							my_display_message(display_message);
						}
						
						
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
						//������ ����Ǿ��� ��
						break;
					}
				}//end-while
				
				//����
				
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
		
		//font����
		jta_display.setFont(font);
		//�б�����
		jta_display.setEditable(false);
		
				
	}

	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_MultiChatClient();
	}
}