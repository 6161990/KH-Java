package kr.or.kh.obj4;


public class Register extends Haksa{
	public Haksa haksa;
	
	public Register() {
	
	}

	@Override
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
		

	@Override
	public void registerStudent() throws StudentNumException { //학생등록
		   StudentDTO student = new StudentDTO();	      
			try {
				registerAgeName(student);
			} catch (HaksaAgeException e) {
				e.printStackTrace();
			} catch (HaksaNameException e) {
				e.printStackTrace();
			}
			
		   studentNum();
	       student.setAge(age);
	       student.setName(name);
	       student.setStudentNum(studentNum);
	       student.setObject("학생");
	       studentList.add(student);
	                
	}


	
	@Override
	public void registerProfessor() throws ProfessorSubjectException {
		   ProfessorDTO professor = new ProfessorDTO();
	       try {
	    	   registerAgeName(professor);
		} catch (HaksaAgeException e) {
			e.printStackTrace();
		} catch (HaksaNameException e) {
			e.printStackTrace();
		}
	       professorSubject();
	       professor.setAge(age);
	       professor.setName(name);
	       professor.setSubject(subject);
	       professor.setObject("교수");
	       professorList.add(professor);
	}
	


	@Override
	public void registerManager() throws ManagePartException {
		   ManageDTO manage = new ManageDTO();
		   try {
			   registerAgeName(manage);
		} catch (HaksaAgeException e) {
			e.printStackTrace();
		} catch (HaksaNameException e) {
			e.printStackTrace();
		}
		   managePart();
	       manage.setAge(age);
	       manage.setName(name);
	       manage.setPart(part);
	       manage.setObject("관리자");
	       manageList.add(manage);
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void studentDelete(int i, StudentDTO student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void professorDelete(int i, ProfessorDTO professor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void manageDelete(int i, ManageDTO manage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateManage(ManageDTO manage, int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProfessor(ProfessorDTO professor, int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(StudentDTO student, int i) {
		// TODO Auto-generated method stub
		
	}
	


}
