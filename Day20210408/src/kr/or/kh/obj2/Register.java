package kr.or.kh.obj2;

import java.util.ArrayList;
import java.util.Scanner;

public class Register {

	private int cnt;

	public static Scanner input;
	public static ArrayList<StudentDTO> studentList;
	public static ArrayList<ProfessorDTO> professorList;
	public static ArrayList<ManageDTO> manageList;
	
	static {
		input = new Scanner(System.in);
		studentList = new ArrayList<StudentDTO>();
		professorList = new ArrayList<ProfessorDTO>();
		manageList = new ArrayList<ManageDTO>();
	}
	
	public Register() {
	
	}
	

	public void registerMenu() {
	    System.out.println("등록");
	    System.out.println("=======메뉴 선택======");
	    System.out.println("1.학생");
	    System.out.println("2.교수");
	    System.out.println("3.관리자");
	    System.out.println("4.이전메뉴");
	    System.out.println("번호를 선택해 주세요..");
	    cnt = Register.input.nextInt();
	    if( cnt < 0 || cnt > 4 ) {
			System.out.println("음수이거나 4 이상이면 에러입니다. 메뉴 중에 선택하세요.");
		}
	}
	
	public void registerAgeName(StudentDTO student) {
	       System.out.println("나이:");
	       student.setAge(Register.input.next()); 
	       if(student.getAge() == null || student.getAge() == "") {
				System.out.println("나이가 null이거나 공백입니다.");
			}
	       System.out.println("이름:");
	       student.setName(Register.input.next()); 
	       if( student.getName() == null || student.getName() == "") {
				System.out.println("이름이 null이거나 공백입니다.");
			}
	}
	
	
	public void registerStudent() { //학생등록
		   StudentDTO student = new StudentDTO();
	       registerAgeName(student);
	       System.out.println("학번:");
	       student.setStudentNum(input.next());
	       if( student.getStudentNum() == null || student.getStudentNum() == "") {
				System.out.println("학번이 null이거나 공백입니다.");
			}
	       student.setObject("학생");
	       studentList.add(student);
	                
	}
	public void registerAgeName(ProfessorDTO professor) {
		   System.out.println("나이:");
		   professor.setAge(Register.input.next()); 
	       if(professor.getAge() == null || professor.getAge() == "") {
				System.out.println("나이가 null이거나 공백입니다.");
			}
	       System.out.println("이름:");
	       professor.setName(Register.input.next()); 
	       if( professor.getName() == null || professor.getName() == "") {
				System.out.println("이름이 null이거나 공백입니다.");
			}
	}

	
	public void registerProfessor() {
		   ProfessorDTO professor = new ProfessorDTO();
	       registerAgeName(professor);
	       System.out.println("과목:");
	       professor.setSubject(input.next());
	       if( professor.getSubject() == null || professor.getSubject() == "") {
				System.out.println("담당과목이 null이거나 공백입니다.");
			}
	       professor.setObject("교수");
	       professorList.add(professor);
	}
	
	
	public void registerAgeName(ManageDTO manage) {
		   System.out.println("나이:");
		   manage.setAge(Register.input.next()); 
	       if(manage.getAge() == null || manage.getAge() == "") {
				System.out.println("나이가 null이거나 공백입니다.");
			}
	       System.out.println("이름:");
	       manage.setName(Register.input.next()); 
	       if( manage.getName() == null || manage.getName() == "") {
				System.out.println("이름이 null이거나 공백입니다.");
			}
	}
	
	public void registerManager() {
		   ManageDTO manage = new ManageDTO();
		   registerAgeName(manage);
	       System.out.println("부서:");
	       manage.setPart(input.next()); 
	       if( manage.getPart() == null || manage.getPart()  == "") {
				System.out.println("담당부서가 null이거나 공백입니다.");
			}
	       manage.setObject("관리자");
	       manageList.add(manage);
	}
	
	public void registerDisplay(int cnt) {
		if(cnt==1) {
			System.out.println("학생이 등록되었습니다.");
		}else if(cnt==2) {
			System.out.println("교수님이 등록되었습니다.");
		}else if(cnt ==3) {
			System.out.println("관리자님이 등록되었습니다.");
		}
	}

	public void register() {//등록함수
			registerMenu();
		    if(cnt==1) {//학생시작
		       registerStudent();
		       registerDisplay(1);     
		    }//학생의끝
		    else if(cnt==2) {//교수의시작
		       registerProfessor();
		       registerDisplay(2);             
		    }//교수의끝
		    else if(cnt==3) {//관리자의시작
		    	registerManager();
		    	registerDisplay(3);        
		    }//관리자의끝  
	}//등록함수의끝
		

}
