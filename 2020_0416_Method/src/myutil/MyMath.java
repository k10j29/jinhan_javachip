package myutil;

import java.awt.geom.Arc2D.Double;

public class MyMath {

	// static (class) method : 프로그램 시작시 생성된다.

	public static int multiply(int a, int b) {
		int c = a * b;
		return c;

	}

	// instance method : 객체가 생성되야 만들어지는 메소드
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

//n까지의합
	public int hap(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

	// n까지의 수중 m의 배수의 합

	// hap(10.3) => 3의배수 구하기
	public int hap2(int n, int m) {

		int sum = 0;
		// i++ >> i = i + m 쓰고 if 안써도됨
		for (int i = 1; i <= n; i++) {
			if (i % m == 0)
				sum = sum + i;
		}
		return sum;
	}

	// n까지의 수중 소수 구하기

	// 1과 2.. > > 자신외 나눠지지 않는수

	// 약수가 없는수
	public void sosu(int n) {

		for (int i = 2; i <= n; i++) {// (i) 가 소수인지 확인해야함
			boolean bSosu = true;
			// 현재수 (i) 이전수까지 나눠서 떨어지면 소숫아님
			for (int k = 2; k < i / 2; k++)

			{
				if (i % k == 0) {
					bSosu = false;
					break;
				}

			}

			if (bSosu) // 소수면 출력해라
				System.out.printf("%3d", i);
		}

		System.out.println();

	}

	// 3수중 큰수 구하기 //삼항연산자
	public int min(int a, int b, int c) {
			
		int res;
        res = a > b ? b : a;
        res = res > c ? c : res;

		return res;
	}

	public double max(double a, double b, double c) {

		return 0;

	}

	// a's b 승 구하기

	public double pow(double a, double b) {

		double res = a;
		for (double i = 1; i <= a; i++) {
			
			res = res * b;
		}
		return 0.0; //
	}

	// 팩토리얼 n! = n*(n-1)*(n-2)#
	public double fact(int n) {

		return 0.0;
	}

	// 파보나치 수열
	// f = front
	// r = rear
	//

	public void fibonacci(int n) {

		while (n > 0) {

			n--;

		}

	}

}
