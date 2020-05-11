package mymian;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class MyMain_GridLayout extends JFrame {

	public MyMain_GridLayout() {

		// 윈도우 타이틀
		super("");
		
		GridLayout gl = new GridLayout(3, 4, 10, 10)
				
				this.setLayout(gl);
		
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