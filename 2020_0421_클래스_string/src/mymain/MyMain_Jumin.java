package mymain;

import java.util.Scanner;

import myutil.Jumin;

public class MyMain_Jumin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String jumin_no; // 주민번호
		String yn = "y";

		Jumin jumin = new Jumin();

		while (true) {

			System.out.println("주민번호 (xxxxxxxx-xxxxxxxx) : ");
			jumin_no = scan.next();

			// 입력받은 주민번호 jumin 에 넣어준다 (setter)

			jumin.setJumin_no(jumin_no);

			int year = jumin.getYear();
			int age = jumin.getAge();

			// String 확인하기

			//String tti = jumin.getTti();
			String gender = jumin.getGender();
			String season = jumin.getSeason();
			String local = jumin.getLocal();
			String ganji = jumin.getGanji();
			boolean bValid = jumin.isValid(); // 유효하느냐

			
			if (bValid) {	
			System.out.println("--결과--");
			System.out.printf("출생년도  :  %d(%s)\n", year, ganji);
			System.out.printf("==나이==  :  %d(살)\n", age);
			//System.out.printf("==띠==    :  %s(띠)\n", tti);
			System.out.printf("==성별==  :  %s\n", gender);
			System.out.printf("==계절==  :  %s\n", season);
			System.out.printf("==지역==  :  %s\n", local);
			} else {
				
				System.out.printf("[%s]는틀린 주민번호 \n ", jumin_no);
			}
			
			// 또할건가

			System.out.print("또할래? <y/n> : ");
			yn = scan.next();

			// Y가 아니면 끝내라
			if (yn.equalsIgnoreCase("Y") == false)

				break;
		}

		System.out.println("END");

	}

}
