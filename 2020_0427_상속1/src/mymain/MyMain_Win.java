package mymain;

import java.awt.Dimension;

//AWT (Abstract Window Toolkit)

import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

//생성자 : 초기화 하는 기능

public class MyMain_Win extends JFrame {

	// 화면 해상도
	int screen_w, screen_h;

	public MyMain_Win() {

		super(" 가영아 안녕 ");

		// 해상도 구하는 식
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

		screen_w = d.width;
		screen_h = d.height;

		System.out.printf("%dx%d\n", screen_h, screen_w);
		// 위치 설정
		super.setLocation(100, 100);

		// 크기 설정
		super.setSize(300, 300);

		// 크기 조절 불가능
		super.setResizable(false);

		// 화면 표출
		super.setVisible(true);

		// 종료 코드 (JFrame 안에)
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 키보드 이벤트 설정
		this.addKeyListener(new KeyAdapter() {

			// 키가 눌렸을때 발생
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyPressed(e);

				// 눌린 키값 얻기 : 가상
				int key = e.getKeyCode();
				// System.out.println(e);

				// 현재 윈도우 위치 구하
				MyMain_Win.this.getLocation();

				Point pt = getLocation();
				System.out.printf("x=%d y=%d\n", pt.x, pt.y);

				if (key == KeyEvent.VK_LEFT) {
					pt.x = pt.x - 10;
				} else if (key == KeyEvent.VK_RIGHT) {
					pt.x = pt.x + 10;
				} else if (key == KeyEvent.VK_UP) {
					pt.y = pt.y - 10;
				} else if (key == KeyEvent.VK_DOWN) {
					pt.y = pt.y + 10;
				}

				// 상 하 좌 위 외부체크
				// Point pt2.getLocation(-290, 100);

				if (pt.x > 1920) {
					pt.x = -300;

				} else if (pt.x < -300) {
					pt.x = 1920; //pt.x 가 -300보다 작아지면 pt.x는 (왼쪽상단 기준) 1920 으로 이동

				} else if (pt.y > 1080) {
					pt.y = -300;

				} else if (pt.y < -300) {
					pt.y = 1080;
				}

				// 바뀐 좌표로 이동시키기
				setLocation(pt);

			}

		});

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MyMain_Win();

	}

}
