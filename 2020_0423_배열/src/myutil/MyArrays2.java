package myutil;

public class MyArrays2 {

	// �迭�� ���� 1���� ~ n���� ä��� ���

	public static void setArray(int[][] mm2) {
		// TODO Auto-generated method stub

		int rows = mm2.length; // ���ǰ���
		int cols = mm2[0].length; // ���Ǽ�

		int su = 1;

		for (int i = 0; i < mm2.length; i++) {
			for (int k = 0; k < mm2[i].length; k++) {
				mm2[i][k] = su; // [��][��] su++ ������
				su++;
			}
		}
	}

	// 2���� �迭 ����ϱ�

	public static void display(int[][] mm2) {
		for (int i = 0; i < mm2.length; i++) {

			// ���� ��³���
			for (int k = 0; k < mm2[i].length; k++) {
				System.out.printf("%3d", mm2[i][k]);
			}

			System.out.println();
		}
	}
}
