package mymain;

import java.util.StringTokenizer;

public class MyMain_split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. ���� ����
		String fruit_list = "��� ��� ���� ���� ����";

		// 2. ������ ������� �и��϶�
		String[] fruit_array = fruit_list.split(" ");

		// 0 1 2 3 <==index
		// String [] fruit_array = {"���,"���","����","����"};

		// " " ������ �������� 0 1 2 3 �з� ���
		System.out.println(fruit_array.length);

		for (int i = 0; i < fruit_array.length; i++) {

			System.out.printf("fruit_array[%d] : ", i);
			System.out.println(fruit_array[i]);

			
			
		}
		
		System.out.println();

		System.out.println(fruit_array[0]);
		System.out.println(fruit_array[1]);
		System.out.println(fruit_array[2]);

		
	
	
	             //ä��#3����#��ȭ��#����
	
	String msg = "CHAT#3#ȫ�浿#������?";
	String [] msg_array = msg.split("#");
	String display_msg = String.format("[%s]�� ����:\n %s\n",msg_array[2], msg_array[3]);
	
	System.out.println(display_msg);
		
		
	   String su_list = "1#2#3#4#5";
	   // delimeter ���й��� #
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

	
	



