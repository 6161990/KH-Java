package kr.or.kh.obj3;

public class Search extends Haksa{
	public Haksa haksa;
	
	public Search() {
		haksa = new Haksa();
	}

	public void search() {//검색함수의시작
		
		try {
			searchMenu();
		} catch (ObjectException e) {
			e.printStackTrace();
		} catch (HaksaNameException e) {
			e.printStackTrace();
		}
		
		 if(haksa.object.equals("학생")) {
			 for(int i=0; i<Haksa.studentList.size(); i++) {
				StudentDTO student = Haksa.studentList.get(i);
				if(haksa.nameSearch.equals(student.getName())) {
					haksa.searchDisplay(student);
				}
			 }
		 }
		 else if(haksa.object.equals("교수")) {
			 for(int i=0; i<Haksa.professorList.size(); i++) {
				 ProfessorDTO professor = Haksa.professorList.get(i);
				 if(haksa.nameSearch.equals(professor.getName())) {
					 haksa.searchDisplay(professor);
				 }
			 }
		 }
		 else if(haksa.object.equals("관리자")) {
			 for(int i=0; i<Haksa.manageList.size(); i++) {
				 ManageDTO manage = Haksa.manageList.get(i);
				 if(haksa.nameSearch.equals(manage.getName())) {
					 haksa.searchDisplay(manage);
				 }
			 }
		 }
	}

	
	
}
