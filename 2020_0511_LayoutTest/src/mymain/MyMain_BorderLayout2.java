package mymain;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyMain_BorderLayout2 extends JFrame {

	/*
	 * JFrame �� �⺻ BorderLayout (default) JDialog
	 * 
	 * JPanel �� �⺻ FlowLayout (default)
	 * 
	 * 
	 * 
	 */

	public MyMain_BorderLayout2() {

		// ������ Ÿ��ƲS
		super("Border Layout ����");

		JButton jbt_east = new JButton("East");
		JButton jbt_west = new JButton("West");
		JButton jbt_south = new JButton("South");
		JButton jbt_north = new JButton("North");
		JButton jbt_center = new JButton("Center");

		// comp ��ġ
		this.add(jbt_east, "East");
		this.add(jbt_west, BorderLayout.WEST);
		// ��ġ comp ���� �ٲ㵵 �������
		this.add("South", jbt_south);

		this.add(jbt_north, BorderLayout.NORTH);

		this.add(jbt_center, BorderLayout.CENTER);

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

		new MyMain_BorderLayout2();

	}

}
