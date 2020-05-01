package mymain;

import java.util.StringTokenizer;

public class MyMain_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 과일 설정
		String fruit_list = "사과 배꼽 참외 수박 포도";

		// 2. 공백을 기분으로 분리하라
		String[] fruit_array = fruit_list.split(" ");

		// 0 1 2 3 <==index
		// String [] fruit_array = {"사과,"배꼽","수박","포도"};

		// " " 공백을 기준으로 0 1 2 3 분류 출력
		System.out.println(fruit_array.length);

		for (int i = 0; i < fruit_array.length; i++) {

			System.out.printf("fruit_array[%d] : ", i);
			System.out.println(fruit_array[i]);

			
			
		}
		
		System.out.println();

		System.out.println(fruit_array[0]);
		System.out.println(fruit_array[1]);
		System.out.println(fruit_array[2]);

		
	
	
	             //채팅#3번방#대화명#내용
	
	String msg = "CHAT#3#홍길동#잘지내?";
	String [] msg_array = msg.split("#");
	String display_msg = String.format("[%s]님 말씀:\n %s\n",msg_array[2], msg_array[3]);
	
	System.out.println(display_msg);
		
		
	   String su_list = "1#2#3#4#5";
	   // delimeter 구분문자 #
	   StringTokenizer st = new StringTokenizer(su_list, "#");
	   System.out.println("StringTokenizer");
	   
	   
	   while (st.hasMoreTokens()) {
	      String token = st.nextToken();
	      System.out.println(token);
	               }
	   
	   //split
	   String [] su_array = su_list.split("#");
	   //String [] su_array = {"1", "2", "3", "4", "5"};
	   System.out.println("split");
	   
	   for (int i = 0; i < su_array.length; i++) {
	      
	      System.out.println(su_array[i]) ;
	      
	   }
	   
}
}

	
	



