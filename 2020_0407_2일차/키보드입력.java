//Java Home\jre\lib\.... rt.jar

//��ġ���� �˷���� �ȴ�
import java.util.Scanner;

class Ű�����Է� 
{
	public static void main(String[] args) 
	{
		//Ű����κ��� �Է¹޴� ��ü ����
		Scanner scan = new Scanner(System.in);

		String name;//�̸�
		int    age; //����
		String addr;//�ּ�
		double ki;  //Ű
		String tel; //��ȭ

		//�̸� �Է¹ޱ�
		System.out.print("�̸�:");
		//     Ű���� ���ۿ��� ���� ��������
		//name = scan.next();  //�Է±����� : ���� or ����
		//                       �Է±����� ������ ������ 
		name = scan.nextLine();//�Է±�����: ����
		                       //            ���ͱ��� �����ͼ�

        System.out.print("����:");
		age = scan.nextInt();

        scan.nextLine();//���� ���Ͱ� �����´�(������)

        System.out.print("�ּ�:");
		addr = scan.nextLine();

		System.out.print("Ű:");
		ki = scan.nextDouble();

		scan.nextLine();//���� ���Ͱ� �����´�(������)

        System.out.print("��ȭ:");
		tel = scan.nextLine();

        System.out.println("---[��³���]---");
		System.out.printf("�̸�: %s\n",name);
		System.out.printf("����: %d(��)\n",age);
		System.out.printf("�ּ�: %s\n",addr);
		System.out.printf("Ű: %.1f(cm)\n",ki);
		System.out.printf("��ȭ: %s\n",tel);


	}
}
