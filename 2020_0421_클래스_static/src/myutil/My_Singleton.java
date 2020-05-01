//사용 되어지는 객체 측

//Singleton

package myutil; 

public class My_Singleton {

	
	//Design Pattern : 개발자들이 개발했던 최적의 방법들을 정리해놓은
	//					개발 방법론
	
	//class에서 객체가 없음을 나타냄
	//객체 1개만 나타내서 서비스하자  
	static My_Singleton single = null;
	
	public static My_Singleton getinstance() {
		
		if (single == null) single = new My_Singleton();
		
		return single;
	}
	
	public void sayHello() {
		System.out.println("==안녕==");
	}
	
	private My_Singleton() {
		System.out.println("--My_Singleton()--");
		
	}
	

	

}
