package mymain;

import java.util.Base64;

public class MyMain_Base64 {

	public static void main(String[] args) {

		String pwd = "1234";
		System.out.println("���� :" + pwd);
		// encoding (��ȣȭ)

		String encode_pwd = Base64.getEncoder().encodeToString(pwd.getBytes());

		System.out.println("���ڵ��Ȱ�: " + encode_pwd);

		// decode (��ȣȭ, ����)

		byte[] decode_pwd = Base64.getDecoder().decode(encode_pwd.getBytes());

		// byte [] �迭�� �ٽ� String ��ü�� ����

		String decode_str_pwd = new String(decode_pwd);

		System.out.println("���ڵ��Ȱ�: " + decode_str_pwd);

	}

}
