package mymain;

import java.util.StringTokenizer;

public class MyMain_stringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� �и� �ϱ�
		String sido_list = "���� ��� ��õ ���� �뱸 ���� �λ� ���";

		// ��ū = ���� ��� ��õ ��

		// �����ϸ� �и����� ���� (delim) �� ���� ����
		StringTokenizer st = new StringTokenizer(sido_list);
		// StringTokenizer st1 = new StringTokenizer(sido_list, "");

		// has �������ֳ� ��ũ��
		while (st.hasMoreTokens()) {

			// token �������� �������� �̵�
			String token = st.nextToken();
			System.out.println(token);
		}
		
		
	}

}
