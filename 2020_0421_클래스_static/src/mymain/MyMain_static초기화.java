package mymain;

public class MyMain_static초기화 {

	// static 초기화
	static {

		// 1. DB Driver Loading
		// 2. Resource compile (image , sound,....) 필요없이 바로 사용가능한

		System.out.println("--★☆★☆★ static 영역 //// 내가 더 잘나가 ★☆★☆★--");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("--main 영역 /// 내가 제일 잘나가--");

	}

}
