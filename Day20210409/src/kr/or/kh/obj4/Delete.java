package kr.or.kh.obj4;


public class Delete extends Haksa {
	public Haksa haksa;
	
	public Delete() {
	
	}
	
	@Override
	public void delete() {//삭제함수의시작
 		  try {
 			 deleteMenu();
		} catch (HaksaNameException e) {
			e.printStackTrace();
		} catch (ObjectException e) {
			e.printStackTrace();
		}
 		  if(object.equals("학생")) {
	 		  for(int i=0; i<Register.studentList.size(); i++) {
	 			  StudentDTO student = Register.studentList.get(i);
	 			  if(nameDelete.equals(student.getName())) {
	 				 studentDelete(i,student);
	 				 
	 			  }
	 		  }
 		  }  
 		  
 		  else if(object.equals("교수")) {
 			  for(int i=0; i<Register.studentList.size(); i++) {
 				  ProfessorDTO professor = Register.professorList.get(i);
 				  if(nameDelete.equals(professor.getName())) {
 					  professorDelete(i,professor);
 				  }
 			  }
 		  }
 		  
 		  else if(object.equals("관리자")) {
 			  for(int i=0; i<Register.manageList.size(); i++) {
 				  ManageDTO manage = Register.manageList.get(i);
 				 if(nameDelete.equals(manage.getName())) {
 					 manageDelete(i, manage);
				  }
 				 
 			  }
 		  }
 		  
    }
	
	 @Override
	 public void studentDelete(int i, StudentDTO student) {
		 Register.studentList.remove(i);  
		 deleteDisplay(student);
	 }
	 @Override
	 public void professorDelete(int i, ProfessorDTO professor) {
		 Register.professorList.remove(i);  
		 deleteDisplay(professor);
	 }
	 @Override
	 public void manageDelete(int i, ManageDTO manage) {
		 Register.manageList.remove(i);
		 deleteDisplay(manage);
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
