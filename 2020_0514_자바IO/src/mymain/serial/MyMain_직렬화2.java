package mymain.serial;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Random;

import vo.PersonVo;

public class MyMain_����ȭ2 {

	public static void main(String[] args) throws Exception {

		// ��ü �����

		/*
		 * List<PersonVo> p_list = new ArrayList<PersonVo>();
		 * 
		 * p_list.add(new PersonVo("�ϱ浿", 20, "���� ���� �Ÿ�1")); p_list.add(new
		 * PersonVo("�̱浿", 22, "���� ���� �Ÿ�2")); p_list.add(new PersonVo("��浿", 21,
		 * "���� ���� �Ÿ�4")); p_list.add(new PersonVo("��浿", 24, "���� ���� �Ÿ�3"));
		 * p_list.add(new PersonVo("���浿", 25, "���� ���� �Ÿ�5"));
		 * 
		 * OutputStream os = new FileOutputStream("person_list.dat");
		 * 
		 * ObjectOutputStream oos2 = new ObjectOutputStream(os);
		 * oos2.writeObject(p_list);
		 * 
		 * oos2.close(); os.close(); System.out.println("--����Ϸ�--");
		 */
		
		
		
		
		InputStream is = new FileInputStream("person_list.dat");
		ObjectInputStream ois = new ObjectInputStream(is);
		ArrayList<PersonVo> p1 = (ArrayList<PersonVo>) ois.readObject();

		System.out.println(p1);

		ois.close();
		is.close();
	}

}
