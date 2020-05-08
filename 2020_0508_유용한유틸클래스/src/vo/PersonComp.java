package vo;

import java.util.Comparator;

public class PersonComp implements Comparator<PersonVo> {// ���� ���� ��ü

	// �������� > ���Ĵ�� ���� ��� (���� ���� �޶����)

	public static final int SOTR_FIELD_NAME = 1;
	public static final int SOTR_FIELD_AGE = 2;
	public static final int SOTR_FIELD_ADDR = 3;
	public static final int SOTR_FIELD_TELL = 4;

	// ���ı��� �ʵ�/����� �����Һ���
	int sort_field = SOTR_FIELD_NAME;

	public static final int SORT_METHOD_ASC = 1; // (��������)
	public static final int SORT_METHOD_DESC = 2; // (��������)

	// getter ,setter ����� (�����Ҽ��ֵ���)

	public int getSort_field() {
		return sort_field;
	}

	public void setSort_field(int sort_field) {
		this.sort_field = sort_field;
	}

	public int getSort_method() {
		return sort_method;
	}

	public void setSort_method(int sort_method) {
		this.sort_method = sort_method;
	}

	// ���ı��� �ʵ�/����� �����Һ���
	int sort_method = SORT_METHOD_ASC;

	@Override
	public int compare(PersonVo o1, PersonVo o2) {
		int res = 0;

		// �̸� ���� �� ���� ����
		if (sort_field == SOTR_FIELD_NAME) { // �̸�����

			if (o1.getName().compareTo(o2.getName()) > 0)
				res = 1;
			else if (o1.getName().compareTo(o2.getName()) < 0)
				res = -1;
		} else if (sort_field == SOTR_FIELD_AGE) { // ���� ����

			if (o1.getAge() > o2.getAge())
				res = 1;
			else if (o1.getAge() < o2.getAge())
				res = -1;

		} else if (sort_field == SOTR_FIELD_ADDR) { // �ּ�����
			if (o1.getAddr().compareTo(o2.getAddr()) > 0)
				res = 1;
			else if (o1.getAddr().compareTo(o2.getAddr()) < 0)
				res = -1;
		} else if (sort_field == SOTR_FIELD_TELL) { // ��ȣ����
			if (o1.getTell().compareTo(o2.getTell()) > 0)
				res = 1;
			else if (o1.getTell().compareTo(o2.getTell()) < 0)
				res = -1;
		}

		if (sort_method == SORT_METHOD_DESC)
			res = -res;

		// ���������̸�? //res = -res;

		// �ּ� ����
		/*
		 * if (o1.getaddr().compareTo(o2.getaddr()) > 0) res = 1; else if
		 * (o1.getaddr().compareTo(o2.getaddr()) < 0) res = -1;
		 * 
		 * // ���������̸�? //res = -res;
		 */

		return res;
	}

}
