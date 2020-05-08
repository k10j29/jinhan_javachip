package mymain;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MyMain_Properties {

	public static void main(String[] args) {

		Properties prop = new Properties();

		FileReader fr = null;

		try {
			// 파일 읽어들임
			fr = new FileReader("db.properties");
			prop.load(fr);

			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String user = prop.getProperty("user");
			String pwd = prop.getProperty("pwd");

			System.out.println(driver);
			System.out.println(url);
			System.out.println(user);
			System.out.println(pwd);

			System.out.println("key name 모를경우");
			// 만약 저장된 key 의 이름을 모를경우?

			Enumeration<String> keys = (Enumeration<String>) prop.propertyNames();

			while (keys.hasMoreElements()) {
				String key = keys.nextElement();
				String value = prop.getProperty(key);
				System.out.println(key + " " + value);

			}
		} catch (Exception e) { // 모두 예외처리
			e.printStackTrace();

			// user = scott
			// pwd = 1234
			// myname = KIM_JIN_HAN

		}
	}
}
