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

	// �������� ũ��
	final static int GAMEPAN_W = 1000;
	final static int GAMEPAN_H = 400;

	JPanel gamePan;

	// ��������
	int ball_x, ball_y;
	int ball_diameter;// ����

	// ���� �̵�����
	boolean bRight = true;
	boolean bDown = true;

	// Ÿ�̸�
	Timer timer;

	// Bar����
	Bar bar = new Bar();

	// ���� Ű��������
	int key_state = 0;

	// Block
	Block[][] block_array = null;// new Block[5][7];
	int block_count = 0;

	int stage = 0;

	public MyMain_BlockGame2() {
		// TODO Auto-generated constructor stub
		// Ÿ��Ʋ
		super("��������");

		// ������ �ʱ�ȭ
		init_gamepan();

		// Bar & Ball �ʱ�ȭ
		init_bar();

		// Block �ʱ�ȭ
		// init_block();
		open_stage(0);

		// Ÿ�̸� �ʱ�ȭ
		init_timer();

		// Ű�̺�Ʈ �ʱ�ȭ
		init_key_event();

		// ��ġ
		super.setLocation(300, 200);

		setResizable(false);// ũ�����
		// ũ��
		// super.setSize(300, 300);
		pack();// Frame�׵θ��� �ڽ������츦 ���ζ�...

		// �������
		super.setVisible(true);

		// ����
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

		// Bar ��ġ
		bar.color = Color.black;
		bar.pos.x = GAMEPAN_W / 2 - bar_width / 2;
		bar.pos.y = GAMEPAN_H - bar_height - 5;
		bar.pos.width = bar_width;
		bar.pos.height = bar_height;

		// ���ʱ�ȭ
		ball_diameter = 10;
		ball_x = GAMEPAN_W / 2 - ball_diameter / 2;
		ball_y = bar.pos.y - ball_diameter;
		// ������ �ʱ�ȭ
		bRight = true;
		bDown = false;

	}

	private void init_key_event() {
		// TODO Auto-generated method stub
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				// ����Ű��
				int key = e.getKeyCode();

				// 'S' Key�� ������
				if (key == KeyEvent.VK_ENTER) {

					// ��� * ����
					/*
					 * block_count = block_array.length * block_array[0].length;
					 */
					// if(timer!=null)
					block_count = 0;
					for (int i = 0; i < block_array.length; i++) {// ���
						for (int k = 0; k < block_array[i].length; k++) {// ����
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
				// �� Ű��
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

		// Ÿ�̸� ���� : 50 FPS(Frame Per Sec)
		timer = new Timer(1, listener);
		// timer.start();//�ֱ������� listener->actionPeformed Call

	}

	protected void process() {
		// TODO Auto-generated method stub
		// ���̵�
		move_ball();

		// Bar�̵�
		move_bar();

		// ���� ���� �浹üũ
		collision_ball_bar();

		// ���� Block���� �浹üũ
		collision_ball_block();

	}

	private void collision_ball_block() {
		// TODO Auto-generated method stub

		// ���� �ϴ��浹�� üũ
		if (bDown == false) {// �����̵��ø� üũ
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
		// ���� �浹���� ��ǥ
		int cx = ball_x;
		int cy = ball_y + ball_diameter / 2;

		// ���� ��/����
		int block_h = block_array[0][0].pos.height;
		int block_w = block_array[0][0].pos.width;

		// ���� ���� ���������� üũ�����ض�..
		if (cy >= block_h * block_array.length)
			return;

		// �浹�� ���� ÷�ڸ� ���ϱ�
		int row = cy / block_h;
		int col = cx / block_w;

		int rows = block_array.length;
		int cols = block_array[0].length;

		// ���� ÷�ڰ� ��ȿ������ �Ѿ��..
		if (row < 0 || row >= rows)
			return;
		if (col < 0 || col >= cols)
			return;

		// ���� �̹� �������¸�...
		if (block_array[row][col].bShow == false)
			return;

		// ���� �������·� ��ȯ
		block_array[row][col].bShow = false;

		// ������ ��ȯ(��->��)
		bRight = true;

		end_check();

	}

	private void end_check() {
		// TODO Auto-generated method stub
		block_count--;

		setTitle("���� ����:" + block_count);

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
		// ���� �浹���� ��ǥ
		int cx = ball_x + ball_diameter;
		int cy = ball_y + ball_diameter / 2;

		// ���� ��/����
		int block_h = block_array[0][0].pos.height;
		int block_w = block_array[0][0].pos.width;

		// ���� ���� ���������� üũ�����ض�..
		if (cy >= block_h * block_array.length)
			return;

		// �浹�� ���� ÷�ڸ� ���ϱ�
		int row = cy / block_h;
		int col = cx / block_w;

		int rows = block_array.length;
		int cols = block_array[0].length;

		// ���� ÷�ڰ� ��ȿ������ �Ѿ��..
		if (row < 0 || row >= rows)
			return;
		if (col < 0 || col >= cols)
			return;

		// ���� �̹� �������¸�...
		if (block_array[row][col].bShow == false)
			return;

		// ���� �������·� ��ȯ
		block_array[row][col].bShow = false;

		// ������ ��ȯ(��->��)
		bRight = false;

		end_check();

	}

	private void collision_block_top() {
		// TODO Auto-generated method stub
		// ���� �浹���� ��ǥ
		int cx = ball_x + ball_diameter / 2;
		int cy = ball_y + ball_diameter;

		// ���� ��/����
		int block_h = block_array[0][0].pos.height;
		int block_w = block_array[0][0].pos.width;

		// ���� ���� ���������� üũ�����ض�..
		if (cy >= block_h * block_array.length)
			return;

		// �浹�� ���� ÷�ڸ� ���ϱ�
		int row = cy / block_h;
		int col = cx / block_w;

		int rows = block_array.length;
		int cols = block_array[0].length;

		// ���� ÷�ڰ� ��ȿ������ �Ѿ��..
		if (row < 0 || row >= rows)
			return;
		if (col < 0 || col >= cols)
			return;

		// ���� �̹� �������¸�...
		if (block_array[row][col].bShow == false)
			return;

		// ���� �������·� ��ȯ
		block_array[row][col].bShow = false;

		// ������ ��ȯ(�Ʒ�->��)
		bDown = false;

		end_check();
	}

	private void collision_block_bottom() {
		// TODO Auto-generated method stub
		// ���� �浹���� ��ǥ
		int cx = ball_x + ball_diameter / 2;
		int cy = ball_y;

		// ���� ��/����
		int block_h = block_array[0][0].pos.height;
		int block_w = block_array[0][0].pos.width;

		// ���� ���� ���������� üũ�����ض�..
		if (cy >= block_h * block_array.length)
			return;

		// �浹�� ���� ÷�ڸ� ���ϱ�
		int row = cy / block_h;
		int col = cx / block_w;

		int rows = block_array.length;
		int cols = block_array[0].length;

		// ���� ÷�ڰ� ��ȿ������ �Ѿ��..
		if (row < 0 || row >= rows)
			return;
		if (col < 0 || col >= cols)
			return;

		// ���� �̹� �������¸�...
		if (block_array[row][col].bShow == false)
			return;

		// ���� �������·� ��ȯ
		block_array[row][col].bShow = false;

		// ������ ��ȯ(��->�Ʒ�)
		bDown = true;

		end_check();

	}

	private void collision_ball_bar() {
		// TODO Auto-generated method stub
		// ���� �ϴ��߽�����(�浹����)
		int cx = ball_x + ball_diameter / 2;
		int cy = ball_y + ball_diameter;

		// bar�� �浹�� �Ǿ�����...
		if (bar.pos.contains(cx, cy)) {
			bDown = false;
			return;
		}

		// ȭ�� �ϴܿ� �������
		if (cy >= GAMEPAN_H) {
			timer.stop();
			init_bar();
			gamePan.repaint();

			key_state = 0;

			// �޽��� ���̾Ʒα�
			JOptionPane.showMessageDialog(this, "Game Over");
		}

	}

	private void move_bar() {
		// TODO Auto-generated method stub

		if (key_state == Key.LEFT) {

			bar.pos.x -= 5;
			// ���� ������ ����
			if (bar.pos.x < 0)
				bar.pos.x = 0;

		} else if (key_state == Key.RIGHT) {

			bar.pos.x += 5;

			// ������ ������ ����
			if ((bar.pos.x + bar.pos.width) > GAMEPAN_W) {
				bar.pos.x = GAMEPAN_W - bar.pos.width;
			}
		}

	}

	int gan = 3;

	private void move_ball() {
		// TODO Auto-generated method stub
		// �¿�
		if (bRight)
			ball_x += gan;// Right
		else
			ball_x -= gan;// Left

		// ����
		if (bDown)
			ball_y += gan;// Down
		else
			ball_y -= gan;// Up

		// �����ʺ��� ��ҳ�?
		if ((ball_x + ball_diameter) > GAMEPAN_W) {

			ball_x = GAMEPAN_W - ball_diameter;

			bRight = false;
		} else if (ball_x < 0) {// ���ʺ��� ��ҳ�?
			ball_x = 0;
			bRight = true;
		}

		// �Ʒ��� ��ҳ�?
		if ((ball_y + ball_diameter) > GAMEPAN_H) {
			bDown = false;
		} else if (ball_y < 0) {// ���� �������
			bDown = true;
		}

	}

	private void init_gamepan() {
		// TODO Auto-generated method stub
		gamePan = new JPanel() {

			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub

				// ����ȭ�� �����
				g.clearRect(0, 0, GAMEPAN_W, GAMEPAN_H);

				// ���׸���
				g.setColor(Color.red);
				g.fillOval(ball_x, ball_y, ball_diameter, ball_diameter);

				// Block �׸���
				draw_block(g);

				// Bar �׸���
				bar.draw(g);

			}

		};

		// ������ ũ�� ����
		gamePan.setPreferredSize(new Dimension(GAMEPAN_W, GAMEPAN_H));

		this.add(gamePan, "Center");

	}

	protected void draw_block(Graphics g) {
		// TODO Auto-generated method stub
		for (int i = 0; i < block_array.length; i++) {// ���
			for (int k = 0; k < block_array[i].length; k++) {// ����
				block_array[i][k].draw(g);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_BlockGame2();
	}
}