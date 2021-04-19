package kr.or.kh.db;

import java.sql.SQLException;


public class Update {
	private int no;
	private int cnt;
	private String nameUpdate;
	private String object;
	private String commit;
	private String ageUpdate;
	private String studentNumUpdate;
	private String result;
	private String subjectUpdate;
	private String partUpdate;
	private String nameDB;
	private StudentDTO student;
	private ProfessorDTO professor;
	private ManageDTO manage;
	private UpdateDAO updateDAO;
	
	
	public Update(){
		student = new StudentDTO();
		professor = new ProfessorDTO();
		manage = new ManageDTO();
		updateDAO = new UpdateDAO();
	}
	
	public void nameUpdate() {
		System.out.println("수정할 이름을 입력하세요. ");
		nameUpdate = Register.input.next();
		if(nameUpdate==null || nameUpdate=="") {
			System.out.println("에러");
		}
	}
	public void objectUpdate() {
		System.out.println("학생, 교수, 관리자 중 입력하세요");
		object = Register.input.next(); 
		if(object==null || object=="") {
			System.out.println("에러");
		}
	}
	
	
	public void studentViewDisplay() {
		System.out.print("[학생부] 나이: "+student.getAge()+"\t"+"이름: "+student.getName()+"\t"+"학번: "+student.getStudentNum()+"\n");
		System.out.println("기존 정보입니다.");
	}
	public void commitFinal() {
		System.out.println("변경하십니까? yes/no");
		commit= Register.input.next();
	}
	
	
	/*
	 *  public void updateReAge(String str) {
    	    if(str.equals("학생")) {
    	    System.out.println("학생 나이입력:");
			student.setAge(Register.input.next());			
			if(student.age==null||student.age=="") {
					System.out.println("에러");
				}
    	    }else if(str.equals("교수")) {
    	    	System.out.println("교수 나이입력:");
    			professor.setAge(Register.input.next());			
    			if(professor.age==null||professor.age=="") {
    					System.out.println("에러");
    				}
    	    }else if(str.equals("관리자")) {
    	    	System.out.println("관리자 나이입력:");
    			manager.setAge(Register.input.next());			
    			if(manager.age==null||manager.age=="") {
    					System.out.println("에러");
    				}
    	    }
    }
    public void updateReIrum(String str) {
    	    if(str.equals("학생")) {
			System.out.println("학생 이름입력:");
			student.setIrum(Register.input.next());
			if(student.irum==null||student.irum=="") {
				System.out.println("에러");
			  }
    	    }else if(str.equals("교수")) {
    	    	System.out.println("교수 이름입력:");
    			professor.setIrum(Register.input.next());
    			if(professor.irum==null||professor.irum=="") {
    				System.out.println("에러");
    			  }
    	    }else if(str.equals("관리자")) {
    	    	System.out.println("관리자 이름입력:");
    			manager.setIrum(Register.input.next());
    			if(manager.irum==null||manager.irum=="") {
    				System.out.println("에러");
    			  }
    	    }    	    
    }
	 * */
	public void updateReAgeName() {
		System.out.println("수정할 나이입력");
		ageUpdate = Register.input.next();
		if(ageUpdate==null ||ageUpdate=="") {
			System.out.println("에러");
		}
		System.out.println("수정할 이름입력");
		nameDB = Register.input.next();
		if(nameDB==null ||nameDB=="") {
			System.out.println("에러");
		}
	}
	public void updateReStudentNum() {
		System.out.println("수정할 학번입력");
	//	student.setHakbun(Register.input.next());
		studentNumUpdate = Register.input.next();
		if(studentNumUpdate==null ||studentNumUpdate=="") {
			System.out.println("에러");
		}
	}

	public void updateStudentDisplay(int cnt) {
		if(cnt==1) {
			System.out.println(cnt+"건의 [학생] 정보가 수정되었습니다.");
		}else {
			System.out.println(" 교수 정보 변경을 실패하였습니다.");
		} 
	}
	
	//학생끝
	
	//교수시작
	
