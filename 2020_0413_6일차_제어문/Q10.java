class Q10 
{
	public static void main(String[] args) 
	{
		double res = 1;
        int n = 20;
		for(int i=1;i<=n;i++){
           if(i%2==0)
			   res = res * i;
		}

		System.out.printf("1���� %d���� ¦���� ��:%.0f\n",n,res);
	}
}
