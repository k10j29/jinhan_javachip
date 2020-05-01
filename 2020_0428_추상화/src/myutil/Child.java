package myutil; // 두번째로 작성

public class Child extends Parent {
	// Parent 상속 받음

	// 1. 재정의 Parent의 sub
	// 2. 오버 라이드 관계 부모와 자식
	public void sub() {
		System.out.println("--Child.sub()--");
	}

	// 어노티션? JVM 이 프로그램을 돌리때 확인 하는것 (14라인 @꼬리표)
		@Override // 부모가 가진 메소드를 오버라이드
		public void sub(int n) {
			// TODO Auto-generated method stub
			super.sub(n);
		}

}
