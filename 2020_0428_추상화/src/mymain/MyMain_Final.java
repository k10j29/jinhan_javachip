package mymain;

//2. ���� Ŭ�� ����
class A {
	void sub() {
	}

	// �������������ƶ� ���� 13���� �������Ѱ� �����߻�
	final void sub1() {
	}

	class B extends A {
		void sub() {
		}
		// void sub1() {}

	}

}


// final Ŭ�󽺰� �ֱ� ������ ������
// class C extends B {}


//���ʿ� String class �� final Ŭ�� �̱⶧���� �����߻� 
// class MyString extends String{}

public class MyMain_Final {

//������� ���� Static ���̱�
	// �������--1
	final static double PI = 3.14;

	// 1. ���� >> ������� : �����μ��� final
	// �ڷ��� ��(��)���� = ��

	// 2. �޼ҵ� ���ʿ����� final�� ���̻� ������ ���� ���ƶ�
	// ��ȯ�� �޵����� ()

	// 3. Ŭ�󽺿����� final �� ���̻� �����������
	// Ŭ�� �ȿ� final �� ������ finla Ŭ����

	public static void main(String[] args) {

		// PI = 3.141592;

	}

}
