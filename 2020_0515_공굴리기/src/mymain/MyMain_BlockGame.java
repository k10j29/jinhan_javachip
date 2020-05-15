package mymain;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class MyMain_BlockGame extends JFrame {

	// 게임판의 크기
	final static int GAMEPAN_W = 500;
	final static int GAMEPAN_H = 400;

	JPanel gamePan;

	// 공의정보
	int ball_x, ball_y;
	int ball_diameter;// 지름

	// 공의 이동방향
	boolean bRight = true;
	boolean bDown = true;

	// 타이머
	Timer timer;

	// Bar생성
	Bar bar = new Bar();

	// 현재 키눌림상태
	int key_state = 0;

	public MyMain_BlockGame() {
		// TODO Auto-generated constructor stub
		// 타이틀
		super("벽돌깨기");

		// 게임판 초기화
		init_gamepan();

		// Bar & Ball 초기화
		init_bar();

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

	private void init_bar() {
		// TODO Auto-generated method stub
		int bar_width = 120;
		int bar_height = 15;

		// Bar 위치
		bar.pos.x = GAMEPAN_W / 2 - bar_width / 2;
		bar.pos.y = GAMEPAN_H - bar_height - 5;
		bar.pos.width = bar_width;
		bar.pos.height = bar_height;

		// 공초기화
		ball_diameter = 20;
		ball_x = GAMEPAN_W / 2 - ball_diameter / 2;
		ball_y = bar.pos.y - ball_diameter;
		// 공방향 초기화
		bRight = true;
		bDown = false;

	}

	private void init_key_event() {
		// TODO Auto-generated method stub
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				// 눌린키값
				int key = e.getKeyCode();

				// 'S' Key가 눌리면
				if (key == KeyEvent.VK_S) {
					if (timer != null)
						timer.start();
				}

				if (key == KeyEvent.VK_LEFT) {

					key_state = key_state | Key.LEFT;

				} else if (key == KeyEvent.VK_RIGHT) {

					key_state = key_state | Key.RIGHT;

				} else if (key == KeyEvent.VK_UP) {

					key_state = key_state | Key.UP;

				} else if (key == KeyEvent.VK_DOWN) {

					key_state = key_state | Key.DOWN;
				}
			}// end-keyPressed

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				// 뗀 키값
				int key = e.getKeyCode();

				if (key == KeyEvent.VK_LEFT) {

					key_state = key_state ^ Key.LEFT;

				} else if (key == KeyEvent.VK_RIGHT) {

					key_state = key_state ^ Key.RIGHT;

				} else if (key == KeyEvent.VK_UP) {

					key_state = key_state ^ Key.UP;

				} else if (key == KeyEvent.VK_DOWN) {

					key_state = key_state ^ Key.DOWN;
				}
			}

		});
	}

	private void init_timer() {
		// TODO Auto-generated method stub
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// System.out.println(e);
				process();

				gamePan.repaint();

			}
		};

		// 타이머 생성 : 50 FPS(Frame Per Sec)
		timer = new Timer(10, listener);
		// timer.start();//주기적으로 listener->actionPeformed Call

	}

	protected void process() {
		// TODO Auto-generated method stub
		// 공이동
		move_ball();

		// Bar이동
		move_bar();

		// 공과 바의 충돌체크
		collision_ball_bar();

	}

	private void collision_ball_bar() {
		// TODO Auto-generated method stub
		// 볼의 하단중심지점(충돌지점)
		int cx = ball_x + ball_diameter / 2;
		int cy = ball_y + ball_diameter;

		// bar와 충돌이 되었으면...
		if (bar.pos.contains(cx, cy)) {
			bDown = false;
			return;
		}

		// 화면 하단에 맞은경우
		if (cy >= GAMEPAN_H) {
			timer.stop();
			init_bar();
			gamePan.repaint();
			// 메시지 다이아로그
			JOptionPane.showMessageDialog(this, "Game Over");
		}

	}

	private void move_bar() {
		// TODO Auto-generated method stub

		if (key_state == Key.LEFT) {

			bar.pos.x -= 5;

		} else if (key_state == Key.RIGHT) {

			bar.pos.x += 5;
		}

		if (bar.pos.x < 0) {// 왼쪽벽에 닿았냐?
			bar.pos.x = 0;

		} else if (bar.pos.x > GAMEPAN_W - bar.pos.width) {
			bar.pos.x = GAMEPAN_W - bar.pos.width;

		}

	}

	int gan = 3;

	private void move_ball() {
		// TODO Auto-generated method stub
		// 좌우
		if (bRight)
			ball_x += gan;// Right
		else
			ball_x -= gan;// Left

		// 상하
		if (bDown)
			ball_y += gan;// Down
		else
			ball_y -= gan;// Up

		// 오른쪽벽에 닿았냐?
		if ((ball_x + ball_diameter) > GAMEPAN_W) {

			ball_x = GAMEPAN_W - ball_diameter;

			bRight = false;

		} else if (ball_x < 0) {// 왼쪽벽에 닿았냐?
			ball_x = 0;
			bRight = true;
		}

		// 아래쪽 닿았냐?
		if ((ball_y + ball_diameter) > GAMEPAN_H) {
			bDown = false;
		} else if (ball_y < 0) {// 윗쪽 닿은경우
			bDown = true;
		}

	}

	private void init_gamepan() {
		// TODO Auto-generated method stub
		gamePan = new JPanel() {

			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub

				// 이전화면 지우기
				g.clearRect(0, 0, GAMEPAN_W, GAMEPAN_H);

				// 공그리기
				g.setColor(Color.red);

				g.fillOval(ball_x, ball_y, ball_diameter, ball_diameter);

				// Bar 그리기
				bar.draw(g);

			}

		};

		// 게임판 크기 예약
		gamePan.setPreferredSize(new Dimension(GAMEPAN_W, GAMEPAN_H));

		this.add(gamePan, "Center");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_BlockGame();
	}
}