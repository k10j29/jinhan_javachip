package mymain;

import java.util.Scanner;

import myutil.MyCalendar;

public class MyMain_캘린더 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int year;
		int month;
		String yn = "y";

		MyCalendar mc = new MyCalendar(); // 얘한테 유틸의 year 과 month 를 전달해야함

		while(true) {

			System.out.print("년도/월 : ");
			year = scan.nextInt();
			month = scan.nextInt();
			
			System.out.print("  일   월   화   수   목   금   토   \n");
						
			// □□□□□□□□□□□□□ 달력 객체에게 날짜 전달
			mc.setDate(year, month);

			// □□□□□□□□□□□□□ 달력출력
			mc.display();

			//////////// 다시?
			System.out.print("다시? (y/n) : ");
			yn = scan.next();
			if (yn.equalsIgnoreCase("Y") == false)
				break;

		}

		System.out.println("END");

	}

}
