package mymain;

import myutil.Myline;

public class MyMain_Method_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int line_size = 35; //--- ���Ǳ���
		int line_size2 = 10;
		
			System.out.printf("%23s\n", "===��������===");
			
			
				
				//System.out.println("-----------------------------------------");
				//Myline.draw_line();
			    //Myline.draw_line(line_size);
				
			
				Myline.draw_line(line_size);				
				System.out.println("��ȣ  �̸�  ����  ����  ����  ����   ");
				Myline.draw_line(line_size);
				//System.out.println("-----------------------------------------");
				//Myline.draw_line();
				//Myline.draw_line(line_size);
				System.out.println(" 1   ������  90    80    60   240    ");
				System.out.println(" 2   ������  70    80    60   210    ");
				System.out.println("      �Ұ�   85    80    70       ");
				//System.out.println("-----------------------------------------");
				//Myline.draw_line();
				
				Myline.draw_line3(line_size, '*', 1, '-', 3, '#',5);
				
				
				//*---*---*---*---*---*---
				//**--**--**--**--**--**--
	}

}
