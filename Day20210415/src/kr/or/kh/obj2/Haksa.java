package kr.or.kh.obj2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Scanner;


public class Haksa {
	protected int no;
	protected int cnt;
	protected String age;
	protected String name;
	protected String studentNum;
	protected String subject;
	protected String part;
	protected String object;
	protected String commit;
	protected Statement stmt;
	protected String sql;
	protected ResultSet rs;
	
	public static Scanner input;
	public static Connection conn;
	static {
		input = new Scanner(System.in);
	}
	
	public Haksa() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf8","root", "");
		return conn;
	}

	//학생
	public void displayAll(String str,int cnt) {
		if(str.equals("학생")) {
			System.out.println("전학생으로 등록되었습니다.");
			if(cnt==0) {
				System.out.println("학생등록이 실패되었습니다.");
			}
		}else if(str.equals("교수")) {
			System.out.println("교수로 등록되었습니다.");
			if(cnt==0) {
				System.out.println("교수등록이 실패되었습니다.");
			}
		}else if(str.equals("관리자")) {
			System.out.println("관리자로 등록되었습니다.");
			if(cnt==0) {
				System.out.println("관리자등록이 실패되었습니다.");
			}
		}
	}//학생
	
	
	//검색
	public void close() throws SQLException {
		stmt.close();
		conn.close();
		rs.close();
	}
	
	//삭제
	public void studentDisplay() {
		if(cnt == 1) {
			System.out.println(cnt+"건의 학생 정보가 삭제되었습니다.");
		}else {
			System.out.println("정보를 삭제하지 못했습니다.");
		}
	}
	public void professorDisplay() {
		if(cnt == 1) {
			System.out.println(cnt+"건의 교수정보가 삭제되었습니다.");
		}else {
			System.out.println("정보를 삭제하지 못했습니다.");
		}
	}
	public void manageDisplay() {
		if(cnt == 1) {
			System.out.println(cnt+"건의 관리자 정보가 삭제되었습니다.");
		}else {
			System.out.println("정보를 삭제하지 못했습니다.");
		}
	}


}
