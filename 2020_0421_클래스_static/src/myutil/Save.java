package myutil;

public class Save {

	// 1. �������ֱ�

	String name; // �̸�
	int money; // �����

	// 4. 0.1 (10%) double �̱⶧���� ����
	public static double rate = 0.1; // ����

	// 2. �⺻ ������ ����� > Ŭ���� �̸�ġ�� �ڵ��ϼ� ��� Constructor

	public Save() {
		// TODO Auto-generated constructor stub
	}

	// 3. field ����� ����Ű ��� (Shift, Alt, s)
	public Save(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}

	// 5. ���÷��� �غ���

	public void display() {
		System.out.printf("[%10s]-[%8d]-[%8d]\n", this.name, this.money,

				// 6. �����ϰ� ���� �������� �����̱⶧���� ������
				/// this.money*rate

				(int) (this.money * rate));
	}

}
