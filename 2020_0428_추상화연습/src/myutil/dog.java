package myutil;

//extends 학생을 상속받음 초등학생은 오버라이드 (재정의) 필요
public class dog extends Animal{

	
	//재정의 됨
	
	@Override
	public void walwal() {
		// TODO Auto-generated method stub
		
		System.out.println("==dog : 멍멍멍 ==");
		
	}

	@Override
	public void eatfood() {
		// TODO Auto-generated method stub
		
		System.out.println("==dog : 사료 ==");
	}


}
