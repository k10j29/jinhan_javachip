package mymain;

public class MyMain_����������ǿ���ó�� {
	
	
	/////////////////////////////////////////////////////////
//������ :	
//	1. �ڵ尡 ����������.
//  2. ���ڵ��� ������ �Ҹ�Ȯ������.	
	//////////////////////////////////////////////////////////
	

	public static void main(String[] args) {

		int a = 10, b = 1, res;

		String str = "abc";

		if (b != 0) {
			res = a / b;

//���ڿ� ���� ���ϱ�		

			if (str != null) {
				int len = str.length();

//���ڿ� => ���� (����) �� �ٲ� 
				// ���ڿ��� ���ڷ� �ٲٴ°� ��������
				int su = Integer.parseInt(str);

			} else {
				System.out.println("str = null �Դϴ�.");

			}
		} else {

			System.out.println("0���� ������ �����ϴ�.");

			System.out.println("int len = str.length(); ���ڿ� ���� ���ϱ�");

		}
	}

}
