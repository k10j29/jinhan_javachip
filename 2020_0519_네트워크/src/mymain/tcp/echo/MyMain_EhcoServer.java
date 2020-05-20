package mymain.tcp.echo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MyMain_EhcoServer {

	public static void main(String[] args) throws Exception {

		// 1. ���� ���� 8000��
		ServerSocket server = new ServerSocket(8000);
		System.out.println("--Server wait...");

		// 2. ���� ��� > �ڼ��� ���� > ���� ���ϰ� ���� (�ݺ� while)

		while (true) {
			Socket child = server.accept(); ////////////// �ڼ���

			// ���ſ� ��Ʈ�� ������

			InputStream is = child.getInputStream();

			// �۽ſ� ��Ʈ�� ������

			OutputStream os = child.getOutputStream();

			// ������ ���� (�����Ͱ� ���������� while �Ⱦ�)

			byte[] read_buff = new byte[100];
// 			len �� ���ŵ� ������ ũ�⸦ �̾߱���
			int len = is.read(read_buff);

//			���ŵ� ������ ����

			String read_data = new String(read_buff, 0, len); // �ڿ��� �߶������ ���� ũ�⸸ ;
			System.out.printf("���ŵ� ������ : %s (%d bytes)\n", read_data, len);

//			���� �����͸� ������ (�۽ſ� ��Ʈ�� ���)
			os.write(read_data.getBytes()); // ������

			// 2- ���� ���� ������
			InetAddress ia = child.getInetAddress(); // �ڼ��ϰ� ����� InetAddress .

			System.out.printf("[%s] (ip) �����û\n", ia.getHostAddress());
		}

	}

}
