package myutil;

import java.util.BitSet;

// MyInfo ���� MyDate�� �ܺ�
public class MyInfo {


	String name;
	MyDate birthday = new MyDate();
	
	private void setBirthday(int y, int m, int d, int w) {
		
		//private�� �ܺο��� ���� �Ұ���
		
		//birthday.year = y;
		//���� Package ���� ��ü���� (private ���� )�� ȣ�Ⱑ��
		//���� �����̴��� �����̴���
		
		birthday.month = m; //protected
		birthday.day = d;   //public
		birthday.week_day = w; //default
	}


}
