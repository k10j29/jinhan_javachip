package mymain;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyMain_MoveBall extends JFrame {

	// 게임판의 크기
	final static int GAMEPAN_W = 500;
	final static int GAMEPAN_H = 400;

	JPanel gamePan;

// 공의정보
	int ball_x, ball_y;
	int ball_diameter;

//공의 이동방향
	boolean bRight = true;
	boolean bDown = true;

	Timer timer;

	public MyMain_MoveBall() {
		// TODO Auto-generated constructor stub
		// 타이틀
		super("벽돌부수기");

		// 게임판 초기화
		init_gamepan();

		// 공의 위치 초기화
		ball_diameter = 30;

		ball_x = GAMEPAN_W / 2 - ball_diameter / 2; // 볼의 반지름을 빼야 판 정중앙에 위치
		ball_y = GAMEPAN_H / 2 - ball_diameter / 8;

		// 타이머 초기화
		init_timer();

		// 키이벤트 초기화
		init_key_event();

		// 위치
		super.setLocation(300, 200);

		setResizable(false);// 크기고정
		// 크기
		// super.setSize(300, 300);
		pack();// Frame테두리를 자식윈도우를 감싸라...

		// 보여줘라
		super.setVisible(true);

		// 종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_key_event() {

		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {

				int key = e.getKeyCode();
				if (key == KeyEvent.VK_LEFT) {

				} else if (key == KeyEvent.VK_RIGHT) {

				} else if (key == KeyEvent.VK_UP) {

				} else if (key == KeyEvent.VK_DOWN) {

				}
			}
		});

	}

	private void init_timer() {

		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				process();
				gamePan.repaint();

			}
		};

		// 타이머 생성

		// 딜레이 20 = 50 FPS (Frame Per Sec)
		timer = new Timer(2, listener);
		// timer.start(); // 주기적으로 listener > actionPeformed Call

	}

	// 공이동시키기
	protected void process() {
		move_ball();

	}

	int gan = 1;

	private void move_ball() {

		if (bRight)
			ball_x += gan;
		else
			ball_x -= gan;

		if ((ball_x + ball_diameter) > GAMEPAN_W) {
			ball_x = GAMEPAN_W - ball_diameter;
			bRight = false;

		} else if (ball_x < 0) { // 왼쪽벽에 닿았냐

			ball_x = 0;
			bRight = true;

		}

		// 아래 쪽아 닿았나
		if (bDown)
			ball_y += gan;
		else
			ball_y -= gan;

		if ((ball_y + ball_diameter) > GAMEPAN_H) {

			ball_y = GAMEPAN_H - ball_diameter;
			bDown = false;

		} else if (ball_y < 0) {

			ball_y = 0;
			bDown = true;
		}

	}

	private void init_gamepan() {

		gamePan = new JPanel() {

			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub

				// 이전화면 지우기
				g.clearRect(0, 0, GAMEPAN_W, GAMEPAN_H);

				g.setColor(Color.BLACK);

				g.fillOval(ball_x, ball_y, ball_diameter, ball_diameter);

			}

		};

		// 게임판 크기 예약
		gamePan.setPreferredSize(new Dimension(GAMEPAN_W, GAMEPAN_H));

		this.add(gamePan, "Center");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_MoveBall();
	}
}