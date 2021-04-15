package kr.or.kh.obj;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class List {
	private Connection conn;
	private Statement stmt;
	private int no;
	private ResultSet rs;
	private String sql;
	private StudentDTO student;
	private ProfessorDTO professor;
	private ManageDTO manage;
	
	public List() {
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
		sql ="select no,age,name,studentNum from student";
		stmt=conn.createStatement();
	}
	public void listProfessor() throws SQLException {
		sql ="select no,age,name,subject from professor";
		stmt=conn.createStatement();
	}
	public void listManage() throws SQLException {
		sql ="select no,age,name,part from manage";
		stmt=conn.createStatement();
	}
	
	public void StudentExecute() throws SQLException {
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			no = rs.getInt("no");
			student.age = rs.getString("age");
			student.name = rs.getString("name");
			student.studentNum = rs.getString("studentNum");
			System.out.print("[학생부] 나이: "+student.getAge()+"\t"+"이름: "+student.getName() +"\t"+"학번: "+student.getStudentNum()+"\n");
		}
	}
	public void ProfessorExecute() throws SQLException {
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			no = rs.getInt("no");
			professor.age = rs.getString("age");
			professor.name = rs.getString("name");
			professor.subject = rs.getString("subject");
			System.out.print("[교수진] 나이: "+professor.getAge()+"\t"+"이름: "+professor.getName()+"\t"+"담당과목: "+professor.getSubject()+"\n");
		}
	}
	public void ManageExecute() throws SQLException {
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			no = rs.getInt("no");
			manage.age = rs.getString("age");
			manage.name = rs.getString("name");
			manage.part = rs.getString("part");
			System.out.print("[관리자] 나이: "+manage.getAge()+"\t"+"이름: "+manage.getName()+"\t"+"담당부서: "+manage.getPart()+"\n");
		}
	}
	public void close() throws SQLException {
		if(conn != null) {conn.close();}
		if(stmt != null) {stmt.close();}
		if(rs != null) {rs.close();}
	}
	public void list() {
		try {
			conn=Register.getConnection();
			listStudent();
			StudentExecute();
			listProfessor() ;
			ProfessorExecute();
			listManage();
			ManageExecute();
			close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		List listObj = new List();
		listObj.list();
	}
	
}
