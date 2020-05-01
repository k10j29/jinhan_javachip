package myutil;

public class MyArrays {

	// 1 )디스플레이 하기
	// 객체안만들고 바로 출력하기 위해 static 사용
	public static void displayArray(int[] mr2) {

		System.out.print("[");
		for (int i = 0; i < mr2.length; i++) {

			System.out.printf("%3d", mr2[i]);

		}
		// 그냥 닫아준거
		System.out.print("]");
	}

	// 2 ) 특정부분 채워보기 (7)

	public static void fill(int[] mr2, int value) {

		for (int i = 0; i < mr2.length; i++) {

			// i = 0 1 2 3

			mr2[i] = value; // 10 20 30 40 (연산자 주의

			System.out.printf("mr2[%d] : %d\n", i, mr2[i]);
		}

		System.out.println();

	}
	// 3 ) 특정부분 지정한 범위로 채워보기 (8)

	public static void fill(int[] mr2, int begin, int end, int value) {

		for (int i = begin; i < end; i++) {

			// i = 0 1 2 3

			mr2[i] = value; // 10 20 30 40 (연산자 주의

			System.out.printf("mr2[%d] : %d\n", i, mr2[i]);
		}
	}
	// 4 ) 오름차순 내림차순 만들어보기 (11)

	// 오름차순
	public static void sort_asc(int[] mr) {

		for (int i = 0; i < mr.length - 1; i++) {
			for (int k = i + 1; k < mr.length; k++) {

				if (mr[i] > mr[k]) { // 조건이 만족하면 앞쪽수와 교환
					// 두가지 값을 교환
					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;

				}
			} // end for k
		} // end for i

	}

	// 내림차순
	public static void sort_desc(int[] mr) {

		for (int i = 0; i < mr.length - 1; i++) {
			for (int k = i + 1; k < mr.length; k++) {

				if (mr[i] < mr[k]) { // 조건이 만족하면 앞쪽수와 교환
					// 두가지 값을 교환
					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;
				}
			}
		}
	}
}