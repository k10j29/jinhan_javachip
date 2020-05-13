package mymain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyMain_MouseEvent extends JFrame {

	static Image image_TED;
	static { // main method ���� ���� ȣ��

		// �̹��� �ε�
		image_TED = new ImageIcon("TED.png").getImage();
	}

	// �޸𸮻��� ȭ��(��ȭ��)
	Image memPan;

	JPanel grimPan;

	public MyMain_MouseEvent() {
		// TODO Auto-generated constructor stub
		// Ÿ��Ʋ
		super("���콺 �̺�Ʈ");

		// �׸��� �ʱ�ȭ
		init_grimpan();

		// ���콺 �̺�Ʈ �ʱ�ȭ
		init_mouse_event();

		// ��ġ
		super.setLocation(100, 100);

		// ũ��
		super.setSize(500, 500);

		// �������
		super.setVisible(true);

		// ����
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// �޸� ȭ�� ����
		memPan = grimPan.createImage(2000, 2000);

	}

	private void init_mouse_event() {
		// TODO Auto-generated method stub
		/*
		 * class MyNamingMouseAdapter extends MouseAdapter{ } MouseAdapter adapter1 =
		 * new MyNamingMouseAdapter();
		 */

		MouseAdapter adapter = new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				// ���ư ������?
				int button = e.getButton();
				// ���콺�� Ŭ���� ��ġ
				Point pt = e.getPoint();

				//// ��ȭ��(grimPan)�� �׸� ����(��) ���
				// Graphics g = grimPan.getGraphics();

				// �޸�ȭ�鿡 �׸� ���� ���
				Graphics g = memPan.getGraphics();

				// System.out.println(button);
				// System.out.printf("(%d,%d)\n", pt.x,pt.y);

				if (button == MouseEvent.BUTTON1) {// Left
					System.out.println("���콺 ���� Ŭ��");
					// ȭ��->���ڿ� ���
					String msg = String.format("(%d,%d)", pt.x, pt.y);
					g.drawString(msg, pt.x, pt.y);

				} else if (button == MouseEvent.BUTTON2) {// Middle
					System.out.println("���콺 �� Ŭ��");

					// Į����
					g.setColor(Color.RED);
					// ȭ��->���� ���
					// �簢��
					// g.drawRect(pt.x, pt.y, 100, 100);
					g.fillRect(pt.x, pt.y, 100, 100);
					// Ÿ��
					// g.drawOval(pt.x, pt.y, 100, 100);
					g.setColor(Color.BLUE);
					g.fillOval(pt.x, pt.y, 100, 100);

				} else if (button == MouseEvent.BUTTON3) {// Right
					System.out.println("���콺 ������ Ŭ��");

					// ȭ��->�̹���
					g.drawImage(image_TED, pt.x, pt.y, null);

				}

				// �޸𸮳���->ȭ�鿡 ����
				// Graphics gg = grimPan.getGraphics();
				// gg.drawImage(memPan, 0, 0, null);

				// �ٽñ׷���
				grimPan.repaint();// paintComponent ����ȣ��ȴ�

			}
		};

		// �̺�Ʈ�ҽ�.addXXXListener(ó����ü);
		grimPan.addMouseListener(adapter);

	}

	private void init_grimpan() {
		// TODO Auto-generated method stub
		// class GrimPan extends JPanel{}

		grimPan = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				// �޸𸮳���->����ȭ������ �����ؿ´�
				System.out.println("--paintComponent--");
				g.drawImage(memPan, 0, 0, null);
			}
		};

		this.add(grimPan, "Center");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_MouseEvent();
	}
}
