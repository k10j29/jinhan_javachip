package mymain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import vo.PersonComp;
import vo.PersonVo;

public class MyMain_ArraySort {

	public static void main(String[] args) {

		// Sample data
		// ���׸� �������� (name, age, addr)

		List<PersonVo> p_list = new ArrayList<PersonVo>();
		p_list.add(new PersonVo("������", 30, "���� ���� �Ÿ�3", "010-5555-1234"));
		p_list.add(new PersonVo("������", 10, "���� ���� �Ÿ�1", "010-4555-2234"));
		p_list.add(new PersonVo("������", 50, "���� ���� �Ÿ�4", "010-3555-4234"));
		p_list.add(new PersonVo("������", 20, "���� ���� �Ÿ�5", "010-1555-5234"));
		p_list.add(new PersonVo("������", 40, "���� ���� �Ÿ�2", "010-2555-3234"));

		// ArrayList �� Array �� (Array �� �ѹ� �������� �þ������) =! (ArrayList)
		// 5ĭ�� �ֱ�������� ���� �������������� (�迭�̶� 5ĭ ����)
		PersonVo[] p_array = new PersonVo[p_list.size()];

		// List<PersonVo> p_list = new ArrayList<PersonVo>();
		// PersonVo[] p_array = new PersonVo[p_list.size()];

		p_list.toArray(p_array); // �ټ����� ��ü�� ���� ����Ʈ�� �迭��

		// ù��° ��ü�ǰ� �����°�
		// PersonVo p1 = p_list.get(0);
		// PersonVo p2 = p_array[0];

		System.out.println("--- original ---");
		// ���� loop

		for (PersonVo p : p_array) {
			System.out.println(p);

		}

		System.out.println("=========================����============================");

//System.out.println("ABC".compareTo("ABC")); //�տ� ���ڿ��� �ڿ� ���� �� (����)

		// ���ı��ع� ����� ������ ��ü
		PersonComp comp = new PersonComp();

		Arrays.sort(p_array, comp);
		System.out.println("----�̸��� ��������");

		for (PersonVo p : p_array) {
			System.out.println(p);
		}
		System.out.println("=========================����============================");

		// �̸��� ��������
		comp.setSort_field(PersonComp.SOTR_FIELD_NAME);
		comp.setSort_method(PersonComp.SORT_METHOD_DESC);
		Arrays.sort(p_array, comp);
		System.out.println("----�̸��� ��������");

		for (PersonVo p : p_array) {
			System.out.println(p);
		}
		System.out.println("=========================����============================");

		comp.setSort_field(PersonComp.SOTR_FIELD_AGE);
		comp.setSort_method(PersonComp.SORT_METHOD_ASC);
		Arrays.sort(p_array, comp);
		System.out.println("----���� ��������");

		for (PersonVo p : p_array) {
			System.out.println(p);
		}
		System.out.println("=========================����============================");

		comp.setSort_field(PersonComp.SOTR_FIELD_AGE);
		comp.setSort_method(PersonComp.SORT_METHOD_DESC);
		Arrays.sort(p_array, comp);
		System.out.println("----���� ��������");

		for (PersonVo p : p_array) {
			System.out.println(p);
		}
		System.out.println("=========================����============================");

		comp.setSort_field(PersonComp.SOTR_FIELD_ADDR);
		comp.setSort_method(PersonComp.SORT_METHOD_ASC);
		Arrays.sort(p_array, comp);
		System.out.println("----�ּ� ��������");

		for (PersonVo p : p_array) {
			System.out.println(p);
		}
		System.out.println("=========================����============================");

		comp.setSort_field(PersonComp.SOTR_FIELD_ADDR);
		comp.setSort_method(PersonComp.SORT_METHOD_DESC);
		Arrays.sort(p_array, comp);
		System.out.println("----�ּ� ��������");

		for (PersonVo p : p_array) {
			System.out.println(p);
		}
		System.out.println("=========================����============================");

		comp.setSort_field(PersonComp.SOTR_FIELD_TELL);
		comp.setSort_method(PersonComp.SORT_METHOD_ASC);
		Arrays.sort(p_array, comp);
		System.out.println("----��ȣ ��������");
		for (PersonVo p : p_array) {
			System.out.println(p);

		}
		System.out.println("=========================����============================");

		comp.setSort_field(PersonComp.SOTR_FIELD_TELL);
		comp.setSort_method(PersonComp.SORT_METHOD_DESC);
		Arrays.sort(p_array, comp);
		System.out.println("----��ȣ ��������");
		for (PersonVo p : p_array) {
			System.out.println(p);

		}
		// ArrayList ���

		System.out.println("=========================����============================");

		System.out.println("------------ArrayList [original]----------");

		for (PersonVo p : p_list) {
			System.out.println(p);
		}

		PersonComp comp1 = new PersonComp();
		comp1.setSort_field(PersonComp.SOTR_FIELD_AGE);
		Collections.sort(p_list, comp1);

		System.out.println("-ArrayList [���̿�������]-");

		for (PersonVo p : p_list) {
			System.out.println(p);
		}
	}

}
