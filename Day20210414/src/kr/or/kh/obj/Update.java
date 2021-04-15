package kr.or.kh.obj;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	private String age;
	private String studentNum;
	private String subject;
	private int no;
	private int cnt ;
	private String part;
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private String nameUpdate;
	private String object;
	private String sql;
	private String nameDB;
	private String commit;
	private String ageUpdate;
	private String studentNumUpdate;
	private String result;
	private String subjectUpdate;
	private String partUpdate;
	
	
	public Update(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
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
	public void studentUpdate() throws SQLException {
		sql = "select name from student where name='"+nameUpdate+"'";
		stmt=conn.createStatement();
	}
	public void studentUpdateView() throws SQLException {
		sql = "select no,age,name,studentNum from student where name='"+nameUpdate+"'";
		stmt = conn.createStatement();
	}
	
	public void studentExecute() throws SQLException {
		rs=stmt.executeQuery(sql);
		while(rs.next()) {
			nameDB = rs.getString("name");
		}
	}
	
	public void studentExecuteView() throws SQLException {
		rs= stmt.executeQuery(sql);
		while(rs.next()) {
			no = rs.getInt("no");
			age = rs.getString("age");
			nameDB = rs.getString("name");
			studentNum = rs.getString("studentNum");
		}
	}
	public void studentViewDisplay() {
		System.out.print("[학생부] 나이: "+age+"\t"+"이름: "+nameDB+"\t"+"학번: "+studentNum+"\n");
		System.out.println("기존 정보입니다.");
	}
	public void commitFinal() {
		System.out.println("변경하십니까? yes/no");
		commit= Register.input.next();
	}

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
		studentNumUpdate = Register.input.next();
		if(studentNumUpdate==null ||studentNumUpdate=="") {
			System.out.println("에러");
		}
	}
	public void updateStudentFinal() throws SQLException {
		sql ="update student set age='"+ageUpdate+"', name='"+nameDB+"',studentNum='"+studentNumUpdate+"' where name='"+nameUpdate+"'";
		stmt=conn.createStatement();
	}
	public int updateStudentExecute() throws SQLException {
		cnt=stmt.executeUpdate(sql);
		return cnt;
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
	public void ProfessorUpdate() throws SQLException {
		sql ="select name from professor where name='"+nameUpdate+"'";
		stmt= conn.createStatement();
	}
	public void professorUpdateView() throws SQLException {
		sql ="select no,age,name,subject from professor where name='"+nameUpdate+"'";
		stmt =conn.createStatement();
	}
	public void professorExecute() throws SQLException {
		rs=stmt.executeQuery(sql);
		while(rs.next()) {
			nameDB = rs.getString("name");
		}
	}
	public void professorExecuteView() throws SQLException {
		rs=stmt.executeQuery(sql);
		while(rs.next()) {
			no = rs.getInt("no");
			age = rs.getString("age");
			nameDB = rs.getString("name");
			subject = rs.getString("subject");
		}
	}
	public void professorViewDisplay() {
		System.out.print("[교수진] 나이: "+age+"\t"+"이름: "+nameDB+"\t"+"담당과목: "+subject+"\n");
		System.out.println("기존 정보입니다.");
	}
	public void updateReSubject() {
		System.out.println("수정할 담당과목입력");
		subjectUpdate = Register.input.next();
		if(subjectUpdate==null ||subjectUpdate=="") {
			System.out.println("에러");
		}
	}
	public void updateProfessorFinal() throws SQLException {
		sql ="update professor set age='"+ageUpdate+"', name='"+nameDB+"',subject='"+subjectUpdate+"' where name='"+nameUpdate+"'";
		stmt=conn.createStatement();
	}
	public int updateProfessorExecute() throws SQLException {
		cnt=stmt.executeUpdate(sql);
		return cnt;
	}
	public void updateProfessorDisplay(int cnt) {
		if(cnt==1) {
			System.out.println(cnt+"건의 [교수] 정보가 수정되었습니다.");
		}else {
			System.out.println(" 교수 정보 변경을 실패하였습니다.");
		} 
	}
	
	//교수 끝
	
	
	
	public void manageUpdate() throws SQLException {
		sql ="select name from manage where name='"+nameUpdate+"'";
		stmt= conn.createStatement();
	}
	public void manageExecute() throws SQLException {
		rs=stmt.executeQuery(sql);
		while(rs.next()) {
			nameDB = rs.getString("name");
		}
	}
	public void manageUpdateView() throws SQLException {
		sql ="select no,age,name,part from manage where name='"+nameUpdate+"'";
		stmt =conn.createStatement();
	}
	public void manageExecuteView() throws SQLException {
		rs=stmt.executeQuery(sql);
		while(rs.next()) {
			no = rs.getInt("no");
			age = rs.getString("age");
			nameDB = rs.getString("name");
			part = rs.getString("part");
		}
	}
	public void manageViewDisplay() {
		System.out.print("[관리자] 나이: "+age+"\t"+"이름: "+nameDB+"\t"+"담당부서: "+part+"\n");
		System.out.println("기존 정보입니다.");
	}
	public void updateRePart() {
		System.out.println("수정할 부서입력");
		partUpdate= Register.input.next();
		if(partUpdate==null ||part=="") {
			System.out.println("에러");
		}
	}
	public void updateManageFinal() throws SQLException {
		sql ="update manage set age='"+ageUpdate+"', name='"+nameDB+"',part='"+partUpdate+"' where name='"+nameUpdate+"'";
		stmt=conn.createStatement();
	}
	public int updateManageExecute() throws SQLException {
		cnt=stmt.executeUpdate(sql);
		return cnt;
	}
	public void updateManageDisplay(int cnt) {
		if(cnt==1) {
			System.out.println(cnt+"건의 [관리잔] 정보가 수정되었습니다.");
		}else {
			System.out.println(" 관리자 정보 변경을 실패하였습니다.");
		} 
	}
	
	
	
	public String update() {
		 nameUpdate();
		 objectUpdate();
			try {
				conn=Register.getConnection();
				 	if(object.equals("학생")) {	 
					 studentUpdate();
					 studentExecute();
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
				 		ProfessorUpdate();	 		
				 		professorExecute();
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
								result="continue;";
					 		}else {
								 result="continue";
							 }
				 		}
				 }//교수수정
				 	else if(object.equals("관리자")) {//관리자수정
				 		manageUpdate();
				 		manageExecute();
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
	
	
} 


