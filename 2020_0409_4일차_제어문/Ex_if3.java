class Ex_if3 
{
	public static void main(String[] args) throws Exception
	{
		//1.키보드에서 문자 1개을 입력 받는다
		//2.문자 구분한다
		//  대문자, 소문자, 숫자, 기타문자
        String res="기타";
 
        System.out.print("문자1개 입력:"); 
		// System.in    <=키보드입력객체
		//        read()<=키보드버퍼에서 1byte을 가져온다 
		int ch = System.in.read();

		if( ch>='A' && ch<='Z' )      res = "대문자";
		else if( ch>='a' && ch<='z' ) res = "소문자";
		else if( ch>='0' && ch<='9' ) res = "숫자";
		else res="기타";

		System.out.printf("읽어온 문자 [%c]는 [%s]\n",ch,res);


	}
}
