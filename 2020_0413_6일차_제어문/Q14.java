class Q14 
{
	public static void main(String[] args) 
	{
		double res = 0;
		int n = 1;
		while(n<10){ //n =  1 3 5 7 9

           res = res + (1.0/n);
           
		   n+=2;
		}

		System.out.print(res);
	}
}
