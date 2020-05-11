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
		// Ÿ��Ʋ
		super("CardLayout����");

		// �޴�����(North��ġ��)
		JPanel p = new JPanel(new GridLayout(1, 3));
		this.add(p, "North");

		JButton jbt_card1 = new JButton("card1");
		JButton jbt_card2 = new JButton("card2");
		JButton jbt_card3 = new JButton("card3");

		// ���Panel�� ��ư 3���� �ִ´�
		p.add(jbt_card1);
		p.add(jbt_card2);
		p.add(jbt_card3);

		// ��ư�̺�Ʈ ó��
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// ActionEvent : EventSource(�߻���Ų������Ʈ)
				// �߻��ð�,etc..
				// �̺�Ʈ�ҽ��� ã�� ���1)
				// �̺�Ʈ�� �߻���Ų ������Ʈ����
				/*
				 * Object event_source = e.getSource(); if(event_source==jbt_card1) {
				 * System.out.println("card1 click"); }else if(event_source==jbt_card2) {
				 * System.out.println("card2 click"); }else if(event_source==jbt_card3) {
				 * System.out.println("card3 click"); }
				 */

				// ���2) �̺�Ʈ�ҽ��� ĸ��(Ÿ��Ʋ)�� �̿�
				String caption = e.getActionCommand();
				System.out.println(caption);

				if (caption.equals("card1")) {
					card.first(mainPanel);
				} else if (caption.equals("card2")) {
					card.show(mainPanel, "two");
				} else if (caption.equals("card3")) {
					card.last(mainPanel);
				}
				
				// ��� �ι�°
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
		// �����̺�Ʈ ��
		// �̺�Ʈ�ҽ�.addActionListener(ó����ü)
		jbt_card1.addActionListener(listener);
		jbt_card2.addActionListener(listener);
		jbt_card3.addActionListener(listener);

		// CardLayout�ʱ�ȭ
		card = new CardLayout();
		mainPanel = new JPanel();// default : FlowLayout
		mainPanel.setLayout(card);
		this.add(mainPanel, "Center");

		// card����...
		mainPanel.add(new Mycard1(), "one");
		mainPanel.add(new Mycard2(), "two");
		mainPanel.add(new Mycard3(), "three");

		// �ι�° ī�� �����ֱ�
		card.show(mainPanel, "two");

		
		
		
		
		
		
		
		
		
		
		
		
		
		// ��ġ
		super.setLocation(100, 100);

		// ũ��
		super.setSize(300, 300);

		// �������
		super.setVisible(true);

		// ����
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_CardLayout();
	}
}