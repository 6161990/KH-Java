package kr.or.kh.obj4;


public class List extends Haksa {
	
	
	public List() {
			
		}

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
			   if(object.equals(professor.getObject())) {
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

	
}
