import java.util.Scanner;

class Q12 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		double r;
		int    n;
		double res=1;
		System.out.print("�Ǽ��Է��ϼ���>>");
        r = scan.nextDouble();
		System.out.print("�����Է��ϼ���>>");
		n = scan.nextInt();

        for(int i=0;i<n;i++)
			res = res * r;
        
		System.out.printf("%.1f's %d�� : %.1f\n",r,n,res);  

	}
}
