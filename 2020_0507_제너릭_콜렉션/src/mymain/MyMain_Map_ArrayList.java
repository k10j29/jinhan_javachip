package mymain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import vo.PersonVo;

public class MyMain_Map_ArrayList {
	private static final List PersonVo = null;

// Map과 ArrayList 비교

	public static void main(String[] args) {

		Map<String, PersonVo> personMap = new HashMap<String, PersonVo>();

		List<PersonVo> personList = new ArrayList<PersonVo>();

		for (int i = 1; i <= 100; i++) {// 100사람의 정보 생성
			String name = String.format("길동%04d", i); // 길동 0001, 0002, ~ 0100
			int age = 20 + (i % 11); // 21 22 23 24 ~ 30
			String addr = String.format("서울 관악 신림 %d동", (i % 4) + 1);

			PersonVo p = new PersonVo(name, age, addr);

			// Map 에 저장

			personMap.put(name, p);

			// List 에 저장

			personList.add(p);
		}
//Map 에서 검색
		String search_name = "길동0100";

		PersonVo res_p = personMap.get(search_name);
		System.out.println(res_p);
//List 로 검색
		// 반복문 (개선루프 ,첨자방식)
		int count = 0;
		for (PersonVo p : personList) {

			if (search_name.equals(p.getName()))
				System.out.println(p);

			count++;
		}

		System.out.println(count + "회");

	}
}
