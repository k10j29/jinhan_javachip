package mymain.input;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class MyMain_3_1_Network_Input {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String host = "https://www.naver.com";
		// Uniform Resource Locator(�ڿ��� ��ġ�� ǥ���� �ּ�ü��)
		URL url = new URL(host);
		// �ش��ּҿ� �Է½�Ʈ���� ���´�
		InputStream is = url.openStream();

		// charset (���ڼ�)

		// ���� '��'
		// utf - 8 ���̹� ���� 100
		// ms 949 �츮�� 10

		InputStreamReader isr = new InputStreamReader(is, "utf-8");

		// ��Ʈ��ũ�κ��� �б�
		while (true) {
			// 1byte�� �о����
			int ch = isr.read();//
			if (ch == -1)
				break;
			System.out.printf("%c", ch);// �Է¹���->���

			Thread.sleep(1);
		}

	}

}
