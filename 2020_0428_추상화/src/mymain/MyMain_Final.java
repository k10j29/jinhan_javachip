package mymain;

//2. 위해 클라스 선언
class A {
	void sub() {
	}

	// 재정의하지말아라 라인 13번이 재정의한것 에러발생
	final void sub1() {
	}

	class B extends A {
		void sub() {
		}
		// void sub1() {}

	}

}


// final 클라스가 있기 때문에 오류남
// class C extends B {}


//애초에 String class 가 final 클라스 이기때문에 오류발생 
// class MyString extends String{}

public class MyMain_Final {

//전역상수 쓸때 Static 붙이기
	// 상수선언--1
	final static double PI = 3.14;

	// 1. 변수 >> 상수선언 : 변수로서의 final
	// 자료형 변(상)수형 = 값

	// 2. 메소드 안쪽에서의 final은 더이상 재정의 하지 말아라
	// 변환형 메도스명 ()

	// 3. 클라스에서의 final 은 더이상 상속하지말것
	// 클라스 안에 final 이 붙으면 finla 클라스임

	public static void main(String[] args) {

		// PI = 3.141592;

	}

}
