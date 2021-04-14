package kr.or.kh.obj;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	private Connection conn;
	private Statement stmt;
	private int cnt;
	private String nameDelete;
	private String object;
	private String sql;
	
	
	public Delete() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void deleteName() {
		System.out.println("삭제할 이름을 입력하세요.");
		nameDelete= Register.input.next();
		if(nameDelete==""| nameDelete==null) {
			System.out.println("에러");
		}
	}
	public void deleteObject() {
		System.out.println("학생, 교수, 관리자 중 해당사항을 입력하세요.");
		object = Register.input.next();
		if(object==""| object==null) {
			System.out.println("에러");
		}
	}
	public void deleteStudent() throws SQLException {
		sql = "delete from student where name='"+nameDelete+"'";
		stmt = conn.createStatement();
	}
	public void deleteProfessor() throws SQLException {
		sql = "delete from professor where name='"+nameDelete+"'";
		stmt = conn.createStatement();
	}
	public void deleteManage() throws SQLException {
		String sql = "delete from manage where name='"+nameDelete+"'";
		stmt =conn.createStatement();
	}
	public void studentDisplay() {
		if(cnt == 1) {
			System.out.println("학생이 삭제되었습니다.");
		}else {
			System.out.println("정보를 삭제하지 못했습니다.");
		}
	}
	public void professorDisplay() {
		if(cnt == 1) {
			System.out.println("교수가 삭제되었습니다.");
		}else {
			System.out.println("정보를 삭제하지 못했습니다.");
		}
	}
	public void manageDisplay() {
		if(cnt == 1) {
			System.out.println("관리자가 삭제되었습니다.");
		}else {
			System.out.println("정보를 삭제하지 못했습니다.");
		}
	}
	
	public void studentExecute() throws SQLException {
		cnt = stmt.executeUpdate(sql);
	}
	public void professorExecute() throws SQLException {
		cnt = stmt.executeUpdate(sql);
	}
	public void manageExecute() throws SQLException {
		cnt = stmt.executeUpdate(sql);
	}
	
	public void close() throws SQLException {
		if(conn != null) {conn.close();}
		if(stmt != null) {stmt.close();}
	}
	
	public void delete() {
		deleteName();
		 deleteObject();
		if(object.equals("학생")) {//학생삭제
			try {
				conn=Register.getConnection();
				deleteStudent();
				studentExecute();
				studentDisplay();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//학생삭제
		else if(object.equals("교수")) {//교수삭제
			try {
				conn=Register.getConnection();
				deleteProfessor();
				professorExecute();
				professorDisplay();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//교수삭제
		else if(object.equals("관리자")) {//관리자 삭제
			try {
				conn=Register.getConnection();
				deleteManage();
				manageExecute();
				manageDisplay();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//관리자 삭제 
	
	}
	

	
}
