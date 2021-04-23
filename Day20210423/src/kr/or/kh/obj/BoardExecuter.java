package kr.or.kh.obj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BoardExecuter {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
		System.out.println("=====게시판작성=====");
		System.out.println("R 등록, S 검색, D 삭제, U 수정, L 목록");
		String protocol = input.next();
		Connection conn=null;
	
		BoardFunction boardFunction = new BoardFunction();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","daegu","dkdlel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(protocol.equals("R")||protocol.equals("r")) {//등록
			boardFunction.register();
		}//등록
		else if(protocol.equals("S")||protocol.equals("s")) {//검색
			boardFunction.search();
			
		}//검색
		else if(protocol.equals("D")||protocol.equals("d")) {//삭제
			boardFunction.delete();
		}//삭제
		else if(protocol.equals("U")||protocol.equals("u")) {//수정
			String result=boardFunction.update();
			if(result.equals("continue")) {
				continue;
			}
		}//수정
		else if(protocol.equals("L")||protocol.equals("l")) {//목록
			boardFunction.list();
		}//목록
		
	  }//반복문
	}

}
