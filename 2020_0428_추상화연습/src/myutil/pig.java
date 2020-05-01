package myutil;

//extends 학생을 상속받음 초등학생은 오버라이드 (재정의) 필요
public class pig extends Animal{

	
	//재정의 됨
	
	@Override
	public void walwal() {
		// TODO Auto-generated method stub
		
		System.out.println("==pig : 꿀꿀꿀 ==");
		
	}

	@Override
	public void eatfood() {
		// TODO Auto-generated method stub
		System.out.println("==pig : 잡식 ==");
	}


}
