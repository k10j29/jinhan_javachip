package mymain;

public class MyMain_배열3_개선루프 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nr = { 1, 2, 3, 4, 5 };

		
		
		
		System.out.println("==첨자를 이용한 출력==");
		for (int i = 0; i < nr.length; i++) {
			System.out.println(nr[i]);
		}
		
		
		System.out.println("==개선 loop==");
		for (int n : nr) {
			System.out.println(n);
		}

		// 개선 loop 방식 : JDK 5.0 버전 이후

	}
}