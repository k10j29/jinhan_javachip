package mymain.input;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MyMain_2_2_File_Input {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// ȭ�Ͽ���
		InputStream is = new FileInputStream("src/mymain/input/MyMain_2_1_File_Input.java");

		InputStreamReader isr = new InputStreamReader(is);

		// ���Ϸκ��� �б�
		while (true) {
			// 1byte�� �о����
			int ch = isr.read();//
			if (ch == -1)
				break;
			System.out.printf("%c", ch);// �Է¹���->���
		}

	}

}
