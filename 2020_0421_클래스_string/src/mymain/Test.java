// ���ڿ� �����̽� �׽�Ʈ �ڷ���

package mymain;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� 01234567890123 << index (÷��)
		String jumin_no = "801212-1234567";

		// 1. �ΰ��̻��� ���� �߶� ������ �ö�

		// substring

		// ���� �߶󳻱� �ڸ��� 0���� 2���� ���ڿ� ������
		// ��
		String strYear = jumin_no.substring(0, 0 + 2);

		// ���� (��)
		String strSeason = jumin_no.substring(2, 2 + 2);

		// ����⵵ (�����ڸ�)
		String strLocal = jumin_no.substring(8, 8 + 2);

		// ���� �ڵ� ���ϱ�
		// 2. ���ڿ��߿��� ���� �Ѱ� �����Ҷ�

		char gender = jumin_no.charAt(7);

		// 3. ���ڿ��� ������ ��ȯ�ϴ� �Լ� integer.parseint("80");

		int year = Integer.parseInt(strYear); // "80" > 80

		System.out.println(strYear);
		System.out.println(strSeason);
		System.out.println(strLocal);
		System.out.println(gender);
	}

}
