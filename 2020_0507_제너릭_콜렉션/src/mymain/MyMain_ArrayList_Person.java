package mymain;

import java.util.ArrayList;
import java.util.List;

import vo.PersonVo;

public class MyMain_ArrayList_Person {

	public static void main(String[] args) {

		List<PersonVo> p_list = new ArrayList<PersonVo>();

		PersonVo p = new PersonVo("�ϱ浿", 21, "���� ���Ǳ� ����1��"); // Override �س�����

		p_list.add(p); // ���� ������� ��ü�� ������ ArrayList ��

		p_list.add(new PersonVo("�̱浿", 22, "���� ���Ǳ� ����2��"));
		p_list.add(new PersonVo("��浿", 23, "���� ���Ǳ� ����3��"));
		p_list.add(new PersonVo("��浿", 24, "���� ���Ǳ� ����4��"));
		p_list.add(new PersonVo("���浿", 25, "���� ���Ǳ� ����5��"));

		System.out.println("---���� loop---");

		for (PersonVo p1 : p_list) {
			System.out.println(p1);
			// System.out.println(p1.toString());
		}

		// for (String sido : sido_list) { //�������� �ϳ��� 0 ~ 4 //÷�ڸ� �̿��� ����ó�� ÷�ڸ� ����ϱ�� �����
		// System.out.println(sido);

		System.out.println("--------------------÷�ڸ� �̿��� ���� ���--------------------");

		for (int i = 0; i < p_list.size(); i++) {
			System.out.println(p_list.get(i)); // index�� �ִ¾� ���°�

		}

	}
}