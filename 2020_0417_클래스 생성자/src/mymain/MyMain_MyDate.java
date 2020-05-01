package mymain;

import myutil.MyDate;

public class MyMain_MyDate {

	public static void main(String[] args) {
//2. 위쪽은 참조 변수임		
//1. 객체가 생성됨 (heap : 생성위치임)

		// (참조변수) \\ (객체 변수)
		// in 이라는 이름으로 내부 변수 접근 하려함
		MyDate in = new MyDate();

		in.display();
		// setyear = 가인자 //2020 = 실인자

		in.setYear(2020);
		in.setMonth(4);
		in.day = 20;

		in.setWeek_day(1);

		in.display();

		System.out.println();
		System.out.println();

		// 객체가 갖고있는 값 > 각각의 값을 얻어온다
		int year = in.getYear();
		int month = in.getMonth();
		int day = in.getDay();
		int week_day = in.getWeek_day();

		System.out.printf("낱개 : %04d-%02d-%02d %s요일\n", year, month, day, week_day);

		System.out.println();

		// 날짜를 한번에 변경
		// 2020-04-20
		in.setDate(2020, 4, 20, MyDate.MON);
		in.display();
		
		// 다음날  날짜
		in.setDate(2020, 4, 21, MyDate.TUE);
		in.display();
		
		//MyDate.SUN = 0;

	}

}
