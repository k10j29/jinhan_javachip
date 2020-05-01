package myutil;

public class MyDate {

	int year;
	int month;
	int day;

	// ������ (constructor) method
	// 1. �ʱ�ȭ �뵵�� method (�ڽ��� ������ �ʱ�ȭ �� �� �ִ�)
	// 2. ���� Ŭ������ ()
	// ��ȯ���� ����.
	// 3. ��ü�� �����ɶ� �ڵ�ȣ�� (�� 1ȸ�� ȣ��)
	// 4. Overload �� �����ϴ�. �ߺ� �޼ҵ�
	// 5. �����ڴ� ���� �����ϴ�
								// ��,overload �� �����ڸ� �߰��Ұ��
								// �⺻�����ڴ� ������ �߰��ؾ���

//������ void ��ȯ�� ����
//�⺻ ������ dafault constructor (�⺻������)	
	public MyDate() {
		System.out.println("--MyDate()--");
		year = month = day = 1000;
	}

	// ���� Overload ���� (method �� ������ ������ �ٸ���)
	// overload constructor

	public MyDate(int y, int m, int d) {

		System.out.println("--MyDate(y,m,d)--");

		year = y;
		month = m;
		day = d;

	}

	public MyDate(int y) {
		System.out.println("--MyDate(y)--");

		year = y;
		month = day = 1;

	}

	public MyDate(int y, int m) {

		System.out.println("--MyDate(y,m)--");

		year = y;
		month = m;
		day = 1;

	}
	
	

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
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

	public void display() {
		System.out.printf("%04d-%02d-%02d\n", year, month, day);
	}
}
