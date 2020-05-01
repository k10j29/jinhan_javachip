package mymain;

import java.util.ArrayList;

public class MyMain_Wrapper {

	public static void main(String[] args) {

		// 기본자료형 ==> 객체화
		// int 객체화 ==> integer
		// 변수 객체
		// int n integer job = new integer(100);

//Auto Boxing (포장) : JDK 5.0 이상부터 지원

		Integer iOb = 10; // new integer (10)

		// 버전에 따라 오류남 5.0 대 이후부터는 자동 Auto Boxing
		// 아래 버전오류
		// Integer iOb = new Integer(10);

		// Collection 객체 ==> 객체만 저장하도록 설계되어있음

		ArrayList list = new ArrayList();
		int n = 10;
		list.add(n); // list.add(new integer(n));
		list.add(10.5); // list.add(new Double(10.5));
		list.add(true); // list.add(new Boolean(true));
		list.add("hello"); // 객체이기때문에 그대로 들어감

		Character cob = 'A'; // 가능
		// Character cOb = new Character('A'); //원래대로

		System.out.println(Character.isAlphabetic('A'));

		// Auto-Boxing (자동포장)
		Integer nob = 10;

		// 객체형 자료형이 ==> 기본형 자료형으로
		// Auto-Unboxing
		int n1 = nob; // 자료형이 일치해야함 int != nob 그러나 Integer 로 인해 nob intValue
		double d = nob; // nob.doubleValue
		float f = nob; // nob.floatValue

		// 문자열 변환
		n1 = Integer.parseInt("123");
		//2진수 출력
		System.out.println(Integer.toBinaryString(100));  //2진
		System.out.println("0x" + Integer.toHexString(100));    //16진수
		System.out.println("0" + Integer.toOctalString(100)); //8진수
		
		Integer nob1 = new Integer ("100");
	}

}
