class 연산자_쉬프트 
{
	public static void main(String[] args) 
	{
		//쉬프트(2진) :  >>  <<   >>>

	    int n = 10;
		int result;
		System.out.printf("[%32s]\n", 
			              Integer.toBinaryString(n) );

		// n >> 2
        result = n >> 2;
		System.out.printf("[%32s]\n", 
			              Integer.toBinaryString(result) );

		// n << 2
        result = n << 2;
		System.out.printf("[%32s]\n", 
			              Integer.toBinaryString(result) );

        n = -1;  
        System.out.printf("[%32s]\n", 
			              Integer.toBinaryString(n) );

		// >>는 앞에 발생된 공간을 부호로 채운다
		result = n >> 4;
		System.out.println("-1 >> 4");
		System.out.printf("[%32s]\n", 
			              Integer.toBinaryString(result) );

		// >>>는 앞에 발생된 공간을 무조건 0으로 채운다
		result = n >>> 4;
		System.out.println("-1 >>> 4");
		System.out.printf("[%32s]\n", 
			              Integer.toBinaryString(result) );


	}
}
