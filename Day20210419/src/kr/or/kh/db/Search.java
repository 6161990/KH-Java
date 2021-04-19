package kr.or.kh.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Search {
	private int no;
	private Connection conn;
	private String nameSearch;
	private String object;
	private StudentDTO student;
	private ProfessorDTO professor;
	private ManageDTO manage;
	private SearchDAO searchDAO;
	
	public Search() {
			student = new StudentDTO();
			professor = new ProfessorDTO();
			manage = new ManageDTO();
			searchDAO = new SearchDAO();
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
	
	
	
	public void studentDisplay(StudentDTO student) {
		System.out.println("나이: "+student.age+"\t"+"이름: "+student.name+"\t"+"학번: "+student.studentNum+"\n");
	}
	public void professorDisplay(ProfessorDTO professor) {
		System.out.print("나이: "+professor.age+"\t"+"이름: "+professor.name+"\t"+"담당과목: "+professor.subject+"\n");
	}
	public void manageDisplay(ManageDTO manage) {
		System.out.print("나이: "+manage.age+"\t"+"이름: "+manage.name+"\t"+"담당부서: "+manage.part+"\n");
	}

	
	public void search() {
		nameSearch();
		objectSearch();
		if(object.equals("학생")) {//학생찾기
			try {
				searchDAO.searchStudentSql(nameSearch);
				searchDAO.searchStudentExecute(student);
				studentDisplay(student);
				searchDAO.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//학생찾기
		else if(object.equals("교수")) {//교수 찾기 
			try {
				searchDAO.searchProfessorSql(nameSearch);
				searchDAO.searchProfessorExecute(professor);
				professorDisplay(professor);
				searchDAO.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//교수 찾기
		else if(object.equals("관리자")) {
			try {
				searchDAO.searchManageSql(nameSearch);
				searchDAO.searchManageExecute(manage);
				manageDisplay(manage);
				searchDAO.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	}
	
	
}


