package myutil;

public class Myline {
	
	
	//void = ���� ������ ��¡������ ǥ���ϴ� �ڷ���
	// : ȣ��� ���� ���ڰ� ���� �޼ҵ�
	
	public static void draw_line() {
		
		System.out.println("-----------------------------------"); // - 35ĭ
	
		// }�� ������ ��¥�� ��ȯ�� return �� ��������
		return ;
	}
	
	
//�޼ҵ���� ����  ȣ������ int ������ �ٸ���. (����)
//Method Overload : ����ڰ� ���ϸ޼ҵ� �̸��� ������ �Ȱ��� �������ִ�. 
//Call By Value Method  Value ������ �޼ҵ� : ȣ��� ������ ���ڰ��� �־ ȣ���ϴ� �޼ҵ� 
	public static void draw_line (int n) {
	
		for (int i=0; i<n; i++) {  //"-" n ����ŭ �ݺ� �������
		System.out.print("-");
		
	}
	
		System.out.println(); //�ٹٲٱ�
	}


	//���̿� ���Ǹ�� ����
	
	//*---*---*---*---*---*---
	//**--**--**--**--**--**--
	//##---##---##---##---##---
	
	
	//Myline.draw.line (25, '#',2,'-',3);
	
	//n : ��ü����
	//ch1 : 1��° ���Ϲ���
	//len1 : 1��° ���ϱ��� 
	// .
	// .
	
	public static void draw_line(int n, int len1, char ch1, int len2, char ch2) {

		while (true) {

			// ����1
			for (int k = 0; k < len1; k++) {
				System.out.print(ch1);

				n--;

				if (n == 0) {// �������̸�ŭ ��������� ��

					return; // �ش� �޼ҵ�� ����
				}
				System.out.println(); // �ٹٲٱ�
			}

			// ����2
			for (int j = 0; j < len2; j++) {
				System.out.print(ch2);

				n--;

				if (n == 0) {// �������̸�ŭ ��������� ��

					return;
				}

				System.out.println(); // �ٹٲٱ�

			}

		}

	}
	
	public static void draw_line2(int n, char ch1, int len1, char ch2, int len2 ) {

		
	OUT_WHILE:	
		while (true) {
			// ����1
			for (int k = 0; k < len1; k++) {
				System.out.print(ch1);
				n--;
				if (n == 0) {// �������̸�ŭ ��������� ��
					break OUT_WHILE;
				}
			}
			// ����2
			for (int j = 0; j < len2; j++) {
				System.out.print(ch2);
				n--;
				if (n == 0) {// �������̸�ŭ ��������� ��
					break OUT_WHILE;
					
				}		
			}
		}
	System.out.println(); // �ٹٲٱ�
	}
	
	public static void draw_line3(int n, char ch1, int len1, char ch2, int len2, char ch3, int len3) {
		
		OUT_WHILE: 
			while (true) {
			// ����1
			for (int k = 0; k < len1; k++) {
				System.out.print(ch1);
				n--;
				if (n == 0) {// �������̸�ŭ ��������� ��
					break OUT_WHILE;
				}
			}
			// ����2
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
					if (n == 0) {// �������̸�ŭ ��������� ��
						break OUT_WHILE;
					}
				}
			
		}
		System.out.println(); // �ٹٲٱ�
	}
}
