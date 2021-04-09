package kr.or.kh.obj3;


public class List extends Haksa{
	public Haksa haksa;
	
	public List() {
		haksa = new Haksa();
	}

	
	public void list() {//전체출력의시작
		   System.out.println("====전체출력====");
		   for(int i=0;i<Haksa.studentList.size();i++) {//반복문시작
			   StudentDTO student = Haksa.studentList.get(i);
			   haksa.object=student.getObject();
			   if(haksa.object.equals(student.getObject())) {
				   haksa.listDisplay(student);
			   } 
		   }
		   for(int i=0;i<Haksa.professorList.size();i++) {//반복문시작
			   ProfessorDTO professor = Haksa.professorList.get(i);
			   haksa.object=professor.getObject();
			   if(haksa.object.equals(professor.getObject())) {
				   haksa.listDisplay(professor);
			   } 
		   }
		   for(int i=0;i<Haksa.manageList.size();i++) {//반복문시작
			   ManageDTO manage = Haksa.manageList.get(i);
			   haksa.object=manage.getObject();
			   if(haksa.object.equals(manage.getObject())) {
				   haksa.listDisplay(manage);
			   } 
		   }
	}  


	
}
