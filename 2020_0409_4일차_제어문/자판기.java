import java.util.Scanner;
class ���Ǳ� 
{
	public static void main(String[] args) 
	{
        Scanner scan = new Scanner(System.in);
 
        //����ܰ�
		int price_cola   = 500;
		int price_cider  = 600;
		int price_coffee = 1000;
 
		int money;   //���ұݾ�
		String drink;//��������
		int count;   //����

        int price;//��������ܰ�
		int amount;//��
		int tax;//�ΰ���
        int total_amount;//�Ѿ�
        int remain_money;//�ܾ�

		System.out.println("==================================");
		System.out.println("�ݶ�(500)  ���̴�(600) Ŀ��(1000)");
		System.out.println("==================================");

        //�Է�
		System.out.print("�����ѱݾ�:");
		money = scan.nextInt();
        
		System.out.print("���ἱ��:");
		drink = scan.next();

        System.out.print("����:");
		count = scan.nextInt();

        //�������ῡ ���� �ܰ� ���

		//if(drink.equals("�ݶ�")) price = price_cola;

		switch(drink)
		{
			case "�ݶ�":   price = price_cola;break;
			case "���̴�": price = price_cider;break;
			case "Ŀ��":   price = price_coffee;break;
			default: price = 0;
		}

		if(price==0){
			System.out.println("���õ� ���ᰡ �����ϴ�");
			return;//���α׷� ��.
		}

		//���
		amount = price * count;
		tax    = (int)(amount*0.1);
		total_amount = amount + tax;
		remain_money = money - total_amount;
         
		//���..
        System.out.println("------------------------------------" );
		System.out.printf("��    ��:%10d\n", amount);
		System.out.printf("�� �� ��:%10d\n", tax);
		System.out.printf("��    ��:%10d\n", total_amount);
		System.out.println("------------------------------------" );
		System.out.printf("�Ž�����:%10d\n", remain_money);




	}
}
