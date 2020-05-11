package mymain;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class MyMain_NullLayout extends JFrame {

	public MyMain_NullLayout() {

		// 윈도우 타이틀
		super("NullLayout");

		this.setLayout(null); // 레이아웃 해제 (직접 위치와 크기 지정해야함)

		// 성별
		JLabel jlb_gender = new JLabel("성별");

		JRadioButton jrd_male = new JRadioButton("남자");
		JRadioButton jrd_female = new JRadioButton("여자");
		
		

		int x = 10;
		int y = 10;
		int width = 100;
		int height = 30;
		/// 위치 크기 한번에 지정하는
		jlb_gender.setBounds(x, y, width, height);
		
		x += 100; // 다음 컨트롤 위치
		jrd_male.setBounds(x, y, width, height);
		
		x += 100; // 다음 컨트롤 위치
		jrd_female.setBounds(x, y, width, height);

		this.add(jlb_gender);
		this.add(jrd_male);
		this.add(jrd_female);
		
		
		
		//버튼그룹으로 묶어주기 (하나 선택시 나머지 선택취소)

		ButtonGroup bg = new ButtonGroup();
		bg.add(jrd_male);
		bg.add(jrd_female);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

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

		new MyMain_NullLayout();

	}

}