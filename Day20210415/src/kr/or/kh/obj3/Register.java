package kr.or.kh.obj3;

import java.sql.SQLException;


public class Register extends Haksa{

	private StudentDTO student;
	private ProfessorDTO professor;
	private ManageDTO manage;
	
	public Register() { //객체가 생성될 때 로드 되어야하니까. 
			student = new StudentDTO();
			professor = new ProfessorDTO();
			manage = new ManageDTO();
	}

	
	@Override
	public void setStudentSql() throws SQLException {
		sql = "insert into student(age,name,studentNum) values('"+student.getAge()+"', '"+student.getName()+"','"+student.getStudentNum()+"')";
		stmt = conn.createStatement();
	}
	@Override
	public void setProfessorSql() throws SQLException {
		sql="insert into professor(age,name,subject) values ('"+ professor.getAge() +"', '"+ professor.getName() +"', '"+ professor.getSubject() +"')";
		stmt = conn.createStatement();
	}
	@Override
	public void setManageSql() throws SQLException {
		sql="insert into manage(age,name,part) values ('"+ manage.getAge() +"', '"+ manage.getName() +"', '"+ manage.getPart() +"')";
		stmt = conn.createStatement();
	}
	
	
	@Override
	public void setAgeName(String object) {
		if(object.equals("학생")) {
			student.setAge();
			student.setName();
		}else if(object.equals("교수")) {
			professor.setAge();
			professor.setName();
		}else if(object.equals("관리자")) {
			manage.setAge();
			manage.setName();
		}
		
	}
	@Override
	public void setStudentNum() {
		student.setStudentNum();
	}
	@Override
	public void setSubject() {
		professor.setSubject();
	}
	@Override
	public void setPart() {
		manage.setPart();
	}

	@Override
	public void register() {
		 System.out.println("등록");
		 System.out.println("=======메뉴 선택======");
		    System.out.println("1.학생");
		    System.out.println("2.교수");
		    System.out.println("3.관리자");
		    System.out.println("4.이전메뉴");
		    System.out.println("번호를 선택해 주세요..");
		    cnt = input.nextInt();
		    if(cnt < 0 || cnt > 4) {
				System.out.println("에러");
			}
		    if(cnt == 1) {//학생등록
		    	setAgeName("학생");
		    	setStudentNum();
		    	try {
					conn=getConnection();
					setStudentSql();
					cnt=studentExecute();	
					displayAll("학생",cnt);
					close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		    	

		    }//학생등록
		    else if(cnt==2) {//교수등록
		    	setAgeName("교수");
		    	setSubject();
		    	try {
					conn=getConnection();
					setProfessorSql();
					cnt=professorExecute();
					displayAll("교수",cnt);
					close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		    }//교수등록
		    else if(cnt==3) { //관리자
		    	setAgeName("관리자");
		    	setPart();
		    	try {
					conn=getConnection();
					setManageSql();
					cnt=manageExecute();
					displayAll("관리자",cnt);
					close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		      	
		    }//관리자
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


	@Override
	public void studentUpdateSearch() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void studentUpdateView() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void studentUpdateExecute() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void studentExecuteView() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void studentViewDisplay() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void commitFinal() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void updateReAgeName() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void updateReStudentNum() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void updateStudentFinal() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void ProfessorUpdateSearch() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void professorUpdateView() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void professorUpdateExecute() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void professorExecuteView() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void professorViewDisplay() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void updateReSubject() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void updateProfessorFinal() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void manageUpdateSearch() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void manageUpdateExecute() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void manageUpdateView() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void manageExecuteView() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void manageViewDisplay() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void updateRePart() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void updateManageFinal() throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String update() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
}
