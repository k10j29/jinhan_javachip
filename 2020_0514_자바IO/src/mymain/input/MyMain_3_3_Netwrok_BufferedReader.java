package mymain.input;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.print.DocFlavor.STRING;

public class MyMain_3_3_Netwrok_BufferedReader {

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

		BufferedReader br = new BufferedReader(isr);

		// ��Ʈ��ũ�κ��� �б�
		while (true) {
			// ���� ������ �о�ɴϴ� (����ó���ӵ�)
			String readStr = br.readLine();
			if (readStr == null)
				break;
			System.out.println(readStr);
			Thread.sleep(1000);

		}

	}

}
