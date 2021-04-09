package kr.or.kh.obj3;


public class Delete extends Haksa{
	public Haksa haksa;
	
	public Delete() {
		haksa = new Haksa();
	}
	
	
	public void delete() {//삭제함수의시작
 		  try {
 			 haksa.deleteMenu();
		} catch (HaksaNameException e) {
			e.printStackTrace();
		} catch (ObjectException e) {
			e.printStackTrace();
		}
 		  if(haksa.object.equals("학생")) {
	 		  for(int i=0; i<Haksa.studentList.size(); i++) {
	 			  StudentDTO student = Haksa.studentList.get(i);
	 			  if(haksa.nameDelete.equals(student.getName())) {
	 				 studentDelete(i,student);
	 				 
	 			  }
	 		  }
 		  }  
 		  
 		  else if(haksa.object.equals("교수")) {
 			  for(int i=0; i<Haksa.studentList.size(); i++) {
 				  ProfessorDTO professor = Haksa.professorList.get(i);
 				  if(haksa.nameDelete.equals(professor.getName())) {
 					  professorDelete(i,professor);
 				  }
 			  }
 		  }
 		  
 		  else if(haksa.object.equals("관리자")) {
 			  for(int i=0; i<Haksa.manageList.size(); i++) {
 				  ManageDTO manage = Haksa.manageList.get(i);
 				 if(haksa.nameDelete.equals(manage.getName())) {
 					 manageDelete(i, manage);
				  }
 				 
 			  }
 		  }
 		  
    }
	
	
	 public void studentDelete(int i, StudentDTO student) {
		 Haksa.studentList.remove(i);  
		 haksa.deleteDisplay(student);
	 }
	 public void professorDelete(int i, ProfessorDTO professor) {
		 Haksa.professorList.remove(i);  
		 haksa.deleteDisplay(professor);
	 }
	 public void manageDelete(int i, ManageDTO manage) {
		 Haksa.manageList.remove(i);
		 haksa.deleteDisplay(manage);
	 }
	 
	 
}
