package mymain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMain_����ó����� {

	public static void main(String[] args) {

		int a = 10, b = 1, res;
		String str = "123";

		try {
//���ڵ�
			// JVM �� ���ܳ����� �����ش�.

			// ������������ if �� ��� �����ʾƵ��ȴ�, Ȯ�ο뵵
			if (b == 0)
				throw new ArithmeticException("0���� ������ ����");

			res = a / b; // ���� �Ͼ ������ catch �� ����

			// ������������ if �� ��� �����ʾƵ��ȴ�, Ȯ�ο뵵
			if (str == null)
				throw new NullPointerException("str is null");

			int len = str.length(); // 12������ ������ �߻��ϸ� �� ���� ���� �ȵ�

			// ���Խ�

			Pattern pattern = Pattern.compile("[0-9]+");

			Matcher match = pattern.matcher(str);

			if (match.matches() == false) // ���� ���ϰ� ��ġ �ϴ��� Ȯ��
				throw new NumberFormatException("������ ���ڰ� �ƴ�");

			int su = Integer.parseInt(str);

			System.out.println("-3���� ���-");

			Thread.sleep(3000);

			System.out.println("-�� �� ó �� �� ��-");

			// �� 3���� ����ó�� ���������� �Ϸ�
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());

		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());

		} catch (Exception e) { // Exception e = new.InterruptedException();

			System.out.println("��Ÿ : " + e.getMessage());
		}

	}

}
