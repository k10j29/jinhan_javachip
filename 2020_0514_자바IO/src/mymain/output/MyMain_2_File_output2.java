package mymain.output;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class MyMain_2_File_output2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		OutputStream os = new FileOutputStream("b.txt");

		// System.out <= PrintStream
		PrintStream out = new PrintStream(os);

		int age = 20;
		String tti = "��";

		out.println("===ȭ�����===");
		out.println("�ȳ��ϼ���");

		out.printf("����:%d(��)\n", age);
		out.printf("��:%s(��)\n", tti);

	}

}
