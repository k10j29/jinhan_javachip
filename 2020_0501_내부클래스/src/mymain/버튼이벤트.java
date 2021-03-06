package mymain;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼이벤트 extends JFrame {

	// 멤버로서의 내부 클라스 (Member inner class)

	class MyinnerButtonEvent implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			버튼이벤트.this.setTitle("-Hi - Everyone!-");

		}

	}

	public 버튼이벤트() {

		// 윈도우 타이틀
		super("");

		// 각 버튼 생성
		// Button bt1 = new Button(); 거의 사용안함

		// SWING (가볍고, 모양이 이쁨)
		JButton jbt_kor = new JButton("한국어 인사말");
		JButton jbt_eng = new JButton("영  어 인사말");
		JButton jbt_jpn = new JButton("일본어 인사말");
		JButton jbt_chn = new JButton("중국어 인사말");

		JButton jbt_fra = new JButton("프랑스 인사말");
		JButton jbt_ger = new JButton("독일어 인사말");

		// 배치방법
		this.setLayout(new GridLayout(6, 1));
		this.add(jbt_kor);
		this.add(jbt_eng);
		this.add(jbt_jpn);
		this.add(jbt_chn);
		this.add(jbt_fra);
		this.add(jbt_ger);

		// 버튼 이벤트 등록하기
		ActionListener listener = new MyButtonEvent(this);
		jbt_kor.addActionListener(listener);

		jbt_eng.addActionListener(new MyinnerButtonEvent());

		// 로컬 내부 클래스
		class MyLocalinnerButtonEvent implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				setTitle("おげんきですか");

			}

		}
		jbt_jpn.addActionListener(new MyLocalinnerButtonEvent());

		// 익명객체(Anoymous) 클래스
		ActionListener listener2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setTitle("Nihao");

			}
		};

		jbt_chn.addActionListener(listener2);

		ActionListener listener3 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setTitle("bonjour");

			}
		};

		jbt_fra.addActionListener(listener3);

		ActionListener listener4 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setTitle("Guten Tag ");

			}
		};

		jbt_ger.addActionListener(listener4);

		// 위치
		super.setLocation(100, 100);
		// 크기
		super.setSize(300, 300);
		// 보여줘라
		super.setVisible(true);
		// 종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new 버튼이벤트();

	}

}