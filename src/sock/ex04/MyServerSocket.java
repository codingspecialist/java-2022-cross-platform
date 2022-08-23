package sock.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSocket {
	
	ServerSocket serverSocket;
	BufferedReader br, keyboard;
	BufferedWriter bw;
	
	class ReadThread implements Runnable{

		@Override
		public void run() {
			try {
				while(true) {
					String msg = br.readLine();
					System.out.println("받은 메시지 : "+msg);
					
					if(msg.equals("싸이코::bye")) {
						break;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void init() {
		System.out.println("서버 시작-----------");
		try {
			
			serverSocket = new ServerSocket(10000); // 0~ 65535 이 중에서 0 ~ 1023 well known port
			Socket socket = 	serverSocket.accept(); // while 돌면서 리스닝하고 있음.
			System.out.println("클라이언트 연결됨......");
			System.out.println(socket.getLocalSocketAddress());
			System.out.println(socket.getRemoteSocketAddress());
			System.out.println(socket.getLocalAddress());
			System.out.println(socket.getInetAddress());
			
			br = new BufferedReader(
					new InputStreamReader(socket.getInputStream())
			);
			
			bw = new BufferedWriter(
					new OutputStreamWriter(socket.getOutputStream()));
			
			keyboard = new BufferedReader(
					new InputStreamReader(System.in)); 
			
			// 새로운 스레드는 메시지를 읽기만 한다.
			Thread t1 = new Thread(new ReadThread());
			t1.start();
			
			// 메인 스레드는 메시지를 전송만 한다.
			while(true) {
				String keyboardMsg = keyboard.readLine();
				bw.write(keyboardMsg+"\n");
				bw.flush();
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		MyServerSocket ms = new MyServerSocket();
		ms.init();
	}
}
