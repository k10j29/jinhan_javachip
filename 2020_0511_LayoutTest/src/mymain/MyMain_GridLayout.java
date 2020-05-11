package mymain;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyMain_GridLayout extends JFrame {

	public MyMain_GridLayout() {

		// 윈도우 타이틀
		super("Grid 연습");

		GridLayout gl = new GridLayout(6, 4, 1, 1);

		this.setLayout(gl);

		// 행기준으로, 항상 3행을 유지함
		// 열은 늘어날수도 줄어들수도
		for (int i = 1; i <= 24; i++) {

			String title = String.format("버튼%01d", i);
			JButton jbt = new JButton(title);
			this.add(jbt);
		}

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

		new MyMain_GridLayout();

	}

}