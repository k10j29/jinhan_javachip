class Ex_break_continue 
{
	public static void main(String[] args) 
	{
		//break :탈출문
		//  1)break : 현재소속된 반복문만 탈출
		//  2)break label : 지정된 label영역의 반복문을 탈출
        //Label  
        OUT_FOR: 
		for(int i=0;i<5;i++){
            for(int k=0;k<5;k++){
				 //if(i==3)break;//안쪽 for문 탈출
				 // label OUT_FOR인 반복문까지 탈출
				 if(i==3)break OUT_FOR;
				 System.out.printf("(i=%d k=%d) ",i,k);
			}
			System.out.println();
		}

		//contine 
        // 1) continue        :현재소속된반복문의 명령을 종료
		//                     ->다음제어식으로 이동해라
		// 2) continue label : label영역의 반복문의 명령을 종료
		//                     ->다음제어식으로 이동해라
        System.out.println("---------------------------");
        OUT_FOR2:
		for(int i=0;i<5;i++){
            for(int k=0;k<5;k++){
				 
				 System.out.printf("(i=%d k=%d) ",i,k);
				 //if(i==2 && k==2) continue;
				 if(i==2 && k==2) {
					 System.out.println();

					 continue OUT_FOR2;
				 }

			}
			System.out.println();
		}



	}
}
