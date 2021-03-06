package mymain;



import java.awt.event.WindowListener;

//Templates
import javax.swing.JFrame;

public class Main_인터페이스활용 extends JFrame {

	public Main_인터페이스활용() {

		// 윈도우 타이틀
		super("");
		// 위치
		super.setLocation(100, 100);
		// 크기
		super.setSize(300, 300);
		// 보여줘라
		super.setVisible(true);
		// 종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		//this. 인터페이스활용 .. ~~에서
		//이벤트 등록절차
		//addXXXListener : 이벤트 종류별 등록
		//addXXXListener(인자) : 인자 <= 처리객체
		//   XXXListener : Interface
		
		//처리객체는 해당 interface를 재정의 (준비) 해야된다
		
		//위임 이벤트 모델 (Delegation Event Model)
		
		WindowListener listener = new MyWindowEventListener();
		this.addWindowListener(new MyWindowEventListener());
		
	}

	public static void main(String[] args) {

		new Main_인터페이스활용();

	}

}