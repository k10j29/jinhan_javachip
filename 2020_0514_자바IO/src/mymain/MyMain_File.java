package mymain;

import java.io.File;

public class MyMain_File {

	public static void main(String[] args) {

		String path = "C:\\My_Study\\Java_Study";
		File f = new File(path, "Myfolder"); // Myfolder ������ ���翩�� �˻��ؼ� ������ �����ϰ���.

		if (!f.exists()) { // �������������� ������ (����1 ����)
			f.mkdir(); // ���丮����

		} else { // �����ϸ�. (����2 ����)
			f.delete(); // ��������
		}

		System.out.println("-- ȭ�� ��� --");
		File f1 = new File(path);

		File[] f_array = f1.listFiles(); // f1's Directory ���� File ����� ����

		// System.out.println(f_array.length);

		for (File ff : f_array) { // ���ϸ���� ó�� ff �迭
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
