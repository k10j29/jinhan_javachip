class ������_���ܻ��� 
{
	public static void main(String[] args) 
	{
		int x = 1;
		int y = 2;
		boolean z;

		// Short circuit evaluation(������ ����)
		// && ||

        // x = 0     (x>0) -> false

        //�������� �̹� false ���� ��ɼ��� ���� 
		z = (--x > 0) && (++y > 1) ;
//      x = 0   y = 3  z = false
//      x = 0   y = 2  z = false
        System.out.printf("x = %d y = %d z = %b\n",x,y,z);

        //�������� �̹� true ���� ��ɼ��� ���� 
		z = (++x > 0) || (++y > 1) ;
//      x = 1   y = 2  z = true
		System.out.printf("x = %d y = %d z = %b\n",x,y,z);

		
	}
}
