package mymain_ex;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class serve_ex {

	public static void main(String[] args) {

		ServerSocket serverSocket = null; // null �� �ʱ�ȭ

		try {

			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 80));

			while (true) {
				System.out.println("��������");
				Socket socket = serverSocket.accept();
// ���� ��û ���� (Ŭ���̾�Ʈ ���� ��û)----------------------------------------------

// ������ �õ��� Ŭ���̾�Ʈ �ּҸ� �˾Ƴ��� --------------------------------------				
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("���Ἲ��" + isa.getHostName());

				byte[] bytes = null;
				String message = null;

				InputStream is = socket.getInputStream();
				bytes = new byte[100]; // byte �迭 �ʱ�ȭ
				int readByteCount = is.read(bytes); // byte �迭 �־��ֱ�
				message = new String(bytes, 0, readByteCount, "UTF-8"); // �� �޾ƿ���
				System.out.println("[������ �ޱ� ����]" + message); // �ޱ� ��û��

				OutputStream os = socket.getOutputStream();
				message = " Hello Client";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("[�����ͺ����� ����]");

				is.close();
				os.close();
				socket.close();

			}

		} catch (IOException e){
			
		} finally {

			if (!serverSocket.isClosed()) {
	
					try {
						serverSocket.close();
					} catch (IOException e) {
						
					}
			}
		}
		
	}
}