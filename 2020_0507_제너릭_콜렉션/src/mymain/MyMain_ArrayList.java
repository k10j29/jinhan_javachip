package mymain;

// �迭 
// set 
// ArrayList 
// ���� ���� (��Ͽ��� �ϳ��� ������ ����)

import java.util.ArrayList;
import java.util.List;

public class MyMain_ArrayList { // ���� �迭 ArrayList
								// ��������� �ִ�. (÷�ڿ��� ������ 14����)

	public static void main(String[] args) {

		List<String> sido_list = new ArrayList<String>(); // �������̽� List
		// ������ Ŭ���� new ArrayList<String>(); �� List �������̽� ����� ����Ұ̴ϴ�.

		sido_list.add("����"); // 0 << ÷�� // 0 ~ 4 ����
		sido_list.add("���"); // 1 ������ ���� List �������̽�
		sido_list.add("��õ");
		sido_list.add("����");
		sido_list.add("�뱸"); // 4

		System.out.println(sido_list);

		System.out.println("--------------------÷�ڸ� �̿��� ���� ���--------------------");

		for (int i = 0; i < sido_list.size(); i++) {
			String sido = sido_list.get(i);

			System.out.printf("%d : %s\n", i, sido); // %d ��° / ����
		}
		System.out.println();

		System.out.println("--------------------���� loop--------------------");

		
		for (String sido : sido_list) { //�������� �ϳ��� 0 ~ 4 //÷�ڸ� �̿��� ����ó�� ÷�ڸ� ����ϱ�� �����
			System.out.println(sido);  

		}
		
		List<String> fruiut_list = new ArrayList<String>();
		fruiut_list.add("���");
		fruiut_list.add("����");
		fruiut_list.add("����");
		fruiut_list.add("����");
		
	}

}
