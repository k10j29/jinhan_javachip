package mymain;

import myutil.MyMath;

public class MyMain_MyMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static methhod 표현방법 (객체생성)
		//1. 객체 생성전에는 클래명, 메소드명()
		//2 .객체 생성 후에는  : 객체명을 통해() 호출 <<가급적 사용금지
		
		int x = 10, y = 5 ,res;
		
		res=MyMath.max(x,y);
	
		System.out.printf("%d와 %d중 큰수는 %d\n", x , y ,res);
	
		
		//기존 API
		
		res = Math.min(x, y);
		
		System.out.printf("%d와 %d중 작은수는 %d\n" ,x,y,res);
		
	//Math m = new Math();
		
		//숫자를 >>> 문자열로 157p
		
		String s = new String();
		String str = String.valueOf(x);
	}

}
