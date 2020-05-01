package mymain;

import java.util.Random;

public class MyMain_배열1_활용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1) 각월의 마지막 날을 배열로 만들어보자
							      //0  1  2  3  4  5  6  7  8  9 10 11  <====index
				int [] month_array = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		
		//1~12월 난수발생 (무작위)
		Random rand = new Random();
		int month  = rand.nextInt(12) + 1 ; //1~12월 0 1 2 3 4 5 6 7 8 9 10 11 ======> +1 // 1~12

		int last_day=month_array[month-1];
		//if 또는 스위치도가능 배열을 만들어 놓으면 첨자 뽑기만 하면됌
		
		System.out.printf("[%d]월은 [%d]일까지..\n", month,last_day);
		
		
		
		
		
		//최소값은 1970 이고 최대값은 50 = 2020 (1970~2020)
		
		//띠구하기
							  //  0       1   2     3  .. 
		String [] tti_array = {"원숭이","닭","개","돼지",
				              // 4    5       6      7     8    9    10   11
								"쥐","소","호랑이","토끼","용","뱀","말","양",};
				
		//출생년도.
		int year = rand.nextInt(51) + 1970 ; //1970-2020

		int tti_index =year%12;
		
		String tti = tti_array[tti_index];
		
		
		//System.out.printf("[%d]년도생 띠는 [%s]", year ,tti);
		System.out.printf("[%d](%d)년도생 띠는 [%s]\n", year ,tti_index,tti);
		
		
		
		//60갑자 구하기
		//year % 10 = 0~9 
		//year % 12 = 0~11
		
		int gan_araay =year%12;
		
		
							//	0
		String [] gan_array = {"경","신","임","계","갑",
								"을","병","정","무","기",};
		
		String [] ji_array = {"신","유","슬","해","자","축","인",
								"묘","진","사","오","미"};
		
		System.out.printf("[%d]년도는 [%s%s년]\n",year, gan_array[year%10], ji_array[year%12]);
		
		
		
	
	
		
	}

}
