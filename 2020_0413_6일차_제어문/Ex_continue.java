class Ex_continue 
{
	public static void main(String[] args) 
	{
		// continue: 반복문내에서 현재명령 종료하고 
		//           다음 제어식으로 이동해라
		int sum = 0;
		for(int i=0;i<=10;i++){
			
			if(i%2==0) continue;
				
            System.out.print(i);   
			sum = sum + i;
		}


	}
}
