package mymain;

import myutil.MyArrays2;

public class MyMain_배열2_4_회전문제 {

	static int [][] rotate_right_90(int [][] src) {
		
		//원본 배열과 동일한 사본배열 생성
		
		int rows = src.length;     //행
		int cols = src[0].length;  //열
		
		int [][] dest = new int [rows][cols];
		
		for (int i=0; i<rows; i++) { 		//행첨자
			for (int k=0; k<cols; k++) { 	//열첨자
				dest [i][k] = src [(rows-1)-k][i];
				
			}
		}
		return dest;
		
	}
	
	static int [][] rotate_right_180(int [][] src) {
		
		//원본 배열과 동일한 사본배열 생성
		
		int rows = src.length;     //행
		int cols = src[0].length;  //열
		
		int [][] dest = new int [rows][cols];
		
		for (int i=0; i<rows; i++) { 		//행첨자
			for (int k=0; k<cols; k++) { 	//열첨자
				dest [i][k] = src [(rows-1)-i][(rows-1)-k];
				
			}
		}
		return dest;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] src = new int[5][5];

		MyArrays2.setArray(src);
		// 원본 문제 출력
		System.out.println("원본입니다.");

		MyArrays2.display(src);
		
		
		System.out.println();
		
		//오른쪽 90도 회전 결과 (복제본)
		
		int [][] res = rotate_right_90(src); 
		System.out.println("rotate 결과");
		MyArrays2.display(res);
		
		int [][] res2 = rotate_right_180(src); 
		System.out.println("rotate 180 결과");
		MyArrays2.display(res2);
		
		

	}

}
