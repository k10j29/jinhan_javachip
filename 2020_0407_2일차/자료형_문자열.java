class 자료형_문자열 
{
	public static void main(String[] args) 
	{
		//문자열  : 1개이상의 문자가 나열 
		//상수    : "ABC" <= 'A''B''C'
		//출력서식: %s

		//변수
		String name = "홍길동";
		System.out.printf("name's value : %s\n", name);

		String str = "우리나라대한민국";
        // %m.ns   : m(전체)  n(출력문자수)
		System.out.printf("%.4s\n", str);




	}
}
