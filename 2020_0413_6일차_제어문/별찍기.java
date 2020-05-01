class 별찍기 
{
	public static void main(String[] args) 
	{
		System.out.println("---전체---");
        for(int i=0;i<5;i++){     // i = 0 1 2 3 4 (행첨자)
		    
			for(int k=0;k<5;k++){ // k = 0 1 2 3 4 (열첨자)
				System.out.print('*');
			}
			System.out.println();
		}

		System.out.println("---삼각형1---");
        for(int i=0;i<5;i++){     // i = 0 1 2 3 4 (행첨자)
		    
			for(int k=0;k<5;k++){ // k = 0 1 2 3 4 (열첨자)
				if(k<=i)
				    System.out.print('*');
				else
					System.out.print('-');
			}
			System.out.println();
		}

		System.out.println("---바람개비---");
        for(int i=0;i<5;i++){     // i = 0 1 2 3 4 (행첨자)
		    
			for(int k=0;k<5;k++){ // k = 0 1 2 3 4 (열첨자)
				if(i==k || i==4-k)//공백채우는 조건
				    System.out.print(' ');
				else
					System.out.print('*');
			}
			System.out.println();
		}




	}
}
