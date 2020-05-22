package mymain_finally;

public class finally_ex {

	public static void main(String[] args) {
		int[] var = { 10, 200, 30 };
		for (int i = 0; i <= 3; i++) {

			try {

				System.out.println((i + 1) + "번째");
				System.out.println("var[" + i + "] : " + var[i]);
				System.out.println("~~~~~~~~~~~");

			} catch (Exception e) {

				System.out.println("배열을 넘었습니다.");

			} finally {

				System.out.println("==finally==");
				
			}

		}
		System.out.println("프로그램 끝");
	}

}
