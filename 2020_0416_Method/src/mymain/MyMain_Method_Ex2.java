package mymain;

import myutil.Myline;

public class MyMain_Method_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int line_size = 35; //--- 선의길이
		int line_size2 = 10;
		
			System.out.printf("%23s\n", "===성적관리===");
			
			
				
				//System.out.println("-----------------------------------------");
				//Myline.draw_line();
			    //Myline.draw_line(line_size);
				
			
				Myline.draw_line(line_size);				
				System.out.println("번호  이름  국어  영어  수학  총점   ");
				Myline.draw_line(line_size);
				//System.out.println("-----------------------------------------");
				//Myline.draw_line();
				//Myline.draw_line(line_size);
				System.out.println(" 1   엄복동  90    80    60   240    ");
				System.out.println(" 2   나루토  70    80    60   210    ");
				System.out.println("      소계   85    80    70       ");
				//System.out.println("-----------------------------------------");
				//Myline.draw_line();
				
				Myline.draw_line3(line_size, '*', 1, '-', 3, '#',5);
				
				
				//*---*---*---*---*---*---
				//**--**--**--**--**--**--
	}

}
