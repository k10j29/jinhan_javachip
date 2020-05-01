package mymain;

import myutil.MyMath;

public class MyMain_MyMath {

	public static void main(String[] args) {

		int x = 10, y = 5, z = 2, res;

		// static method �̱⶧���� Ŭ������, �޼ҵ�� () ���� ����
		res = MyMath.multiply(x, y);

		// new ��ü
		MyMath mm = new MyMath();

		res = mm.plus(x, y);
		System.out.printf("%d + %d = %d\n", x, y, res);

		res = mm.minus(x, y);
		System.out.printf("%d - %d = %d\n", x, y, res);

		res = mm.multiply(x, y);
		System.out.printf("%d * %d = %d\n", x, y, res);

		if (y != 0) {
			res = mm.divide(x, y);
			System.out.printf("%d / %d = %d\n", x, y, res);
		}

		if (y != 0) {
			res = mm.remain(x, y);
			System.out.printf("%d %% %d = %d\n", x, y, res);
		}

		res = mm.hap(x);
		System.out.printf("%d������ ����=%d\n", x, res);

		res = mm.hap2(x, y);
		System.out.printf("%d�������� %d�������=%d\n", x, y, res);

		x = 30;
		System.out.printf("%d�������� �Ҽ�:", x);
		mm.sosu(x);

		// ���� API ��ġ���� API : Math class

				
		res = mm.min(x, y, z);
		System.out.printf("3���� ���������� : %d\n", res);
		
		//res = Math.min(x, y);
		//System.out.printf("%f�� %d�´�=%f\n", x, y, res);

	}

}
