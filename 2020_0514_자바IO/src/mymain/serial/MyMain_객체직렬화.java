package mymain.serial;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

import vo.PersonVo;

public class MyMain_��ü����ȭ {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// ����(��ü����ȭ)
		/*
		 * PersonVo p = new PersonVo("������", 29, "��� ������ �ΰ");
		 * 
		 * OutputStream fos = new FileOutputStream("person.dat"); // ����ȭ����� ���� ��ü��
		 * ����->�����ض�... ObjectOutputStream oos = new ObjectOutputStream(fos);
		 * oos.writeObject(p);
		 * 
		 * // �ݱ�(������������ �ݴ´�) oos.close(); fos.close(); System.out.println("--����Ϸ�--")
		 * 
		 */

		// �б� ����Ȱ� �о���� (������ȭ)
		InputStream is = new FileInputStream("person.dat");

		// ���� ������ �о�ͼ� �ش簴ü�� ����
		ObjectInputStream ois = new ObjectInputStream(is);

		// ����� �����ͼ� �������Ѷ�
		PersonVo p1 = (PersonVo) ois.readObject();

		System.out.println(p1);

		ois.close();
		is.close();

	}

}
