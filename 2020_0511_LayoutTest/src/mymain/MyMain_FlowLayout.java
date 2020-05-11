package mymain;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyMain_FlowLayout extends JFrame {

	public MyMain_FlowLayout() {

		// 윈도우 타이틀
		super("FlowLayout 연습");

		
		FlowLayout fl = new FlowLayout(FlowLayout.RIGHT, 10 ,15);
		this.setLayout(fl); // 배치방법 변경 (BorderLayout > FlowLayout)

		for (int i = 0; i <= 10; i++) {
			
			String title = String.format("%01d",i);
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

		new MyMain_FlowLayout();

	}

}