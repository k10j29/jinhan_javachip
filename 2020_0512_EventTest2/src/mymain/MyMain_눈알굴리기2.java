package mymain;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyMain_���˱�����2 extends JFrame {

	//
	final static int GRIMPAN_WIDTH = 500;
	final static int GRIMPAN_HEIGHT = 514;

	static Image back_image;
	static Image back_image_off;
	static {
		back_image = new ImageIcon("sim.png").getImage();
		back_image_off = new ImageIcon("sim2.png").getImage();
	}

	JPanel grimPan;

	// ������ ǥ���ϱ�
	boolean bEyeClosed = false;

	// ����ǥ
	Point eye_left = new Point();
	Point eye_right = new Point();
	int eye_radius;// �� ������

	// ������ǥ
	Point eyeball_left = new Point();
	Point eyeball_right = new Point();
	int eyeball_radius;// ���� ������

	public MyMain_���˱�����2() {
		// TODO Auto-generated constructor stub
		// Ÿ��Ʋ
		super("���˱�����2");

		// ����ġ �ʱ�ȭ
		init_eye_position();

		// ������ġ �ʱ�ȭ
		init_eyeball_position();

		// �׸��� �ʱ�ȭ
		init_grimpan();

		// ���콺 �ʱ�ȭ
		init_mouse_event();

		// ��ġ
		super.setLocation(200, 200);

		// ũ������ �Ұ�
		setResizable(false);
		// ũ��
		// super.setSize(300, 300);
		// �����̳ʻ��� �θ�/�ڽ�
		// �ڽ������츦 �θ�(JFrame)�����찡 ���Ѵ�
		this.pack();

		// �������
		super.setVisible(true);

		// ����
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_mouse_event() {
		// TODO Auto-generated method stub

		MouseAdapter adapter = new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				Point pt = e.getPoint();
				move_eyeball_left_position(pt);
				move_eyeball_right_position(pt);

				check_eye_in_mouse(pt); // ���ȿ� ���콺 �����Ͱ� ��� �Դ���
				grimPan.repaint();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				// ���� ����ġ
				init_eyeball_position();

				bEyeClosed = false;

				grimPan.repaint();
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				Point pt = e.getPoint();
				move_eyeball_left_position(pt);
				move_eyeball_right_position(pt);
				check_eye_in_mouse(pt); // ���ȿ� ���콺 �����Ͱ� ��� �Դ���
				grimPan.repaint();
			}

		};

		grimPan.addMouseListener(adapter);
		grimPan.addMouseMotionListener(adapter);// ���콺�� �����϶�

	}

	protected void check_eye_in_mouse(Point pt) {
		// TODO Auto-generated method stub

	}

	protected void move_eyeball_right_position(Point pt) {
		// TODO Auto-generated method stub
		int x = pt.x - eye_right.x;//
		int y = pt.y - eye_right.y;//

		// ������ ���� ���ϱ�
		double r = Math.sqrt(x * x + y * y);

		if (r <= eye_radius) {

			bEyeClosed = true;
			return;
		}

		// ���ʴ� üũ

		x = pt.x - eye_left.x;//
		y = pt.y - eye_left.y;//

		// ������ ���� ���ϱ�
		r = Math.sqrt(x * x + y * y);

		if (r <= eye_radius) {

			bEyeClosed = true;
		}

		bEyeClosed = false;

		// ������ ����
		double r_rate = eyeball_radius / r;

		eyeball_right.x = eye_right.x + (int) (x * r_rate);
		eyeball_right.y = eye_right.y + (int) (y * r_rate);

	}

	protected void move_eyeball_left_position(Point pt) {
		// TODO Auto-generated method stub
		// ���ʴ��� �߽���ǥ�κ��� ���콺 �����ͱ����� �Ÿ� ���ϱ�
		int x = pt.x - eye_left.x;//
		int y = pt.y - eye_left.y;//

		// ������ ���� ���ϱ�
		double r = Math.sqrt(x * x + y * y);
		// ������ ����
		double r_rate = eyeball_radius / r;

		eyeball_left.x = eye_left.x + (int) (x * r_rate);
		eyeball_left.y = eye_left.y + (int) (y * r_rate);

	}

	private void init_eyeball_position() {
		// TODO Auto-generated method stub
		// ���ʴ���
		eyeball_left.x = eye_left.x;
		eyeball_left.y = eye_left.y;

		// �����ʴ���
		eyeball_right.x = eye_right.x;
		eyeball_right.y = eye_right.y;

		// ������ ������( ��������/2 )
		eyeball_radius = eye_radius / 7;
	}

	private void init_eye_position() {
		// TODO Auto-generated method stub
		// ���ʴ�
		// ���ʴ�
		eye_left.x = 251;
		eye_left.y = 261;

		// �����ʴ�
		eye_right.x = 331;
		eye_right.y = 242;

		// ���� ������
		eye_radius = GRIMPAN_WIDTH / 4 - 50;

	}

	private void init_grimpan() {
		// TODO Auto-generated method stub
		grimPan = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				// Dimension d = this.getSize();
				// System.out.printf("w=%d h=%d\n", d.width,d.height);

				// ����ȭ�� �����
				// g.clearRect(0, 0, GRIMPAN_WIDTH, GRIMPAN_HEIGHT);

				// ����̹��� �׸���
				if (bEyeClosed) {

					g.drawImage(back_image_off, 0, 0, this);
					return;
				}

				g.drawImage(back_image, 0, 0, this);

				// ���׸���
				// ���ʴ�
				/*
				 * g.drawOval(eye_left.x-eye_radius, eye_left.y-eye_radius, eye_radius*2,
				 * eye_radius*2 ); //�����ʴ� g.drawOval(eye_right.x-eye_radius,
				 * eye_right.y-eye_radius, eye_radius*2, eye_radius*2 );
				 */
				// ���˱׸���
				// ���ʴ���
				g.setColor(Color.BLACK);
				g.fillOval(eyeball_left.x - eyeball_radius, eyeball_left.y - eyeball_radius, eyeball_radius * 2,
						eyeball_radius * 2);
				// �����ʴ���
				g.fillOval(eyeball_right.x - eyeball_radius, eyeball_right.y - eyeball_radius, eyeball_radius * 2,
						eyeball_radius * 2);

			}
		};

		grimPan.setPreferredSize(new Dimension(GRIMPAN_WIDTH, GRIMPAN_HEIGHT));

		this.add(grimPan);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_���˱�����2();
	}
}