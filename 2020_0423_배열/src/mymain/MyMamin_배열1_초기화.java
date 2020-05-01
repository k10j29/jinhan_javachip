package mymain;

import java.util.Stack;

import myutil.MyArrays;

//초기화 : 변수선언과 동시에 값을 부여
//초기화 : 변수선언과 동시에 값을 부여
//초기화 : 변수선언과 동시에 값을 부여
//초기화 : 변수선언과 동시에 값을 부여
//초기화 : 변수선언과 동시에 값을 부여

public class MyMamin_배열1_초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;  //변수 선언
		n = 10; //대입 또는 치환
		
		
		int m = 10; //변수선언과 동시에 값을 주는것 (초기화)
		
		
		//1) 1차원 배열 초기화
		
              //stack         heap
		//int [] nr = new int [5];              //1-1) 초기화 할때는 갯수에대한 부분을 생략함
		
		                      //배열요소목록
		//int [] nr = new int [] {1,2,3,4,5,}; //1-2) 중괄호에 숫자를 넣어줌
		
		int [] nr = {1,2,3,4,5,};              //1-3)new int [] 부분 생략 가능
		
		/*int [] mr; 
		  mr = {10,20,30,40,50};*/             //1-4) 에러
		
		int [] mr;                             //mr인데 객체를 만들어서 변수를 대입해서 1차 함수를 만들어라 = 대입 은 초기화 하려면 조건을 확실하게 써줘야함
		  mr =new int [] {10,20,30,40,50};     //1-5) new int [] 부여시 가능
		
		//어디서나 재활용 가능한 util 성 출력창
		MyArrays.displayArray(nr);
																																									System.out.println();
																																									System.out.println();
		MyArrays.displayArray(mr);
		
		
		//객체형 자료형 초기화 20200424
		//객체형은 아래와같이 해주어야함 (1)     (1)(2)(3) 값이 모두같음
		Integer [] iob_array = new Integer[] {new Integer(1),
												new Integer(2),
												new Integer(3)
												};
		//에러는 안나지만 잘못된 배열
		/*Integer [] iob_array = new Integer[] {1,2,3,}; */ 
		
		//간략화 (2)
		Integer [] iob_array2 = {new Integer(1),new Integer(2), new Integer(3)};
		
		//간략화 (3) Auto Boxing : int 를 integer 로 자동변환해줌
		Integer [] iob_array3 = {1 , 2, 3};
		
		
		//String 객체를 저장할 참조변수의 배열
		String [] str_array = new String[3];
		
		//String 도 각각의 개체를 생성하여 넣어줘야한다
		str_array[0] = "안녕";
		str_array[1] = new String("안녕반가워");
		str_array[3] = new String("또만나요");
	}

}
