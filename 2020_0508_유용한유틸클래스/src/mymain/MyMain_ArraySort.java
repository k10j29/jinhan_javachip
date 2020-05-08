package mymain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import vo.PersonComp;
import vo.PersonVo;

public class MyMain_ArraySort {

	public static void main(String[] args) {

		// Sample data
		// 각항목 선택정렬 (name, age, addr)

		List<PersonVo> p_list = new ArrayList<PersonVo>();
		p_list.add(new PersonVo("나진한", 30, "서울 관악 신림3", "010-5555-1234"));
		p_list.add(new PersonVo("가진한", 10, "서울 관악 신림1", "010-4555-2234"));
		p_list.add(new PersonVo("라진한", 50, "서울 관악 신림4", "010-3555-4234"));
		p_list.add(new PersonVo("다진한", 20, "서울 관악 신림5", "010-1555-5234"));
		p_list.add(new PersonVo("마진한", 40, "서울 관악 신림2", "010-2555-3234"));

		// ArrayList 를 Array 로 (Array 는 한번 정해지면 늘어나지않음) =! (ArrayList)
		// 5칸이 있기는하지만 값이 정해져있지않음 (배열이라 5칸 고정)
		PersonVo[] p_array = new PersonVo[p_list.size()];

		// List<PersonVo> p_list = new ArrayList<PersonVo>();
		// PersonVo[] p_array = new PersonVo[p_list.size()];

		p_list.toArray(p_array); // 다섯개의 객체를 공유 리스트와 배열이

		// 첫번째 객체의값 가져온것
		// PersonVo p1 = p_list.get(0);
		// PersonVo p2 = p_array[0];

		System.out.println("--- original ---");
		// 개선 loop

		for (PersonVo p : p_array) {
			System.out.println(p);

		}

		System.out.println("=========================구분============================");

//System.out.println("ABC".compareTo("ABC")); //앞에 문자에서 뒤에 문자 비교 (뺀것)

		// 정렬기준및 방식을 설정된 객체
		PersonComp comp = new PersonComp();

		Arrays.sort(p_array, comp);
		System.out.println("----이름순 오름차순");

		for (PersonVo p : p_array) {
			System.out.println(p);
		}
		System.out.println("=========================구분============================");

		// 이름순 내림차순
		comp.setSort_field(PersonComp.SOTR_FIELD_NAME);
		comp.setSort_method(PersonComp.SORT_METHOD_DESC);
		Arrays.sort(p_array, comp);
		System.out.println("----이름순 내림차순");

		for (PersonVo p : p_array) {
			System.out.println(p);
		}
		System.out.println("=========================구분============================");

		comp.setSort_field(PersonComp.SOTR_FIELD_AGE);
		comp.setSort_method(PersonComp.SORT_METHOD_ASC);
		Arrays.sort(p_array, comp);
		System.out.println("----나이 오름차순");

		for (PersonVo p : p_array) {
			System.out.println(p);
		}
		System.out.println("=========================구분============================");

		comp.setSort_field(PersonComp.SOTR_FIELD_AGE);
		comp.setSort_method(PersonComp.SORT_METHOD_DESC);
		Arrays.sort(p_array, comp);
		System.out.println("----나이 내림차순");

		for (PersonVo p : p_array) {
			System.out.println(p);
		}
		System.out.println("=========================구분============================");

		comp.setSort_field(PersonComp.SOTR_FIELD_ADDR);
		comp.setSort_method(PersonComp.SORT_METHOD_ASC);
		Arrays.sort(p_array, comp);
		System.out.println("----주소 오름차순");

		for (PersonVo p : p_array) {
			System.out.println(p);
		}
		System.out.println("=========================구분============================");

		comp.setSort_field(PersonComp.SOTR_FIELD_ADDR);
		comp.setSort_method(PersonComp.SORT_METHOD_DESC);
		Arrays.sort(p_array, comp);
		System.out.println("----주소 내림차순");

		for (PersonVo p : p_array) {
			System.out.println(p);
		}
		System.out.println("=========================구분============================");

		comp.setSort_field(PersonComp.SOTR_FIELD_TELL);
		comp.setSort_method(PersonComp.SORT_METHOD_ASC);
		Arrays.sort(p_array, comp);
		System.out.println("----번호 오름차순");
		for (PersonVo p : p_array) {
			System.out.println(p);

		}
		System.out.println("=========================구분============================");

		comp.setSort_field(PersonComp.SOTR_FIELD_TELL);
		comp.setSort_method(PersonComp.SORT_METHOD_DESC);
		Arrays.sort(p_array, comp);
		System.out.println("----번호 내림차순");
		for (PersonVo p : p_array) {
			System.out.println(p);

		}
		// ArrayList 출력

		System.out.println("=========================구분============================");

		System.out.println("------------ArrayList [original]----------");

		for (PersonVo p : p_list) {
			System.out.println(p);
		}

		PersonComp comp1 = new PersonComp();
		comp1.setSort_field(PersonComp.SOTR_FIELD_AGE);
		Collections.sort(p_list, comp1);

		System.out.println("-ArrayList [나이오름차순]-");

		for (PersonVo p : p_list) {
			System.out.println(p);
		}
	}

}
