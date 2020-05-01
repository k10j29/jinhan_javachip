package myutil; // 첫번째로 작성

public class Parent {

	public void sub() {
		System.out.println("--Parent.sub()--");

		// 1. 재정의된 Parent sub 가 호출되는지 확인
	}

	public void sub(int n) {
		// 오버로드 위 메소드와 6라인
	}

}
