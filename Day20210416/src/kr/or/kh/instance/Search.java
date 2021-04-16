package kr.or.kh.instance;

import java.sql.SQLException;


public class Search extends Haksa implements ISearch{
	
	private String nameSearch;
	private String object;
	private StudentDTO student;
	private ProfessorDTO professor;
	private ManageDTO manage;
	
	public Search() {
			student = new StudentDTO();
			professor = new ProfessorDTO();
			manage = new ManageDTO();
	}
	@Override
	public void nameSearch() {
		System.out.println("찾을 이름을 입력 : ");
		nameSearch = Register.input.next();
		if(nameSearch==null || nameSearch=="") {
			System.out.println("에러");
		}
	}
	@Override
	public void objectSearch() {
		System.out.println("학생, 교수, 관리자 중 입력하세요");
		object = Register.input.next(); 
		if(object==null || object=="") {
			System.out.println("에러");
		}
	}
	@Override
	public void searchStudent() throws SQLException {
		sql = "select no,age,name,studentNum from student where name='"+nameSearch+"'";
		stmt =conn.createStatement();
	}
	@Override
	public void searchProfessor() throws SQLException {
		sql = "select no,age,name,subject from professor where name='"+nameSearch+"'";
		stmt=conn.createStatement();
	}
	@Override
	public void searchManage() throws SQLException {
		sql = "select no,age,name,part from manage where name='"+nameSearch+"'";
		stmt= conn.createStatement();
	}
	@Override
	public void studentSearchExecute() throws SQLException {
		rs =stmt.executeQuery(sql); //insert,update, delete => executeUpdate(), search => executeQuery()
		while(rs.next()) { //메모리에서는 for문을 쓰는데 db는 while문으로 돌린ㄷㅏ.
			no = rs.getInt("no");
			student.age = rs.getString("age");
			student.name = rs.getString("name");
			student.studentNum = rs.getString("studentNum");
		}
	}
	@Override
	public void professorSearchExecute() throws SQLException {
		rs =stmt.executeQuery(sql);
		while(rs.next()) {
			no = rs.getInt("no");
			professor.age =rs.getString("age");
			professor.name = rs.getString("name");
			professor.subject = rs.getString("subject");
		}
	}
	@Override
	public void manageSearchExecute() throws SQLException {
		rs=stmt.executeQuery(sql);
		while(rs.next()) {
			no = rs.getInt("no");
			manage.age =rs.getString("age");
			manage.name =rs.getString("name");
			manage.part =rs.getString("part");
		}
	}
	
	@Override
	public void studentDisplay() {
		System.out.println("나이: "+student.age+"\t"+"이름: "+student.name+"\t"+"학번: "+student.studentNum+"\n");
	}
	@Override
	public void professorDisplay() {
		System.out.print("나이: "+professor.age+"\t"+"이름: "+professor.name+"\t"+"담당과목: "+professor.subject+"\n");
	}
	@Override
	public void manageDisplay() {
		System.out.print("나이: "+manage.age+"\t"+"이름: "+manage.name+"\t"+"담당부서: "+manage.part+"\n");
	}

	@Override
	public void search() {
		nameSearch();
		objectSearch();
		if(object.equals("학생")) {//학생찾기
			try {
				conn= Register.getConnection();
				searchStudent();
				studentSearchExecute();
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
				professorSearchExecute();
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
				manageSearchExecute();
				manageDisplay();
				close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	}
	
	
	
}


