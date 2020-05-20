package mymain.tcp.echo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyMain_EchoClient {

	public static void main(String[] args) throws Exception {
//		Socket client = new Socket("localhost", 8000);
		Socket client = new Socket("192.168.7.224", 8000);

		// 송신용 스트림 (전송)
		OutputStream os = client.getOutputStream();

		// 수신용 스트림 (받기)
		InputStream is = client.getInputStream();

		String message = "Hello Server ~ :) ";

		// 송신
		os.write(message.getBytes());

		// 수신
		byte[] read_buff = new byte[100];
		int len = is.read(read_buff);
		String read_data = new String(read_buff, 0, len);

		System.out.printf("return data : %s\n", read_data); 

	}

}
