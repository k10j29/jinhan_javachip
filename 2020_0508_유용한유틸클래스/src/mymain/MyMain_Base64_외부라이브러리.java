package mymain;

import org.apache.commons.codec.binary.Base64;

public class MyMain_Base64_�ܺζ��̺귯�� {

	public static void main(String[] args) {

		String pwd = "1234";
		byte[] encode = Base64.encodeBase64(pwd.getBytes());
		byte[] decode = Base64.decodeBase64(encode);

		String encode_str = new String(encode);
		String decode_str = new String(decode);

		System.out.println("���ڵ� : " + encode_str);
		System.out.println("���ڵ� : " + decode_str);
	}

}
