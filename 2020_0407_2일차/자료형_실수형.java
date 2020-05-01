class 자료형_실수형 
{
	public static void main(String[] args) 
	{
		//실수: 소숫점이 있는 수
		//상수: 1.0(double)  1.0F(float)  
		//      1.25E + 2(double)  1.25E + 2F(float)
		//출력서식: %f(소숫점이하 6자리)    
		//          %e(소숫점이하 6자리)    
		//          %g(자릿수가 적은쪽으로)
		//          %m.nf <= m:전체자릿수
		//                   n:소숫점자릿수

		float  f = 1.23456789012345678901234567f;
		double d = 1.23456789012345678901234567;
		//  소숫점이하 20자리까지 출력
		System.out.printf("%.20f\n",f);
		System.out.printf("%.20f\n",d);

		d = 12.345;
		System.out.printf("%f\n",d);
		System.out.printf("%e\n",d);
		System.out.printf("%E\n",d);
		System.out.printf("%g\n",d);

		//자릿수 지정 출력
		//전체출력자릿수 10자리 확보 소숫점이하 2자리 출력
		//최우선지켜지는내용은 소숫점자릿수
		// d = 12.345
		System.out.printf("[%10.2f]\n",d);
		System.out.printf("[%-10.2f]\n",d);//left align
		//앞쪽빈자리는 0으로 채워라
		System.out.printf("[%010.2f]\n",d);

        //지정한전체자릿수 < 출력자릿수 : 무시된다
		System.out.printf("[%3.2f]\n",d);
		System.out.printf("[%.2f]\n",d); //전체자릿수 생략


		//정수출력서식
		int n = 123;
        System.out.printf("[%10d]\n",n);
        System.out.printf("[%-10d]\n",n);
        //System.out.printf("[%-010d]\n",n);
        System.out.printf("[%010d]\n",n);
        
		System.out.printf("[%2d]\n",n);

		//System.out.printf("[%f]\n",(double)n);






	}
}
