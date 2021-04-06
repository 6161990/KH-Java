package kr.or.kh.obj3;

import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		int var_byte = 'q';
		System.out.println("문자 하나를 입력하세용");
		do {
			try {
				var_byte = System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(var_byte==10 ||var_byte==13) continue; //아스키코드로 enter값
			if(var_byte == 'q') break;
			System.out.println("읽은 값: "+ (char)var_byte);
		} while(true);
	}

}
