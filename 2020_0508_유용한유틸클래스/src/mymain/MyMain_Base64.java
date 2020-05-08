package mymain;

import java.util.Base64;

public class MyMain_Base64 {

	public static void main(String[] args) {

		String pwd = "1234";
		System.out.println("원본 :" + pwd);
		// encoding (암호화)

		String encode_pwd = Base64.getEncoder().encodeToString(pwd.getBytes());

		System.out.println("인코딩된값: " + encode_pwd);

		// decode (복호화, 복원)

		byte[] decode_pwd = Base64.getDecoder().decode(encode_pwd.getBytes());

		// byte [] 배열을 다시 String 객체로 생성

		String decode_str_pwd = new String(decode_pwd);

		System.out.println("디코딩된값: " + decode_str_pwd);

	}

}
