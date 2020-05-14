package mymain.input;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class MyMain_3_1_Network_Input {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String host = "https://www.naver.com";
		// Uniform Resource Locator(자원의 위치를 표현한 주소체계)
		URL url = new URL(host);
		// 해당주소에 입력스트림을 얻어온다
		InputStream is = url.openStream();

		// charset (문자셋)

		// 문자 '가'
		// utf - 8 네이버 제공 100
		// ms 949 우리는 10

		InputStreamReader isr = new InputStreamReader(is, "utf-8");

		// 네트워크로부터 읽기
		while (true) {
			// 1byte씩 읽어오기
			int ch = isr.read();//
			if (ch == -1)
				break;
			System.out.printf("%c", ch);// 입력문자->출력

			Thread.sleep(1);
		}

	}

}
