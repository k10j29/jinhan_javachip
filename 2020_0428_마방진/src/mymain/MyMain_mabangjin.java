package mymain;

import java.util.Scanner;

import myutil.Mabangjin;

public class MyMain_mabangjin {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int chasu; // 차수 입력 (몇행 몇열 할거냐)
		String yn = "y";
		
		Mabangjin mabangjin = new Mabangjin();

		while (true) {
			System.out.println("차수 : ");
			chasu = scan.nextInt();

			// 차수를 2로 나눴더니 나머지가 0이래 (짝수)
			if (chasu % 2 == 0) {
				System.out.println("=홀수만 입렵하세요=");

				// 14라인으로 이동 (true)
				continue;

			}

			// 마방진 차수 넘기고 출력하기
			
			mabangjin.setChasu(chasu);
			mabangjin.display();
			
			System.out.print("또할래?(y/n):");
			yn = scan.next();

			// 입력한 값이 y가 아니면 (!) 끝내라.
			if (!yn.equalsIgnoreCase("Y"))
				break;

		}
		
		System.out.println("END");

	}

}
