package mymain;

import myutil.Save;

public class MyMain_Save {
	
/////////////////////////////////////////////////////////////////////////////
//static 변수 표현방법                                                     //
// 1. 객체생성전 : 클래스명, 변수명 (line 18) 공유변수                     //        
// 2. 객체생성후 : 객체명, 변수명, (가급적 사용하지말것)                   //
//                   객체가 생성된 다음에 접근이 가능 잘안씀 (line 28)     //
/////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 저축할 사람의 정보 3개 입력
		
		Save s1 = new Save("일길동", 1000000);
		Save s2 = new Save("이길동", 3000000);
		Save s3 = new Save("삼길동", 4000000);

		// 2. 스태틱 변수이기때문에 Save.rate 줘도됨
		
		System.out.printf("--이율 %.2f--\n", Save.rate);
		// 3. s? 이 가지고 있는 이자정보 (Save 이율 0.1)
		
		s1.display();
		s2.display();
		s3.display();
		
		//4. 이율 바꿔보기 (0.15)
		// stack s1/s2/s3 Save 의 이율 공유해서 사용하던거 그래서 s1/s2/s3 각각 변경해줘도 가능 
		
		s1.rate = 0.15;
		
		//5. 이율 변경후  출력 (% 퍼센트 붙여보기)
		System.out.printf("--이율 %.2f(%%)--\n", s1.rate*100);
		
		s1.display();
		s2.display();
		s3.display();
		
		
		
		
	}

}
