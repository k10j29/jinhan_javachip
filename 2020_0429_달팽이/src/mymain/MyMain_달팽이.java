package mymain;

import java.util.Scanner;

import myutil.Snail;

public class MyMain_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int chasu;
		String yn="y";
		
		//������ ��ü����
		Snail  snail = new Snail();
		
		while(true) {
			System.out.print("����:");
			chasu = scan.nextInt();
			
			//������ ��������->���
			snail.setChasu(chasu);
			
			snail.display();
			
			System.out.print("��?(y/n):");
			yn = scan.next();
			
			if(!yn.equalsIgnoreCase("Y"))break;
			
		}//end-while
		
		System.out.println("--End--");
		
		
	}

}
