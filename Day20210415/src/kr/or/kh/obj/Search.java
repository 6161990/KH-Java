package kr.or.kh.obj;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Search {
	private int no;
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private String nameSearch;
	private String object;
	private String sql;
	private StudentDTO student;
	private ProfessorDTO professor;
	private ManageDTO manage;
	
	public Search() {
		try {
			student = new StudentDTO();
			professor = new ProfessorDTO();
			manage = new ManageDTO();
			Class.forName("com.mysql.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void nameSearch() {
		System.out.println("찾을 이름을 입력 : ");
		nameSearch = Register.input.next();
		if(nameSearch==null || nameSearch=="") {
			System.out.println("에러");
		}
	}
	public void objectSearch() {
		System.out.println("학생, 교수, 관리자 중 입력하세요");
		object = Register.input.next(); 
		if(object==null || object=="") {
			System.out.println("에러");
		}
	}
	public void searchStudent() throws SQLException {
		sql = "select no,age,name,studentNum from student where name='"+nameSearch+"'";
		stmt =conn.createStatement();
	}
	public void searchProfessor() throws SQLException {
		sql = "select no,age,name,subject from professor where name='"+nameSearch+"'";
		stmt=conn.createStatement();
	}
	public void searchManage() throws SQLException {
		sql = "select no,age,name,part from manage where name='"+nameSearch+"'";
		stmt= conn.createStatement();
	}
	public void studentExecute() throws SQLException {
		rs =stmt.executeQuery(sql); //insert,update, delete => executeUpdate(), search => executeQuery()
		while(rs.next()) { //메모리에서는 for문을 쓰는데 db는 while문으로 돌린ㄷㅏ.
			no = rs.getInt("no");
			student.age = rs.getString("age");
			student.name = rs.getString("name");
			student.studentNum = rs.getString("studentNum");
		}
	}
	public void professorExecute() throws SQLException {
		rs =stmt.executeQuery(sql);
		while(rs.next()) {
			no = rs.getInt("no");
			professor.age =rs.getString("age");
			professor.name = rs.getString("name");
			professor.subject = rs.getString("subject");
		}
	}
	public void manageExecute() throws SQLException {
		rs=stmt.executeQuery(sql);
		while(rs.next()) {
			no = rs.getInt("no");
			manage.age =rs.getString("age");
			manage.name =rs.getString("name");
			manage.part =rs.getString("part");
		}
	}
	
	public void studentDisplay() {
		System.out.println("나이: "+student.age+"\t"+"이름: "+student.name+"\t"+"학번: "+student.studentNum+"\n");
	}
	public void professorDisplay() {
		System.out.print("나이: "+professor.age+"\t"+"이름: "+professor.name+"\t"+"담당과목: "+professor.subject+"\n");
	}
	public void manageDisplay() {
		System.out.print("나이: "+manage.age+"\t"+"이름: "+manage.name+"\t"+"담당부서: "+manage.part+"\n");
	}
	public void close() throws SQLException {
		stmt.close();
		conn.close();
		rs.close();
	}
	
	public void search() {
		nameSearch();
		objectSearch();
		if(object.equals("학생")) {//학생찾기
			try {
				conn= Register.getConnection();
				searchStudent();
				studentExecute();
				studentDisplay();
				close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//학생찾기
		else if(object.equals("교수")) {//교수 찾기 
			try {
				conn= Register.getConnection();
				searchProfessor();
				professorExecute();
				professorDisplay();
				close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//교수 찾기
		else if(object.equals("관리자")) {
			try {
				conn=Register.getConnection();
				searchManage();
				manageExecute();
				manageDisplay();
				close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	}
	
	
}


