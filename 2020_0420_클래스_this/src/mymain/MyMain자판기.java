package mymain;

import java.util.Scanner;

import myutil.VandingMachine;

public class MyMain���Ǳ� {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int money;
		int drink;
		String yn = "y";

		VandingMachine vm = new VandingMachine();

		while (true) {

			System.out.print("�Աݱݾ� :");
			money = scan.nextInt();

			System.out.println("1. �ݶ�  2. ���̴�  3. Ŀ��  4. ��");
			System.out.print("���ἱ�� : ");
			drink = scan.nextInt();

		
			// drink 1~4�ǰ�
			// ���Ǳ⿡ ���ֱ�

			vm.setMoney(money);
			vm.setDrink(drink);

			// ������

			vm.display();

			// --[���]--
			// ���� : �ݶ�
			// �Ա� : 10000
			// �ܰ� : 500
			// �ܾ� : 9500

			System.out.print("�ٽ��ϱ� (y/n) : ");
			yn = scan.next();

			// ��ҹ��� ���������ʰ� y Y / n N

			if (yn.equalsIgnoreCase("y") == false)
				break;

		}
		System.out.println(" =����= ");

	}

}
