import java.util.Scanner;

class Exam2 
{
	public static void main(String[] args) 
	{
		Scanner scan  = new Scanner(System.in);
		int ft;
		int inch;
		double cm;
        
		//�Է¹�� : �����̸� �������
		//           �����̸� ����
		System.out.print("ft/inch:");
		ft   = scan.nextInt();
		inch = scan.nextInt();

        //cm ���
		cm = (ft*12 + inch)*2.54;



        System.out.printf("%d(ft) %d(inch)�� %.2f(cm)\n",
			               ft,   inch,        cm);


      


	}
}
