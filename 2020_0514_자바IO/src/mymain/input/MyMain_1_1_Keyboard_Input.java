package mymain.input;

import java.io.IOException;
import java.io.InputStream;

import javax.print.DocFlavor.INPUT_STREAM;

public class MyMain_1_1_Keyboard_Input {

	public static void main(String[] args) throws IOException {

		System.out.println("EXIT (Ctrl+Z)");

		InputStream is = System.in; // Ű���� ��ġ�� ǥ����ġ�� (System.in)

		while (true) {
			// 1byte�� �о��
			int ch = is.read();
			if (ch == -1)
				break;
			System.out.printf("%c", ch); // �Է¹��� ���� �ϳ��� ����ϴ°�

		}

	}

}
