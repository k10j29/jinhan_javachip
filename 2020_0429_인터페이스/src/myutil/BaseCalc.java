package myutil;

public interface BaseCalc {

	//interface내에는 상수,추상메소드만 들어올수 있다
	// public,final 붙이지 않아도 붙여서 해석 
	                     double PI  = 3.14;
	public static final double PI2 = 3.141592;
	
    //추상메소드 선언
	//public abstract안붙여도 붙여서 해석
					 int plus(int a,int b);
	public abstract int minus(int a,int b);
	
}
