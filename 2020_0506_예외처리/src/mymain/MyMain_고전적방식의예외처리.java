package mymain;

public class MyMain_고전적방식의예외처리 {
	
	
	/////////////////////////////////////////////////////////
//문제점 :	
//	1. 코드가 복잡해진다.
//  2. 본코드의 개념이 불명확해진다.	
	//////////////////////////////////////////////////////////
	

	public static void main(String[] args) {

		int a = 10, b = 1, res;

		String str = "abc";

		if (b != 0) {
			res = a / b;

//문자열 길이 구하기		

			if (str != null) {
				int len = str.length();

//문자열 => 숫자 (정수) 로 바꿈 
				// 문자열을 숫자로 바꾸는건 에러나옴
				int su = Integer.parseInt(str);

			} else {
				System.out.println("str = null 입니다.");

			}
		} else {

			System.out.println("0으로 나눌수 없습니다.");

			System.out.println("int len = str.length(); 문자열 길이 구하기");

		}
	}

}
