package kr.or.kh.obj2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Register extends Haksa{

	private StudentDTO student;
	private ProfessorDTO professor;
	private ManageDTO manage;
	
	public Register() { //객체가 생성될 때 로드 되어야하니까. 
			student = new StudentDTO();
			professor = new ProfessorDTO();
			manage = new ManageDTO();
	}

	public static Connection getConnection() throws SQLException {
		conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf8","root", "");
		return conn;
	}
	public void setStudentSql() throws SQLException {
		sql = "insert into student(age,name,studentNum) values('"+student.getAge()+"', '"+student.getName()+"','"+student.getStudentNum()+"')";
		stmt = conn.createStatement();
	}
	public void setProfessorSql() throws SQLException {
		sql="insert into professor(age,name,subject) values ('"+ professor.getAge() +"', '"+ professor.getName() +"', '"+ professor.getSubject() +"')";
		stmt = conn.createStatement();
	}
	public void setManageSql() throws SQLException {
		sql="insert into manage(age,name,part) values ('"+ manage.getAge() +"', '"+ manage.getName() +"', '"+ manage.getPart() +"')";
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

	public void setAgeName(String object) {
		if(object.equals("학생")) {
			student.setAge();
			student.setName();
		}else if(object.equals("교수")) {
			professor.setAge();
			professor.setName();
		}else if(object.equals("관리자")) {
			manage.setAge();
			manage.setName();
		}
		
	}
	public void setStudentNum() {
		student.setStudentNum();
	}
	public void setSubject() {
		professor.setSubject();
	}
	public void setPart() {
		manage.setPart();
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
		    	setAgeName("학생");
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
		    	setAgeName("교수");
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
		    	setAgeName("관리자");
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
