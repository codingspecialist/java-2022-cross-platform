package sock.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import com.google.gson.Gson;

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
				MyDto dto = new MyDto(1, "성공", keyboardMsg);
				
				Gson gson = new Gson();
				String sendData = gson.toJson(dto);
				
				bw.write(sendData+"\n");
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
