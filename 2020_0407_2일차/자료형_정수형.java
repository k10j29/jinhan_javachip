class �ڷ���_������ 
{
	public static void main(String[] args) 
	{
		//����  : �Ҽ����� ���� ��(byte,short,int,long)
		//�⺻��: 0(int)  0L(long)
		//���  : 1 100 0 <= 10����
		//       0144    <=  8����
		//       0x64    <= 16���� 
        //       cf)16���� �� ǥ��:0~15���� ǥ�� 
		//          0~9 10 11 12 13 14 15
		//               a  b  c  d  e  f
		//          0xf => 15    
		//��¼���: %d  (decimal:10����)
		//          %o  (octal:8����)
		//          %x  (hexa:16����)

        int n = 100;
        //                         1           2          1 2
        System.out.printf("10���� %d�� 16���� %x�Դϴ�\n",n,n);

		int m = 0x64;
		System.out.printf("16���� %x�� 10���� %d�Դϴ�\n",m,m);

		int o = 0144;
		System.out.printf("8���� %o�� 10���� %d�Դϴ�\n",o,o);

		n = 0xff;//16���� 1�ڸ��� 2���� 4�ڸ�
		//    f    f
		// 1111 1111 
		System.out.println(n);

		byte b1 = 100;
		System.out.printf("b1's value=%d\n",b1);

		//b1 = 128;(X)
		System.out.println("---�� �ڷ����� ��� ����---");
		System.out.printf("byte : %d~%d\n",
			                      Byte.MIN_VALUE,
			                      Byte.MAX_VALUE);
		System.out.printf("short : %d~%d\n",
			                      Short.MIN_VALUE,
			                      Short.MAX_VALUE);
		System.out.printf("int : %d~%d\n",
			                      Integer.MIN_VALUE,
			                      Integer.MAX_VALUE);
		System.out.printf("long : %d~%d\n",
			                      Long.MIN_VALUE,
			                      Long.MAX_VALUE);

	}
}
