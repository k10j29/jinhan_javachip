class Ex_for1 
{
	public static void main(String[] args) throws Exception
	{
        { 
           int n;//local 변수
		}

        {
		   int n;//local 변수
		}

        for(int i=0 ; i<5 ; i++)// i = 0 1 2 3 4
		{
			System.out.print("안녕");
		}

		System.out.println();//줄바꾸기..

        int sum = 0;//i 값을 누적... 
		int n   = 10;
		for(int i=1;i<=n;i++) // i =       1  2 ... 10
		{
           // i값을 누적
		   sum  = sum + i;    //  sum = 0 + 1 + 2 ...
           //                      
           System.out.print(i);
		   if(i<n)
				System.out.print('+');
		   else
				System.out.print('=');

		   Thread.sleep(1);// milisec : 1/1000초
		}

		System.out.println(sum);


	}
}
