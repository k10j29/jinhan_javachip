package mymain;

import java.util.Scanner;

import myutil.VandingMachine;

public class MyMain자판기 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int money;
		int drink;
		String yn = "y";

		VandingMachine vm = new VandingMachine();

		while (true) {

			System.out.print("입금금액 :");
			money = scan.nextInt();

			System.out.println("1. 콜라  2. 사이다  3. 커피  4. 물");
			System.out.print("음료선택 : ");
			drink = scan.nextInt();

		
			// drink 1~4의값
			// 자판기에 값넣기

			vm.setMoney(money);
			vm.setDrink(drink);

			// 결과출력

			vm.display();

			// --[결과]--
			// 음료 : 콜라
			// 입금 : 10000
			// 단가 : 500
			// 잔액 : 9500

			System.out.print("다시하기 (y/n) : ");
			yn = scan.next();

			// 대소문자 구별하지않고 y Y / n N

			if (yn.equalsIgnoreCase("y") == false)
				break;

		}
		System.out.println(" =빠이= ");

	}

}
