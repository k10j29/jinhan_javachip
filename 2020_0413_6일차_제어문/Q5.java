class Q5 
{
	public static void main(String[] args) throws Exception
	{
		int ch = System.in.read();
        String nation="어떤나라?";

		if(ch=='a' || ch=='A')nation="America";
		else if(ch=='b' || ch=='B')nation="Brazil";
		else if(ch=='c' || ch=='C')nation="Canada";

		System.out.printf("[%c]로 시작되는 나라이름 [%s]\n",
			                ch,                    nation);

	}
}
