package mymain;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class MyMain_Set {

	public static void main(String[] args) {
		
	
		// 인터페이스 = 클래스
		// 사용설명서 = 제조방법 (설계서)

		Random rand = new Random();										
													// 중복값은 허용하지않음
													// Hashset : 정렬되지않음
													// Treeset : 오름차순 정렬
		// 로또 6자리뽑기 (랜덤) 		// 반복횟수 6번
		Set<Integer> set = new TreeSet<Integer>();
		int n = 6;
		while (n > 0) {
			// n = 6 5 4 3 2 1 (6번 회전)

			int su = rand.nextInt(45) + 1;
			if (set.add(su) == false)
				continue;
			n--;								// if (!set.add(su)==true) (위랑 같은뜻) 실패, 안들어갔다. Set 에 add실패 같은 값이 있는경우
												// 반복수 체크하기

			

		}

		System.out.println(set.toString());
		
		//Set 의요소 추출하는 방법     //(1)// //set 은 위치정보가 없다 (첨자방식 사용불가)
				
			//출력
		System.out.println("--개선loop--");
		
		for (int su : set) {  //개선loop방식 : set안에 su (숫자) 를 빼온다. 한바퀴돌때마다 개선loop 는 순서대로
				
			//출력
			System.out.print(su + " ");
		}
		//띄어쓰기
		System.out.println();
		
		//Set 의요소 추출하는 방법     //(2)// //set 은 위치정보가 없다 (첨자방식 사용불가)
		
		System.out.println("--iterator방식--"); //interator 방식 : 탐색자/검색자 이용방식 인터페이스 
												//읽기전용이라 제공만 할수있다 가공 수정 불가능
		
		Iterator<Integer> it = set.iterator();
		
		//while 써서 뽑아오기
		
		while(it.hasNext()){ //값을 가지고 있는지 hasnext 다음값확인 > 다음이동 > 다음이동 > 가져올값 있나 > 없다 while 탈출
			
			int su = it.next();
			System.out.print(su + " ");
		}
		
		System.out.println();
		
		//(3) 모두 지우기
		System.out.println();
		
		set.clear();
		System.out.println(set);
		
		if (set.isEmpty())
			System.out.println("set is empty");
		}
		
	}


