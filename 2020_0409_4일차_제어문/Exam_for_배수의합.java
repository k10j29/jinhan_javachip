import java.util.Scanner;

class Exam_for_������� 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int n; //����
		int m; //���

        System.out.print("����/���:");
		n = scan.nextInt();
		m = scan.nextInt();
        
		//����� �� ���
		for(int i=0;i<=n ; i+=m){
           sum += i;
		}

		System.out.printf("%d������ %d�� ����� �� = %d\n",
			               n,       m,               sum);


	}
}
