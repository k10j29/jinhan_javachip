package mymain;

import java.util.ArrayList;
import java.util.List;

import vo.PersonVo;

public class MyMain_ArrayList_Person {

	public static void main(String[] args) {

		List<PersonVo> p_list = new ArrayList<PersonVo>();

		PersonVo p = new PersonVo("일길동", 21, "서울 관악구 조원1동"); // Override 해놓은거

		p_list.add(p); // 위에 만들어진 객체를 넣은것 ArrayList 에

		p_list.add(new PersonVo("이길동", 22, "서울 관악구 조원2동"));
		p_list.add(new PersonVo("삼길동", 23, "서울 관악구 조원3동"));
		p_list.add(new PersonVo("사길동", 24, "서울 관악구 조원4동"));
		p_list.add(new PersonVo("오길동", 25, "서울 관악구 조원5동"));

		System.out.println("---개선 loop---");

		for (PersonVo p1 : p_list) {
			System.out.println(p1);
			// System.out.println(p1.toString());
		}

		// for (String sido : sido_list) { //돌때마다 하나씩 0 ~ 4 //첨자를 이용한 추출처럼 첨자를 사용하기는 힘들다
		// System.out.println(sido);

		System.out.println("--------------------첨자를 이용한 추출 방법--------------------");

		for (int i = 0; i < p_list.size(); i++) {
			System.out.println(p_list.get(i)); // index에 있는애 빼온것

		}

	}
}