package mymain;

import javax.swing.JFrame;

public class BaseWin extends JFrame {

	public BaseWin() {

		// 윈도우 타이틀
		super("");
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

		new BaseWin();

	}

}
