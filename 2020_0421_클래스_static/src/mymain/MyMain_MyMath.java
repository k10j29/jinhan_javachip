package mymain;

import myutil.MyMath;

public class MyMain_MyMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static methhod ǥ����� (��ü����)
		//1. ��ü ���������� Ŭ����, �޼ҵ��()
		//2 .��ü ���� �Ŀ���  : ��ü���� ����() ȣ�� <<������ ������
		
		int x = 10, y = 5 ,res;
		
		res=MyMath.max(x,y);
	
		System.out.printf("%d�� %d�� ū���� %d\n", x , y ,res);
	
		
		//���� API
		
		res = Math.min(x, y);
		
		System.out.printf("%d�� %d�� �������� %d\n" ,x,y,res);
		
	//Math m = new Math();
		
		//���ڸ� >>> ���ڿ��� 157p
		
		String s = new String();
		String str = String.valueOf(x);
	}

}
