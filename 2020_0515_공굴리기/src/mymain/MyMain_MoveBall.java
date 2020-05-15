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

	// �������� ũ��
	final static int GAMEPAN_W = 500;
	final static int GAMEPAN_H = 400;

	JPanel gamePan;

// ��������
	int ball_x, ball_y;
	int ball_diameter;

//���� �̵�����
	boolean bRight = true;
	boolean bDown = true;

	Timer timer;

	public MyMain_MoveBall() {
		// TODO Auto-generated constructor stub
		// Ÿ��Ʋ
		super("�����μ���");

		// ������ �ʱ�ȭ
		init_gamepan();

		// ���� ��ġ �ʱ�ȭ
		ball_diameter = 30;

		ball_x = GAMEPAN_W / 2 - ball_diameter / 2; // ���� �������� ���� �� ���߾ӿ� ��ġ
		ball_y = GAMEPAN_H / 2 - ball_diameter / 8;

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

		// Ÿ�̸� ����

		// ������ 20 = 50 FPS (Frame Per Sec)
		timer = new Timer(2, listener);
		// timer.start(); // �ֱ������� listener > actionPeformed Call

	}

	// ���̵���Ű��
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

		} else if (ball_x < 0) { // ���ʺ��� ��ҳ�

			ball_x = 0;
			bRight = true;

		}

		// �Ʒ� �ʾ� ��ҳ�
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

				// ����ȭ�� �����
				g.clearRect(0, 0, GAMEPAN_W, GAMEPAN_H);

				g.setColor(Color.BLACK);

				g.fillOval(ball_x, ball_y, ball_diameter, ball_diameter);

			}

		};

		// ������ ũ�� ����
		gamePan.setPreferredSize(new Dimension(GAMEPAN_W, GAMEPAN_H));

		this.add(gamePan, "Center");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_MoveBall();
	}
}