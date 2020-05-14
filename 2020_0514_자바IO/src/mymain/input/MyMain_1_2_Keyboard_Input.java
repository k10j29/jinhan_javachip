package mymain.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.print.DocFlavor.INPUT_STREAM;

public class MyMain_1_2_Keyboard_Input {

	public static void main(String[] args) throws IOException {

		System.out.println("EXIT (Ctrl+Z)");

		InputStream is = System.in; // Ű���� ��ġ�� ǥ����ġ�� (System.in)

		// Stream => Reader
		InputStreamReader isr = new InputStreamReader(is);

		// Ű����κ��� ����
		while (true) {
			// ? byte�� �о��
			int ch = isr.read();
			if (ch == -1)
				break;
			System.out.printf("%c", ch); // �Է¹��� ���� �ϳ��� ����ϴ°�

		}

	}

}
