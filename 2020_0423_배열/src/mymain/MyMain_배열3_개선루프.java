package mymain;

public class MyMain_�迭3_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nr = { 1, 2, 3, 4, 5 };

		
		
		
		System.out.println("==÷�ڸ� �̿��� ���==");
		for (int i = 0; i < nr.length; i++) {
			System.out.println(nr[i]);
		}
		
		
		System.out.println("==���� loop==");
		for (int n : nr) {
			System.out.println(n);
		}

		// ���� loop ��� : JDK 5.0 ���� ����

	}
}