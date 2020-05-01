package myutil;

import java.util.BitSet;

// MyInfo 기준 MyDate가 외부
public class MyInfo {


	String name;
	MyDate birthday = new MyDate();
	
	private void setBirthday(int y, int m, int d, int w) {
		
		//private는 외부에서 접근 불가능
		
		//birthday.year = y;
		//같은 Package 상의 객체끼리 (private 제외 )는 호출가능
		//같은 폴더이던지 직계이던지
		
		birthday.month = m; //protected
		birthday.day = d;   //public
		birthday.week_day = w; //default
	}


}
