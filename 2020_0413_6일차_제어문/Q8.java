class Q8 
{
	public static void main(String[] args) 
	{
		int n = 10;
		System.out.println("n     1~n������");
		System.out.println("===============");
		for(int i=1;i<=n;i++){
            
			//i������ �ձ��ϱ�
			int sum = 0;
			for(int k=0;k<=i;k++)
				sum  = sum + k;


            System.out.printf("%3d%10d\n",i,sum);
		}

	}
}
