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
	static { // main method 보다 먼저 호출

		// 이미지 로드
		image_TED = new ImageIcon("TED.png").getImage();
	}

	// 메모리상의 화면(도화지)
	Image memPan;

	JPanel grimPan;

	public MyMain_MouseEvent() {
		// TODO Auto-generated constructor stub
		// 타이틀
		super("마우스 이벤트");

		// 그림판 초기화
		init_grimpan();

		// 마우스 이벤트 초기화
		init_mouse_event();

		// 위치
		super.setLocation(100, 100);

		// 크기
		super.setSize(500, 500);

		// 보여줘라
		super.setVisible(true);

		// 종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 메모리 화면 생성
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
				// 어떤버튼 눌렀냐?
				int button = e.getButton();
				// 마우스가 클릭된 위치
				Point pt = e.getPoint();

				//// 도화지(grimPan)에 그릴 도구(붓) 얻기
				// Graphics g = grimPan.getGraphics();

				// 메모리화면에 그릴 도구 얻기
				Graphics g = memPan.getGraphics();

				// System.out.println(button);
				// System.out.printf("(%d,%d)\n", pt.x,pt.y);

				if (button == MouseEvent.BUTTON1) {// Left
					System.out.println("마우스 왼쪽 클릭");
					// 화면->문자열 출력
					String msg = String.format("(%d,%d)", pt.x, pt.y);
					g.drawString(msg, pt.x, pt.y);

				} else if (button == MouseEvent.BUTTON2) {// Middle
					System.out.println("마우스 휠 클릭");

					// 칼라선택
					g.setColor(Color.RED);
					// 화면->도형 출력
					// 사각형
					// g.drawRect(pt.x, pt.y, 100, 100);
					g.fillRect(pt.x, pt.y, 100, 100);
					// 타원
					// g.drawOval(pt.x, pt.y, 100, 100);
					g.setColor(Color.BLUE);
					g.fillOval(pt.x, pt.y, 100, 100);

				} else if (button == MouseEvent.BUTTON3) {// Right
					System.out.println("마우스 오른쪽 클릭");

					// 화면->이미지
					g.drawImage(image_TED, pt.x, pt.y, null);

				}

				// 메모리내용->화면에 복사
				// Graphics gg = grimPan.getGraphics();
				// gg.drawImage(memPan, 0, 0, null);

				// 다시그려라
				grimPan.repaint();// paintComponent 간접호출된다

			}
		};

		// 이벤트소스.addXXXListener(처리객체);
		grimPan.addMouseListener(adapter);

	}

	private void init_grimpan() {
		// TODO Auto-generated method stub
		// class GrimPan extends JPanel{}

		grimPan = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				// 메모리내용->현재화면으로 복사해온다
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
