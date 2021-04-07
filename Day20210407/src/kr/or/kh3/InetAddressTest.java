package kr.or.kh3;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {
		InetAddress ia = null;
		try {
			ia = InetAddress.getLocalHost(); //DESKTOP-4730154/192.168.0.101
			System.out.println(ia);
			
			ia = InetAddress.getByName("www.google.or.kr");  //DNS
			System.out.println(ia); //www.google.or.kr
			
			InetAddress[] aia = InetAddress.getAllByName("www.google.or.kr"); //IP //도메인을 IP로 바꿔줌
			for(int i = 1; i<aia.length; i++) { 
				System.out.println(aia[i]); //221.143.20.101
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
