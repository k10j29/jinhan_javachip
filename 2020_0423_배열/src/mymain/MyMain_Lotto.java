package mymain;

import java.util.Scanner;

import myutil.Lotto;

public class MyMain_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����� ���Ͽ� 
		Scanner scan = new Scanner(System.in);

		//���� �Է��ϰԵ� ������ ���� 6��
		int[] user_num = new int[6];
		
		//�������� �ٽ� ������ �Ұ��� ������ Ȯ���ϴ� Ȯ�ι� ����ϱ�
		String yn = "y";
		
		// �ٽ��ҷ�?
		/* System.out.print("\n���ҷ�? [y/n] : \n");
		yn = scan.next();
		if (yn.equalsIgnoreCase("Y") == false)
			break; */

		//myutil �� ���ĵ� ��������
		Lotto lotto = new Lotto();

		
		
		lotto.make_win_num();

		
		//���ڸ� �Է��Ҽ� �ֵ��� ����
		while (true) {
			System.out.print("�ζ� ��ȣ 6���� �Է��ϼ��� : ");
			user_num[0] = scan.nextInt();
			user_num[1] = scan.nextInt();
			user_num[2] = scan.nextInt();
			user_num[3] = scan.nextInt();
			user_num[4] = scan.nextInt();
			user_num[5] = scan.nextInt();

			
			// ����ڰ� �Է��� �ζ� ��ȣ�� ��� ��ü���� �ѱ��
			lotto.setUser_num(user_num);
			lotto.display();

			
			
			
			// �ٽ��ҷ�?
			System.out.print("\n���ҷ�? [y/n] : \n");
			yn = scan.next();
			if (yn.equalsIgnoreCase("Y") == false)
				break;

		} // end while

		System.out.println("--END--");

	}

}
