package myutil;

import java.util.Calendar;

public class MyDate2 {

	// member field
	// instance ���� : ��ü�� ������ �ɶ� �����Ǵ� ����
	int year;
	int month;
	int day;

	public MyDate2() {
		// TODO Auto-generated constructor stub

		// ���� �ý��� ��¥ ���ϴ½� : �� �� �� �� �� �� AM PM
		Calendar c = Calendar.getInstance();

		this.year = c.get(Calendar.YEAR);
		this.month = c.get(Calendar.MONTH) + 1; // 0���� ������
		this.day = c.get(Calendar.DATE);
		// Calendar.JANUARY //ã�ư����� 0���� �Ǿ����� ���� +1 �������
	}

	public MyDate2(int year) {
		
		
		//�ڽ��� �����ڰ� ���� ���� �־����
		this(); // �ڽ��� ������ ȣ�� : MyDate() Call
		// MyDate2

		this.year = year;

	}

	public MyDate2(int year, int month) {

		this();

		this.year = year;
		this.month = month;

	}

	public MyDate2(int year, int month, int day) {

		// �θ�Ŭ�� �θ��� super
		// super();
		this (year, month);
		this.day = day;
	}

	public void display() {
		System.out.printf("%04d-%02d-%02d\n", year, month, day);

	}
	// instance method ��ü�� �����ɶ� �����Ǵ� method �ѹ��� ����

	public int getYear() {
		return year;
		
	}

	public void setYear(int year) {
		// �۾��� ��û�� ��ü�� this
		System.out.println("���� :" + this);
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
