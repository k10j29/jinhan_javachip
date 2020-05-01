class Q9 
{
	public static void main(String[] args) 
	{
		//factorial : n!=n*(n-1)*(n-2)*.....1
		//            4!=4*3*2*1
		//            0!=1
		
		int n = 5;
		double res = 1;

		for(int i=n;i>=1;i--){
           res = res * i; 
		}

		System.out.printf("%d fact = %.0f\n",n,res);

	}
}
