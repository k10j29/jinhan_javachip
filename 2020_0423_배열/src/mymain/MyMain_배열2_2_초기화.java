package mymain;

import myutil.MyArrays2;

public class MyMain_배열2_2_초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//초기화하기 
		
						   //행열 처음 초기화때 갯수 생략
		int [][] mm = new int[][] {
			{1,2,3}, //0행
			{4,5,6}, //1행
			{7,8,9}  //2행
		};
		
		MyArrays2.display(mm);
		
		System.out.println();
		
		int [][] mm2 = {
			{1,2,3}, //0행
			{4,5,6}, //1행
			{7,8,9}  //2행
		};
		MyArrays2.display(mm2);
		
		int [][] block_t = {
				{0,1,0},
				{0,1,0},
				{1,1,1}
		};
		System.out.println();
		
		MyArrays2.display(block_t);
		
		//블럭그리기
		System.out.println();
		
		for (int i=0; i<block_t.length; i++) {
			for (int k=0; k<block_t[i].length; k++) {
				if(block_t[i][k]==0)
					System.out.printf("%3s"," ");
					else
						System.out.printf("%3s","■");
			}
			System.out.println();
		}
	}
}
