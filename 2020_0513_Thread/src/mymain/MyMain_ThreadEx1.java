package mymain;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class MyMain_ThreadEx1 extends JFrame {

	// ProgressBar 만들기

	JProgressBar jpb_red;
	JProgressBar jpb_green;
	JProgressBar jpb_blue;

	Thread t_red;
	Thread t_green;
	Thread t_blue;

//Thread 의 Running 상태 체크	
	boolean bRedRunning = true;
	boolean bGreenRunning = true;
	boolean bBlueRunning = true;

//내부 클래스로 Thread 선언
//아래 내부 클래스에서는 JProgressBar jpb_red; 를 제어
	class RedThread extends Thread {

		@Override // 과거 자신의 메소드를 재정의
		public void run() {
			System.out.println(currentThread().getName());

			// 무한루프 돌리기 빠져나갈수없음
			while (true) {

				try {
					int value = jpb_red.getValue();// 현재값 얻어옴
					value++; // 하나늘어남

					if (value > jpb_red.getMaximum()) // red Progress par의 최대값은 100까지갔다가 다시 0으로
						value = 0;

					jpb_red.setValue(value);

					sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		} // run method (end) 가 종료하는 시점 > 해당 Thread는 소멸이됩니다.

	}

	class GreenThread extends Thread {

		@Override // 과거 자신의 메소드를 재정의
		public void run() {
			System.out.println(currentThread().getName());

			// 무한루프 돌리기 빠져나갈수없음
			while (true) {

				try {
					int value = jpb_green.getValue();// 현재값 얻어옴
					value++; // 하나늘어남

					if (value > jpb_green.getMaximum()) // red Progress par의 최대값은 100까지갔다가 다시 0으로
						value = 0;

					jpb_green.setValue(value);

					sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		} // run method (end) 가 종료하는 시점 > 해당 Thread는 소멸이됩니다.

	}

	class BlueThread extends Thread {

		@Override // 과거 자신의 메소드를 재정의
		public void run() {

			System.out.println(currentThread().getName());

			// 무한루프 돌리기 빠져나갈수없음
			while (true) {

				try {
					int value = jpb_blue.getValue();// 현재값 얻어옴
					value++; // 하나늘어남

					if (value > jpb_blue.getMaximum()) // red Progress par의 최대값은 100까지갔다가 다시 0으로
						value = 0;

					jpb_blue.setValue(value);

					sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		} // run method (end) 가 종료하는 시점 > 해당 Thread는 소멸이됩니다.

	}

	public MyMain_ThreadEx1() {

		// 윈도우 타이틀
		super("Thread 연습");

		this.setLayout(new GridLayout(6, 1));

		jpb_red = new JProgressBar();
		jpb_red.setForeground(Color.red);
		JButton jbt_red = new JButton("Pause");// 중지버튼
		jbt_red.setForeground(Color.RED); // 글자색

		jpb_green = new JProgressBar();
		jpb_green.setForeground(Color.green);
		JButton jbt_green = new JButton("Pause");// 중지버튼
		jbt_green.setForeground(Color.GREEN); // 글자색

		jpb_blue = new JProgressBar();
		jpb_blue.setForeground(Color.blue);
		JButton jbt_blue = new JButton("Pause");// 중지버튼
		jbt_blue.setForeground(Color.blue); // 글자색

		this.add(jpb_red);
		this.add(jbt_red); // 만든 버튼 사이사이에 넣기 138 라인
		this.add(jpb_green);
		this.add(jbt_green);
		this.add(jpb_blue);
		this.add(jbt_blue);

		// 임의값넣기
		jpb_red.setValue(70);
		jpb_green.setValue(30);
		jpb_blue.setValue(20);

//버튼이벤트

		jbt_red.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bRedRunning = !bRedRunning; // 토글 방식 (ture 시켰다 false 시켰다)
				if (bRedRunning == false) {
					// 일시정지
					t_red.suspend(); // 일시정지 시키는 기능
					jbt_red.setText("Resume");
				} else {
					t_red.resume(); // 아니면 재가동 시켜라
					jbt_red.setText("Pause");
				}
			}
		});

		jbt_green.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bGreenRunning = !bGreenRunning;
				if (bGreenRunning == false) {
					// 일시정지
					jbt_green.setText("Resume");
					t_green.suspend(); // 일시정지 시키는 기능
				} else {
					t_green.resume(); // 아니면 재가동 시켜라
					jbt_green.setText("Pause");
				}
			}
		});

		jbt_blue.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bBlueRunning = !bBlueRunning;
				if (bBlueRunning == false) {
					// 일시정지
					t_blue.suspend(); // 일시정지 시키는 기능
					jbt_blue.setText("Resume");
				} else {
					t_blue.resume(); // 아니면 재가동 시켜라
					jbt_blue.setText("pause");
				}
			}
		});

//RedThread 생성하고 구동시킴 (이전작업 19라인 재정의)

//서브 Thread (자식 Thread)
		t_red = new RedThread();
		t_red.start(); // Runnable(대기) => Running (수행상태 run method 진입)

		t_green = new GreenThread();
		t_green.start(); // Runnable(대기) => Running (수행상태 run method 진입)

		t_blue = new BlueThread();
		t_blue.start(); // Runnable(대기) => Running (수행상태 run method 진입)

		// 위치
		super.setLocation(100, 100);
		// 크기
		super.setSize(400, 300);
		// 보여줘라
		super.setVisible(true);
		// 종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) { // Primary Thread (주 쓰레드)

		System.out.println(Thread.currentThread().getName());

		new MyMain_ThreadEx1();

	}

}
