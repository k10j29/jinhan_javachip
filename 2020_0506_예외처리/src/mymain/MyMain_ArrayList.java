package mymain;

import java.util.ArrayList;

public class MyMain_ArrayList {

	public static void main(String[] args) {

		//Collection : �ڹ��� ��� ��ü�� ���� ���� �Ҽ��ִ� (�������̽�)
		
		
		//��� ���� 
		//   �� List (�������̽�)
		//       �� Array  List (Ŭ����)
		
		// ���� �迭 (Dynamic) �迭������ �����͸� ��������ϴ� ��ü
		
		ArrayList list = new ArrayList();

		// �������߰�
		// �Ʒ��� ���� �ְԵǸ� auto-boxing ���� ��ü�� ���
		list.add(100); // 0.               100 = (int) > new integer (100) ���� ��ȯ
		list.add(200); // 1.
		list.add(300); // 2.

		// ������ ����
		int count = list.size();
		System.out.printf("list's size() : %d\n", count);

		//�迭 �� ���(�о�) ����
		Integer nob = (Integer)list.get(1);
		int n = nob; //auto-unboxing
		double d = nob; //auto-unboxing
		
		//��ü������ �о����
		System.out.println("÷�ڸ� �̿��� ������ ���");
		for (int i=0; i<list.size(); i++) { //o = 0 .1. 2
			int n1 = (Integer)list.get(i);
			System.out.printf("index=%d : %d\n", i,n1);
		}
		
		//�����ϱ�
		//index �� ==> 1�� ���̻���
		list.remove(1);
		
		System.out.println("������ (remove) ������");
		for (int i=0; i<list.size(); i++) { //o = 0 .1. 2
			int n1 = (Integer)list.get(i);
			System.out.printf("index=%d : %d\n", i,n1);
		
		}

	}
}
