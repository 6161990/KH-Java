package kr.or.kh2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest1 {

	public static void main(String[] args) {
		User beforeUser = new User("aaa","15486","삼천동",27,"윤디짱");
		User afterUser = null;
		FileOutputStream fileos = null;
		ObjectOutputStream objectos = null;
		FileInputStream fileis = null;
		ObjectInputStream objectis = null;
	
		try {
			fileos = new FileOutputStream("c:\\kh\\userInfo.ser"); //이 파일이 객체로 들어간다
			objectos = new ObjectOutputStream(fileos);
			objectos.writeObject(beforeUser);
			
			
			fileis = new FileInputStream("c:\\kh\\userInfo.ser");
			objectis = new ObjectInputStream(fileis);
			afterUser = (User)objectis.readObject();
			System.out.println(afterUser);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileos.close();
				objectos.close();
				fileis.close();
				objectis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
