package mymain.input;

import java.io.FileInputStream;
import java.io.InputStream;

public class MyMain_2_1_File_Input {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// ȭ�Ͽ���
		InputStream is = new FileInputStream("src/mymain/input/MyMain_2_1_File_Input.java");

		// ȭ�Ϸκ��� �б�
		while (true) {
			// 1byte�� �о����
			int ch = is.read();//
			if (ch == -1)
				break;
			System.out.printf("%c", ch);// �Է¹���->���
		}

	}

}
