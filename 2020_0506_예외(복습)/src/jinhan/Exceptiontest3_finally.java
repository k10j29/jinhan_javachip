package jinhan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptiontest3_finally {

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
		}finally {
			System.out.println("||Finally||");
		}
		
		
		System.out.println("���α׷� ����");

	}

}
