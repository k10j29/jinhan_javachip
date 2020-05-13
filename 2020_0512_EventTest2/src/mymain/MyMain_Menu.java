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
		//타이틀
		super("메뉴연습");
		
		//패널->Center에 넣기
		myPanel = new JPanel();
		this.add(myPanel,"Center");
		
		
		//메뉴초기화
		init_menu();

		//위치
		super.setLocation(100, 100);

		//크기
		super.setSize(300, 300);

		//보여줘라
		super.setVisible(true);

		//종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_menu() {
		// TODO Auto-generated method stub
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("색상");
		
		//MenuBar->menu추가
		menuBar.add(menu);
		
		//JMenuItem : Event처리
		JMenuItem item_red   = new JMenuItem("빨강");
		JMenuItem item_green = new JMenuItem("초록");
		JMenuItem item_blue  = new JMenuItem("파랑");
		JMenuItem item_custom  = new JMenuItem("사용자");
		JMenuItem item_exit  = new JMenuItem("종료");
		
		//Menu->menuitem추가
		menu.add(item_red);
		menu.add(item_green);
		menu.add(item_blue);
		menu.add(item_custom);
		menu.addSeparator();//구분선
		menu.add(item_exit);
				
		//현재 JFrame에 넣기
		this.setJMenuBar(menuBar);
		
		
		//메뉴이벤트 처리
		
		//메뉴이벤트를 처리할 객체(익명 내부(Inner class) 클래스)
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
					
					//색상파렛트 띄우기
					Color color = JColorChooser.showDialog(
							                 MyMain_Menu.this,    //부모컨포넌트 
							                 "색상을 선택하세요", //제목
							                 Color.red);          //기본칼라
					//취소가 아니면
					if(color != null) {
						//선택된 칼라를 myPanel색상으로 지정
						myPanel.setBackground(color);
					}
					
					
				}else if(evt_source==item_exit) {
					System.exit(0);
				}
			}
		};
		
		//이벤트등록
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






