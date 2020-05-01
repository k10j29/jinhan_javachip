package mymain;

import java.util.Scanner;

import myutil.Lotto;

public class MyMain_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//출력을 위하여 
		Scanner scan = new Scanner(System.in);

		//내가 입력하게될 숫자의 갯수 6개
		int[] user_num = new int[6];
		
		//마지막에 다시 진행을 할건지 말건지 확인하는 확인문 출력하기
		String yn = "y";
		
		// 다시할래?
		/* System.out.print("\n또할래? [y/n] : \n");
		yn = scan.next();
		if (yn.equalsIgnoreCase("Y") == false)
			break; */

		//myutil 의 계산식들 가져오기
		Lotto lotto = new Lotto();

		
		
		lotto.make_win_num();

		
		//숫자를 입력할수 있도록 설정
		while (true) {
			System.out.print("로또 번호 6개를 입력하세요 : ");
			user_num[0] = scan.nextInt();
			user_num[1] = scan.nextInt();
			user_num[2] = scan.nextInt();
			user_num[3] = scan.nextInt();
			user_num[4] = scan.nextInt();
			user_num[5] = scan.nextInt();

			
			// 사용자가 입력한 로또 번호를 계산 객체에서 넘긴다
			lotto.setUser_num(user_num);
			lotto.display();

			
			
			
			// 다시할래?
			System.out.print("\n또할래? [y/n] : \n");
			yn = scan.next();
			if (yn.equalsIgnoreCase("Y") == false)
				break;

		} // end while

		System.out.println("--END--");

	}

}
