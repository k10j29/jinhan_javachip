//��� �Ǿ����� ��ü ��

//Singleton

package myutil; 

public class My_Singleton {

	
	//Design Pattern : �����ڵ��� �����ߴ� ������ ������� �����س���
	//					���� �����
	
	//class���� ��ü�� ������ ��Ÿ��
	//��ü 1���� ��Ÿ���� ��������  
	static My_Singleton single = null;
	
	public static My_Singleton getinstance() {
		
		if (single == null) single = new My_Singleton();
		
		return single;
	}
	
	public void sayHello() {
		System.out.println("==�ȳ�==");
	}
	
	private My_Singleton() {
		System.out.println("--My_Singleton()--");
		
	}
	

	

}
