package mymain.tcp.echo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MyMain_EhcoServer {

	public static void main(String[] args) throws Exception {

		// 1. 서버 생성 8000번
		ServerSocket server = new ServerSocket(8000);
		System.out.println("--Server wait...");

		// 2. 접속 대기 > 자소켓 생성 > 상대방 소켓과 연결 (반복 while)

		while (true) {
			Socket child = server.accept(); ////////////// 자소켓

			// 수신용 스트림 얻어오기

			InputStream is = child.getInputStream();

			// 송신용 스트림 얻어오기

			OutputStream os = child.getOutputStream();

			// 데이터 수신 (데이터가 많지않으니 while 안씀)

			byte[] read_buff = new byte[100];
// 			len 은 수신된 데이터 크기를 이야기함
			int len = is.read(read_buff);

//			수신된 데이터 찍어보기

			String read_data = new String(read_buff, 0, len); // 뒤에는 잘라버리고 받은 크기만 ;
			System.out.printf("수신된 데이터 : %s (%d bytes)\n", read_data, len);

//			수신 데이터를 재전송 (송신용 스트림 사용)
			os.write(read_data.getBytes()); // 재전송

			// 2- 상대방 정보 얻어오기
			InetAddress ia = child.getInetAddress(); // 자소켓과 연결된 InetAddress .

			System.out.printf("[%s] (ip) 연결요청\n", ia.getHostAddress());
		}

	}

}
