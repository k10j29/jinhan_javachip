package mymain;

import myutil.����л�;
import myutil.���л�;
import myutil.�ʵ��л�;
import myutil.�л�;

public class MyMain_�л� {

	static void ������(�л�[] s_array) {
		// ������ Polymorphism) 
		// �� ��ü�� ������ ����� ������ �� ��ü�� 
		// �ڽſ� �´� �ൿ�� ���� �����ϰԵ�
		
		
		//1 ÷�� ��ĵ� ����
		
		for (int i = 0; i < s_array.length; i++) {

			�л� student = s_array[i];
			student.�����Ѵ�();
		}
		
		//2. 16���� ����ȭ �������� 
		
		for (�л� student:s_array)
			student.�����Ѵ�();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	�л� [] s_array = { new �ʵ��л�(), 
						new ���л�(),
						new ����л�()};
		
	
	
	������ (s_array);

}
}
