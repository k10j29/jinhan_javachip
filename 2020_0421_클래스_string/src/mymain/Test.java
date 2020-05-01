// 문자열 슬라이싱 테스트 자료임

package mymain;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자 01234567890123 << index (첨자)
		String jumin_no = "801212-1234567";

		// 1. 두개이상의 문자 잘라서 가지고 올때

		// substring

		// 숫자 잘라내기 자리수 0에서 2까지 문자열 슬레쉬
		// 년
		String strYear = jumin_no.substring(0, 0 + 2);

		// 계절 (월)
		String strSeason = jumin_no.substring(2, 2 + 2);

		// 출생년도 (성별자리)
		String strLocal = jumin_no.substring(8, 8 + 2);

		// 성별 코드 구하기
		// 2. 문자열중에서 문자 한개 추출할때

		char gender = jumin_no.charAt(7);

		// 3. 문자열을 정수로 변환하는 함수 integer.parseint("80");

		int year = Integer.parseInt(strYear); // "80" > 80

		System.out.println(strYear);
		System.out.println(strSeason);
		System.out.println(strLocal);
		System.out.println(gender);
	}

}
