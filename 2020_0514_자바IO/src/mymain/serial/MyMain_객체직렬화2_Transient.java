package mymain.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import vo.PersonVo2;

public class MyMain_��ü����ȭ2_Transient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// ����(��ü����ȭ)

		PersonVo2 p = new PersonVo2("������", 29, "��� ������ �ΰ");

		OutputStream fos = new FileOutputStream("person1.dat"); // ����ȭ����� ���� ��ü��
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);

		// �ݱ�(������������ �ݴ´�) oos.close(); fos.close(); System.out.println("--����Ϸ�--")

		// �б� ����Ȱ� �о���� (������ȭ)
		InputStream is = new FileInputStream("person1.dat");

		// ���� ������ �о�ͼ� �ش簴ü�� ����
		ObjectInputStream ois = new ObjectInputStream(is);

		// ����� �����ͼ� �������Ѷ�
		PersonVo2 p1 = (PersonVo2) ois.readObject();

		System.out.println(p1);

		ois.close();
		is.close();

	}

}
