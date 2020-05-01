package myutil;

public class MyMath {
	
	//상수
	public static final double PI = 3.141592;
	
	// 외부로 부터 값이 들어오면 계산만 해주는 일종의 서비스 객체
	// 수학적 계산기능만 갖는 객체 Math, 저장할 변수가 필요없음
	// 상수는 필요함 (수학적 상수들 , 지수)
	//int a : //new MyMath() 할필요없음
	

	
	//외부에서 객체생성 차단
	private MyMath() {
		// TODO Auto-generated constructor stub
	
	}
		
	//1. abs 가 instance method 라면....
	
	//           MyMath mm = new MyMath();
	//           int res = mm.abs(-100);
	

	// 절대값구하기
	
	//2. 자주 쓸것 같으니까 Static 으로 넣어버림
	//int res = MyMath.abs(-100); 클래스 이름 붙이고 호출만 하면됨
		
	public static int abs (int n) {
	return n<0 ? -n : n;
	}
	
	//0보다 작으면 음수 줘서 변환하고
	// 아니면 그냥 나오고
	
	
	public static double abs (double n) {
	return n<0 ? -n : n; }
		
	public static int max(int a , int b) {
	return a>b ? a : b;	
	}
	
	public static int min(int a, int b) {
	return a<b ? a : b;	
	}
		//overload
	
	}


