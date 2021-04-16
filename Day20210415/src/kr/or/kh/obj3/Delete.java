package kr.or.kh.obj3;

import java.sql.SQLException;

public class Delete extends Haksa{
	
	private String nameDelete;

	
	public Delete() {}
	
	public void deleteName() {
		System.out.println("삭제할 이름을 입력하세요.");
		nameDelete= Register.input.next();
		if(nameDelete==""| nameDelete==null) {
			System.out.println("에러");
		}
	}
	public void deleteObject() {
		System.out.println("학생, 교수, 관리자 중 해당사항을 입력하세요.");
		object = Register.input.next();
		if(object==""| object==null) {
			System.out.println("에러");
		}
	}
	@Override
	public void deleteStudent() throws SQLException {
		sql = "delete from student where name='"+nameDelete+"'";
		stmt = conn.createStatement();
	}
	@Override
	public void deleteProfessor() throws SQLException {
		sql = "delete from professor where name='"+nameDelete+"'";
		stmt = conn.createStatement();
	}
	@Override
	public void deleteManage() throws SQLException {
		sql = "delete from manage where name='"+nameDelete+"'";
		stmt =conn.createStatement();
	}
	@Override
	public void delete() {
		deleteName();
		 deleteObject();
		if(object.equals("학생")) {//학생삭제
			try {
				conn=Register.getConnection();
				deleteStudent();
				studentExecute();
				studentDisplay();
				close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//학생삭제
		else if(object.equals("교수")) {//교수삭제
			try {
				conn=Register.getConnection();
				deleteProfessor();
				professorExecute();
				professorDisplay();
				close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//교수삭제
		else if(object.equals("관리자")) {//관리자 삭제
			try {
				conn=Register.getConnection();
				deleteManage();
				manageExecute();
				manageDisplay();
				close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//관리자 삭제 
	
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
