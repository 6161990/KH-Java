package kr.or.kh.obj4;


public class List extends Haksa{
	public Haksa haksa;
	
	public List() {
	
	}

	@Override
	public void list() {//전체출력의시작
		   System.out.println("====전체출력====");
		   for(int i=0;i<Register.studentList.size();i++) {//반복문시작
			   StudentDTO student = Register.studentList.get(i);
			   object=student.getObject();
			   if(object.equals(student.getObject())) {
				   listDisplay(student);
			   } 
		   }
		   for(int i=0;i<Register.professorList.size();i++) {//반복문시작
			   ProfessorDTO professor = Register.professorList.get(i);
			   object=professor.getObject();
			   if(haksa.object.equals(professor.getObject())) {
				   listDisplay(professor);
			   } 
		   }
		   for(int i=0;i<Register.manageList.size();i++) {//반복문시작
			   ManageDTO manage = Register.manageList.get(i);
			   object=manage.getObject();
			   if(object.equals(manage.getObject())) {
				   listDisplay(manage);
			   } 
		   }
	}


	@Override
	public void registerStudent() throws StudentNumException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void registerProfessor() throws ProfessorSubjectException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void registerManager() throws ManagePartException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void register() {
		// TODO Auto-generated method stub
		
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
