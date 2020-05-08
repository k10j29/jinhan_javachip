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
			// ���� �о����
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

			System.out.println("key name �𸦰��");
			// ���� ����� key �� �̸��� �𸦰��?

			Enumeration<String> keys = (Enumeration<String>) prop.propertyNames();

			while (keys.hasMoreElements()) {
				String key = keys.nextElement();
				String value = prop.getProperty(key);
				System.out.println(key + " " + value);

			}
		} catch (Exception e) { // ��� ����ó��
			e.printStackTrace();

			// user = scott
			// pwd = 1234
			// myname = KIM_JIN_HAN

		}
	}
}
