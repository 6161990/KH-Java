package kr.or.kh.obj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BoardExecuter {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Register registerObj = new Register();
		Search searchObj = new Search();
		Delete deleteObj = new Delete();
		Update updateObj = new Update();
		List listObj = new List();
		
		while(true) {
		System.out.println("=====게시판작성=====");
		System.out.println("R 등록, S 검색, D 삭제, U 수정, L 목록");
		String protocol = input.next();
		Connection conn=null;

		if(protocol.equals("R")||protocol.equals("r")) {//등록
			registerObj.register();
		}//등록
		else if(protocol.equals("S")||protocol.equals("s")) {//검색
			searchObj.search();
			
		}//검색
		else if(protocol.equals("D")||protocol.equals("d")) {//삭제
			deleteObj.delete();
		}//삭제
		else if(protocol.equals("U")||protocol.equals("u")) {//수정
			String result=updateObj.update();
			if(result.equals("continue")) {
				continue;
			}
		}//수정
		else if(protocol.equals("L")||protocol.equals("l")) {//목록
			listObj.list();
		}//목록
		
	  }//반복문
	}

}
