package myutil;

public class MyDate {

	int year;
	int month;
	int day;

	// 생성자 (constructor) method
	// 1. 초기화 용도의 method (자신의 변수를 초기화 할 수 있는)
	// 2. 형식 클랙스명 ()
	// 반환형이 없다.
	// 3. 객체가 생성될때 자동호출 (단 1회만 호출)
	// 4. Overload 가 가능하다. 중복 메소드
	// 5. 생성자는 생략 가능하다
								// 단,overload 된 생정자를 추가할경우
								// 기본생성자는 무조건 추가해야함

//생성자 void 반환형 없음
//기본 생성자 dafault constructor (기본생성자)	
	public MyDate() {
		System.out.println("--MyDate()--");
		year = month = day = 1000;
	}

	// 위와 Overload 관계 (method 는 같은데 변수가 다른거)
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
