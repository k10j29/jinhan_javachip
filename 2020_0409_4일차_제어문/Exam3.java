import java.util.Scanner;

class Exam3 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        //�Է¹��� ����
		double c;
		double f;

		//����� ������ ����
		double res_c;
		double res_f;

        System.out.print("����(C)/ȭ��(F):");
		c = scan.nextDouble();
		f = scan.nextDouble();

		//���
        res_f  = 9.0/5.0*c  + 32.0 ;  //����->ȭ��
		res_c  = 5.0/9.0*(f - 32.0);  //ȭ��->����

        //���
		System.out.printf("����(C) %.1f�� ȭ���� %.1f(F)\n",c,res_f);
		System.out.printf("ȭ��(C) %.1f�� ������ %.1f(F)\n",f,res_c);


			







	}
}
