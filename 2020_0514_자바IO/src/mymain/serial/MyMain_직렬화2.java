package mymain.serial;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Random;

import vo.PersonVo;

public class MyMain_직렬화2 {

	public static void main(String[] args) throws Exception {

		// 객체 만들기

		/*
		 * List<PersonVo> p_list = new ArrayList<PersonVo>();
		 * 
		 * p_list.add(new PersonVo("일길동", 20, "서울 관악 신림1")); p_list.add(new
		 * PersonVo("이길동", 22, "서울 관악 신림2")); p_list.add(new PersonVo("사길동", 21,
		 * "서울 관악 신림4")); p_list.add(new PersonVo("삼길동", 24, "서울 관악 신림3"));
		 * p_list.add(new PersonVo("오길동", 25, "서울 관악 신림5"));
		 * 
		 * OutputStream os = new FileOutputStream("person_list.dat");
		 * 
		 * ObjectOutputStream oos2 = new ObjectOutputStream(os);
		 * oos2.writeObject(p_list);
		 * 
		 * oos2.close(); os.close(); System.out.println("--저장완료--");
		 */
		
		
		
		
		InputStream is = new FileInputStream("person_list.dat");
		ObjectInputStream ois = new ObjectInputStream(is);
		ArrayList<PersonVo> p1 = (ArrayList<PersonVo>) ois.readObject();

		System.out.println(p1);

		ois.close();
		is.close();
	}

}
