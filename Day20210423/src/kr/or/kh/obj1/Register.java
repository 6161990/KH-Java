package kr.or.kh.obj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Register {
	private String titleContent;
	private String author;
	private String nal;
	private String readcount;
	private Statement stmt;
	private String sql;
	private String content;
	private String title;
	private int indexI;
	private int cnt;
	
	public static Scanner input;
	public static Connection conn;
	static { //static 변수를 초기화하는 정적함수(클래스함수)
		input = new Scanner(System.in);
		
	}
	public Register() { //인스턴스 변수를 초기화하는 생성자 함수
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void setTitleContent() {
		System.out.println("제목|내용입력:");
		titleContent = input.next();
		setTitleContent(titleContent);
	}
	public void setTitleContent(String titleContent) {
		indexI = titleContent.indexOf("|");
		title = titleContent.substring(0,indexI);
		content = titleContent.substring(indexI+1);
	}
	public void setAuthor() {
		System.out.println("작성자 : ");
		author=input.next();
	}
	public void setNal() {
		System.out.println("날짜 : ");
		nal = input.next();
	}
	public void setReadCount() {
		System.out.println("조회수 : ");
		readcount = input.next();	
	}
	
	public static Connection getConnection () throws SQLException {
		conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","daegu","dkdlel");
		return conn;
	}
	public void getReadyConnectionRegister() throws SQLException {
		stmt = conn.createStatement();
		sql ="insert into board (no,title,content,author,nal,readcount) values(board_seq.nextval,'"+title+"','"+content+"','"+author+"','"+nal+"','"+readcount+"')";
	}
	public void registerDisplay(int cnt) {
		if(cnt==1) {
			System.out.println("게시글이 등록되었습니다.");
		}else {
			System.out.println("게시글 등록을 실패했습니다.");
		}
	}
	public void close() throws SQLException {
		if(conn != null) {conn.close();}
		if(stmt != null) {stmt.close();}
	}
	public void register() {
		setTitleContent();
		setAuthor();
		setNal();
		setReadCount();
		
		try {
			conn=getConnection();
			getReadyConnectionRegister();
			cnt=stmt.executeUpdate(sql);
			registerDisplay(cnt);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	}
	
	
	
}
