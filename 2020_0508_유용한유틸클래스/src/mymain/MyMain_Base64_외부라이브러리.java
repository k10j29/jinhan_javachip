package mymain;

import org.apache.commons.codec.binary.Base64;

public class MyMain_Base64_외부라이브러리 {

	public static void main(String[] args) {

		String pwd = "1234";
		byte[] encode = Base64.encodeBase64(pwd.getBytes());
		byte[] decode = Base64.decodeBase64(encode);

		String encode_str = new String(encode);
		String decode_str = new String(decode);

		System.out.println("인코딩 : " + encode_str);
		System.out.println("디코딩 : " + decode_str);
	}

}
