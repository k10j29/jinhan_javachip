package myutil;

public class MyMath {
	
	//���
	public static final double PI = 3.141592;
	
	// �ܺη� ���� ���� ������ ��길 ���ִ� ������ ���� ��ü
	// ������ ����ɸ� ���� ��ü Math, ������ ������ �ʿ����
	// ����� �ʿ��� (������ ����� , ����)
	//int a : //new MyMath() ���ʿ����
	

	
	//�ܺο��� ��ü���� ����
	private MyMath() {
		// TODO Auto-generated constructor stub
	
	}
		
	//1. abs �� instance method ���....
	
	//           MyMath mm = new MyMath();
	//           int res = mm.abs(-100);
	

	// ���밪���ϱ�
	
	//2. ���� ���� �����ϱ� Static ���� �־����
	//int res = MyMath.abs(-100); Ŭ���� �̸� ���̰� ȣ�⸸ �ϸ��
		
	public static int abs (int n) {
	return n<0 ? -n : n;
	}
	
	//0���� ������ ���� �༭ ��ȯ�ϰ�
	// �ƴϸ� �׳� ������
	
	
	public static double abs (double n) {
	return n<0 ? -n : n; }
		
	public static int max(int a , int b) {
	return a>b ? a : b;	
	}
	
	public static int min(int a, int b) {
	return a<b ? a : b;	
	}
		//overload
	
	}


