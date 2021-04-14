package kr.or.kh.obj;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class List {
	private Connection conn;
	private Statement stmt;
	private String age;
	private String name;
	private String studentNum;
	private String subject;
	private int no;
	private String part;
	private ResultSet rs;
	private String sql;
	
	public List() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
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
			age = rs.getString("age");
			name = rs.getString("name");
			studentNum = rs.getString("studentNum");
			System.out.print("[학생부] 나이: "+age+"\t"+"이름: "+name+"\t"+"학번: "+studentNum+"\n");
		}
	}
	public void ProfessorExecute() throws SQLException {
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			no = rs.getInt("no");
			age = rs.getString("age");
			name = rs.getString("name");
			subject = rs.getString("subject");
			System.out.print("[교수진] 나이: "+age+"\t"+"이름: "+name+"\t"+"담당과목: "+subject+"\n");
		}
	}
	public void ManageExecute() throws SQLException {
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			no = rs.getInt("no");
			age = rs.getString("age");
			name = rs.getString("name");
			part = rs.getString("part");
			System.out.print("[관리자] 나이: "+age+"\t"+"이름: "+name+"\t"+"담당부서: "+part+"\n");
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
