package mymain;

import java.util.Scanner;

import myutil.Mabangjin;

public class MyMain_mabangjin {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int chasu; // ���� �Է� (���� � �Ұų�)
		String yn = "y";
		
		Mabangjin mabangjin = new Mabangjin();

		while (true) {
			System.out.println("���� : ");
			chasu = scan.nextInt();

			// ������ 2�� �������� �������� 0�̷� (¦��)
			if (chasu % 2 == 0) {
				System.out.println("=Ȧ���� �Է��ϼ���=");

				// 14�������� �̵� (true)
				continue;

			}

			// ������ ���� �ѱ�� ����ϱ�
			
			mabangjin.setChasu(chasu);
			mabangjin.display();
			
			System.out.print("���ҷ�?(y/n):");
			yn = scan.next();

			// �Է��� ���� y�� �ƴϸ� (!) ������.
			if (!yn.equalsIgnoreCase("Y"))
				break;

		}
		
		System.out.println("END");

	}

}
