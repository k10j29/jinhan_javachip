class 자료형_정수형 
{
	public static void main(String[] args) 
	{
		//정수  : 소숫점이 없는 수(byte,short,int,long)
		//기본형: 0(int)  0L(long)
		//상수  : 1 100 0 <= 10진수
		//       0144    <=  8진수
		//       0x64    <= 16진수 
        //       cf)16진의 값 표현:0~15까지 표현 
		//          0~9 10 11 12 13 14 15
		//               a  b  c  d  e  f
		//          0xf => 15    
		//출력서식: %d  (decimal:10진수)
		//          %o  (octal:8진수)
		//          %x  (hexa:16진수)

        int n = 100;
        //                         1           2          1 2
        System.out.printf("10진수 %d는 16진수 %x입니다\n",n,n);

		int m = 0x64;
		System.out.printf("16진수 %x는 10진수 %d입니다\n",m,m);

		int o = 0144;
		System.out.printf("8진수 %o는 10진수 %d입니다\n",o,o);

		n = 0xff;//16진수 1자리가 2진수 4자리
		//    f    f
		// 1111 1111 
		System.out.println(n);

		byte b1 = 100;
		System.out.printf("b1's value=%d\n",b1);

		//b1 = 128;(X)
		System.out.println("---각 자료형별 사용 범위---");
		System.out.printf("byte : %d~%d\n",
			                      Byte.MIN_VALUE,
			                      Byte.MAX_VALUE);
		System.out.printf("short : %d~%d\n",
			                      Short.MIN_VALUE,
			                      Short.MAX_VALUE);
		System.out.printf("int : %d~%d\n",
			                      Integer.MIN_VALUE,
			                      Integer.MAX_VALUE);
		System.out.printf("long : %d~%d\n",
			                      Long.MIN_VALUE,
			                      Long.MAX_VALUE);

	}
}
