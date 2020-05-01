package myutil;

public class MyDate {

	// 2020-04-20 요일에 대한 상수 선언
	// final 자료형 변수명 = 값 <= 상수
	public static final int MON = 1;
	public static final int TUE = 2;
	public static final int WED = 3;
	public static final int THU = 4;
	public static final int FRI = 5;
	public static final int SAT = 6;
	public static final int SUN = 7;
	
	

	// 접근 제한자
	// member variable
	// member field

	// 은닉화 (Encapsulation): 중요속성 외부노출
	// 행위에 대한 구체적 과정 노출안함

	// 1. 객체를 설계시 변수는 노출 안함 (데이터보호 목적)
	// 2. 간접적으로 데이터를 넣고 / 뺄수있는 방법을 구현하자

	private int year;
	protected int month;
	public int day;
	int week_day;

	// geter \\setter method (명명법 준수) 소문자 대문자 준수 단어 두개이상시 앞글자 대문자
	// 세터 : set 속성명
	// 게터 : get 속석명

	// 전후 사정 제껴버리고 public 선언해서 마음대로 쓸수있음 (같은 소속)

	/* ★★★★★ year's setter method */

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

	// 일반 메소드 2020-04-20

	public void setDate(int y, int m, int d, int w) {
		// MyDate 의 year
		// this 는생략가능
		this.year = y;
		this.month = m;
		this.day = d;
		this.week_day = w;

	}

	public void display() {

		String str_yoil = "금";
		// week_day 1(일) 2(월) 3(화)

		switch (week_day) {
		case 1:
			str_yoil = "월";
			break;
		case 2:
			str_yoil = "화";
			break;
		case 3:
			str_yoil = "수";
			break;
		case 4:
			str_yoil = "목";
			break;
		case 5:
			str_yoil = "금";
			break;
		case 6:
			str_yoil = "토";
			break;
		case 7:
			str_yoil = "일";
			break;

		}

		System.out.printf("%04d-%02d-%2d %s\n", year, month, day, str_yoil);

	}

}
