package myutil;

public class MyDate {

	// 2020-04-20 ���Ͽ� ���� ��� ����
	// final �ڷ��� ������ = �� <= ���
	public static final int MON = 1;
	public static final int TUE = 2;
	public static final int WED = 3;
	public static final int THU = 4;
	public static final int FRI = 5;
	public static final int SAT = 6;
	public static final int SUN = 7;
	
	

	// ���� ������
	// member variable
	// member field

	// ����ȭ (Encapsulation): �߿�Ӽ� �ܺγ���
	// ������ ���� ��ü�� ���� �������

	// 1. ��ü�� ����� ������ ���� ���� (�����ͺ�ȣ ����)
	// 2. ���������� �����͸� �ְ� / �����ִ� ����� ��������

	private int year;
	protected int month;
	public int day;
	int week_day;

	// geter \\setter method (���� �ؼ�) �ҹ��� �빮�� �ؼ� �ܾ� �ΰ��̻�� �ձ��� �빮��
	// ���� : set �Ӽ���
	// ���� : get �Ӽ���

	// ���� ���� ���������� public �����ؼ� ������� �������� (���� �Ҽ�)

	/* �ڡڡڡڡ� year's setter method */

	public void setYear(int y) {
		year = y;
	}

	public int getYear() {
		return year;
	}

	public void setMonth(int m) {
		month = m;
	}

	public int getMonth() {
		return month;
	}

	public void setDay(int d) {
		day = d;
	}

	public int getDay() {
		return day;
	}

	public void setWeek_day(int w) {
		week_day = w;
	}

	public int getWeek_day() {
		return week_day;
	}

	// �Ϲ� �޼ҵ� 2020-04-20

	public void setDate(int y, int m, int d, int w) {
		// MyDate �� year
		// this �»�������
		this.year = y;
		this.month = m;
		this.day = d;
		this.week_day = w;

	}

	public void display() {

		String str_yoil = "��";
		// week_day 1(��) 2(��) 3(ȭ)

		switch (week_day) {
		case 1:
			str_yoil = "��";
			break;
		case 2:
			str_yoil = "ȭ";
			break;
		case 3:
			str_yoil = "��";
			break;
		case 4:
			str_yoil = "��";
			break;
		case 5:
			str_yoil = "��";
			break;
		case 6:
			str_yoil = "��";
			break;
		case 7:
			str_yoil = "��";
			break;

		}

		System.out.printf("%04d-%02d-%2d %s\n", year, month, day, str_yoil);

	}

}
