package mymain;

import java.util.Arrays;

import myutil.MyArrays;

public class MyMain_배열1_개요 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] mr;
		{
			// 1) 1차원 배열의 참조 변수
			// 2) 이렇게 써도 가능 int mr [];

			// stack 할당
			// 지역변수
			// 자기 영역을 벗어나면 소멸 (중괄호 벗어나면 int [] nr 소멸)

			int[] nr;

			// 3) 배열 생성 (어떤 모양일지 생각해보기)

			// heap 할당 (전역개체)
			// 중괄호시 nr = new int [4]; 는 쓰레기데이터로 제거 대상이됨

			nr = new int[4];
			mr = nr;
		}

		System.out.printf("mr's length=%d\n", mr.length);

		// 4) 배열의 요소 표현방법

		mr[0] = 1;
		mr[1] = 2;
		mr[2] = 3;
		mr[3] = 4;

		// 5) 반복문을 이용해서 값을 넣어보자 (일괄처리) 배열의 요소가 많아지면.

		for (int i = 0; i < mr.length; i++) {

			// i = 0 1 2 3

			mr[i] = (i + 1) * 10; // 10 20 30 40 (연산자 주의

			System.out.printf("mr[%d] : %d\n", i, mr[i]);
		}

		// 5) 출력을 요청

		MyArrays.displayArray(mr);

		// 6) 배열의 값을 0으로 채우기
		System.out.println();

		MyArrays.fill(mr, 0);
		System.out.println("0 으로 채워보기");
		MyArrays.displayArray(mr);

		// 7) 기존 java Arrays 기능...
		System.out.println();

		Arrays.fill(mr, 1);
		System.out.println("Arrays 의 기능을 사용하여 1로 채워보기");
		MyArrays.displayArray(mr);

		// 8) 기존 Arrays 기능을 사용하여 0 (1 2) 3 ==>5로 넣어보기
		System.out.println();

		Arrays.fill(mr, 1, 1 + 2, 5);
		MyArrays.displayArray(mr);
		System.out.println();

		// 9) 특정부분 지정범위 채우기 (내가구현한 기능)

		System.out.println();

		MyArrays.fill(mr, 1, 1 + 2, 3);
		System.out.println("MyArrays : 지정범위 3로 채워보기");
		MyArrays.displayArray(mr);

		// 10) 기존 Arrays : 정렬 (소트)

		mr[0] = 4;
		mr[1] = 3;
		mr[2] = 2;
		mr[3] = 1;

		System.out.println("--before sort--");
		MyArrays.displayArray(mr);

		// 10) 오름차순(ASCENDING) sort 작은값에서 큰값으로
		MyArrays.sort_asc(mr);
		System.out.println("--오름차순--");
		MyArrays.displayArray(mr);

		// 11) 내림차순(ASCENDING) 큰값에서 작은값으로

		MyArrays.sort_desc(mr);
		System.out.println("--내림차순--");
		MyArrays.displayArray(mr);

	}

}
