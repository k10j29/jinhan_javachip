package myutil;

import java.util.Calendar;

public class MyDate2 {

	// member field
	// instance 변수 : 객체가 생성이 될때 생성되는 변수
	int year;
	int month;
	int day;

	public MyDate2() {
		// TODO Auto-generated constructor stub

		// 현재 시스템 날짜 구하는식 : 년 월 일 시 분 초 AM PM
		Calendar c = Calendar.getInstance();

		this.year = c.get(Calendar.YEAR);
		this.month = c.get(Calendar.MONTH) + 1; // 0부터 시작함
		this.day = c.get(Calendar.DATE);
		// Calendar.JANUARY //찾아가보면 0으로 되어있음 월은 +1 해줘야함
	}

	public MyDate2(int year) {
		
		
		//자신의 생성자가 가장 위에 있어야함
		this(); // 자신의 생성자 호출 : MyDate() Call
		// MyDate2

		this.year = year;

	}

	public MyDate2(int year, int month) {

		this();

		this.year = year;
		this.month = month;

	}

	public MyDate2(int year, int month, int day) {

		// 부모클라스 부를때 super
		// super();
		this (year, month);
		this.day = day;
	}

	public void display() {
		System.out.printf("%04d-%02d-%02d\n", year, month, day);

	}
	// instance method 객체가 생성될때 생성되는 method 한번만 생성

	public int getYear() {
		return year;
		
	}

	public void setYear(int year) {
		// 작업을 요청한 객체가 this
		System.out.println("내부 :" + this);
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

// String	
}
