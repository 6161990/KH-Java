package kr.or.kh.obj3;

import java.sql.SQLException;


public class Update extends Haksa {

	private String commit;
	private String nameDB;
	private String ageUpdate;
	private String nameUpdate;
	private String studentNumUpdate;
	private String subjectUpdate;
	private String partUpdate;
	private String result;
	private StudentDTO student;
	private ProfessorDTO professor;
	private ManageDTO manage;
	
	public Update(){
			student = new StudentDTO();
			professor = new ProfessorDTO();
			manage = new ManageDTO();
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
	
	//학생시작
	@Override
	public void studentUpdateSearch() throws SQLException {
		sql = "select name from student where name='"+nameUpdate+"'";
		stmt=conn.createStatement();
	}
	@Override
	public void studentUpdateView() throws SQLException {
		sql = "select no,age,name,studentNum from student where name='"+nameUpdate+"'";
		stmt = conn.createStatement();
	}
	
	@Override
	public void studentUpdateExecute() throws SQLException {
		rs=stmt.executeQuery(sql);
		while(rs.next()) {
			nameDB = rs.getString("name");
		}
	}
	@Override
	public void studentExecuteView() throws SQLException {
		rs= stmt.executeQuery(sql);
		while(rs.next()) {
			no = rs.getInt("no");
			student.age = rs.getString("age");
			student.name = rs.getString("name");
			student.studentNum = rs.getString("studentNum");
		}
	}
	@Override
	public void studentViewDisplay() {
		System.out.print("[학생부] 나이: "+student.getAge()+"\t"+"이름: "+student.getName()+"\t"+"학번: "+student.getStudentNum()+"\n");
		System.out.println("기존 정보입니다.");
	}
	@Override
	public void commitFinal() {
		System.out.println("변경하십니까? yes/no");
		commit= Register.input.next();
	}

	@Override
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
	@Override
	public void updateReStudentNum() {
		System.out.println("수정할 학번입력");
		studentNumUpdate = Register.input.next();
		if(studentNumUpdate==null ||studentNumUpdate=="") {
			System.out.println("에러");
		}
	}
	@Override
	public void updateStudentFinal() throws SQLException {
		sql ="update student set age='"+ageUpdate+"', name='"+nameDB+"',studentNum='"+studentNumUpdate+"' where name='"+nameUpdate+"'";
		stmt=conn.createStatement();
	}




	
	//학생끝
	
	//교수시작
	@Override
	public void ProfessorUpdateSearch() throws SQLException {
		sql ="select name from professor where name='"+nameUpdate+"'";
		stmt= conn.createStatement();
	}
	@Override
	public void professorUpdateView() throws SQLException {
		sql ="select no,age,name,subject from professor where name='"+nameUpdate+"'";
		stmt =conn.createStatement();
	}

	@Override
	public void professorUpdateExecute() throws SQLException {
		rs=stmt.executeQuery(sql);
		while(rs.next()) {
			nameDB = rs.getString("name");
		}
	}
	@Override
	public void professorExecuteView() throws SQLException {
		rs=stmt.executeQuery(sql);
		while(rs.next()) {
			no = rs.getInt("no");
			professor.age = rs.getString("age");
			professor.name = rs.getString("name");
			professor.subject = rs.getString("subject");
		}
	}
	@Override
	public void professorViewDisplay() {
		System.out.print("[교수진] 나이: "+professor.getAge()+"\t"+"이름: "+nameDB+"\t"+"담당과목: "+professor.getSubject()+"\n");
		System.out.println("기존 정보입니다.");
	}
	@Override
	public void updateReSubject() {
		System.out.println("수정할 담당과목입력");
		subjectUpdate = Register.input.next();
		if(subjectUpdate==null ||subjectUpdate=="") {
			System.out.println("에러");
		}
	}
	@Override
	public void updateProfessorFinal() throws SQLException {
		sql ="update professor set age='"+ageUpdate+"', name='"+nameDB+"',subject='"+subjectUpdate+"' where name='"+nameUpdate+"'";
		stmt=conn.createStatement();
	}

	
	//교수 끝
	
	
	@Override
	public void manageUpdateSearch() throws SQLException {
		sql ="select name from manage where name='"+nameUpdate+"'";
		stmt= conn.createStatement();
	}
	@Override
	public void manageUpdateExecute() throws SQLException {
		rs=stmt.executeQuery(sql);
		while(rs.next()) {
			nameDB = rs.getString("name");
		}
	}
	@Override
	public void manageUpdateView() throws SQLException {
		sql ="select no,age,name,part from manage where name='"+nameUpdate+"'";
		stmt =conn.createStatement();
	}
	@Override
	public void manageExecuteView() throws SQLException {
		rs=stmt.executeQuery(sql);
		while(rs.next()) {
			no = rs.getInt("no");
			manage.age = rs.getString("age");
			manage.name = rs.getString("name");
			manage.part= rs.getString("part");
		}
	}
	@Override
	public void manageViewDisplay() {
		System.out.print("[관리자] 나이: "+manage.getAge()+"\t"+"이름: "+nameDB+"\t"+"담당부서: "+manage.getPart()+"\n");
		System.out.println("기존 정보입니다.");
	}
	@Override
	public void updateRePart() {
		System.out.println("수정할 부서입력");
		partUpdate= Register.input.next();
		if(partUpdate==null ||partUpdate=="") {
			System.out.println("에러");
		}
	}
	@Override
	public void updateManageFinal() throws SQLException {
		sql ="update manage set age='"+ageUpdate+"', name='"+nameDB+"',part='"+partUpdate+"' where name='"+nameUpdate+"'";
		stmt=conn.createStatement();
	}
	
	
	
	@Override
	public String update() {
		 nameUpdate();
		 objectUpdate();
			try {
				conn=Register.getConnection();
				 	if(object.equals("학생")) {	 
					 studentUpdateSearch();
					 studentUpdateExecute();
					 if(nameUpdate.equals(nameDB)) {
						 studentUpdateView();
						 studentExecuteView();
						 studentViewDisplay();
						 commitFinal();
						 if(commit.equals("yes")||commit.equals("YES")) {
							 updateReAgeName();
							 updateReStudentNum();
							 updateStudentFinal();
							 cnt=updateStudentExecute();
							 updateStudentDisplay(cnt);
							 result="continue";
						 }else {
							result="continue";
						 }
					 }
				 }//학생수정
				 	else if(object.equals("교수")) {//교수수정
				 		ProfessorUpdateSearch();	 		
				 		professorUpdateExecute();
				 		if(nameUpdate.equals(nameDB)) {
					 	professorUpdateView();
					 	professorExecuteView();
					 	professorViewDisplay();
					 	commitFinal();
					 		if(commit.equals("yes")||commit.equals("YES")) {
					 			updateReAgeName();
					 			updateReSubject();
					 			updateProfessorFinal();
								cnt=updateProfessorExecute();
								updateProfessorDisplay(cnt);
								result="continue";
					 		}else {
								 result="continue";
							 }
				 		}
				 }//교수수정
				 	else if(object.equals("관리자")) {//관리자수정
				 		manageUpdateSearch();
				 		manageUpdateExecute();
				 		if(nameUpdate.equals(nameDB)) {
				 			manageUpdateView();
				 			manageExecuteView();
				 			manageViewDisplay();
				 			commitFinal();
				 				if(commit.equals("yes")||commit.equals("YES")) {
				 					updateReAgeName();
				 					updateRePart();
				 					updateManageFinal();
				 					updateManageExecute();
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


	@Override
	public void setStudentSql() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setProfessorSql() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setManageSql() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setAgeName(String object) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setStudentNum() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setSubject() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setPart() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void nameSearch() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void objectSearch() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void searchStudent() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void searchProfessor() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void searchManage() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void studentSearchExecute() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void professorSearchExecute() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void manageSearchExecute() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteStudent() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteProfessor() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteManage() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void listStudent() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void listProfessor() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void listManage() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}


	
	
} 


