class Q15 
{
	public static void main(String[] args) 
	{
		int n = 1;
		int sign = -1;
		while(n<20){// n= 1 3 5 ... 19
           
		   System.out.printf("%4d ",n*sign);
           n += 2;
		   sign = -sign;//부호변경 : + <-> -
		}
	}
}
