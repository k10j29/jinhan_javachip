class 명명법 
{
	public static void main(String[] args) 
	{
		System.out.println("---[명명법 : 반드시 지켜야할 내용]---");
		System.out.println("1.정의: 클래스명 변수명 메소드명 상수명등의 이름을 부여");
		System.out.println("2.숫자로 시작되면 안된다");
		//int 1kor; => int kor1;
		System.out.println("3.중간에 공백 띄우면 안된다");
		//int kor 1;
		System.out.println("4.특수문자 사용 못한다(단 _ $ 제외)");
		System.out.println("  특수문자: 키보드에서 영문자/숫자/한글을 제외한 모든문자");
		//int abc#; (X)
		int kor_1;
		int ___;// (△) <= 상징성이 결여
		int $$$;

		System.out.println("5.예약어는 사용못한다");
        //int  public; (X) 



		System.out.println("---[클래스명 명명법(권고사항)]---");
		System.out.println("1.대문자로 시작한다");
		//  class MyProfile :  My + Profile
		System.out.println("2.2개이상의 단어로 조합된 이름은 매단어 첫글자를 대문자");
		//  class My_Profile
		System.out.println("3.2개이상의 단어로 조합된 이름은 단어사이를 _ 연결");

		System.out.println("---[메소드(함수)명/변수명 명명법(권고사항)]---");
		System.out.println("1.소문자로 시작한다");
		//  public void morningHello() {  }
		//  public void eveningHello() {  }
		//  int myPay;
		System.out.println("2.2개이상의 단어로 조합된 이름은 매단어 첫글자를 대문자");
		//  public void morning_hello() {  }
		//  public void evening_hello() {  }
		//  int my_pay;
		System.out.println("3.2개이상의 단어로 조합된 이름은 단어사이를 _ 연결");


        System.out.println("---[상수(변하지않는 고정값) 명명법(권고)]---");  
		System.out.println("1.모든 단어가 대문자로 기록");
		System.out.println("  Math.PI : " + Math.PI);
		//Math.PI = 3.14;

		System.out.println("2.2개이상 단어로 조합된 이름은 _ 연결");
        System.out.println("  Byte.MAX_VALUE : " + Byte.MAX_VALUE);
        System.out.println("  Byte.MIN_VALUE : " + Byte.MIN_VALUE);

        
			 

	}
}
