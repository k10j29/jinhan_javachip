class 자료형_boolean 
{
	public static void main(String[] args) 
	{
		//논리형: boolean
		//상수  : true or false
		//출력서식: %b  or %B(대문자)

        // 변수앞에 접두어 b(boolean) n(number)
		boolean  bOk = 3 > 2 ;
		System.out.println(bOk);
        //                           1       1 
		System.out.printf("3 > 2 => %b\n", bOk );
		System.out.printf("3 > 2 => %B\n", bOk );
     
	    bOk = (3 == 2) ;//같냐?
		System.out.printf("(3 == 2) => %b\n", bOk );
 
		//bOk = ("파리" == "새") ;

		bOk = true;//변수=상수;

		//true = bOk;



	}
}
