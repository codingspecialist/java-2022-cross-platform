package sock.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClientSocket {
	
	Socket socket;
	
	public void init() {
		try {
			socket = new Socket("localhost", 10000);

			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(socket.getOutputStream())
			);
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in)
			);
			
			while(true) {
				String keyboardMsg = br.readLine();
				bw.write(keyboardMsg+"\n");
				bw.flush();
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MyClientSocket ms = new MyClientSocket();
		ms.init();
	}

}
