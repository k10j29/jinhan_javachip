package jinhan;

import java.awt.im.InputContext;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptiontest2 {

	public static void main(String[] args) {

		int var = 50;
		try {
			System.out.print("���� �Է� : ");
			int data = new Scanner(System.in).nextInt();

			System.out.println(var / data );

		} catch (InputMismatchException ie) {
			System.out.println("���ڰ� �ƴմϴ�.");
		} catch (ArithmeticException ae) {
			System.out.println("0���� ������ �����ϴ�.");
		}
		System.out.println("���α׷� ����");

	}

}
