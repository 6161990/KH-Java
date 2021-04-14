package kr.or.kh.obj;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Search {
	private String age;
	private String name;
	private String studentNum;
	private String subject;
	private int no;
	private String part;
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private String nameSearch;
	private String object;
	private String sql;
	
	public Search() {
		try {
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
			age = rs.getString("age");
			name = rs.getString("name");
			studentNum = rs.getString("studentNum");
		}
	}
	public void professorExecute() throws SQLException {
		rs =stmt.executeQuery(sql);
		while(rs.next()) {
			no = rs.getInt("no");
			age =rs.getString("age");
			name = rs.getString("name");
			subject = rs.getString("subject");
		}
	}
	public void manageExecute() throws SQLException {
		rs=stmt.executeQuery(sql);
		while(rs.next()) {
			no = rs.getInt("no");
			age =rs.getString("age");
			name =rs.getString("name");
			part =rs.getString("part");
		}
	}
	
	public void studentDisplay() {
		System.out.println("나이: "+age+"\t"+"이름: "+name+"\t"+"학번: "+studentNum+"\n");
	}
	public void professorDisplay() {
		System.out.print("나이: "+age+"\t"+"이름: "+name+"\t"+"담당과목: "+subject+"\n");
	}
	public void manageDisplay() {
		System.out.print("나이: "+age+"\t"+"이름: "+name+"\t"+"담당부서: "+part+"\n");
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
	
	public static void main(String[] args) {
		Search searchObj = new Search();
		searchObj.search();
	}
}


