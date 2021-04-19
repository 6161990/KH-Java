package kr.or.kh.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SearchDAO {
	private int cnt;
	private Statement stmt;
	private Connection conn;
	private String sql;
	private ResultSet rs;

	
	public SearchDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void searchStudentSql(String nameSearch) throws SQLException {
		conn= RegisterDAO.getConnection();
		sql = "select no,age,name,studentNum from student where name='"+nameSearch+"'";
		stmt = conn.createStatement();
	}
	public StudentDTO searchStudentExecute(StudentDTO student) throws SQLException {
		rs =stmt.executeQuery(sql); //insert,update, delete => executeUpdate(), search => executeQuery()
		while(rs.next()) { //메모리에서는 for문을 쓰는데 db는 while문으로 돌린ㄷㅏ.
			student.setNo(rs.getInt("no"));
			student.setAge(rs.getString("age"));
			student.setName(rs.getString("name"));
			student.setStudentNum(rs.getString("studentNum"));
		}
		return student;
	}
	
	public void searchProfessorSql(String nameSearch) throws SQLException {
		conn= RegisterDAO.getConnection();
		sql = "select no,age,name,subject from professor where name='"+nameSearch+"'";
		stmt=conn.createStatement();
	}
	
	public ProfessorDTO searchProfessorExecute(ProfessorDTO professor) throws SQLException {
		rs =stmt.executeQuery(sql);
		while(rs.next()) {
			professor.setNo(rs.getInt("no"));
			professor.setAge(rs.getString("age"));
			professor.setName(rs.getString("name"));
			professor.setSubject(rs.getString("subject"));
		}
		return professor;
	}
	
	public void searchManageSql(String nameSearch) throws SQLException {
		conn= RegisterDAO.getConnection();
		sql = "select no,age,name,part from manage where name='"+nameSearch+"'";
		stmt= conn.createStatement();
	}
	
	public ManageDTO searchManageExecute(ManageDTO manage) throws SQLException {
		rs=stmt.executeQuery(sql);
		while(rs.next()) {
			manage.setNo(rs.getInt("no"));
			manage.setAge(rs.getString("age"));
			manage.setName(rs.getString("name"));
			manage.setPart(rs.getString("part"));
		}
		return manage;
	}
	
	public void close() throws SQLException {
		stmt.close();
		conn.close();
		rs.close();
	}
	
}
