package myutil;

import java.awt.geom.Arc2D.Double;

public class MyMath {

	// static (class) method : ���α׷� ���۽� �����ȴ�.

	public static int multiply(int a, int b) {
		int c = a * b;
		return c;

	}

	// instance method : ��ü�� �����Ǿ� ��������� �޼ҵ�
	public int plus(int a, int b) {
		int c = a + b;
		return c;
	}

	public int minus(int a, int b) {
		int c = a - b;
		return c;
	}

	public int divide(int a, int b) {
		int c = a / b;
		return c;
	}

	public int remain(int a, int b) {
		int c = a % b;
		return c;
	}

//n��������
	public int hap(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

	// n������ ���� m�� ����� ��

	// hap(10.3) => 3�ǹ�� ���ϱ�
	public int hap2(int n, int m) {

		int sum = 0;
		// i++ >> i = i + m ���� if �Ƚᵵ��
		for (int i = 1; i <= n; i++) {
			if (i % m == 0)
				sum = sum + i;
		}
		return sum;
	}

	// n������ ���� �Ҽ� ���ϱ�

	// 1�� 2.. > > �ڽſ� �������� �ʴ¼�

	// ����� ���¼�
	public void sosu(int n) {

		for (int i = 2; i <= n; i++) {// (i) �� �Ҽ����� Ȯ���ؾ���
			boolean bSosu = true;
			// ����� (i) ���������� ������ �������� �Ҽ��ƴ�
			for (int k = 2; k < i / 2; k++)

			{
				if (i % k == 0) {
					bSosu = false;
					break;
				}

			}

			if (bSosu) // �Ҽ��� ����ض�
				System.out.printf("%3d", i);
		}

		System.out.println();

	}

	// 3���� ū�� ���ϱ� //���׿�����
	public int min(int a, int b, int c) {
			
		int res;
        res = a > b ? b : a;
        res = res > c ? c : res;

		return res;
	}

	public double max(double a, double b, double c) {

		return 0;

	}

	// a's b �� ���ϱ�

	public double pow(double a, double b) {

		double res = a;
		for (double i = 1; i <= a; i++) {
			
			res = res * b;
		}
		return 0.0; //
	}

	// ���丮�� n! = n*(n-1)*(n-2)#
	public double fact(int n) {

		return 0.0;
	}

	// �ĺ���ġ ����
	// f = front
	// r = rear
	//

	public void fibonacci(int n) {

		while (n > 0) {

			n--;

		}

	}

}
