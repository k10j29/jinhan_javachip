package mymain;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyMain_BorderLayout2 extends JFrame {

	/*
	 * JFrame 은 기본 BorderLayout (default) JDialog
	 * 
	 * JPanel 은 기본 FlowLayout (default)
	 * 
	 * 
	 * 
	 */

	public MyMain_BorderLayout2() {

		// 윈도우 타이틀S
		super("Border Layout 연습");

		JButton jbt_east = new JButton("East");
		JButton jbt_west = new JButton("West");
		JButton jbt_south = new JButton("South");
		JButton jbt_north = new JButton("North");
		JButton jbt_center = new JButton("Center");

		// comp 위치
		this.add(jbt_east, "East");
		this.add(jbt_west, BorderLayout.WEST);
		// 위치 comp 순서 바꿔도 상관없음
		this.add("South", jbt_south);

		this.add(jbt_north, BorderLayout.NORTH);

		this.add(jbt_center, BorderLayout.CENTER);

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

		new MyMain_BorderLayout2();

	}

}
