package kr.or.kh.obj4;

public class Search extends Haksa implements ISearch{
	

	public Search() {
	}
	
	
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

	

	
	
}
