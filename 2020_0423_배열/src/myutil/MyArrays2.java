package myutil;

public class MyArrays2 {

	// 배열의 값을 1부터 ~ n까지 채우기 계산

	public static void setArray(int[][] mm2) {
		// TODO Auto-generated method stub

		int rows = mm2.length; // 행의갯수
		int cols = mm2[0].length; // 열의수

		int su = 1;

		for (int i = 0; i < mm2.length; i++) {
			for (int k = 0; k < mm2[i].length; k++) {
				mm2[i][k] = su; // [행][열] su++ 후위형
				su++;
			}
		}
	}

	// 2차원 배열 출력하기

	public static void display(int[][] mm2) {
		for (int i = 0; i < mm2.length; i++) {

			// 한줄 출력내용
			for (int k = 0; k < mm2[i].length; k++) {
				System.out.printf("%3d", mm2[i][k]);
			}

			System.out.println();
		}
	}
}
