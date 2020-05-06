package jinhan;

import java.util.Scanner;

public class Exception_throws_throw {

	public void printDan(String value) throws NumberFormatException {

		int dan = Integer.parseInt(value);
		System.out.println(dan + "��");
		System.out.println("--------------------");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "x" + i + "=" + dan * i);

		}

	}

	public static void main(String[] args) {
		Exception_throws_throw exception_throws_throw = new Exception_throws_throw();
		Scanner scanner = new Scanner(System.in);

		System.out.println("����� ���� �Է����ּ���");

		try {

			exception_throws_throw.printDan(scanner.next());
		} catch (NumberFormatException ne) {
			System.out.println("���ڸ� �Է� �ϼ���");
		}

	}

}
