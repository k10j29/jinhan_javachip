package mymain;

import myutil.Save;

public class MyMain_Save {
	
/////////////////////////////////////////////////////////////////////////////
//static ���� ǥ�����                                                     //
// 1. ��ü������ : Ŭ������, ������ (line 18) ��������                     //        
// 2. ��ü������ : ��ü��, ������, (������ �����������)                   //
//                   ��ü�� ������ ������ ������ ���� �߾Ⱦ� (line 28)     //
/////////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. ������ ����� ���� 3�� �Է�
		
		Save s1 = new Save("�ϱ浿", 1000000);
		Save s2 = new Save("�̱浿", 3000000);
		Save s3 = new Save("��浿", 4000000);

		// 2. ����ƽ �����̱⶧���� Save.rate �൵��
		
		System.out.printf("--���� %.2f--\n", Save.rate);
		// 3. s? �� ������ �ִ� �������� (Save ���� 0.1)
		
		s1.display();
		s2.display();
		s3.display();
		
		//4. ���� �ٲ㺸�� (0.15)
		// stack s1/s2/s3 Save �� ���� �����ؼ� ����ϴ��� �׷��� s1/s2/s3 ���� �������൵ ���� 
		
		s1.rate = 0.15;
		
		//5. ���� ������  ��� (% �ۼ�Ʈ �ٿ�����)
		System.out.printf("--���� %.2f(%%)--\n", s1.rate*100);
		
		s1.display();
		s2.display();
		s3.display();
		
		
		
		
	}

}
