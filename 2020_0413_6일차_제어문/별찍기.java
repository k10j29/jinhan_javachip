class ����� 
{
	public static void main(String[] args) 
	{
		System.out.println("---��ü---");
        for(int i=0;i<5;i++){     // i = 0 1 2 3 4 (��÷��)
		    
			for(int k=0;k<5;k++){ // k = 0 1 2 3 4 (��÷��)
				System.out.print('*');
			}
			System.out.println();
		}

		System.out.println("---�ﰢ��1---");
        for(int i=0;i<5;i++){     // i = 0 1 2 3 4 (��÷��)
		    
			for(int k=0;k<5;k++){ // k = 0 1 2 3 4 (��÷��)
				if(k<=i)
				    System.out.print('*');
				else
					System.out.print('-');
			}
			System.out.println();
		}

		System.out.println("---�ٶ�����---");
        for(int i=0;i<5;i++){     // i = 0 1 2 3 4 (��÷��)
		    
			for(int k=0;k<5;k++){ // k = 0 1 2 3 4 (��÷��)
				if(i==k || i==4-k)//����ä��� ����
				    System.out.print(' ');
				else
					System.out.print('*');
			}
			System.out.println();
		}




	}
}
