package mymain;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

import myutil.AdvanceCalc;
import myutil.BaseCalc;

public class MyMain_Calc {

	// Basecalc ��ɸ� ��� �Ǵ� �޼ҵ� �����ϱ�
	static void use_basecalc(BaseCalc bc) {
		int a = 5, b = 3, res;
		res = bc.plus(a, b);
		System.out.printf("use_basecalc : %d + %d = %d\n", a, b, res);

		res = bc.minus(a, b);
		System.out.printf("use_basecalc : %d - %d = %d\n", a, b, res);

		// res =bc.hap(a); //�������� ���� //

	}

	static void use_advancecalc(Object ob) {
		// = use_advancecalc(ac);

		int n = 10;
		int res;
		// ���� ��ġ�� ��� ������ Ȯ���ϰڴ� (�ٿ�ĳ����)
		AdvanceCalc ac = (AdvanceCalc) ob;

		res = ac.hap(n);

		double res1 = ac.pow(2, 3);

		// res = ((AdvanceCalc)ob).hap(n); //�ѹ� ���� ���Ÿ�

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
		System.out.printf("%d ������ ���� = %d", x, res);

		res = ac.hap(x);
		System.out.printf("%d ������ ���� = %d\n", x, res);

		x = 2;
		y = 10;

		double res1 = ac.pow(x, y);

		System.out.printf("%d's %d�� : %.1f\n", x, y, res1);

		// Collection ��ü : Set List
		// /Collection /// //�ڹ��� ��� ��ü�� �����Ҽ� �ִ�.

		ArrayList list = new ArrayList();

		list.add(new String("ABC")); // 0
		list.add(new Integer(100)); // 1
		list.add(new Random()); // 2
		list.add(new Scanner(System.in)); // 3

		// down-casting (��뿵���� Ȯ��)
		String str = (String) list.get(0);
		System.out.println(str.length());

		// down-casting (��뿵���� Ȯ��)
		Integer nob = (Integer) list.get(1);

		Object ob = new BaseCalc();
		BaseCalc bc = (BaseCalc) ob;

		// ������ ��ü BaseCalc
		// AdvanceCalc ac1 = (AdvanceCalc) ob; ==== ��� �Ұ�

	}

}
