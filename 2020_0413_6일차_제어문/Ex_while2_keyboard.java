class Ex_while2_keyboard 
{
	public static void main(String[] args) throws Exception
	{
		int ch;//�Է¹��� ����

        int count=0;//�ݺ�Ƚ�� ����

        System.out.println("�����Ϸ��� Ctrl + Z"); 

		while(true){ //���� loop(�ݺ�)

           ch = System.in.read();//�ǹ�?

           if(ch==-1) break;//Ż�⹮
           
		   count++;//����

		   System.out.printf("%c",ch);

		}

		System.out.printf("while�� �ݺ�Ƚ��:%d(ȸ)\n", count);

		System.out.println("--End--");
	}
}
