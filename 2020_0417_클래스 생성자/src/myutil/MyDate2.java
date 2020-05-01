package myutil;

public class MyDate2 {

	// geter \\setter method (명명법 준수) 소문자 대문자 준수 단어 
	// 숨겨진 변수를 외부로 도출할수있는 방법
	// 두개이상시 앞글자 대문자
		// 세터 : set 속성명
		// 게터 : get 속석명
	

	
	private int year;
	private int month;
	private int day;
	
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
	
	
	
}
