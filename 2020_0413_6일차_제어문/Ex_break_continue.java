class Ex_break_continue 
{
	public static void main(String[] args) 
	{
		//break :Ż�⹮
		//  1)break : ����Ҽӵ� �ݺ����� Ż��
		//  2)break label : ������ label������ �ݺ����� Ż��
        //Label  
        OUT_FOR: 
		for(int i=0;i<5;i++){
            for(int k=0;k<5;k++){
				 //if(i==3)break;//���� for�� Ż��
				 // label OUT_FOR�� �ݺ������� Ż��
				 if(i==3)break OUT_FOR;
				 System.out.printf("(i=%d k=%d) ",i,k);
			}
			System.out.println();
		}

		//contine 
        // 1) continue        :����Ҽӵȹݺ����� ����� ����
		//                     ->������������� �̵��ض�
		// 2) continue label : label������ �ݺ����� ����� ����
		//                     ->������������� �̵��ض�
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
