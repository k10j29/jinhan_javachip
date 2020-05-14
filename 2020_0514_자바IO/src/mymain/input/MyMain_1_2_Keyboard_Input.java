package mymain.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.print.DocFlavor.INPUT_STREAM;

public class MyMain_1_2_Keyboard_Input {

	public static void main(String[] args) throws IOException {

		System.out.println("EXIT (Ctrl+Z)");

		InputStream is = System.in; // 키보드 장치의 표준장치면 (System.in)

		// Stream => Reader
		InputStreamReader isr = new InputStreamReader(is);

		// 키보드로부터 읽음
		while (true) {
			// ? byte씩 읽어옴
			int ch = isr.read();
			if (ch == -1)
				break;
			System.out.printf("%c", ch); // 입력받은 문자 하나를 출력하는것

		}

	}

}
