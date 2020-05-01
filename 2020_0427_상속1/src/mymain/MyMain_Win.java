package mymain;

import java.awt.Dimension;

//AWT (Abstract Window Toolkit)

import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

//������ : �ʱ�ȭ �ϴ� ���

public class MyMain_Win extends JFrame {

	// ȭ�� �ػ�
	int screen_w, screen_h;

	public MyMain_Win() {

		super(" ������ �ȳ� ");

		// �ػ� ���ϴ� ��
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

		screen_w = d.width;
		screen_h = d.height;

		System.out.printf("%dx%d\n", screen_h, screen_w);
		// ��ġ ����
		super.setLocation(100, 100);

		// ũ�� ����
		super.setSize(300, 300);

		// ũ�� ���� �Ұ���
		super.setResizable(false);

		// ȭ�� ǥ��
		super.setVisible(true);

		// ���� �ڵ� (JFrame �ȿ�)
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Ű���� �̺�Ʈ ����
		this.addKeyListener(new KeyAdapter() {

			// Ű�� �������� �߻�
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyPressed(e);

				// ���� Ű�� ��� : ����
				int key = e.getKeyCode();
				// System.out.println(e);

				// ���� ������ ��ġ ����
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

				// �� �� �� �� �ܺ�üũ
				// Point pt2.getLocation(-290, 100);

				if (pt.x > 1920) {
					pt.x = -300;

				} else if (pt.x < -300) {
					pt.x = 1920; //pt.x �� -300���� �۾����� pt.x�� (���ʻ�� ����) 1920 ���� �̵�

				} else if (pt.y > 1080) {
					pt.y = -300;

				} else if (pt.y < -300) {
					pt.y = 1080;
				}

				// �ٲ� ��ǥ�� �̵���Ű��
				setLocation(pt);

			}

		});

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MyMain_Win();

	}

}
