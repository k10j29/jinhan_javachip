package mymain;

import java.util.Scanner;

import myutil.Jumin;

public class MyMain_Jumin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String jumin_no; // �ֹι�ȣ
		String yn = "y";

		Jumin jumin = new Jumin();

		while (true) {

			System.out.println("�ֹι�ȣ (xxxxxxxx-xxxxxxxx) : ");
			jumin_no = scan.next();

			// �Է¹��� �ֹι�ȣ jumin �� �־��ش� (setter)

			jumin.setJumin_no(jumin_no);

			int year = jumin.getYear();
			int age = jumin.getAge();

			// String Ȯ���ϱ�

			//String tti = jumin.getTti();
			String gender = jumin.getGender();
			String season = jumin.getSeason();
			String local = jumin.getLocal();
			String ganji = jumin.getGanji();
			boolean bValid = jumin.isValid(); // ��ȿ�ϴ���

			
			if (bValid) {	
			System.out.println("--���--");
			System.out.printf("����⵵  :  %d(%s)\n", year, ganji);
			System.out.printf("==����==  :  %d(��)\n", age);
			//System.out.printf("==��==    :  %s(��)\n", tti);
			System.out.printf("==����==  :  %s\n", gender);
			System.out.printf("==����==  :  %s\n", season);
			System.out.printf("==����==  :  %s\n", local);
			} else {
				
				System.out.printf("[%s]��Ʋ�� �ֹι�ȣ \n ", jumin_no);
			}
			
			// ���Ұǰ�

			System.out.print("���ҷ�? <y/n> : ");
			yn = scan.next();

			// Y�� �ƴϸ� ������
			if (yn.equalsIgnoreCase("Y") == false)

				break;
		}

		System.out.println("END");

	}

}
