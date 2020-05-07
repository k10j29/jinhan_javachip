package mymain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import vo.PersonVo;

public class MyMain_Map_ArrayList {
	private static final List PersonVo = null;

// Map�� ArrayList ��

	public static void main(String[] args) {

		Map<String, PersonVo> personMap = new HashMap<String, PersonVo>();

		List<PersonVo> personList = new ArrayList<PersonVo>();

		for (int i = 1; i <= 100; i++) {// 100����� ���� ����
			String name = String.format("�浿%04d", i); // �浿 0001, 0002, ~ 0100
			int age = 20 + (i % 11); // 21 22 23 24 ~ 30
			String addr = String.format("���� ���� �Ÿ� %d��", (i % 4) + 1);

			PersonVo p = new PersonVo(name, age, addr);

			// Map �� ����

			personMap.put(name, p);

			// List �� ����

			personList.add(p);
		}
//Map ���� �˻�
		String search_name = "�浿0100";

		PersonVo res_p = personMap.get(search_name);
		System.out.println(res_p);
//List �� �˻�
		// �ݺ��� (�������� ,÷�ڹ��)
		int count = 0;
		for (PersonVo p : personList) {

			if (search_name.equals(p.getName()))
				System.out.println(p);

			count++;
		}

		System.out.println(count + "ȸ");

	}
}
