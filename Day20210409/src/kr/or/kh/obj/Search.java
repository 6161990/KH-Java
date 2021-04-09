package kr.or.kh.obj;

public class Search {
	
	private String object;
	private String nameSearch;

	public Search() {}
	
	
	public void searchMenu() throws ObjectException, HaksaNameException {
		 System.out.println("찾을이름을 입력해주세요.");
	     System.out.println("이름:");
	     nameSearch = Register.input.next();
	     if(nameSearch==null || nameSearch=="") {
	    	 throw new HaksaNameException("이름 검색에서 null이거나 공백입니다.");
	     }
	     System.out.println("학생, 교수, 관리자 중 입력하세요.");
	     object = Register.input.next();
	     if(object==null || object=="") {
	    	 throw new ObjectException("학생, 교수, 관리자 중 입력하세요.");
	     }
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

	
	public void searchDisplay(StudentDTO student) {
		   System.out.print("나이:"+student.getAge()+ "\t");
           System.out.print("이름:"+student.getName()+ "\t");
           System.out.print("학번:"+student.getStudentNum()+ "\t");
		
	}
	public void searchDisplay(ProfessorDTO professor) {
		   System.out.print("나이:"+professor.getAge()+ "\t");
		   System.out.print("이름:"+professor.getName()+ "\t");
		   System.out.print("담당과목:"+professor.getSubject()+ "\t");
		
	}
	public void searchDisplay(ManageDTO manage) {
		   System.out.print("나이:"+manage.getAge()+ "\t");
		   System.out.print("이름:"+manage.getName()+ "\t");
		   System.out.print("담당부서:"+manage.getPart()+ "\t");
		
	}
}
