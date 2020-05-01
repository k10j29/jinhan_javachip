package mymain;

import myutil.Animal;
import myutil.cat;
import myutil.dog;
import myutil.pig;

public class MyMain_Animal {

	static void wal(Animal[] s_array) {

		for (Animal pet : s_array)
			pet.walwal();
	}

static void food(Animal[] f_array) {
		
		for (Animal pet:f_array)
			pet.eatfood();
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Animal [] s_array = {new dog(), 
						new cat(),
						new pig()};
	
	Animal [] f_array = {new dog(), 
			new cat(),
			new pig()};

	
	wal (s_array);
	food (f_array);
	
}
	
	//추상 클라스는 객체 생성못함
}
