package mymain.output;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class MyMain_2_File_output {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		OutputStream os = new FileOutputStream("a.txt");

		//
		os.write('A');

		os.write('1');

		os.write(50);// ASCII : '2' <- 50

		String msg = "�ȳ��ϼ���";
		// String -> byte[]
		os.write(msg.getBytes());

		boolean bOk = true; //
		// String.valueOf(�ڷ�����)=>String���� ��ȯ
		// true=>"true"
		os.write(String.valueOf(bOk).getBytes());

		double d = 3.14;
		os.write(String.valueOf(d).getBytes());

	}

}