	public void professorViewDisplay() {
		System.out.print("[교수진] 나이: "+professor.getAge()+"\t"+"이름: "+professor.getName()+"\t"+"담당과목: "+professor.getSubject()+"\n");
		System.out.println("기존 정보입니다.");
	}
	public void updateReSubject() {
		System.out.println("수정할 담당과목입력");
		subjectUpdate = Register.input.next();
		if(subjectUpdate==null ||subjectUpdate=="") {
			System.out.println("에러");
		}
	}
	
	public void updateProfessorDisplay(int cnt) {
		if(cnt==1) {
			System.out.println(cnt+"건의 [교수] 정보가 수정되었습니다.");
		}else {
			System.out.println(" 교수 정보 변경을 실패하였습니다.");
			
		} 
	}
	
	//교수 끝
	
	
	
	
	public void manageViewDisplay() {
		System.out.print("[관리자] 나이: "+manage.getAge()+"\t"+"이름: "+manage.getPart()+"\t"+"담당부서: "+manage.getPart()+"\n");
		System.out.println("기존 정보입니다.");
	}
	public void updateRePart() {
		System.out.println("수정할 부서입력");
		partUpdate= Register.input.next();
		if(partUpdate==null ||partUpdate=="") {
			System.out.println("에러");
		}
	}
	
	public void updateManageDisplay(int cnt) {
		if(cnt==1) {
			System.out.println(cnt+"건의 [관리자] 정보가 수정되었습니다.");
		}else {
			System.out.println(" 관리자 정보 변경을 실패하였습니다.");
		} 
	}
	
	
	
	public String update() {
		 nameUpdate();
		 objectUpdate();
			try {
				 	if(object.equals("학생")) {	 
					 updateDAO.studentUpdate(nameUpdate);
					 student=updateDAO.studentExecute();
					 if(nameUpdate.equals(student.getName())) {//
						 updateDAO.studentUpdateView(nameUpdate);
						 updateDAO.studentExecuteView();
						 studentViewDisplay();
						 commitFinal();
						 if(commit.equals("yes")||commit.equals("YES")) {
							// updateReAge("학생");
							// updateReIrum("학생");
							 updateReAgeName();
							 updateReStudentNum();
							 
							 //updateDAO.updateStudentFinal(student,irumUpdate); 	
							 updateDAO.updateStudentFinal(ageUpdate,nameDB,studentNumUpdate,nameUpdate);
							 cnt=updateDAO.updateStudentExecute();
							 updateStudentDisplay(cnt);
							 result="continue";
						 }else {
							result="continue";
						 }
					 }
				 }//학생수정
				 	else if(object.equals("교수")) {//교수수정
				 		updateDAO.ProfessorUpdate(nameUpdate);	 		
				 		professor=updateDAO.professorExecute();
				 		if(nameUpdate.equals(professor.getName())) {//
				 			updateDAO.professorUpdateView(nameUpdate);
				 			updateDAO.professorExecuteView();
				 			professorViewDisplay();
				 			commitFinal();
					 		if(commit.equals("yes")||commit.equals("YES")) {
					 			updateReAgeName();
					 			updateReSubject();
					 			updateDAO.updateProfessorFinal(ageUpdate,nameDB,subjectUpdate,nameUpdate);
								cnt=updateDAO.updateProfessorExecute();
								updateProfessorDisplay(cnt);
								result="continue";
					 		}else {
								 result="continue";
							 }
				 		}
				 }//교수수정
				 	else if(object.equals("관리자")) {//관리자수정
				 		updateDAO.manageUpdate(nameUpdate);
				 		manage=updateDAO.manageExecute();
				 		if(nameUpdate.equals(manage.getName())) {//
				 			updateDAO.manageUpdateView(nameUpdate);
				 			updateDAO.manageExecuteView();
				 			manageViewDisplay();
				 			commitFinal();
				 				if(commit.equals("yes")||commit.equals("YES")) {
				 					updateReAgeName();
				 					updateRePart();
				 					updateDAO.updateManageFinal(ageUpdate,nameDB,partUpdate,nameUpdate);
				 					cnt=updateDAO.updateManageExecute();
				 					updateManageDisplay(cnt);
				 					result="continue";
				 				}else {
									 result="continue";
								 }
				 		}
				 		
				 	}//관리자수정
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		return result;
		 } 
	
	
} 


