package mymain;

import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MyMain_Menu extends JFrame {

	public MyMain_Menu() {

		// ������ Ÿ��Ʋ
		super("��  ��  ��  ��");
		
		//�޴� �ʱ�ȭ
		init_menu();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// ��ġ
		super.setLocation(100, 100);
		// ũ��
		super.setSize(300, 300);
		// �������
		super.setVisible(true);
		// ����
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void init_menu() {
	
//1. �޴��� �����
		JMenuBar menuBar = new JMenuBar();
//3. �޴������
		JMenu menu = new JMenu("����");
//4. MenuBar �� menu �߰�
		menuBar.add(menu);
		
//5. �޴� ������ �߰�, Event ó��		
		JMenuItem item_red = new JMenuItem("����");
		JMenuItem item_green = new JMenuItem("�ʷ�");
		JMenuItem item_blue = new JMenuItem("�Ķ�");
		
		JMenuItem item_exit = new JMenuItem("��");
		
//6. �޴��� menuitem �߰�
		menu.add(item_red);
		menu.add(item_green);
		menu.addSeparator(); //���м�
		menu.add(item_blue);
		
		
//2. ���� JFrame �� �ֱ�		
		this.setJMenuBar(menuBar);
		
//�޴� �̺�Ʈ ó��                  (�޴� �̺�Ʈ ó���Ұ�ü)
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
	}

	public static void main(String[] args) {

		new MyMain_Menu();

	}

}