
 //package = class의 저장위치(폴더) 지정 
package mymain;



import java.util.Scanner;

public class MyMain_Method_Ex1 {

	
	
	//전역 변수 여기저기 메소드에서 다쓸수있음
	static int global_var = 1000;

	
	
	//더하기 기능
	//static : 미리생성되있는것 정적변수
		public static int plus(int a, int b) {
			
			
			
			//method 의 가인자는 언제 생성됩니까? 메소드 호출시
			//method 의 가인자는 언제 소멸됩니까? 메소드 종료시

			//local 지역변수
			
				//int a = x int b = y
			
			//전달된 a와 b의 값을 더해서 c에 저장함
			int c = a + b;
			
			global_var = 1000;
			
			
			
			//제어문 return: 자신을 호출한 곳으로 제어권을 반환하겠다. 
			// return 값 : 값을 가지고 반환한다. 자료형 일치해야함 1.0 이면 // public static int plus(int a, int b)  int 부분 double 줘야함
			return c;
			
			
			
		}
				
				
		
		
		public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
			
			int x = 10;
			int y = 5;
			int res;
			
			
			
			
			//plus 하기위해 메소드 호출함
			//res = MyMain_Method_Ex1 .plus(x, y);
			res = plus(x, y);
			
			System.out.printf("%d+%d=%d\n", x,y,res);			
			System.out.println(global_var);
	}

}
