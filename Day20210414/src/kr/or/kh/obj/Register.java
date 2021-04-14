package kr.or.kh.obj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Register {
	private static int cnt;
	private static Connection conn;
	private  Statement stmt;
	private String age;
	private String name;
	private String studentNum;
	private String subject;
	private String part;
	private String sql;
	public static Scanner input;

	public Register() { //객체가 생성될 때 로드 되어야하니까. 
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	static {
		input = new Scanner(System.in);
	}
	public static Connection getConnection() throws SQLException {
		conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf8","root", "");
		return conn;
	}
	public void setStudentSql() throws SQLException {
		sql = "insert into student(age,name,studentNum) values('"+age+"', '"+name+"','"+studentNum+"')";
		stmt = conn.createStatement();
	}
	public void setProfessorSql() throws SQLException {
		sql="insert into professor(age,name,subject) values ('"+ age +"', '"+ name +"', '"+ subject +"')";
		stmt = conn.createStatement();
	}
	public void setManageSql() throws SQLException {
		sql="insert into manage(age,name,part) values ('"+ age +"', '"+ name +"', '"+ part +"')";
		stmt = conn.createStatement();
	}
	
	public int studentExecute() throws SQLException {
		cnt = stmt.executeUpdate(sql);
		return cnt;
	}
	public int professorExecute() throws SQLException {
		cnt = stmt.executeUpdate(sql);
		return cnt;
	}
	public int manageExecute() throws SQLException {
		cnt = stmt.executeUpdate(sql);
		return cnt;
	}
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
	}
	public void setAgeName() {
		System.out.println("나이 : ");
    	age = input.next();
    	if(age==null || age=="") {
			System.out.println("에러");
		}
    	System.out.println("이름 : ");
    	name = input.next();
    	if(name==null || name=="") {
			System.out.println("에러");
		}
	}
	public void setStudentNum() {
		System.out.println("학번 : ");
    	studentNum = input.next();
    	if(studentNum==null || studentNum=="") {
			System.out.println("에러");
		}
	}
	public void setSubject() {
		System.out.println("담당과목 : ");
    	subject = input.next();
    	if(subject==null || subject=="") {
			System.out.println("에러");
		}
	}
	public void setPart() {
		System.out.println("담당부서 : ");
    	part = input.next();
    	if(part==null || part=="") {
			System.out.println("에러");
		}
	}
	public void close() throws SQLException {
		if(conn != null) {conn.close();}
		if(stmt != null) {stmt.close();}
	}
	public void register() {
		 System.out.println("등록");
		 System.out.println("=======메뉴 선택======");
		    System.out.println("1.학생");
		    System.out.println("2.교수");
		    System.out.println("3.관리자");
		    System.out.println("4.이전메뉴");
		    System.out.println("번호를 선택해 주세요..");
		    cnt = input.nextInt();
		    if(cnt < 0 || cnt > 4) {
				System.out.println("에러");
			}
		    if(cnt == 1) {//학생등록
		    	setAgeName();
		    	setStudentNum();
		    	try {
					conn=getConnection();
					setStudentSql();
					cnt=studentExecute();	
					displayAll("학생",cnt);
					close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		    	

		    }//학생등록
		    else if(cnt==2) {//교수등록
		    	setAgeName();
		    	setSubject();
		    	try {
					conn=getConnection();
					setProfessorSql();
					cnt=professorExecute();
					displayAll("교수",cnt);
					close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		    }//교수등록
		    else if(cnt==3) { //관리자
		    	setAgeName();
		    	setPart();
		    	try {
					conn=getConnection();
					setManageSql();
					cnt=manageExecute();
					displayAll("관리자",cnt);
					close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		      	
		    }//관리자
	}
	
	
	
}
