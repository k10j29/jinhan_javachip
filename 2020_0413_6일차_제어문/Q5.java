class Q5 
{
	public static void main(String[] args) throws Exception
	{
		int ch = System.in.read();
        String nation="�����?";

		if(ch=='a' || ch=='A')nation="America";
		else if(ch=='b' || ch=='B')nation="Brazil";
		else if(ch=='c' || ch=='C')nation="Canada";

		System.out.printf("[%c]�� ���۵Ǵ� �����̸� [%s]\n",
			                ch,                    nation);

	}
}
