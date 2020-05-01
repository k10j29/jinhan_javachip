package mymain;

import myutil.MyArrays2;

public class MyMain_배열_2_3_가변고정길이배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//고정길이 배열 : 1차원 배열의 길이가 같은배열
//가변길이 배열 : 1차원 배열의 길이가 다른배열
		
		//가변길이 배열의 참조변수
		int [][] mm = new int[3][];
		
		mm[0] = new int[] {1,2};
		mm[1] = new int[] {3,4,5};
		mm[2] = new int[] {6,7,8,9};
		
		MyArrays2.display(mm);
		
		System.out.println();
		
		//가변길이배열의 초기화
		
		int [][] mm2 = {
				{1,2},
				{3,4,5},
				{6,7,8,9}
			};
		MyArrays2.display(mm2);
		
		
		//60갑자
		String [][] ganji_array = {
			/* 0행 */		{"경","신","임","계","갑","을","병","정","무","기"},
			/* 1행 */		{"산","유","술","해","자","축","인","묘","진","사","오","미"}
														};
		
		int year = 2020;
		//문자열 만들기 String.format
		String ganji= String.format("%s%s년", 
				
				ganji_array [0] [year%10], 
				ganji_array [1] [year%12]
						);
	
		System.out.printf("[%d]년도는 %s\n", year, ganji);
		
	}
}
