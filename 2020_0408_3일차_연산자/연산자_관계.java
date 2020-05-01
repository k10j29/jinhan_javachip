class 연산자_관계 
{
	public static void main(String[] args) 
	{
		// 관계(비교) 연산자:  > >= < <=  ==(같냐?) !=(같지않냐?)
		//                    결과:boolean
		int a = 3;
		int b = 2;

		System.out.printf("%d > %d  : %b\n", a,b, a>b);
		System.out.printf("%d >= %d : %b\n", a,b, a>=b);
		System.out.printf("%d < %d  : %b\n", a,b, a<b);
		System.out.printf("%d <= %d : %b\n", a,b, a<=b);
		System.out.printf("%d == %d : %b\n", a,b, a==b);
		System.out.printf("%d != %d : %b\n", a,b, a!=b);

	}
}
