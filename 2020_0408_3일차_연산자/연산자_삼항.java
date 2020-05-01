class 연산자_삼항 
{
	public static void main(String[] args) 
	{
		// (조건) ? 값1(참) : 값2(거짓)

        //절대값 구하기
		int n = -100;
		int res;//결과값

		res = (n<0) ? -n : n ;
		
		System.out.printf("|%d| = %d\n",n,res);

		//2수중 큰(작)수 구하기
		int a = 10, b = 5;
		res  =  (a > b) ? a : b ; 

		System.out.printf("%d와(과) %d중 큰수는 %d\n",a,b,res);

        //작은수 구하기( if ~ else)
		if( a < b )
			res = a;
		else
			res = b;

		System.out.printf("%d와(과) %d중 작은수는 %d\n",a,b,res);



	}
}
