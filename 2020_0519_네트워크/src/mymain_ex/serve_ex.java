package mymain_ex;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class serve_ex {

	public static void main(String[] args) {

		ServerSocket serverSocket = null; // null 로 초기화

		try {

			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 80));

			while (true) {
				System.out.println("연결대기중");
				Socket socket = serverSocket.accept();
// 연결 요청 받음 (클라이언트 연결 요청)----------------------------------------------

// 연결을 시도한 클라이언트 주소를 알아낸다 --------------------------------------				
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("연결성공" + isa.getHostName());

				byte[] bytes = null;
				String message = null;

				InputStream is = socket.getInputStream();
				bytes = new byte[100]; // byte 배열 초기화
				int readByteCount = is.read(bytes); // byte 배열 넣어주기
				message = new String(bytes, 0, readByteCount, "UTF-8"); // 값 받아오기
				System.out.println("[데이터 받기 성공]" + message); // 받기 요청중

				OutputStream os = socket.getOutputStream();
				message = " Hello Client";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("[데이터보내기 성공]");

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