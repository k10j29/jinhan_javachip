class ������_��� 
{
	public static void main(String[] args) 
	{
		//��� :  
		//        *  /(��)  %(������)
		//        +  -  

        //int a = 10 , b = 3 , res;

		int a = 10;
		int b = 3;
		int res;


		//+
		res  = a + b ;
        System.out.printf("%d + %d = %d\n", a,b,res);

        //-
		res  = a - b ;
        System.out.printf("%d - %d = %d\n", a,b,res);

		res  = a * b ;
        System.out.printf("%d * %d = %d\n", a,b,res);

        //  /(��)
		res  = a / b ;
        System.out.printf("%d / %d = %d\n", a,b,res);

        // %(������)
		res  = a % b ;
		// %�� ��¼������� �ν�=>error
		// %�� �����νĽ�Ű���� %% =>'%'
        System.out.printf("%d %% %d = %d\n", a,b,res);

        // ""������ "�� ���� �ν� : \" => '"'
		System.out.println("�ȳ� \"����\" �ݰ���");
        
		// \ => ����� �Ϻη� �ν�
		// ""������ \�� ���� �ν� : \\ => '\'
		System.out.println("�ȳ� \\�ʹ�\\ �ݰ���");
		System.out.println("c:\\my_study\\java_study");


        //��: ����/����
        double res2 = 10 / 3.0;
        
        System.out.println((int)res2);

        //������
		res2 = 10 % 3.0;
        System.out.println(res2);


	}
}
