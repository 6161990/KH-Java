package kr.or.kh.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListDAO {
	private Connection conn;
	private Statement stmt;
	private String sql;
	private ResultSet rs;
	private StudentDTO student;
	private ProfessorDTO professor;
	private ManageDTO manage;
	
	public ListDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			student = new StudentDTO();
			professor = new ProfessorDTO();
			manage = new ManageDTO();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void listStudent() throws SQLException {
		conn=RegisterDAO.getConnection();
		sql ="select no,age,name,studentNum from student";
		stmt=conn.createStatement();
	}
	public void listProfessor() throws SQLException {
		conn=RegisterDAO.getConnection();
		sql ="select no,age,name,subject from professor";
		stmt=conn.createStatement();
	}
	public void listManage() throws SQLException {
		conn=RegisterDAO.getConnection();
		sql ="select no,age,name,part from manage";
		stmt=conn.createStatement();
	}
	
	
	public void studentExecute() throws SQLException {
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			student.setNo(rs.getInt("no"));
			student.setAge(rs.getString("age"));
			student.setName(rs.getString("name"));
			student.setStudentNum(rs.getString("studentNum")); 
			System.out.print("[학생부] 나이: "+student.getAge()+"\t"+"이름: "+student.getName() +"\t"+"학번: "+student.getStudentNum()+"\n");
		}
	}
	
	public void professorExecute() throws SQLException {
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			professor.setNo(rs.getInt("no"));
			professor.setAge(rs.getString("age"));
			professor.setName(rs.getString("name"));
			professor.setSubject(rs.getString("subject"));
			System.out.print("[교수진] 나이: "+professor.getAge()+"\t"+"이름: "+professor.getName()+"\t"+"담당과목: "+professor.getSubject()+"\n");
		}
	}
	public void manageExecute() throws SQLException {
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			manage.setNo(rs.getInt("no"));
			manage.setAge(rs.getString("age"));
			manage.setName(rs.getString("name"));
			manage.setPart(rs.getString("part"));
			System.out.print("[관리자] 나이: "+manage.getAge()+"\t"+"이름: "+manage.getName()+"\t"+"담당부서: "+manage.getPart()+"\n");
		}
	}
	public void close() throws SQLException {
		if(conn != null) {conn.close();}
		if(stmt != null) {stmt.close();}
		if(rs != null) {rs.close();}
	}
	
}
