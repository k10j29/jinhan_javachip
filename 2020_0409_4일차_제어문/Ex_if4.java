class Ex_if4 
{
	public static void main(String[] args) 
	{
		int su = 12;

        //3 �� 4�� �����?
		if( su%3==0 && su%4==0 ){
			//2���� �̻��� ��쿡�� {  } �����...
			System.out.printf("[%d]�� 3�� ���\n",su); //1
			System.out.printf("[%d]�� 4�� ���\n",su); //2
		}
        else
			System.out.println("--������ �������� �ʽ��ϴ�");//3

        

	}
}
