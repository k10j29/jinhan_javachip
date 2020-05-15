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

	// �������� ũ��
	final static int GAMEPAN_W = 500;
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

	public MyMain_BlockGame() {
		// TODO Auto-generated constructor stub
		// Ÿ��Ʋ
		super("��������");

		// ������ �ʱ�ȭ
		init_gamepan();

		// Bar & Ball �ʱ�ȭ
		init_bar();

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

	private void init_bar() {
		// TODO Auto-generated method stub
		int bar_width = 120;
		int bar_height = 15;

		// Bar ��ġ
		bar.pos.x = GAMEPAN_W / 2 - bar_width / 2;
		bar.pos.y = GAMEPAN_H - bar_height - 5;
		bar.pos.width = bar_width;
		bar.pos.height = bar_height;

		// ���ʱ�ȭ
		ball_diameter = 20;
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
		timer = new Timer(10, listener);
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
			// �޽��� ���̾Ʒα�
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

		if (bar.pos.x < 0) {// ���ʺ��� ��ҳ�?
			bar.pos.x = 0;

		} else if (bar.pos.x > GAMEPAN_W - bar.pos.width) {
			bar.pos.x = GAMEPAN_W - bar.pos.width;

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

				// Bar �׸���
				bar.draw(g);

			}

		};

		// ������ ũ�� ����
		gamePan.setPreferredSize(new Dimension(GAMEPAN_W, GAMEPAN_H));

		this.add(gamePan, "Center");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_BlockGame();
	}
}