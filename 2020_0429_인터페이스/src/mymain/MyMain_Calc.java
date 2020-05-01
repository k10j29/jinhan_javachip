package mymain;

import myutil.BaseCalc;
import myutil.BaseCalcImpl;

public class MyMain_Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //BaseCalc.PI = 3.141592;
		System.out.println(BaseCalc.PI);
		// 사용자         =   생산자
		//인터페이스 calc = new 클래스(); 
		BaseCalc calc     = new BaseCalcImpl();
		
		int x = 10,y=5,res;
		res = calc.plus(x, y);
		
		System.out.printf("%d + %d = %d\n",x,y,res);
		
        
	}

}
