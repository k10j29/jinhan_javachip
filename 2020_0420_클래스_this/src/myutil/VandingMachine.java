package myutil;

public class VandingMachine {

	// ��� (������ ����)

	public static final int COLA = 1;
	public static final int CYDER = 2;
	public static final int COFFEE = 3;
	public static final int WATER = 4;

	// ���Ằ �ܰ�

	int cola = 500;
	int cyder = 600;
	int coffee = 700;
	int water = 800;

	int money; // �Է±ݾ�
	int drink; // �������� //1,2,3,4 �߿� �Է�

	// Get / Set ����

	public void setMoney(int money) {

		this.money = money;
	}

	public void setDrink(int drink) {

		this.drink = drink;

		// ���� �� �ܰ� ���ð��� / �װ����� �ܵ� ���Ҽ�����

	}

	public void display() {

		System.out.println(" =���= ");

		//1. ���ᰡ �߸� ���õ� ��� = drink �� 1~4 ���� ��

		if (drink < 1 || drink > 4) {
			System.out.println("������ ���ᰡ �����ϴ�");
			// ���� ���÷��� ����
			return;
		}
		//2. ���� �̸�, �ܰ� ����
		//14 line �ܰ� Ȯ��
		
		String drink_name="";
		int remain=0;
		int price=0;
		
		if(drink==COLA) {
	    drink_name="�ݶ�";
		price = cola;
		}else if (drink==CYDER) {
			drink_name="���̴�";
			price = cyder; 
			
		}else if(drink==COFFEE) {
			drink_name="Ŀ��";
			price=coffee; 

			
	}else if(drink==WATER)
			drink_name="��";
			price=water;




if (money < price) {
	
	System.out.println("�Աݾ��� �����մϴ�");
	return;
			
}

//�ܾװ��
remain = money - price;

System.out.printf("����: %s\n", drink_name);
System.out.printf("�Ա�: [%5d]\n", money);
System.out.printf("�ܰ�: [%5d]\n", price);
System.out.printf("�ܾ�: [%5d]\n", remain);
	}
}
	
