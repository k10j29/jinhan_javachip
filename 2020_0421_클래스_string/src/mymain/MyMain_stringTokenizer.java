package mymain;

import java.util.StringTokenizer;

public class MyMain_stringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 글자 분리 하기
		String sido_list = "서울 경기 인천 대전 대구 광주 부산 찍고";

		// 토큰 = 서울 경기 인천 등

		// 생략하면 분리기준 문자 (delim) 는 공백 엔터
		StringTokenizer st = new StringTokenizer(sido_list);
		// StringTokenizer st1 = new StringTokenizer(sido_list, "");

		// has 가지고있냐 토크을
		while (st.hasMoreTokens()) {

			// token 가져오고 다음으로 이동
			String token = st.nextToken();
			System.out.println(token);
		}
		
		
	}

}
