package sock.ex02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSocket {
	
	ServerSocket serverSocket;
	
	public void init() {
		System.out.println("서버 시작-----------");
		try {
			
			serverSocket = new ServerSocket(10000); // 0~ 65535 이 중에서 0 ~ 1023 well known port
			Socket socket = 	 serverSocket.accept(); // while 돌면서 리스닝하고 있음.
			System.out.println("클라이언트 연결됨......");
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(socket.getInputStream())
			);
			
			while(true) {
				String msg = br.readLine();
				System.out.println("받은 메시지 : "+msg);
				
				if(msg.equals("싸이코::bye")) {
					break;
				}
			}
			System.out.println("서버 종료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		MyServerSocket ms = new MyServerSocket();
		ms.init();
	}
}
