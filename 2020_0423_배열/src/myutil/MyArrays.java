package myutil;

public class MyArrays {

	// 1 )���÷��� �ϱ�
	// ��ü�ȸ���� �ٷ� ����ϱ� ���� static ���
	public static void displayArray(int[] mr2) {

		System.out.print("[");
		for (int i = 0; i < mr2.length; i++) {

			System.out.printf("%3d", mr2[i]);

		}
		// �׳� �ݾ��ذ�
		System.out.print("]");
	}

	// 2 ) Ư���κ� ä������ (7)

	public static void fill(int[] mr2, int value) {

		for (int i = 0; i < mr2.length; i++) {

			// i = 0 1 2 3

			mr2[i] = value; // 10 20 30 40 (������ ����

			System.out.printf("mr2[%d] : %d\n", i, mr2[i]);
		}

		System.out.println();

	}
	// 3 ) Ư���κ� ������ ������ ä������ (8)

	public static void fill(int[] mr2, int begin, int end, int value) {

		for (int i = begin; i < end; i++) {

			// i = 0 1 2 3

			mr2[i] = value; // 10 20 30 40 (������ ����

			System.out.printf("mr2[%d] : %d\n", i, mr2[i]);
		}
	}
	// 4 ) �������� �������� ������ (11)

	// ��������
	public static void sort_asc(int[] mr) {

		for (int i = 0; i < mr.length - 1; i++) {
			for (int k = i + 1; k < mr.length; k++) {

				if (mr[i] > mr[k]) { // ������ �����ϸ� ���ʼ��� ��ȯ
					// �ΰ��� ���� ��ȯ
					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;

				}
			} // end for k
		} // end for i

	}

	// ��������
	public static void sort_desc(int[] mr) {

		for (int i = 0; i < mr.length - 1; i++) {
			for (int k = i + 1; k < mr.length; k++) {

				if (mr[i] < mr[k]) { // ������ �����ϸ� ���ʼ��� ��ȯ
					// �ΰ��� ���� ��ȯ
					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;
				}
			}
		}
	}
}