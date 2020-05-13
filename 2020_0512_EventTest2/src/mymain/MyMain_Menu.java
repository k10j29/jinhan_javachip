package mymain;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MyMain_Menu extends JFrame {

	JPanel  myPanel;
	
	public MyMain_Menu() {
		// TODO Auto-generated constructor stub
		//Ÿ��Ʋ
		super("�޴�����");
		
		//�г�->Center�� �ֱ�
		myPanel = new JPanel();
		this.add(myPanel,"Center");
		
		
		//�޴��ʱ�ȭ
		init_menu();

		//��ġ
		super.setLocation(100, 100);

		//ũ��
		super.setSize(300, 300);

		//�������
		super.setVisible(true);

		//����
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_menu() {
		// TODO Auto-generated method stub
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("����");
		
		//MenuBar->menu�߰�
		menuBar.add(menu);
		
		//JMenuItem : Eventó��
		JMenuItem item_red   = new JMenuItem("����");
		JMenuItem item_green = new JMenuItem("�ʷ�");
		JMenuItem item_blue  = new JMenuItem("�Ķ�");
		JMenuItem item_custom  = new JMenuItem("�����");
		JMenuItem item_exit  = new JMenuItem("����");
		
		//Menu->menuitem�߰�
		menu.add(item_red);
		menu.add(item_green);
		menu.add(item_blue);
		menu.add(item_custom);
		menu.addSeparator();//���м�
		menu.add(item_exit);
				
		//���� JFrame�� �ֱ�
		this.setJMenuBar(menuBar);
		
		
		//�޴��̺�Ʈ ó��
		
		//�޴��̺�Ʈ�� ó���� ��ü(�͸� ����(Inner class) Ŭ����)
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object evt_source = e.getSource();
				if(evt_source==item_red) {
					myPanel.setBackground(Color.red);
				}else if(evt_source==item_green) {
					myPanel.setBackground(Color.green);
				}else if(evt_source==item_blue) {
					myPanel.setBackground(Color.blue);
				}else if(evt_source==item_custom) {
					
					//�����ķ�Ʈ ����
					Color color = JColorChooser.showDialog(
							                 MyMain_Menu.this,    //�θ�������Ʈ 
							                 "������ �����ϼ���", //����
							                 Color.red);          //�⺻Į��
					//��Ұ� �ƴϸ�
					if(color != null) {
						//���õ� Į�� myPanel�������� ����
						myPanel.setBackground(color);
					}
					
					
				}else if(evt_source==item_exit) {
					System.exit(0);
				}
			}
		};
		
		//�̺�Ʈ���
		item_red.addActionListener(listener);
		item_green.addActionListener(listener);
		item_blue.addActionListener(listener);
		item_custom.addActionListener(listener);
		item_exit.addActionListener(listener);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_Menu();
	}
}






