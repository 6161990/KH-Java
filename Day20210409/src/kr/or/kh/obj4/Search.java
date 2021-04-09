package kr.or.kh.obj4;

public class Search extends Haksa{
	
	
	public Search() {
	}
	
	@Override
	public void search() {//검색함수의시작
		
		try {
			searchMenu();
		} catch (ObjectException e) {
			e.printStackTrace();
		} catch (HaksaNameException e) {
			e.printStackTrace();
		}
		
		 if(object.equals("학생")) {
			 for(int i=0; i<Register.studentList.size(); i++) {
				StudentDTO student = Register.studentList.get(i);
				if(nameSearch.equals(student.getName())) {
					searchDisplay(student);
				}
			 }
		 }
		 else if(object.equals("교수")) {
			 for(int i=0; i<Register.professorList.size(); i++) {
				 ProfessorDTO professor = Register.professorList.get(i);
				 if(nameSearch.equals(professor.getName())) {
					 searchDisplay(professor);
				 }
			 }
		 }
		 else if(object.equals("관리자")) {
			 for(int i=0; i<Register.manageList.size(); i++) {
				 ManageDTO manage = Register.manageList.get(i);
				 if(nameSearch.equals(manage.getName())) {
					 searchDisplay(manage);
				 }
			 }
		 }
	}

	@Override
	public void registerStudent() throws StudentNumException {
		
	}

	@Override
	public void registerProfessor() throws ProfessorSubjectException {
		
	}

	@Override
	public void registerManager() throws ManagePartException {
		
	}

	@Override
	public void register() {
		
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
