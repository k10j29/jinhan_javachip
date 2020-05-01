class Q11 
{
	public static void main(String[] args) 
	{
		double pi=0.0;
        int n = 50000000;
		int sign = 1;
		for(int i=0;i<n;i++){
           pi = pi + sign*(4.0/(2*i+1));
		   //부호바꾸기
		   sign = -sign;

		}

		System.out.printf("%.10f\n",pi);
		System.out.printf("%.10f\n",Math.PI);

	}
}
