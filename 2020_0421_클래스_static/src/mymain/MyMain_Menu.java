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

		// 윈도우 타이틀
		super("메  뉴  연  습");
		
		//메뉴 초기화
		init_menu();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 위치
		super.setLocation(100, 100);
		// 크기
		super.setSize(300, 300);
		// 보여줘라
		super.setVisible(true);
		// 종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void init_menu() {
	
//1. 메뉴바 만들기
		JMenuBar menuBar = new JMenuBar();
//3. 메뉴만들기
		JMenu menu = new JMenu("색상");
//4. MenuBar 에 menu 추가
		menuBar.add(menu);
		
//5. 메뉴 아이템 추가, Event 처리		
		JMenuItem item_red = new JMenuItem("빨강");
		JMenuItem item_green = new JMenuItem("초록");
		JMenuItem item_blue = new JMenuItem("파랑");
		
		JMenuItem item_exit = new JMenuItem("종");
		
//6. 메뉴에 menuitem 추가
		menu.add(item_red);
		menu.add(item_green);
		menu.addSeparator(); //구분선
		menu.add(item_blue);
		
		
//2. 현재 JFrame 에 넣기		
		this.setJMenuBar(menuBar);
		
//메뉴 이벤트 처리                  (메뉴 이벤트 처리할객체)
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