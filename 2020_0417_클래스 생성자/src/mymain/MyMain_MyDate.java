package mymain;

import myutil.MyDate;

public class MyMain_MyDate {

	public static void main(String[] args) {
//2. ������ ���� ������		
//1. ��ü�� ������ (heap : ������ġ��)

		// (��������) \\ (��ü ����)
		// in �̶�� �̸����� ���� ���� ���� �Ϸ���
		MyDate in = new MyDate();

		in.display();
		// setyear = ������ //2020 = ������

		in.setYear(2020);
		in.setMonth(4);
		in.day = 20;

		in.setWeek_day(1);

		in.display();

		System.out.println();
		System.out.println();

		// ��ü�� �����ִ� �� > ������ ���� ���´�
		int year = in.getYear();
		int month = in.getMonth();
		int day = in.getDay();
		int week_day = in.getWeek_day();

		System.out.printf("���� : %04d-%02d-%02d %s����\n", year, month, day, week_day);

		System.out.println();

		// ��¥�� �ѹ��� ����
		// 2020-04-20
		in.setDate(2020, 4, 20, MyDate.MON);
		in.display();
		
		// ������  ��¥
		in.setDate(2020, 4, 21, MyDate.TUE);
		in.display();
		
		//MyDate.SUN = 0;

	}

}
