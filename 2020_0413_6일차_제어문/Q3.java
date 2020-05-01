class Q3 
{
	public static void main(String[] args) throws Exception
	{
		//문자 1개 입력받기
		int ch = System.in.read();
        String res="";
		
		if( (ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
			res = "알파벳";
		else if( ch>='0' && ch<='9' )
			res = "숫자";
        else if(ch=='\t')
			res = "탭";
		else if(ch==' ')
			res = "공백";
		else if(ch=='\r')
			res = "캐리지리턴(Home)"; // \r\n 
		else if(ch=='\n')
			res = "new line(Enter)";
		else
			res = "기타";

        System.out.printf("입력받은 문자는 [%s]입니다\n",res);



	}
}
