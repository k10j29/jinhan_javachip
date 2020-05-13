package mymain;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyMain_ThreadSync extends JFrame {

	JButton jbt_red;
	JButton jbt_yellow;
	JButton jbt_blue;

	// Thread 동기화 관리객체로 사용
	Object syncObj = new Object();

//내부클래스 부분 Thread Runnable 

	class SignalRunnable implements Runnable {

		@Override // 18라인 재정의
		public void run() {

			// Thread 이름 구하기
			String name = Thread.currentThread().getName();
			while (true) {

				System.out.printf("--{%s}---\n", name);
				if (name.equals("R")) {

					synchronized (syncObj) // 다른 Thread가 들어오지못함 (Thread 동기화)

					{

						jbt_red.setBackground(Color.red);
						jbt_yellow.setBackground(Color.DARK_GRAY);
						jbt_blue.setBackground(Color.DARK_GRAY);

						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				} else if (name.equals("Y")) {

					synchronized (syncObj) {

						jbt_red.setBackground(Color.DARK_GRAY);
						jbt_yellow.setBackground(Color.ORANGE);
						jbt_blue.setBackground(Color.DARK_GRAY);

						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				} else if (name.equals("B")) {
					synchronized (syncObj) {
						jbt_red.setBackground(Color.DARK_GRAY);
						jbt_yellow.setBackground(Color.DARK_GRAY);
						jbt_blue.setBackground(Color.BLUE);

						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}

		}

	}

	public MyMain_ThreadSync() {

		// 윈도우 타이틀
		super("Thread Sync");
		setLayout(new GridLayout(1, 3)); // 1행 3열
		jbt_red = new JButton("Red");
		jbt_red.setBackground(Color.red);

		jbt_yellow = new JButton("Yellow");
		jbt_yellow.setBackground(Color.yellow);

		jbt_blue = new JButton("Blue");
		jbt_blue.setBackground(Color.blue);

		this.add(jbt_red);
		this.add(jbt_yellow);
		this.add(jbt_blue);

		// Runnable 객체 (Thread 수행 객체) 생성
		Runnable runnable = new SignalRunnable();

		// Runnable 에 1:1로 하나씩 붙는것
		Thread t_red = new Thread(runnable, "R");
		Thread t_yellow = new Thread(runnable, "Y");
		Thread t_blue = new Thread(runnable, "B");

		// Thread 구동 => 각각의 run() 가 수행되어짐
		t_red.start();
		t_yellow.start();
		t_blue.start();

		// 위치
		super.setLocation(100, 100);
		// 크기
		super.setSize(500, 200);
		// 보여줘라
		super.setVisible(true);
		// 종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new MyMain_ThreadSync();

	}

}