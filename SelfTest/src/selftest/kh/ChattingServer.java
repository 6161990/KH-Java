package selftest.kh;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChattingServer {

	
	 public void chattingServer() {
		 int port = 8888;
		 ServerSocket serverSocket = null;
		 DataInputStream dis = null;
		 DataOutputStream dos = null;

		 while(true) {
		 try {
			
			 serverSocket = new ServerSocket(port);
			 Socket clientSocket = serverSocket.accept();
			 
			 //2. 서버에서 인풋, 아웃풋 스트림 객체를 생성할 때 Socket객체를 이용해서 생성해야하는데
			 //    바로 생성해서 오류
			 //3. while문이 없음. 클라이언트에서 서버 메시지를 받아서 출력하는 코드가 1번뿐이라서 시간정보를 받아서 출력할 수 없음
			 /*
			  * InputStream in = new InputStream();
			  * OutputStream out = new OutputStream();
			  */
			 InputStream in = clientSocket.getInputStream();
			 OutputStream out = clientSocket.getOutputStream();
			 dis = new DataInputStream(in);
			 dos = new DataOutputStream(out);
			 dos.writeUTF("[서버 연결 성공]");
			 Date date = new Date();
			 SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
			 String now = sdf.format(date);
			 dos.writeUTF("[현재시간]: "+now);
			 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
				dos.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	   }
	}
	
}
