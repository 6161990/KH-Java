package kr.or.kh.obj2;


public class Delete extends Haksa{
	
	public Delete() {}
	
	
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
	
	
	 public void studentDelete(int i, StudentDTO student) {
		 Register.studentList.remove(i);  
		 deleteDisplay(student);
	 }
	 public void professorDelete(int i, ProfessorDTO professor) {
		 Register.professorList.remove(i);  
		 deleteDisplay(professor);
	 }
	 public void manageDelete(int i, ManageDTO manage) {
		 Register.manageList.remove(i);
		 deleteDisplay(manage);
	 }
	 

}
