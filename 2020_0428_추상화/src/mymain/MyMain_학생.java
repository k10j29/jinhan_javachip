package mymain;

import myutil.고등학생;
import myutil.중학생;
import myutil.초등학생;
import myutil.학생;

public class MyMain_학생 {

	static void 엄마왈(학생[] s_array) {
		// 다형성 Polymorphism) 
		// 각 개체의 동일한 명령을 내리면 각 객체는 
		// 자신에 맞는 행동을 각각 수행하게됨
		
		
		//1 첨자 방식도 가능
		
		for (int i = 0; i < s_array.length; i++) {

			학생 student = s_array[i];
			student.공부한다();
		}
		
		//2. 16라인 간소화 개선루프 
		
		for (학생 student:s_array)
			student.공부한다();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	학생 [] s_array = { new 초등학생(), 
						new 중학생(),
						new 고등학생()};
		
	
	
	엄마왈 (s_array);

}
}
