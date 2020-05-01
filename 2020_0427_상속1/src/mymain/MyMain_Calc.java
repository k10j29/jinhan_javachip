package mymain;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

import myutil.AdvanceCalc;
import myutil.BaseCalc;

public class MyMain_Calc {

	// Basecalc 기능만 사용 되는 메소드 구현하기
	static void use_basecalc(BaseCalc bc) {
		int a = 5, b = 3, res;
		res = bc.plus(a, b);
		System.out.printf("use_basecalc : %d + %d = %d\n", a, b, res);

		res = bc.minus(a, b);
		System.out.printf("use_basecalc : %d - %d = %d\n", a, b, res);

		// res =bc.hap(a); //사용권한이 없음 //

	}

	static void use_advancecalc(Object ob) {
		// = use_advancecalc(ac);

		int n = 10;
		int res;
		// 현재 위치에 사용 영역을 확장하겠다 (다운캐스팅)
		AdvanceCalc ac = (AdvanceCalc) ob;

		res = ac.hap(n);

		double res1 = ac.pow(2, 3);

		// res = ((AdvanceCalc)ob).hap(n); //한번 쓰고 말거면

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10, y = 3, res;

		AdvanceCalc ac = new AdvanceCalc();

		use_basecalc(ac);

		use_advancecalc(ac);

		res = ac.plus(x, y);
		System.out.printf("%d + %d = %d\n", x, y, res);

		res = ac.minus(x, y);
		System.out.printf("%d - %d = %d\n", x, y, res);

		res = ac.multiply(x, y);
		System.out.printf("%d * %d = %d\n", x, y, res);

		res = ac.divide(x, y);
		System.out.printf("%d / %d = %d\n", x, y, res);

		res = ac.hap(x);
		System.out.printf("%d 까지의 합은 = %d", x, res);

		res = ac.hap(x);
		System.out.printf("%d 까지의 합은 = %d\n", x, res);

		x = 2;
		y = 10;

		double res1 = ac.pow(x, y);

		System.out.printf("%d's %d승 : %.1f\n", x, y, res1);

		// Collection 객체 : Set List
		// /Collection /// //자바의 모든 객체를 저장할수 있다.

		ArrayList list = new ArrayList();

		list.add(new String("ABC")); // 0
		list.add(new Integer(100)); // 1
		list.add(new Random()); // 2
		list.add(new Scanner(System.in)); // 3

		// down-casting (사용영역의 확장)
		String str = (String) list.get(0);
		System.out.println(str.length());

		// down-casting (사용영역의 확장)
		Integer nob = (Integer) list.get(1);

		Object ob = new BaseCalc();
		BaseCalc bc = (BaseCalc) ob;

		// 생성된 객체 BaseCalc
		// AdvanceCalc ac1 = (AdvanceCalc) ob; ==== 사용 불가

	}

}
