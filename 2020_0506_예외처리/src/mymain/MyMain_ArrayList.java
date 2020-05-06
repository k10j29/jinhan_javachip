package mymain;

import java.util.ArrayList;

public class MyMain_ArrayList {

	public static void main(String[] args) {

		//Collection : 자바의 모든 객체를 저장 관리 할수있는 (인터페이스)
		
		
		//상속 관계 
		//   ㄴ List (인터페이스)
		//       ㄴ Array  List (클래스)
		
		// 동적 배열 (Dynamic) 배열형식의 데이터를 저장관리하는 객체
		
		ArrayList list = new ArrayList();

		// 데이터추가
		// 아래와 같이 넣게되면 auto-boxing 으로 객체로 들어
		list.add(100); // 0.               100 = (int) > new integer (100) 으로 변환
		list.add(200); // 1.
		list.add(300); // 2.

		// 데이터 갯수
		int count = list.size();
		System.out.printf("list's size() : %d\n", count);

		//배열 값 얻어(읽어) 오기
		Integer nob = (Integer)list.get(1);
		int n = nob; //auto-unboxing
		double d = nob; //auto-unboxing
		
		//전체데이터 읽어오기
		System.out.println("첨자를 이용한 데이터 출력");
		for (int i=0; i<list.size(); i++) { //o = 0 .1. 2
			int n1 = (Integer)list.get(i);
			System.out.printf("index=%d : %d\n", i,n1);
		}
		
		//삭제하기
		//index 가 ==> 1인 데이삭제
		list.remove(1);
		
		System.out.println("삭제후 (remove) 데이터");
		for (int i=0; i<list.size(); i++) { //o = 0 .1. 2
			int n1 = (Integer)list.get(i);
			System.out.printf("index=%d : %d\n", i,n1);
		
		}

	}
}
