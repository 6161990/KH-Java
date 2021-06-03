package selftest.kh;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ChattingClient {

	public void chattingClient() {
		String serverIp="127.0.0.1";
		int serverPort =9999;  //1. 서버와 클라이언트의 포트번호가 맞지 않음
		Socket socket= null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try {
			socket = new Socket(serverIp, serverPort);
			InputStream in =socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);
			String serverMsg = dis.readUTF();
			System.out.println(serverMsg);
		}  catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
				dos.close();
				//4. server 코드 닫는 번호 누락
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	//1. 서버에서 설정하는 포트 번호를 9999로 변경하거나 클라이언트가 접속할 포트번호를 8888로 변경
	//4. 클라이언트의 finally 부분에 socket.close(); 추가 
}
