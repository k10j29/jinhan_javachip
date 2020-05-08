package vo;

import java.util.Comparator;

public class PersonComp implements Comparator<PersonVo> {// 정렬 기준 객체

	// 상수만들기 > 정렬대상에 대한 상수 (값이 서로 달라야함)

	public static final int SOTR_FIELD_NAME = 1;
	public static final int SOTR_FIELD_AGE = 2;
	public static final int SOTR_FIELD_ADDR = 3;
	public static final int SOTR_FIELD_TELL = 4;

	// 정렬기준 필드/방식을 저장할변수
	int sort_field = SOTR_FIELD_NAME;

	public static final int SORT_METHOD_ASC = 1; // (오름차순)
	public static final int SORT_METHOD_DESC = 2; // (내림차순)

	// getter ,setter 만들기 (접근할수있도록)

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

	// 정렬기준 필드/방식을 저장할변수
	int sort_method = SORT_METHOD_ASC;

	@Override
	public int compare(PersonVo o1, PersonVo o2) {
		int res = 0;

		// 이름 정렬 과 나이 정렬
		if (sort_field == SOTR_FIELD_NAME) { // 이름정렬

			if (o1.getName().compareTo(o2.getName()) > 0)
				res = 1;
			else if (o1.getName().compareTo(o2.getName()) < 0)
				res = -1;
		} else if (sort_field == SOTR_FIELD_AGE) { // 나이 정렬

			if (o1.getAge() > o2.getAge())
				res = 1;
			else if (o1.getAge() < o2.getAge())
				res = -1;

		} else if (sort_field == SOTR_FIELD_ADDR) { // 주소정렬
			if (o1.getAddr().compareTo(o2.getAddr()) > 0)
				res = 1;
			else if (o1.getAddr().compareTo(o2.getAddr()) < 0)
				res = -1;
		} else if (sort_field == SOTR_FIELD_TELL) { // 번호정렬
			if (o1.getTell().compareTo(o2.getTell()) > 0)
				res = 1;
			else if (o1.getTell().compareTo(o2.getTell()) < 0)
				res = -1;
		}

		if (sort_method == SORT_METHOD_DESC)
			res = -res;

		// 내림차순이면? //res = -res;

		// 주소 정렬
		/*
		 * if (o1.getaddr().compareTo(o2.getaddr()) > 0) res = 1; else if
		 * (o1.getaddr().compareTo(o2.getaddr()) < 0) res = -1;
		 * 
		 * // 내림차순이면? //res = -res;
		 */

		return res;
	}

}
