package mymain;

import java.io.FileReader;
import java.io.IOException;
import java.text.FieldPosition;

public class MyMain_Finally {

	public static void main(String[] args) {

		FileReader fr = null;

		try {
			fr = new FileReader("src/mymain/MyMain_Finally.java");

			while (true) {

				int ch = fr.read();
				if (ch == -1)
					break; // EOF (End of File) �� ������
							// -1�� ��ȯ�ϰ� break ���� ����

				System.out.printf("%c", ch); // ���
				
				Thread.sleep(10);
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {
				// ����, ������ ó���� ������ ��� ó��

				if (fr != null)
					fr.close();
			} catch (IOException e) {
				// Alt + Shift + Z (��� ����)
				e.printStackTrace();
			}
		}

	}

}
