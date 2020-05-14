package mymain.serial;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

import vo.PersonVo;

public class MyMain_객체직렬화 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 저장(객체직렬화)
		/*
		 * PersonVo p = new PersonVo("김진한", 29, "경기 군포시 부곡동");
		 * 
		 * OutputStream fos = new FileOutputStream("person.dat"); // 직렬화기능을 갖는 객체를
		 * 생성->저장해라... ObjectOutputStream oos = new ObjectOutputStream(fos);
		 * oos.writeObject(p);
		 * 
		 * // 닫기(열린역순으로 닫는다) oos.close(); fos.close(); System.out.println("--저장완료--")
		 * 
		 */

		// 읽기 저장된거 읽어오기 (역직렬화)
		InputStream is = new FileInputStream("person.dat");

		// 파일 내용을 읽어와서 해당객체로 복원
		ObjectInputStream ois = new ObjectInputStream(is);

		// 통재로 가져와서 복원시켜라
		PersonVo p1 = (PersonVo) ois.readObject();

		System.out.println(p1);

		ois.close();
		is.close();

	}

}
