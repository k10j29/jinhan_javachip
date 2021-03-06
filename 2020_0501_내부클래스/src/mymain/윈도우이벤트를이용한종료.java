package mymain;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class 윈도우이벤트를이용한종료 extends JFrame implements WindowListener {

	public 윈도우이벤트를이용한종료() {

		// 윈도우 타이틀
		super("");
		// 위치
		super.setLocation(100, 100);
		// 크기
		super.setSize(300, 300);
		// 보여줘라
		super.setVisible(true);
		// 종료

		// 이벤트 처리를 위암받은 객체 this는 WindowListener Interface 재정의해놔야
		this.addWindowListener(this);
	}

	public static void main(String[] args) {

		new BaseWin();

	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {

		System.exit(0);

	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {

	}

	@Override
	public void windowIconified(WindowEvent e) {

	}

	@Override
	public void windowOpened(WindowEvent e) {

	}

}
