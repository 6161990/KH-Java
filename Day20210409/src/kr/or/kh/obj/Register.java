package kr.or.kh.obj;

import java.util.ArrayList;
import java.util.Scanner;

public class Register {

	private int cnt;
	private String age;
	private String name;
	private String studentNum;
	private String subject;
	private String part;

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
	

	public void registerMenu() throws HaksaMenuException {
	    System.out.println("등록");
	    System.out.println("=======메뉴 선택======");
	    System.out.println("1.학생");
	    System.out.println("2.교수");
	    System.out.println("3.관리자");
	    System.out.println("4.이전메뉴");
	    System.out.println("번호를 선택해 주세요..");
	    cnt = Register.input.nextInt();
	    if( cnt < 0 || cnt > 4 ) {
			throw new HaksaMenuException("음수이거나 4 이상이면 에러입니다.");
	    }
	    
	}
	
	public void registerAgeName(StudentDTO student) throws HaksaAgeException, HaksaNameException {
	       System.out.println("나이:");
	       age = Register.input.next();
	       if(age == null || age == "") {
				throw new HaksaAgeException("나이가 null이거나 공백입니다.");
			}
	       System.out.println("이름:");
	       name = Register.input.next();
	       if( name == null || name == "") {
	    	   throw new HaksaNameException("이름이 null이거나 공백입니다.");
	       }
	}
	
	
	public void registerStudent() throws StudentNumException { //학생등록
		   StudentDTO student = new StudentDTO();	      
			try {
				registerAgeName(student);
			} catch (HaksaAgeException e) {
				e.printStackTrace();
			} catch (HaksaNameException e) {
				e.printStackTrace();
			}
	
	       System.out.println("학번:");
	       studentNum = Register.input.next();
	       if( studentNum == null || studentNum == "") {
				throw new StudentNumException("학번이 null이거나 공백입니다.");
			}
	       student.setAge(age);
	       student.setName(name);
	       student.setStudentNum(studentNum);
	       student.setObject("학생");
	       studentList.add(student);
	                
	}
	public void registerAgeName(ProfessorDTO professor) throws HaksaAgeException, HaksaNameException {
		   System.out.println("나이:");
		   age = Register.input.next();
	       if(age == null || age == "") {
	    	   throw new HaksaAgeException("나이가 null이거나 공백입니다.");
			}
	       System.out.println("이름:");
	       name = Register.input.next();
	       if( name == null || name == "") {
	    	   throw new HaksaNameException("이름이 null이거나 공백입니다.");
	       }
	}

	
	public void registerProfessor() throws ProfessorSubjectException {
		   ProfessorDTO professor = new ProfessorDTO();
	       try {
			registerAgeName(professor);
		} catch (HaksaAgeException e) {
			e.printStackTrace();
		} catch (HaksaNameException e) {
			e.printStackTrace();
		}
	       System.out.println("과목:");
	       subject = Register.input.next();
	       if(subject == null || subject == "") {
				throw new ProfessorSubjectException("담당과목이 null이거나 공백입니다.");
			}
	       professor.setAge(age);
	       professor.setName(name);
	       professor.setSubject(subject);
	       professor.setObject("교수");
	       professorList.add(professor);
	}
	
	
	public void registerAgeName(ManageDTO manage) throws HaksaAgeException, HaksaNameException {
		System.out.println("나이:");
		   age = Register.input.next();
	       if(age == null || age == "") {
	    	   throw new HaksaAgeException("나이가 null이거나 공백입니다.");
			}
	       System.out.println("이름:");
	       name = Register.input.next();
	       if( name == null || name == "") {
	    	   throw new HaksaNameException("이름이 null이거나 공백입니다.");
	       }
	}
	
	public void registerManager() throws ManagePartException {
		   ManageDTO manage = new ManageDTO();
		   try {
			registerAgeName(manage);
		} catch (HaksaAgeException e) {
			e.printStackTrace();
		} catch (HaksaNameException e) {
			e.printStackTrace();
		}
	       System.out.println("부서:");
	       part = Register.input.next();
	       if( part == null || part  == "") {
				throw new ManagePartException("담당부서가 null이거나 공백입니다.");
			}
	       manage.setAge(age);
	       manage.setName(name);
	       manage.setPart(part);
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
			try {
				registerMenu();
			} catch (HaksaMenuException e1) {
				e1.printStackTrace();
			}
			
			if(cnt==1) {//학생시작
		       try {
				registerStudent();
			} catch (StudentNumException e) {
				e.printStackTrace();
			}
		       registerDisplay(1);     
		    }//학생의끝
		    else if(cnt==2) {//교수의시작
		       try {
				registerProfessor();
			} catch (ProfessorSubjectException e) {
				e.printStackTrace();
			}
		       registerDisplay(2);             
		    }//교수의끝
		    else if(cnt==3) {//관리자의시작
		    	try {
					registerManager();
				} catch (ManagePartException e) {
					e.printStackTrace();
				}
		    	registerDisplay(3);        
		    }//관리자의끝  
	}//등록함수의끝
		

}
