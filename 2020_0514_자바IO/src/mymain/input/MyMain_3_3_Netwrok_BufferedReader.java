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
		// Uniform Resource Locator(자원의 위치를 표현한 주소체계)
		URL url = new URL(host);
		// 해당주소에 입력스트림을 얻어온다
		InputStream is = url.openStream();

		// charset (문자셋)

		// 문자 '가'
		// utf - 8 네이버 제공 100
		// ms 949 우리는 10

		InputStreamReader isr = new InputStreamReader(is, "utf-8");

		BufferedReader br = new BufferedReader(isr);

		// 네트워크로부터 읽기
		while (true) {
			// 한줄 단위로 읽어옵니다 (빠른처리속도)
			String readStr = br.readLine();
			if (readStr == null)
				break;
			System.out.println(readStr);
			Thread.sleep(1000);

		}

	}

}
