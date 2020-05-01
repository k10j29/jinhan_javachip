package myutil;

public class Mabangjin {

	// �迭 6��
	int[][] ma_array;
	int chasu;

	// ������ ���� set ������ֱ� (������ �����̵Ǿ���)
	public void setChasu(int chasu) {
		this.chasu = chasu;

		// ������ ä���
		make_mabangjin();

	}

	private void make_mabangjin() {
		// TODO Auto-generated method stub

		// 5�� 5�� 3�� 3�� ---
		ma_array = new int[chasu][chasu];

		// ������ ù�� �߾ӿ��� ����
		int row = 0;
		int col = chasu / 2;
		int su = 1;

		ma_array[row][col] = su++;

		// -1 �ϴ������� ù��° ĭ�� ä������
		for (int i = 0; i < chasu * chasu - 1; i++) {

			// ��밢 ���� ������� �̵�
			row--;
			col++;

			// �� / �������� ��� �������

			// �� = row�� 0���� ������ and ������ col ���� �۰ų� ������
			if (row < 0 && col >= chasu) {

				row += 2; // ��ĭ ������
				col--; // ���� (��������) ��ĭ�̵�
			} else if (row < 0) { // �������� ������� row�� �� �Ʒ��� �Ǹ����� ÷�� �ֱ�

				row = chasu - 1; // ������ ÷��

			} else if (col >= chasu) { // ���������� �������

				col = 0; // ���� (����) �Ǿ����� �̵�
			}

			// �̵��� ��ġ�� �̹� ���� �ִٸ�
			if (ma_array[row][col] != 0) {
				row += 2;
				col--;

			}

			// �̵��� ��ġ�� ���� ä���
			ma_array[row][col] = su++;

		}

	}

	public void display() {

		for (int i = 0; i < chasu; i++) {

			int row_sum = 0;

			for (int k = 0; k < chasu; k++) {
				System.out.printf("%4d", ma_array[i][k]);

				// ������ ���� ����
				row_sum += ma_array[i][k];
			}
			System.out.printf("(%d)",row_sum);

			System.out.println();
		}
	}
}

