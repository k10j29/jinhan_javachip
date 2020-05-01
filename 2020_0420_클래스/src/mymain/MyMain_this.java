package mymain;

import myutil.MyDate2;

public class MyMain_this {

	///// this /////////

	///// this : 자신을 참조하는 내부 변수이다.
	///// method 내에서만 사용된다
	///// 생략가능함, 기본적으로 this 붙어있는걸로 해석
	///// 반드시 써야하는 경우 ))) 외부변수 (method)명과 이름이 동일하면 구분하는 수단

	///// MyDate 24/25 line ex

	public static void main(String[] args) {

//		//첫번째 객체가 생성될때 생성

		// 1. new를 만남 클래스명을 보고 Class Loader 실행 (설계서 정보)
		// 1-2. 해당 Class 내의 method 를 memory 적재
		// 2. 객체를 생성 (메모리확보 > 초기화 수행)

		MyDate2 md2 = new MyDate2();
		MyDate2 md2_1 = new MyDate2();

		System.out.println("외부 :" + md2);

		// myutil.MyDate2 @ 15db9742
		// Class 정보 //Hash 코드

		// setYear 을 호출할때 내부변수인 This 에
		// md2의 정보를 넣고 호출

		// MyDate2 setYear this
		md2.setYear(2020);

		md2_1.setYear(2000);

		System.out.println("외부 :" + md2);

		System.out.println();
		
		MyDate2 md22 = new MyDate2(2020, 4, 20);
		md22.display();

		System.out.println();

		md2.display();

	}

}
