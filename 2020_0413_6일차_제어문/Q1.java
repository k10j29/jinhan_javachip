import java.util.Scanner;

class Q1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int su1,su2,su3;
		int min;

		System.out.print("3���� ������ �Է��ϼ���>>");
		su1 = scan.nextInt();
		su2 = scan.nextInt();
		su3 = scan.nextInt();

        //2���� ���ؼ� �������� min�� �ִ´�
        min = su1 > su2 ? su2 : su1;
        //������ ���� min��
        min = min > su3 ? su3 : min;

		System.out.printf("3���� ���������� : %d\n", min);




	}
}
