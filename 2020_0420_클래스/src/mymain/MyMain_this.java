package mymain;

import myutil.MyDate2;

public class MyMain_this {

	///// this /////////

	///// this : �ڽ��� �����ϴ� ���� �����̴�.
	///// method �������� ���ȴ�
	///// ����������, �⺻������ this �پ��ִ°ɷ� �ؼ�
	///// �ݵ�� ����ϴ� ��� ))) �ܺκ��� (method)��� �̸��� �����ϸ� �����ϴ� ����

	///// MyDate 24/25 line ex

	public static void main(String[] args) {

//		//ù��° ��ü�� �����ɶ� ����

		// 1. new�� ���� Ŭ�������� ���� Class Loader ���� (���輭 ����)
		// 1-2. �ش� Class ���� method �� memory ����
		// 2. ��ü�� ���� (�޸�Ȯ�� > �ʱ�ȭ ����)

		MyDate2 md2 = new MyDate2();
		MyDate2 md2_1 = new MyDate2();

		System.out.println("�ܺ� :" + md2);

		// myutil.MyDate2 @ 15db9742
		// Class ���� //Hash �ڵ�

		// setYear �� ȣ���Ҷ� ���κ����� This ��
		// md2�� ������ �ְ� ȣ��

		// MyDate2 setYear this
		md2.setYear(2020);

		md2_1.setYear(2000);

		System.out.println("�ܺ� :" + md2);

		System.out.println();
		
		MyDate2 md22 = new MyDate2(2020, 4, 20);
		md22.display();

		System.out.println();

		md2.display();

	}

}
