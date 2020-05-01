package myutil;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	// 추첨 중복수
	// 카운터와 랭크
	// 추첨 번호와 유저 번호를 이용하여 당첨 결과계산

	// 당첨번호로 등수 매길수있음
	// 추첨 번호

	int [] win_num = new int[7];
	// 내가 입력한 숫자
	int [] user_num;

	// 추첨
	Random rand = new Random(); // 난수발생

	int count; // 맞은갯수
	int rank; // 등수

	
	//추첨번호 추출후 오름차순으로 정리
	
	public void make_win_num() {
		int n = 7;
		int i = 0; //win_num 배열의 첨자 관리
		
		OUT_WHILE:
		//추첨번호 1~45번까지 랜덤으로 생성해줌		
		while (n>0) {// n = 7 6 5 4 3 2 1 
			int su = rand.nextInt(45)+1; //0~44  ==> +1 1~ 45	
			
			//중복수 체크 중복수 나오면 처음으로 다시
			for (int k=0; k<i; k++) {
				
				if(su==win_num[k])
					continue OUT_WHILE;
			}
			
			win_num[i] = su;
			i++;
			n--; }
		
		Arrays.sort(win_num, 0, 0+6); } //마지막 서비스 제외한 숫자 오름차순 정렬
	
	
	

	public void setUser_num(int[] user_num) {
		this.user_num = user_num;

		Arrays.sort(this.user_num);

		// 맞은 객수 및 등수 계산
		calc_rank();

	}
	private void calc_rank() {
		count = 0;
		// 추첨 번호와 유저 번호를 이용하여 당첨 결과계산
		for (int i=0; i<6; i++ ) {
			for (int k=0; k<7; k++) {
				if(user_num[i]==win_num[k])
					count++;
				
				}

			}
		}
					
	
			
			
			
			
		// count 와 rank (등수)
		//count == 5인것중에서 2등 체크
		
			
	

	
	//결과 출력창
	
	public void display() {
	
		System.out.println("--추첨결과--");
		System.out.println("--추첨번호 : ");
		
		
	//당첨번호 출력 하기
		
		for (int i = 0; i < win_num.length; i++) {
			
			if (i == 6)
				System.out.printf(" [[%d]]", win_num[i]);
			else
				System.out.printf("(%d)", win_num[i]);
			}
		
			
		System.out.print("\n유저번호\n");
		for (int i = 0; i < user_num.length; i++) {
			System.out.printf("(%d)", user_num[i]);
		}
		 if (count < 3) {
 				System.out.print("\n 꽝! \n");

 				return; 
 	  }
		 	System.out.printf("\n맞은갯수 : %d(개)\n", count);
		
		 	System.out.println("");
            
			 int count = 0;
	            for (int i = 0; i < 6; i++) {
	                for (int k = 0; k < 7; k++) {
	                    if (user_num[i] == win_num[k]) {
	                    	count++;
	                    }
	                }
	            }
	            if (count == 0) {
	                System.out.println("꼴등 ");
	            } else if (count == 1) {
	                System.out.println("6등 ");
	            } else if (count == 2) {
	                System.out.println("5등 ");
	            } else if (count == 3) {
	                System.out.println("4등 ");
	            } else if (count == 4) {
	                System.out.println("3등 ");
	            } else if (count == 5) {
	                System.out.println("2등 ");
	            } else if (count == 6) {
	                System.out.println("1등 ");
	            } else {
	                System.err.println("오류 ");
	            }
			
			
		
			
			
	}
  }
		
			
			
		


