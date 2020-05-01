class 연산자_산술 
{
	public static void main(String[] args) 
	{
		//산술 :  
		//        *  /(몫)  %(나머지)
		//        +  -  

        //int a = 10 , b = 3 , res;

		int a = 10;
		int b = 3;
		int res;


		//+
		res  = a + b ;
        System.out.printf("%d + %d = %d\n", a,b,res);

        //-
		res  = a - b ;
        System.out.printf("%d - %d = %d\n", a,b,res);

		res  = a * b ;
        System.out.printf("%d * %d = %d\n", a,b,res);

        //  /(몫)
		res  = a / b ;
        System.out.printf("%d / %d = %d\n", a,b,res);

        // %(나머지)
		res  = a % b ;
		// %를 출력서식으로 인식=>error
		// %를 문자인식시키려면 %% =>'%'
        System.out.printf("%d %% %d = %d\n", a,b,res);

        // ""내에서 "을 문자 인식 : \" => '"'
		System.out.println("안녕 \"정말\" 반가워");
        
		// \ => 제어문자 일부로 인식
		// ""내에서 \를 문자 인식 : \\ => '\'
		System.out.println("안녕 \\너무\\ 반가워");
		System.out.println("c:\\my_study\\java_study");


        //몫: 정수/정수
        double res2 = 10 / 3.0;
        
        System.out.println((int)res2);

        //나머지
		res2 = 10 % 3.0;
        System.out.println(res2);


	}
}
