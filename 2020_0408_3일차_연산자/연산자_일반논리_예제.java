class ������_�Ϲݳ�_���� 
{
	public static void main(String[] args) 
	{
		int year =  2020;

        String res = "���"; 
		//��������
		//����1) 400�� ����⵵
		//����2) 4�� ��� �̸鼭 100�� ����� �ƴ���

		if( /*����1*/ (year%400 == 0) 
			||  
			/*����2*/ (year%4==0  && year%100 != 0)
		  )
		res = "����";

		System.out.printf("[%d]���� [%s]\n",year,res);

	}
}
