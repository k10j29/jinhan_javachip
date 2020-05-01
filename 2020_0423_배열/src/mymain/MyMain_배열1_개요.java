package mymain;

import java.util.Arrays;

import myutil.MyArrays;

public class MyMain_�迭1_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] mr;
		{
			// 1) 1���� �迭�� ���� ����
			// 2) �̷��� �ᵵ ���� int mr [];

			// stack �Ҵ�
			// ��������
			// �ڱ� ������ ����� �Ҹ� (�߰�ȣ ����� int [] nr �Ҹ�)

			int[] nr;

			// 3) �迭 ���� (� ������� �����غ���)

			// heap �Ҵ� (������ü)
			// �߰�ȣ�� nr = new int [4]; �� �����ⵥ���ͷ� ���� ����̵�

			nr = new int[4];
			mr = nr;
		}

		System.out.printf("mr's length=%d\n", mr.length);

		// 4) �迭�� ��� ǥ�����

		mr[0] = 1;
		mr[1] = 2;
		mr[2] = 3;
		mr[3] = 4;

		// 5) �ݺ����� �̿��ؼ� ���� �־�� (�ϰ�ó��) �迭�� ��Ұ� ��������.

		for (int i = 0; i < mr.length; i++) {

			// i = 0 1 2 3

			mr[i] = (i + 1) * 10; // 10 20 30 40 (������ ����

			System.out.printf("mr[%d] : %d\n", i, mr[i]);
		}

		// 5) ����� ��û

		MyArrays.displayArray(mr);

		// 6) �迭�� ���� 0���� ä���
		System.out.println();

		MyArrays.fill(mr, 0);
		System.out.println("0 ���� ä������");
		MyArrays.displayArray(mr);

		// 7) ���� java Arrays ���...
		System.out.println();

		Arrays.fill(mr, 1);
		System.out.println("Arrays �� ����� ����Ͽ� 1�� ä������");
		MyArrays.displayArray(mr);

		// 8) ���� Arrays ����� ����Ͽ� 0 (1 2) 3 ==>5�� �־��
		System.out.println();

		Arrays.fill(mr, 1, 1 + 2, 5);
		MyArrays.displayArray(mr);
		System.out.println();

		// 9) Ư���κ� �������� ä��� (���������� ���)

		System.out.println();

		MyArrays.fill(mr, 1, 1 + 2, 3);
		System.out.println("MyArrays : �������� 3�� ä������");
		MyArrays.displayArray(mr);

		// 10) ���� Arrays : ���� (��Ʈ)

		mr[0] = 4;
		mr[1] = 3;
		mr[2] = 2;
		mr[3] = 1;

		System.out.println("--before sort--");
		MyArrays.displayArray(mr);

		// 10) ��������(ASCENDING) sort ���������� ū������
		MyArrays.sort_asc(mr);
		System.out.println("--��������--");
		MyArrays.displayArray(mr);

		// 11) ��������(ASCENDING) ū������ ����������

		MyArrays.sort_desc(mr);
		System.out.println("--��������--");
		MyArrays.displayArray(mr);

	}

}
