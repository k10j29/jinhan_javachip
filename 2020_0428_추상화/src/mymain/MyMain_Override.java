package mymain; // ����°�� �ۼ�

import myutil.Child;
import myutil.Parent;

public class MyMain_Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. up ĳ���� ��ü�� �������� ����Ÿ���� ���� (���� 13)
		Parent p = new Child();
		p.sub(); // Parent �� sub �� call �Ѱ� >>>> ����� Child.sub �� ȣ��� (�������̱� ������)
		// �Ǹ������� �����ǵ� �޼ҵ带 ȣ���ϰԵǾ�����

	}

}
