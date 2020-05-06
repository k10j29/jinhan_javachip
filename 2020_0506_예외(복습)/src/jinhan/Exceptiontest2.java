package jinhan;

import java.awt.im.InputContext;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptiontest2 {

	public static void main(String[] args) {

		int var = 50;
		try {
			System.out.print("정수 입력 : ");
			int data = new Scanner(System.in).nextInt();

			System.out.println(var / data );

		} catch (InputMismatchException ie) {
			System.out.println("숫자가 아닙니다.");
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나눌수 없습니다.");
		}
		System.out.println("프로그램 종료");

	}

}
