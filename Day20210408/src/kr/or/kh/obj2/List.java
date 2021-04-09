package kr.or.kh.obj2;


public class List {
	
	private String object;
	
	public List() {}

	
	public void list() {//전체출력의시작
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

	   
	   public void listDisplay(StudentDTO student) {
		   System.out.println("===학생전체출력====");
		   System.out.print("이름: " );
           System.out.print(student.getName()+"\t");
           System.out.print("나이: " );
           System.out.print(student.getAge()+"\t");
           System.out.print("학번: " );
           System.out.print(student.getStudentNum()+"\n");
	
		}
	   public void listDisplay(ProfessorDTO professor) {
		   System.out.println("===교수전체출력====");
		   System.out.print("이름: " );
           System.out.print(professor.getName()+"\t");
           System.out.print("나이: " );
           System.out.print(professor.getAge()+"\t");
           System.out.print("담당과목: " );
           System.out.print(professor.getSubject()+"\n");
	   }
	   public void listDisplay(ManageDTO manage) {
		   System.out.println("===관리자전체출력====");
		   System.out.print("이름: " );
           System.out.print(manage.getName()+"\t");
           System.out.print("나이: " );
           System.out.print(manage.getAge()+"\t");
           System.out.print("담당부서: " );
           System.out.print(manage.getPart()+"\n");    
	   }
	
}
