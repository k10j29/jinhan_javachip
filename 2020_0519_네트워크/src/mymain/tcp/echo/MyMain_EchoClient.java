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

		// �۽ſ� ��Ʈ�� (����)
		OutputStream os = client.getOutputStream();

		// ���ſ� ��Ʈ�� (�ޱ�)
		InputStream is = client.getInputStream();

		String message = "Hello Server ~ :) ";

		// �۽�
		os.write(message.getBytes());

		// ����
		byte[] read_buff = new byte[100];
		int len = is.read(read_buff);
		String read_data = new String(read_buff, 0, len);

		System.out.printf("return data : %s\n", read_data); 

	}

}
