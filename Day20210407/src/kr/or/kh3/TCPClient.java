package kr.or.kh3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	private InputStream is;
	private OutputStream os;
	private Socket socket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	public BufferedReader input;
	private String rMsg;
	
	public void start() {
		try {
			socket = new Socket("125.178.1.44", 5000); //5000포트로 들우가
			sendMessage(socket);
			receiveMessage(socket);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void receiveMessage(Socket socket) {
		try {
			is = socket.getInputStream();
			ois = new ObjectInputStream(is);
			rMsg =(String) ois.readObject();
			System.out.println(rMsg);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void sendMessage(Socket socket) {
		try {
			os = socket.getOutputStream();
			oos = new ObjectOutputStream(os);
			input = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("보낼 메세지");
			String sMsg = input.readLine(); //버퍼드 리더가 지원하는 메소드 리드 라인
			oos.writeObject(sMsg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		TCPClient tcp = new TCPClient();
		tcp.start();
	}
}
