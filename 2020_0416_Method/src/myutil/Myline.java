package myutil;

public class Myline {
	
	
	//void = 값이 없음을 상징적으로 표현하는 자료형
	// : 호출시 전달 인자가 없는 메소드
	
	public static void draw_line() {
		
		System.out.println("-----------------------------------"); // - 35칸
	
		// }을 만나면 어짜피 반환함 return 은 생략가능
		return ;
	}
	
	
//메소드명은 같고  호출인자 int 정보가 다르다. (가능)
//Method Overload : 사용자가 동일메소드 이름을 가지고 똑같이 쓸수가있다. 
//Call By Value Method  Value 형식의 메소드 : 호출시 전달할 인자값을 넣어서 호출하는 메소드 
	public static void draw_line (int n) {
	
		for (int i=0; i<n; i++) {  //"-" n 개만큼 반복 해줘야함
		System.out.print("-");
		
	}
	
		System.out.println(); //줄바꾸기
	}


	//길이와 선의모양 전달
	
	//*---*---*---*---*---*---
	//**--**--**--**--**--**--
	//##---##---##---##---##---
	
	
	//Myline.draw.line (25, '#',2,'-',3);
	
	//n : 전체길이
	//ch1 : 1번째 패턴문자
	//len1 : 1번째 패턴길이 
	// .
	// .
	
	public static void draw_line(int n, int len1, char ch1, int len2, char ch2) {

		while (true) {

			// 패턴1
			for (int k = 0; k < len1; k++) {
				System.out.print(ch1);

				n--;

				if (n == 0) {// 지정길이만큼 출력했으면 끝

					return; // 해당 메소드는 종료
				}
				System.out.println(); // 줄바꾸기
			}

			// 패턴2
			for (int j = 0; j < len2; j++) {
				System.out.print(ch2);

				n--;

				if (n == 0) {// 지정길이만큼 출력했으면 끝

					return;
				}

				System.out.println(); // 줄바꾸기

			}

		}

	}
	
	public static void draw_line2(int n, char ch1, int len1, char ch2, int len2 ) {

		
	OUT_WHILE:	
		while (true) {
			// 패턴1
			for (int k = 0; k < len1; k++) {
				System.out.print(ch1);
				n--;
				if (n == 0) {// 지정길이만큼 출력했으면 끝
					break OUT_WHILE;
				}
			}
			// 패턴2
			for (int j = 0; j < len2; j++) {
				System.out.print(ch2);
				n--;
				if (n == 0) {// 지정길이만큼 출력했으면 끝
					break OUT_WHILE;
					
				}		
			}
		}
	System.out.println(); // 줄바꾸기
	}
	
	public static void draw_line3(int n, char ch1, int len1, char ch2, int len2, char ch3, int len3) {
		
		OUT_WHILE: 
			while (true) {
			// 패턴1
			for (int k = 0; k < len1; k++) {
				System.out.print(ch1);
				n--;
				if (n == 0) {// 지정길이만큼 출력했으면 끝
					break OUT_WHILE;
				}
			}
			// 패턴2
			for (int j = 0; j < len2; j++) {
				System.out.print(ch2);
				n--;
				if (n == 0) {
					break OUT_WHILE;
					}
						}
				for (int h = 0; h<len3; h++) {
					System.out.print(ch3);
					n--;
					if (n == 0) {// 지정길이만큼 출력했으면 끝
						break OUT_WHILE;
					}
				}
			
		}
		System.out.println(); // 줄바꾸기
	}
}
