package myutil;

// 1111111111111111111111111111111111111111111111111//

//Java Object 는 묵시적으로 Object를 상속받는다. (주석처리부분)

public class BaseCalc /*extends Object*/ {

public int plus (int a, int b) {
	
	return a + b;
	}


public int minus (int a, int b) {
	
	return a - b;
	}

public int multiply (int a, int b) {
	
	return a * b;
	}

/////////////////////////// 위 와 아래 Overload

public double multiply (double a, double b) {
	
	return a * b;
	}

public int divide (int a, int b) {
	
	return b==0 ? 0 : a/b ;
	}

}
