package mymain;

import java.io.File;

public class MyMain_File {

	public static void main(String[] args) {

		String path = "C:\\My_Study\\Java_Study";
		File f = new File(path, "Myfolder"); // Myfolder 폴더의 존재여부 검사해서 없으면 생성하겠음.

		if (!f.exists()) { // 존재하지않으면 만들어라 (실행1 생성)
			f.mkdir(); // 디렉토리생성

		} else { // 존재하면. (실행2 삭제)
			f.delete(); // 삭제하자
		}

		System.out.println("-- 화일 목록 --");
		File f1 = new File(path);

		File[] f_array = f1.listFiles(); // f1's Directory 내의 File 목록을 얻어옴

		// System.out.println(f_array.length);

		for (File ff : f_array) { // 파일목록의 처음 ff 배열
			String name = ff.getName();
			long len = ff.length();

			String file_kind = "";

			if (ff.isDirectory())
				file_kind = "D";
			else if (ff.isFile())
				file_kind = "F";
			if (ff.isHidden())
				file_kind = file_kind + "H";
			System.out.printf("[%s] %s(%d)\n", file_kind, name, len);
		}

	}

}
