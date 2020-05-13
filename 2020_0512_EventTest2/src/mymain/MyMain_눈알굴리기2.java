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

public class MyMain_눈알굴리기2 extends JFrame {

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

	// 감은눈 표현하기
	boolean bEyeClosed = false;

	// 눈좌표
	Point eye_left = new Point();
	Point eye_right = new Point();
	int eye_radius;// 눈 반지름

	// 눈알좌표
	Point eyeball_left = new Point();
	Point eyeball_right = new Point();
	int eyeball_radius;// 눈알 반지름

	public MyMain_눈알굴리기2() {
		// TODO Auto-generated constructor stub
		// 타이틀
		super("눈알굴리기2");

		// 눈위치 초기화
		init_eye_position();

		// 눈알위치 초기화
		init_eyeball_position();

		// 그림판 초기화
		init_grimpan();

		// 마우스 초기화
		init_mouse_event();

		// 위치
		super.setLocation(200, 200);

		// 크기조절 불가
		setResizable(false);
		// 크기
		// super.setSize(300, 300);
		// 컨테이너상의 부모/자식
		// 자식윈도우를 부모(JFrame)윈도우가 감싼다
		this.pack();

		// 보여줘라
		super.setVisible(true);

		// 종료
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

				check_eye_in_mouse(pt); // 눈안에 마우스 포인터가 들어 왔느냐
				grimPan.repaint();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				// 눈알 원위치
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
				check_eye_in_mouse(pt); // 눈안에 마우스 포인터가 들어 왔느냐
				grimPan.repaint();
			}

		};

		grimPan.addMouseListener(adapter);
		grimPan.addMouseMotionListener(adapter);// 마우스가 움직일때

	}

	protected void check_eye_in_mouse(Point pt) {
		// TODO Auto-generated method stub

	}

	protected void move_eyeball_right_position(Point pt) {
		// TODO Auto-generated method stub
		int x = pt.x - eye_right.x;//
		int y = pt.y - eye_right.y;//

		// 빗변의 길이 구하기
		double r = Math.sqrt(x * x + y * y);

		if (r <= eye_radius) {

			bEyeClosed = true;
			return;
		}

		// 왼쪽눈 체크

		x = pt.x - eye_left.x;//
		y = pt.y - eye_left.y;//

		// 빗변의 길이 구하기
		r = Math.sqrt(x * x + y * y);

		if (r <= eye_radius) {

			bEyeClosed = true;
		}

		bEyeClosed = false;

		// 빗변의 비율
		double r_rate = eyeball_radius / r;

		eyeball_right.x = eye_right.x + (int) (x * r_rate);
		eyeball_right.y = eye_right.y + (int) (y * r_rate);

	}

	protected void move_eyeball_left_position(Point pt) {
		// TODO Auto-generated method stub
		// 왼쪽눈의 중심좌표로부터 마우스 포인터까지의 거리 구하기
		int x = pt.x - eye_left.x;//
		int y = pt.y - eye_left.y;//

		// 빗변의 길이 구하기
		double r = Math.sqrt(x * x + y * y);
		// 빗변의 비율
		double r_rate = eyeball_radius / r;

		eyeball_left.x = eye_left.x + (int) (x * r_rate);
		eyeball_left.y = eye_left.y + (int) (y * r_rate);

	}

	private void init_eyeball_position() {
		// TODO Auto-generated method stub
		// 왼쪽눈알
		eyeball_left.x = eye_left.x;
		eyeball_left.y = eye_left.y;

		// 오른쪽눈알
		eyeball_right.x = eye_right.x;
		eyeball_right.y = eye_right.y;

		// 눈알의 반지름( 눈반지름/2 )
		eyeball_radius = eye_radius / 7;
	}

	private void init_eye_position() {
		// TODO Auto-generated method stub
		// 왼쪽눈
		// 왼쪽눈
		eye_left.x = 251;
		eye_left.y = 261;

		// 오른쪽눈
		eye_right.x = 331;
		eye_right.y = 242;

		// 눈의 반지름
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

				// 이전화면 지우기
				// g.clearRect(0, 0, GRIMPAN_WIDTH, GRIMPAN_HEIGHT);

				// 배경이미지 그리기
				if (bEyeClosed) {

					g.drawImage(back_image_off, 0, 0, this);
					return;
				}

				g.drawImage(back_image, 0, 0, this);

				// 눈그리기
				// 왼쪽눈
				/*
				 * g.drawOval(eye_left.x-eye_radius, eye_left.y-eye_radius, eye_radius*2,
				 * eye_radius*2 ); //오른쪽눈 g.drawOval(eye_right.x-eye_radius,
				 * eye_right.y-eye_radius, eye_radius*2, eye_radius*2 );
				 */
				// 눈알그리기
				// 왼쪽눈알
				g.setColor(Color.BLACK);
				g.fillOval(eyeball_left.x - eyeball_radius, eyeball_left.y - eyeball_radius, eyeball_radius * 2,
						eyeball_radius * 2);
				// 오른쪽눈알
				g.fillOval(eyeball_right.x - eyeball_radius, eyeball_right.y - eyeball_radius, eyeball_radius * 2,
						eyeball_radius * 2);

			}
		};

		grimPan.setPreferredSize(new Dimension(GRIMPAN_WIDTH, GRIMPAN_HEIGHT));

		this.add(grimPan);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_눈알굴리기2();
	}
}