package kr.or.kh.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterDAO {
	private static Connection conn;
	private Statement stmt;
	private String sql;
	private int cnt;
	
	
	public RegisterDAO() {
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
	
	public int studentRegister(StudentDTO student) throws SQLException {
		conn = getConnection();
		sql = "insert into student(age,name,studentNum) values('"+student.getAge()+"', '"+student.getName()+"','"+student.getStudentNum()+"')";
		stmt = conn.createStatement();
		cnt = stmt.executeUpdate(sql);
		return cnt;
	}
	
	public int professorRegister(ProfessorDTO professor) throws SQLException {
		conn = getConnection();
		sql="insert into professor(age,name,subject) values ('"+ professor.getAge() +"', '"+ professor.getName() +"', '"+ professor.getSubject() +"')";
		stmt = conn.createStatement();
		cnt = stmt.executeUpdate(sql);
		return cnt;
	}
	public int manageRegister(ManageDTO manage) throws SQLException {
		conn = getConnection();
		sql="insert into manage(age,name,part) values ('"+ manage.getAge() +"', '"+ manage.getName() +"', '"+ manage.getPart() +"')";
		stmt = conn.createStatement();
		cnt = stmt.executeUpdate(sql);
		return cnt;
	}
	public void close() throws SQLException {
		if(conn != null) {conn.close();}
		if(stmt != null) {stmt.close();}
	}

	
	
}
