class 연산자_일반논리_예제 
{
	public static void main(String[] args) 
	{
		int year =  2020;

        String res = "평년"; 
		//윤년조건
		//조건1) 400의 배수년도
		//조건2) 4의 배수 이면서 100의 배수가 아닌해

		if( /*조건1*/ (year%400 == 0) 
			||  
			/*조건2*/ (year%4==0  && year%100 != 0)
		  )
		res = "윤년";

		System.out.printf("[%d]년은 [%s]\n",year,res);

	}
}
