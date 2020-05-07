package mymain;

// 배열 
// set 
// ArrayList 
// 개선 루프 (목록에서 하나씩 빼오기 가능)

import java.util.ArrayList;
import java.util.List;

public class MyMain_ArrayList { // 동적 배열 ArrayList
								// 저장순서가 있다. (첨자에서 정해짐 14라인)

	public static void main(String[] args) {

		List<String> sido_list = new ArrayList<String>(); // 인터페이스 List
		// 생성한 클래스 new ArrayList<String>(); 에 List 인터페이스 기능을 사용할겁니다.

		sido_list.add("서울"); // 0 << 첨자 // 0 ~ 4 까지
		sido_list.add("경기"); // 1 순서가 있음 List 인터페이스
		sido_list.add("인천");
		sido_list.add("대전");
		sido_list.add("대구"); // 4

		System.out.println(sido_list);

		System.out.println("--------------------첨자를 이용한 추출 방법--------------------");

		for (int i = 0; i < sido_list.size(); i++) {
			String sido = sido_list.get(i);

			System.out.printf("%d : %s\n", i, sido); // %d 번째 / 지역
		}
		System.out.println();

		System.out.println("--------------------개선 loop--------------------");

		
		for (String sido : sido_list) { //돌때마다 하나씩 0 ~ 4 //첨자를 이용한 추출처럼 첨자를 사용하기는 힘들다
			System.out.println(sido);  

		}
		
		List<String> fruiut_list = new ArrayList<String>();
		fruiut_list.add("사과");
		fruiut_list.add("딸기");
		fruiut_list.add("포도");
		fruiut_list.add("참외");
		
	}

}
