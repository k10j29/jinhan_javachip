class Ex_continue 
{
	public static void main(String[] args) 
	{
		// continue: �ݺ��������� ������ �����ϰ� 
		//           ���� ��������� �̵��ض�
		int sum = 0;
		for(int i=0;i<=10;i++){
			
			if(i%2==0) continue;
				
            System.out.print(i);   
			sum = sum + i;
		}


	}
}
