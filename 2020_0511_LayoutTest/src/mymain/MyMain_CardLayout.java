package mymain;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyMain_CardLayout extends JFrame {

	JPanel mainPanel;
	CardLayout card;

	public MyMain_CardLayout() {
		// TODO Auto-generated constructor stub
		// 타이틀
		super("CardLayout연습");

		// 메뉴생성(North위치에)
		JPanel p = new JPanel(new GridLayout(1, 3));
		this.add(p, "North");

		JButton jbt_card1 = new JButton("card1");
		JButton jbt_card2 = new JButton("card2");
		JButton jbt_card3 = new JButton("card3");

		// 상단Panel에 버튼 3개를 넣는다
		p.add(jbt_card1);
		p.add(jbt_card2);
		p.add(jbt_card3);

		// 버튼이베트 처리
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// ActionEvent : EventSource(발생시킨컴포넌트)
				// 발생시각,etc..
				// 이벤트소스를 찾는 방법1)
				// 이벤트를 발생시킨 컴포넌트정보
				/*
				 * Object event_source = e.getSource(); if(event_source==jbt_card1) {
				 * System.out.println("card1 click"); }else if(event_source==jbt_card2) {
				 * System.out.println("card2 click"); }else if(event_source==jbt_card3) {
				 * System.out.println("card3 click"); }
				 */

				// 방법2) 이벤트소스이 캡션(타이틀)을 이용
				String caption = e.getActionCommand();
				System.out.println(caption);

				if (caption.equals("card1")) {
					card.first(mainPanel);
				} else if (caption.equals("card2")) {
					card.show(mainPanel, "two");
				} else if (caption.equals("card3")) {
					card.last(mainPanel);
				}
				
				// 방법 두번째
			/*	if (caption.equals("card1")) {
					card.show(mainPanel, "one");
				} else if (caption.equals("card2")) {
					card.show(mainPanel, "two");
				} else if (caption.equals("card3")) {
					card.show(mainPanel, "three");
				}
*/
			}
		};
		// 위임이벤트 모델
		// 이벤트소스.addActionListener(처리객체)
		jbt_card1.addActionListener(listener);
		jbt_card2.addActionListener(listener);
		jbt_card3.addActionListener(listener);

		// CardLayout초기화
		card = new CardLayout();
		mainPanel = new JPanel();// default : FlowLayout
		mainPanel.setLayout(card);
		this.add(mainPanel, "Center");

		// card적재...
		mainPanel.add(new Mycard1(), "one");
		mainPanel.add(new Mycard2(), "two");
		mainPanel.add(new Mycard3(), "three");

		// 두번째 카드 보여주기
		card.show(mainPanel, "two");

		
		
		
		
		
		
		
		
		
		
		
		
		
		// 위치
		super.setLocation(100, 100);

		// 크기
		super.setSize(300, 300);

		// 보여줘라
		super.setVisible(true);

		// 종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_CardLayout();
	}
}