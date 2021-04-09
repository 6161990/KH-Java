package kr.or.kh.obj3;


public class Register {
	public Haksa haksa;
	public StudentDTO student;
	
	public Register() {
		haksa = new Haksa();
		student = new StudentDTO();
	}


	public void register() {//등록함수
			try {
				haksa.registerMenu();
			} catch (HaksaMenuException e1) {
				e1.printStackTrace();
			}
			
			if(haksa.cnt==1) {//학생시작
		       try {
				registerStudent();
			} catch (StudentNumException e) {
				e.printStackTrace();
			}
		       haksa.registerDisplay(1);     
		    }//학생의끝
		    else if(haksa.cnt==2) {//교수의시작
		       try {
				registerProfessor();
			} catch (ProfessorSubjectException e) {
				e.printStackTrace();
			}
		       haksa.registerDisplay(2);             
		    }//교수의끝
		    else if(haksa.cnt==3) {//관리자의시작
		    	try {
					registerManager();
				} catch (ManagePartException e) {
					e.printStackTrace();
				}
		    	haksa.registerDisplay(3);        
		    }//관리자의끝  
	}//등록함수의끝
		

	public void registerStudent() throws StudentNumException { //학생등록
		   StudentDTO student = new StudentDTO();	      
			try {
				haksa.registerAgeName(student);
			} catch (HaksaAgeException e) {
				e.printStackTrace();
			} catch (HaksaNameException e) {
				e.printStackTrace();
			}
			
		   haksa.studentNum();
	       student.setAge(haksa.age);
	       student.setName(haksa.name);
	       student.setStudentNum(haksa.studentNum);
	       student.setObject("학생");
	       Haksa.studentList.add(student);
	                
	}


	
	
	public void registerProfessor() throws ProfessorSubjectException {
		   ProfessorDTO professor = new ProfessorDTO();
	       try {
	    	   haksa.registerAgeName(professor);
		} catch (HaksaAgeException e) {
			e.printStackTrace();
		} catch (HaksaNameException e) {
			e.printStackTrace();
		}
	       haksa.professorSubject();
	       professor.setAge(haksa.age);
	       professor.setName(haksa.name);
	       professor.setSubject(haksa.subject);
	       professor.setObject("교수");
	       Haksa.professorList.add(professor);
	}
	


	
	public void registerManager() throws ManagePartException {
		   ManageDTO manage = new ManageDTO();
		   try {
			   haksa.registerAgeName(manage);
		} catch (HaksaAgeException e) {
			e.printStackTrace();
		} catch (HaksaNameException e) {
			e.printStackTrace();
		}
		   haksa.managePart();
	       manage.setAge(haksa.age);
	       manage.setName(haksa.name);
	       manage.setPart(haksa.part);
	       manage.setObject("관리자");
	       Haksa.manageList.add(manage);
	}
	


}
