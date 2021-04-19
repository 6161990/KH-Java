package kr.or.kh.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDAO {
	private Connection conn;
	private Statement stmt;
	private String sql;
	private int cnt;
	private String nameDelete;
	
	public DeleteDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void deleteStudent(String nameDelete) throws SQLException {
		conn=RegisterDAO.getConnection();
		sql = "delete from student where name='"+nameDelete+"'";
		stmt = conn.createStatement();
		
	}
	public void deleteProfessor(String nameDelete) throws SQLException {
		conn=RegisterDAO.getConnection();
		sql = "delete from professor where name='"+nameDelete+"'";
		stmt = conn.createStatement();
	}
	public void deleteManage(String nameDelete) throws SQLException {
		conn=RegisterDAO.getConnection();
		sql = "delete from manage where name='"+nameDelete+"'";
		stmt =conn.createStatement();
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
	public void close() throws SQLException {
		if(conn != null) {conn.close();}
		if(stmt != null) {stmt.close();}
	}

}
