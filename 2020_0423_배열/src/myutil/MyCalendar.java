package myutil;

import java.util.Calendar;

public class MyCalendar {

                            //1  2  3  4  5  6  7  8  9  10 11 12    (-1)
		int [] month_array = {31,28,31,30,31,30,31,31,30,31,30,31}; //각 월의 마지막날
		
		int [][] cal_array; //6행 7열
		int year;
		int month;
				
		//윤년 체크 method	//윤년 체크 method	//윤년 체크 method	//윤년 체크 method
		private boolean isYoon() {
		
			return (year%400==0) || (year%4==0 && year%100!=0); 
		}	
					
	public void setDate(int y, int m) {
	 year = y;
	 month = m;
	
	
		 /////////////////달력만들기
		 make_calendar ();
	}

	private void make_calendar() {
		// TODO Auto-generated method stub
		cal_array = new int[6][7];

		// 1) 요일 구하기 //1) 요일 구하기 //1) 요일 구하기 //1) 요일 구하기 //1) 요일 구하기
		Calendar c = Calendar.getInstance();
		// 날짜 수정하기 현재는 시스템 날짜 니까 ==> 입력받은 날짜로

		// month-1 하는이유는 배열의 천번째 칸은 0이기 때문에 -1 시켜서 1 2 3 4 5 6
		// 배열의 첨자로 사용하기위해
		c.set(year, month-1, 1);
		// 요일 알아내기 // 요일 알아내기// 요일 알아내기// 요일 알아내기// 요일 알아내기
		int yoil = c.get(Calendar.DAY_OF_WEEK)-1;

		//System.out.println(yoil);// 윤년이면

		if (this.isYoon())
			month_array[1] = 29; // 윤년
		else
			month_array[1] = 28; // 평년

		// 2) 달력의 행첨자 2) 달력의 행첨자 2) 달력의 행첨자 2) 달력의 행첨자
		int week = 0;
		
		// 날짜 채우기 // 날짜 채우기 // 날짜 채우기 // 날짜 채우기
		for (int i = 1; i<=month_array[month-1]; i++) {
			cal_array[week][yoil] = i;
			
			yoil++; //4 5 6 다음줄로 내리기
			if(yoil>6) {
				week++;
				yoil=0;
				
				
				
			}
		}

	}

	////////////// □□□□□□□□□□□□□□ 요일 출력하기

	public void display() {
		
		for (int i = 0; i < 6; i++) {
			for (int k = 0; k < 7; k++) {
				System.out.printf("%3d", cal_array[i][k]);
			}

		System.out.println();
	 }
	}
}
