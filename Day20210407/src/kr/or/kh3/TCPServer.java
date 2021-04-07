package kr.or.kh3;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer extends Thread { //통신을 하려면 멀티 처리가 되어야하므로 
	private InputStream is;
	private OutputStream os;
	private ServerSocket serverSocket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private Socket socket;
	
	@Override
	public void run() {
		try {
			serverSocket = new ServerSocket(5000); //1~1000까지는 예약포트라서 피하고 10000이하의 아무 포트나 골라쓰면 된다.
			while(true) {
				System.out.println("요청 대기 : "); //서버는 항상 대기 접속이 될 때 그것을 받아주고 서비스 제공(정보 제공), 웹 브라우저로 날라온다.
				socket = serverSocket.accept(); // accept : 접속하겠다. 
				System.out.println("접속한 클라이언트 : "+ socket.getInetAddress());
				is = socket.getInputStream();
				os = socket.getOutputStream();
				ois = new ObjectInputStream(is);
				oos = new ObjectOutputStream(os);
				String msg = (String) ois.readObject();
				System.out.println("클라이언트에서 보낸 메세지 : "+msg);
				String retMsg = "서버로부터 되돌아온 메세지 : " + msg;
				oos.writeObject(retMsg);
				socket.close();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) {
		new TCPServer().start();
	}

}
