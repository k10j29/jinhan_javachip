package mymain.input;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MyMain_2_2_File_Input {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 화일열기
		InputStream is = new FileInputStream("src/mymain/input/MyMain_2_1_File_Input.java");

		InputStreamReader isr = new InputStreamReader(is);

		// 파일로부터 읽기
		while (true) {
			// 1byte씩 읽어오기
			int ch = isr.read();//
			if (ch == -1)
				break;
			System.out.printf("%c", ch);// 입력문자->출력
		}

	}

}
