class ������_���� 
{
	public static void main(String[] args) 
	{
		// (����) ? ��1(��) : ��2(����)

        //���밪 ���ϱ�
		int n = -100;
		int res;//�����

		res = (n<0) ? -n : n ;
		
		System.out.printf("|%d| = %d\n",n,res);

		//2���� ū(��)�� ���ϱ�
		int a = 10, b = 5;
		res  =  (a > b) ? a : b ; 

		System.out.printf("%d��(��) %d�� ū���� %d\n",a,b,res);

        //������ ���ϱ�( if ~ else)
		if( a < b )
			res = a;
		else
			res = b;

		System.out.printf("%d��(��) %d�� �������� %d\n",a,b,res);



	}
}
