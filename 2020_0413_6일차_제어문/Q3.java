class Q3 
{
	public static void main(String[] args) throws Exception
	{
		//���� 1�� �Է¹ޱ�
		int ch = System.in.read();
        String res="";
		
		if( (ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
			res = "���ĺ�";
		else if( ch>='0' && ch<='9' )
			res = "����";
        else if(ch=='\t')
			res = "��";
		else if(ch==' ')
			res = "����";
		else if(ch=='\r')
			res = "ĳ��������(Home)"; // \r\n 
		else if(ch=='\n')
			res = "new line(Enter)";
		else
			res = "��Ÿ";

        System.out.printf("�Է¹��� ���ڴ� [%s]�Դϴ�\n",res);



	}
}
