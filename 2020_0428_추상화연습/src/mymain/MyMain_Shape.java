package mymain;

import myutil.doh;
import myutil.nemo;
import myutil.semo;
import myutil.won;

public class MyMain_Shape {

	static void a_1(doh[] s_array) {

		for (doh grim : s_array)
			grim.draw1();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	doh [] s_array = {new nemo(), 
						new semo(),
						new won()};
	
	
	
	
	a_1(s_array);

	
	
}
}
