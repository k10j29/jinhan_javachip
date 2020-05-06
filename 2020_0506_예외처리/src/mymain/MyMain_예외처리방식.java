package mymain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMain_예외처리방식 {

	public static void main(String[] args) {

		int a = 10, b = 1, res;
		String str = "123";

		try {
//본코드
			// JVM 이 예외내용을 던져준다.

			// 실제문에서는 if 문 사용 하지않아도된다, 확인용도
			if (b == 0)
				throw new ArithmeticException("0으로 나누지 못함");

			res = a / b; // 에서 일어난 문제를 catch 로 전달

			// 실제문에서는 if 문 사용 하지않아도된다, 확인용도
			if (str == null)
				throw new NullPointerException("str is null");

			int len = str.length(); // 12문에서 문제가 발생하면 이 문은 실행 안됨

			// 정규식

			Pattern pattern = Pattern.compile("[0-9]+");

			Matcher match = pattern.matcher(str);

			if (match.matches() == false) // 위의 패턴과 일치 하는지 확인
				throw new NumberFormatException("숫자형 문자가 아님");

			int su = Integer.parseInt(str);

			System.out.println("-3초후 출력-");

			Thread.sleep(3000);

			System.out.println("-정 상 처 리 완 료-");

			// 위 3가지 예외처리 정상적으로 완료
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());

		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());

		} catch (Exception e) { // Exception e = new.InterruptedException();

			System.out.println("기타 : " + e.getMessage());
		}

	}

}
