class Ex_if3 
{
	public static void main(String[] args) throws Exception
	{
		//1.Ű���忡�� ���� 1���� �Է� �޴´�
		//2.���� �����Ѵ�
		//  �빮��, �ҹ���, ����, ��Ÿ����
        String res="��Ÿ";
 
        System.out.print("����1�� �Է�:"); 
		// System.in    <=Ű�����Է°�ü
		//        read()<=Ű������ۿ��� 1byte�� �����´� 
		int ch = System.in.read();

		if( ch>='A' && ch<='Z' )      res = "�빮��";
		else if( ch>='a' && ch<='z' ) res = "�ҹ���";
		else if( ch>='0' && ch<='9' ) res = "����";
		else res="��Ÿ";

		System.out.printf("�о�� ���� [%c]�� [%s]\n",ch,res);


	}
}
