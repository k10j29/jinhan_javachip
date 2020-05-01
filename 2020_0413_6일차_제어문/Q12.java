import java.util.Scanner;

class Q12 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		double r;
		int    n;
		double res=1;
		System.out.print("실수입력하세요>>");
        r = scan.nextDouble();
		System.out.print("정수입력하세요>>");
		n = scan.nextInt();

        for(int i=0;i<n;i++)
			res = res * r;
        
		System.out.printf("%.1f's %d승 : %.1f\n",r,n,res);  

	}
}
