package mymain;

import myutil.MyMath;

public class MyMain_MyMath {

	public static void main(String[] args) {

		int x = 10, y = 5, z = 2, res;

		// static method 이기때문에 클래스명, 메소드명 () 으로 가능
		res = MyMath.multiply(x, y);

		// new 객체
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
		System.out.printf("%d까지의 합은=%d\n", x, res);

		res = mm.hap2(x, y);
		System.out.printf("%d까지수중 %d배수의합=%d\n", x, y, res);

		x = 30;
		System.out.printf("%d까지수중 소수:", x);
		mm.sosu(x);

		// 기존 API 수치관련 API : Math class

				
		res = mm.min(x, y, z);
		System.out.printf("3수중 가장작은수 : %d\n", res);
		
		//res = Math.min(x, y);
		//System.out.printf("%f의 %d승는=%f\n", x, y, res);

	}

}
