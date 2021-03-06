class 연산자_단항 
{
	public static void main(String[] args) 
	{
		//단항연산자 : ~ ! ++ -- (cast) -(부호)

        // ~ (tilde) : 이진논리Not 연산자
		//             1보수를 취한다
		
		int n = 10;
		//정수->2진수의 문자열로 출력
		System.out.printf("[%32s]\n", Integer.toBinaryString(n) );
		System.out.printf("[%32s]\n", Integer.toBinaryString(~n) );

        // ! : 일반논리Not 연산자
        boolean bOk = !true;
        System.out.printf("bOk : %b\n",bOk);

		int a=10,b=50;
		bOk = !(a > b);
        //                    1    2    3      1 2  3   
		System.out.printf("!(%d > %d) : %b\n", a,b,bOk);

		//증감연산자 : ++  --
		//             자신을 1씩 증가(감소) 시키는 연산자
		//형식)    ++변수      (전위형)
		//           변수++    (후위형)
		int x = 10;
		System.out.printf("x=%d\n",x);
		x++; //  x = x + 1
		System.out.printf("x++ -> x=%d\n",x);
		x--; //  x = x - 1
		System.out.printf("x-- -> x=%d\n",x);

		int y = 10,z;
        x = 10;
		z = ++x + y++;// 1)++x  2)z=x+y 3)y++
		System.out.printf("x=%d y=%d z=%d\n",x,y,z);

		System.out.printf("++x=%d  x++=%d\n",++x,x++);
		System.out.println(x);

        //부호연산자 : -
		int sign = 1;
		sign = -sign; // + -> -  // sign = -1 * sign
		sign = -sign; // - -> +

        //형변환
        /*
           1.자동형변환(묵시적)
		      1)대입시 : 좌변항측에 맞춰진다(좌 > 우)

			  2)연산시 : 자료형이 큰쪽으로 맞춰진다
		   
		   2.강제형변환(명시적)
		     (원하는타입)값 
		*/
		
        //대입시 자동형변환
		double d;
		d = 100; //1)100->100.0 2) d = 100.0


        //강제형변환 
		float f;
		//좌=우
		f = (float)d;
		
		//연산시형변환(자동)
        /*
		    byte  + byte -> int
			short + short-> int
			--------------------
			byte  + int   -> int
			short + int   -> int
			int   + long  -> long
			long  + float -> float
			float + double-> double
		*/

		byte b1=1,b2=2,b3;
		b3 = (byte)(b1 + b2);
		System.out.printf("%d + %d = %d\n", b1,b2,b3);

        //연산시 자동형변환
        float f1 = 10.0f;
		long  l1 = 10L;

		float res1 = f1 + l1;//1)l1: long->float 2)f1 + (float)l1


	}
}
