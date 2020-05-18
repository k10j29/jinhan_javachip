package mymain;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyMain_BlockGame2 extends JFrame {

	// 게임판의 크기
	final static int GAMEPAN_W = 1000;
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

	// Block
	Block[][] block_array = null;// new Block[5][7];
	int block_count = 0;

	int stage = 0;

	public MyMain_BlockGame2() {
		// TODO Auto-generated constructor stub
		// 타이틀
		super("벽돌깨기");

		// 게임판 초기화
		init_gamepan();

		// Bar & Ball 초기화
		init_bar();

		// Block 초기화
		// init_block();
		open_stage(0);

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

	private void open_stage(int stage) {
		// TODO Auto-generated method stub
		String filename = String.format("stage%d.dat", stage);

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(filename);
			ois = new ObjectInputStream(fis);
			block_array = (Block[][]) ois.readObject();

			repaint();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			try {
				if (ois != null)
					ois.close();
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	private void init_bar() {
		// TODO Auto-generated method stub
		int bar_width = 1000;
		int bar_height = 30;

		// Bar 위치
		bar.color = Color.black;
		bar.pos.x = GAMEPAN_W / 2 - bar_width / 2;
		bar.pos.y = GAMEPAN_H - bar_height - 5;
		bar.pos.width = bar_width;
		bar.pos.height = bar_height;

		// 공초기화
		ball_diameter = 10;
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
				if (key == KeyEvent.VK_ENTER) {

					// 행수 * 열수
					/*
					 * block_count = block_array.length * block_array[0].length;
					 */
					// if(timer!=null)
					block_count = 0;
					for (int i = 0; i < block_array.length; i++) {// 행수
						for (int k = 0; k < block_array[i].length; k++) {// 열수
							if (block_array[i][k].bShow)
								block_count++;
						}
					}

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
		timer = new Timer(1, listener);
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

		// 공과 Block간의 충돌체크
		collision_ball_block();

	}

	private void collision_ball_block() {
		// TODO Auto-generated method stub

		// 블럭의 하단충돌시 체크
		if (bDown == false) {// 윗쪽이동시만 체크
			collision_block_bottom();
		} else if (bDown == true) {
			collision_block_top();
		}

		if (bRight) {
			collision_block_left();
		} else if (bRight == false) {
			collision_block_right();
		}

	}

	private void collision_block_right() {
		// TODO Auto-generated method stub
		// 공의 충돌지점 좌표
		int cx = ball_x;
		int cy = ball_y + ball_diameter / 2;

		// 블럭의 폭/높이
		int block_h = block_array[0][0].pos.height;
		int block_w = block_array[0][0].pos.width;

		// 블럭이 없는 영역에서는 체크종료해라..
		if (cy >= block_h * block_array.length)
			return;

		// 충돌된 블럭의 첨자를 구하기
		int row = cy / block_h;
		int col = cx / block_w;

		int rows = block_array.length;
		int cols = block_array[0].length;

		// 계산된 첨자가 유효범위를 넘어가면..
		if (row < 0 || row >= rows)
			return;
		if (col < 0 || col >= cols)
			return;

		// 블럭이 이미 깨진상태면...
		if (block_array[row][col].bShow == false)
			return;

		// 블럭을 깨진상태로 전환
		block_array[row][col].bShow = false;

		// 공방향 전환(좌->우)
		bRight = true;

		end_check();

	}

	private void end_check() {
		// TODO Auto-generated method stub
		block_count--;

		setTitle("남은 블럭수:" + block_count);

		if (block_count == 0) {
			timer.stop();

			init_bar();
			gamePan.repaint();
			key_state = 0;

			stage++;
			open_stage(stage);
			repaint();

			// Stage1 -> Stage2
			JOptionPane.showMessageDialog(this, "Stage Clear");
		}
	}

	private void collision_block_left() {
		// TODO Auto-generated method stub
		// 공의 충돌지점 좌표
		int cx = ball_x + ball_diameter;
		int cy = ball_y + ball_diameter / 2;

		// 블럭의 폭/높이
		int block_h = block_array[0][0].pos.height;
		int block_w = block_array[0][0].pos.width;

		// 블럭이 없는 영역에서는 체크종료해라..
		if (cy >= block_h * block_array.length)
			return;

		// 충돌된 블럭의 첨자를 구하기
		int row = cy / block_h;
		int col = cx / block_w;

		int rows = block_array.length;
		int cols = block_array[0].length;

		// 계산된 첨자가 유효범위를 넘어가면..
		if (row < 0 || row >= rows)
			return;
		if (col < 0 || col >= cols)
			return;

		// 블럭이 이미 깨진상태면...
		if (block_array[row][col].bShow == false)
			return;

		// 블럭을 깨진상태로 전환
		block_array[row][col].bShow = false;

		// 공방향 전환(우->좌)
		bRight = false;

		end_check();

	}

	private void collision_block_top() {
		// TODO Auto-generated method stub
		// 공의 충돌지점 좌표
		int cx = ball_x + ball_diameter / 2;
		int cy = ball_y + ball_diameter;

		// 블럭의 폭/높이
		int block_h = block_array[0][0].pos.height;
		int block_w = block_array[0][0].pos.width;

		// 블럭이 없는 영역에서는 체크종료해라..
		if (cy >= block_h * block_array.length)
			return;

		// 충돌된 블럭의 첨자를 구하기
		int row = cy / block_h;
		int col = cx / block_w;

		int rows = block_array.length;
		int cols = block_array[0].length;

		// 계산된 첨자가 유효범위를 넘어가면..
		if (row < 0 || row >= rows)
			return;
		if (col < 0 || col >= cols)
			return;

		// 블럭이 이미 깨진상태면...
		if (block_array[row][col].bShow == false)
			return;

		// 블럭을 깨진상태로 전환
		block_array[row][col].bShow = false;

		// 공방향 전환(아래->위)
		bDown = false;

		end_check();
	}

	private void collision_block_bottom() {
		// TODO Auto-generated method stub
		// 공의 충돌지점 좌표
		int cx = ball_x + ball_diameter / 2;
		int cy = ball_y;

		// 블럭의 폭/높이
		int block_h = block_array[0][0].pos.height;
		int block_w = block_array[0][0].pos.width;

		// 블럭이 없는 영역에서는 체크종료해라..
		if (cy >= block_h * block_array.length)
			return;

		// 충돌된 블럭의 첨자를 구하기
		int row = cy / block_h;
		int col = cx / block_w;

		int rows = block_array.length;
		int cols = block_array[0].length;

		// 계산된 첨자가 유효범위를 넘어가면..
		if (row < 0 || row >= rows)
			return;
		if (col < 0 || col >= cols)
			return;

		// 블럭이 이미 깨진상태면...
		if (block_array[row][col].bShow == false)
			return;

		// 블럭을 깨진상태로 전환
		block_array[row][col].bShow = false;

		// 공방향 전환(위->아래)
		bDown = true;

		end_check();

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

			key_state = 0;

			// 메시지 다이아로그
			JOptionPane.showMessageDialog(this, "Game Over");
		}

	}

	private void move_bar() {
		// TODO Auto-generated method stub

		if (key_state == Key.LEFT) {

			bar.pos.x -= 5;
			// 왼쪽 나가기 막기
			if (bar.pos.x < 0)
				bar.pos.x = 0;

		} else if (key_state == Key.RIGHT) {

			bar.pos.x += 5;

			// 오른쪽 나가기 막기
			if ((bar.pos.x + bar.pos.width) > GAMEPAN_W) {
				bar.pos.x = GAMEPAN_W - bar.pos.width;
			}
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

				// Block 그리기
				draw_block(g);

				// Bar 그리기
				bar.draw(g);

			}

		};

		// 게임판 크기 예약
		gamePan.setPreferredSize(new Dimension(GAMEPAN_W, GAMEPAN_H));

		this.add(gamePan, "Center");

	}

	protected void draw_block(Graphics g) {
		// TODO Auto-generated method stub
		for (int i = 0; i < block_array.length; i++) {// 행수
			for (int k = 0; k < block_array[i].length; k++) {// 열수
				block_array[i][k].draw(g);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_BlockGame2();
	}
}