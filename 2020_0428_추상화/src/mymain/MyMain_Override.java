package mymain; // 세번째로 작성

import myutil.Child;
import myutil.Parent;

public class MyMain_Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. up 캐스팅 객체를 만들어놓고 상위타입을 받음 (라인 13)
		Parent p = new Child();
		p.sub(); // Parent 의 sub 를 call 한것 >>>> 결과는 Child.sub 가 호출됨 (재정의이기 때문에)
		// 맨마지막에 재정의된 메소드를 호출하게되어있음

	}

}
