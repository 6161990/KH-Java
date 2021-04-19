package kr.or.kh.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Register {
	private static int cnt;
	public static Scanner input;
	private RegisterDAO registerDAO;
	private ProfessorDTO professor;
	private ManageDTO manage;
	private StudentDTO student;
	private String age;
	private String name;
	private String studentNum;
	private String subject;
	private String part;
	private static Connection conn;
	

	public Register() { //객체가 생성될 때 로드 되어야하니까. 
			registerDAO = new RegisterDAO();
			student = new StudentDTO();
			professor = new ProfessorDTO();
			manage = new ManageDTO();
	}
	
	static {
		input = new Scanner(System.in);
	}
	
	
	public void displayAll(String str,int cnt) {
		if(str.equals("학생")) {
			System.out.println("전학생으로 등록되었습니다.");
			if(cnt==0) {
				System.out.println("학생등록이 실패되었습니다.");
			}
		}else if(str.equals("교수")) {
			System.out.println("교수로 등록되었습니다.");
			if(cnt==0) {
				System.out.println("교수등록이 실패되었습니다.");
			}
		}else if(str.equals("관리자")) {
			System.out.println("관리자로 등록되었습니다.");
			if(cnt==0) {
				System.out.println("관리자등록이 실패되었습니다.");
			}
		}
	}
	public void setAgeName(String object) {
		if(object.equals("학생")) {
			System.out.println("나이 : ");
	    	 age= Register.input.next();
	    	 student.setAge(age);
	    	 System.out.println("이름 : ");
	    	 name= Register.input.next();
	    	 student.setName(name);	
		}else if(object.equals("교수")) {
			System.out.println("나이 : ");
			 age= input.next();
	    	 professor.setAge(age);
	    	 System.out.println("이름 : ");
	    	 name= input.next();
	    	 professor.setName(name);
		}else if(object.equals("관리자")) {
			 System.out.println("나이 : ");
			 age= input.next();
	    	 manage.setAge(age);
	    	 System.out.println("이름 : ");
	    	 name= input.next();
	    	 manage.setName(name);
		}
		
	}


	public void setStudentNum() {
		System.out.println("학번 : ");
    	studentNum = input.next();
		student.setStudentNum(studentNum);
	}
	public void setSubject() {
		System.out.println("담당과목 : ");
    	subject = input.next();
    	professor.setSubject(subject);
		
	}
	public void setPart() {
		System.out.println("담당부서 : ");
    	part = input.next();
    	manage.setPart(part);

	}
	
	public void studentRegister() {
		student.setAge(age);
    	student.setName(name);
    	student.setStudentNum(studentNum);
	}
	public void professorRegister() {
		professor.setAge(age);
		professor.setName(name);
		professor.setSubject(subject);
	}
	public void manageRegister() {
		manage.setAge(age);
		manage.setName(name);
		manage.setPart(part);
	}
	public void register() {
		 System.out.println("등록");
		 System.out.println("=======메뉴 선택======");
		    System.out.println("1.학생");
		    System.out.println("2.교수");
		    System.out.println("3.관리자");
		    System.out.println("4.이전메뉴");
		    System.out.println("번호를 선택해 주세요..");
		    cnt = input.nextInt();
		    if(cnt < 0 || cnt > 4) {
				System.out.println("에러");
			}
		    if(cnt == 1) {//학생등록
		    	setAgeName("학생");
		    	setStudentNum();
		    	studentRegister();
		    	try {
		    		//conn=RegisterDAO.getConnection();
		    		cnt=registerDAO.studentRegister(student);
					displayAll("학생",cnt);
					registerDAO.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		    	

		    }//학생등록
		    else if(cnt==2) {//교수등록
		    	setAgeName("교수");
		    	setSubject();
		    	professorRegister();
		    	try {
					//conn=RegisterDAO.getConnection();
					cnt=registerDAO.professorRegister(professor);
					displayAll("교수",cnt);
					registerDAO.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		    }//교수등록
		    else if(cnt==3) { //관리자
		    	setAgeName("관리자");
		    	setPart();
		    	manageRegister();
		    	try {
					//conn=RegisterDAO.getConnection();
					cnt=registerDAO.manageRegister(manage);
					displayAll("관리자",cnt);
					registerDAO.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		      	
		    }//관리자
	}
	
	
	
}
