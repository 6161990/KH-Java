package kr.or.kh.obj;


public class Delete {
	
	private String object;
	private String nameDelete;

	public Delete() {}
	
	
	 public void deleteMenu() throws HaksaNameException, ObjectException {
		 System.out.println("삭제할사람의 이름을 입력해 주세요.");
	     System.out.print("이름 : ");
	     nameDelete = Register.input.next();
	     if(nameDelete==null || nameDelete=="") {
	    	 throw new HaksaNameException("삭제할 대상이 없습니다.");
	     }
	     System.out.println("학생, 교수, 관리자 중 입력하세요.");
	     object=Register.input.next();
	     if(object==null || object=="") {
	    	 throw new ObjectException("학생, 교수, 관리자 중 입력하세요.");
	     }
	 }
	
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
	 
	 public void deleteDisplay(StudentDTO student) {
			System.out.println(student.getName()+"님 삭제하였습니다.");    
	 }
	 public void deleteDisplay(ProfessorDTO professor) {
			System.out.println(professor.getName()+"님 삭제하였습니다.");    
	 }
	 public void deleteDisplay(ManageDTO manage) {
			System.out.println(manage.getName()+"님 삭제하였습니다.");    
	 }
}
