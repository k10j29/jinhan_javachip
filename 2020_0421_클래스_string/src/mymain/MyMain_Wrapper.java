package mymain;

import java.util.ArrayList;

public class MyMain_Wrapper {

	public static void main(String[] args) {

		// �⺻�ڷ��� ==> ��üȭ
		// int ��üȭ ==> integer
		// ���� ��ü
		// int n integer job = new integer(100);

//Auto Boxing (����) : JDK 5.0 �̻���� ����

		Integer iOb = 10; // new integer (10)

		// ������ ���� ������ 5.0 �� ���ĺ��ʹ� �ڵ� Auto Boxing
		// �Ʒ� ��������
		// Integer iOb = new Integer(10);

		// Collection ��ü ==> ��ü�� �����ϵ��� ����Ǿ�����

		ArrayList list = new ArrayList();
		int n = 10;
		list.add(n); // list.add(new integer(n));
		list.add(10.5); // list.add(new Double(10.5));
		list.add(true); // list.add(new Boolean(true));
		list.add("hello"); // ��ü�̱⶧���� �״�� ��

		Character cob = 'A'; // ����
		// Character cOb = new Character('A'); //�������

		System.out.println(Character.isAlphabetic('A'));

		// Auto-Boxing (�ڵ�����)
		Integer nob = 10;

		// ��ü�� �ڷ����� ==> �⺻�� �ڷ�������
		// Auto-Unboxing
		int n1 = nob; // �ڷ����� ��ġ�ؾ��� int != nob �׷��� Integer �� ���� nob intValue
		double d = nob; // nob.doubleValue
		float f = nob; // nob.floatValue

		// ���ڿ� ��ȯ
		n1 = Integer.parseInt("123");
		//2���� ���
		System.out.println(Integer.toBinaryString(100));  //2��
		System.out.println("0x" + Integer.toHexString(100));    //16����
		System.out.println("0" + Integer.toOctalString(100)); //8����
		
		Integer nob1 = new Integer ("100");
	}

}
