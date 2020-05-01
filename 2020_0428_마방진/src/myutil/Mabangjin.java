package myutil;

public class Mabangjin {

	// 배열 6열
	int[][] ma_array;
	int chasu;

	// 차수에 대한 set 만들어주기 (차수가 결정이되었음)
	public void setChasu(int chasu) {
		this.chasu = chasu;

		// 마방진 채우기
		make_mabangjin();

	}

	private void make_mabangjin() {
		// TODO Auto-generated method stub

		// 5행 5열 3행 3열 ---
		ma_array = new int[chasu][chasu];

		// 시작은 첫줄 중앙에서 시작
		int row = 0;
		int col = chasu / 2;
		int su = 1;

		ma_array[row][col] = su++;

		// -1 하는이유는 첫번째 칸은 채워져서
		for (int i = 0; i < chasu * chasu - 1; i++) {

			// 우대각 우측 상단으로 이동
			row--;
			col++;

			// 위 / 우측으로 모두 나간경우

			// 위 = row가 0보다 작을때 and 차수가 col 보다 작거나 같을때
			if (row < 0 && col >= chasu) {

				row += 2; // 두칸 내리기
				col--; // 왼쪽 (앞쪽으로) 한칸이동
			} else if (row < 0) { // 위쪽으로 벗어났을때 row를 맨 아래로 맨마지막 첨자 주기

				row = chasu - 1; // 마지막 첨자

			} else if (col >= chasu) { // 오른쪽으로 벗어났으면

				col = 0; // 왼쪽 (앞쪽) 맨앞으로 이동
			}

			// 이동한 위치에 이미 값이 있다면
			if (ma_array[row][col] != 0) {
				row += 2;
				col--;

			}

			// 이동한 위치에 값을 채우기
			ma_array[row][col] = su++;

		}

	}

	public void display() {

		for (int i = 0; i < chasu; i++) {

			int row_sum = 0;

			for (int k = 0; k < chasu; k++) {
				System.out.printf("%4d", ma_array[i][k]);

				// 한행의 값을 누적
				row_sum += ma_array[i][k];
			}
			System.out.printf("(%d)",row_sum);

			System.out.println();
		}
	}
}

