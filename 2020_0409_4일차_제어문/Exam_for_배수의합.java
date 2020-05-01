import java.util.Scanner;

class Exam_for_배수의합 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int n; //범위
		int m; //배수

        System.out.print("범위/배수:");
		n = scan.nextInt();
		m = scan.nextInt();
        
		//배수의 합 계산
		for(int i=0;i<=n ; i+=m){
           sum += i;
		}

		System.out.printf("%d까지의 %d의 배수의 합 = %d\n",
			               n,       m,               sum);


	}
}
