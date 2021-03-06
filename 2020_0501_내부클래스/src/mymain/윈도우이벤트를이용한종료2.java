package mymain;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class 윈도우이벤트를이용한종료2 extends JFrame {

	public 윈도우이벤트를이용한종료2() {
		// TODO Auto-generated constructor stub
		//타이틀
		super("");

		//위치
		super.setLocation(100, 100);

		//크기
		super.setSize(300, 300);

		//보여줘라
		super.setVisible(true);

		//종료
		//super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// class WindowAdapter  implements WindowListener{}
		// : WindowListener interface를 이미 재정의해놓은 
		//   추상클래스
		// 로컬내부클래스
		/*
		class MyWindowAdapter extends WindowAdapter
		{
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		}
		WindowListener listener = new MyWindowAdapter();
		*/
		
		//WindowAdapter adapter = new WindowAdapter() {};
		
		//(로컬)익명(anonymous)내부클래스
		/*
		WindowListener listener = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		};
		this.addWindowListener(listener);
		*/
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 윈도우이벤트를이용한종료2();
	}
}