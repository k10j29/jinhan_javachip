package mymain.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import vo.PersonVo3;

public class MyMain_��ü����ȭ3_External {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// ����(��ü����ȭ)

		PersonVo3 p = new PersonVo3("������", 29, "��� ������ �ΰ");

		OutputStream fos = new FileOutputStream("person2.dat"); // ����ȭ����� ���� ��ü��
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);

		// �ݱ�(������������ �ݴ´�) oos.close(); fos.close(); System.out.println("--����Ϸ�--")

		// �б� ����Ȱ� �о���� (������ȭ)
		InputStream is = new FileInputStream("person2.dat");

		// ���� ������ �о�ͼ� �ش簴ü�� ����
		ObjectInputStream ois = new ObjectInputStream(is);

		// ����� �����ͼ� �������Ѷ�
		PersonVo3 p1 = (PersonVo3) ois.readObject();

		System.out.println(p1);

		ois.close();
		is.close();

	}

}
