package mymain;

import java.util.Scanner;

import myutil.MyCalendar;

public class MyMain_Ķ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int year;
		int month;
		String yn = "y";

		MyCalendar mc = new MyCalendar(); // ������ ��ƿ�� year �� month �� �����ؾ���

		while(true) {

			System.out.print("�⵵/�� : ");
			year = scan.nextInt();
			month = scan.nextInt();
			
			System.out.print("  ��   ��   ȭ   ��   ��   ��   ��   \n");
						
			// �������������� �޷� ��ü���� ��¥ ����
			mc.setDate(year, month);

			// �������������� �޷����
			mc.display();

			//////////// �ٽ�?
			System.out.print("�ٽ�? (y/n) : ");
			yn = scan.next();
			if (yn.equalsIgnoreCase("Y") == false)
				break;

		}

		System.out.println("END");

	}

}
