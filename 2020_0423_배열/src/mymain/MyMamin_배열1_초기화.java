package mymain;

import java.util.Stack;

import myutil.MyArrays;

//�ʱ�ȭ : ��������� ���ÿ� ���� �ο�
//�ʱ�ȭ : ��������� ���ÿ� ���� �ο�
//�ʱ�ȭ : ��������� ���ÿ� ���� �ο�
//�ʱ�ȭ : ��������� ���ÿ� ���� �ο�
//�ʱ�ȭ : ��������� ���ÿ� ���� �ο�

public class MyMamin_�迭1_�ʱ�ȭ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;  //���� ����
		n = 10; //���� �Ǵ� ġȯ
		
		
		int m = 10; //��������� ���ÿ� ���� �ִ°� (�ʱ�ȭ)
		
		
		//1) 1���� �迭 �ʱ�ȭ
		
              //stack         heap
		//int [] nr = new int [5];              //1-1) �ʱ�ȭ �Ҷ��� ���������� �κ��� ������
		
		                      //�迭��Ҹ��
		//int [] nr = new int [] {1,2,3,4,5,}; //1-2) �߰�ȣ�� ���ڸ� �־���
		
		int [] nr = {1,2,3,4,5,};              //1-3)new int [] �κ� ���� ����
		
		/*int [] mr; 
		  mr = {10,20,30,40,50};*/             //1-4) ����
		
		int [] mr;                             //mr�ε� ��ü�� ���� ������ �����ؼ� 1�� �Լ��� ������ = ���� �� �ʱ�ȭ �Ϸ��� ������ Ȯ���ϰ� �������
		  mr =new int [] {10,20,30,40,50};     //1-5) new int [] �ο��� ����
		
		//��𼭳� ��Ȱ�� ������ util �� ���â
		MyArrays.displayArray(nr);
																																									System.out.println();
																																									System.out.println();
		MyArrays.displayArray(mr);
		
		
		//��ü�� �ڷ��� �ʱ�ȭ 20200424
		//��ü���� �Ʒ��Ͱ��� ���־���� (1)     (1)(2)(3) ���� ��ΰ���
		Integer [] iob_array = new Integer[] {new Integer(1),
												new Integer(2),
												new Integer(3)
												};
		//������ �ȳ����� �߸��� �迭
		/*Integer [] iob_array = new Integer[] {1,2,3,}; */ 
		
		//����ȭ (2)
		Integer [] iob_array2 = {new Integer(1),new Integer(2), new Integer(3)};
		
		//����ȭ (3) Auto Boxing : int �� integer �� �ڵ���ȯ����
		Integer [] iob_array3 = {1 , 2, 3};
		
		
		//String ��ü�� ������ ���������� �迭
		String [] str_array = new String[3];
		
		//String �� ������ ��ü�� �����Ͽ� �־�����Ѵ�
		str_array[0] = "�ȳ�";
		str_array[1] = new String("�ȳ�ݰ���");
		str_array[3] = new String("�Ǹ�����");
	}

}
