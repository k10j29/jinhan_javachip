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
					break; // EOF (End of File) 을 만나면
							// -1을 반환하고 break 에서 끝남

				System.out.printf("%c", ch); // 출력
				
				Thread.sleep(10);
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {
				// 정상, 비정상 처리후 무조건 모두 처리

				if (fr != null)
					fr.close();
			} catch (IOException e) {
				// Alt + Shift + Z (블록 지정)
				e.printStackTrace();
			}
		}

	}

}
