package kr.or.kh.obj3;

import java.sql.SQLException;


public class List extends Haksa{
	private StudentDTO student;
	private ProfessorDTO professor;
	private ManageDTO manage;
	
	public List() {
			student = new StudentDTO();
			professor = new ProfessorDTO();
			manage = new ManageDTO();
	}
	
	@Override
	public void listStudent() throws SQLException {
		sql ="select no,age,name,studentNum from student";
		stmt=conn.createStatement();
	}
	@Override
	public void listProfessor() throws SQLException {
		sql ="select no,age,name,subject from professor";
		stmt=conn.createStatement();
	}
	@Override
	public void listManage() throws SQLException {
		sql ="select no,age,name,part from manage";
		stmt=conn.createStatement();
	}
	

	public void StudentListExecute() throws SQLException {
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			no = rs.getInt("no");
			student.age = rs.getString("age");
			student.name = rs.getString("name");
			student.studentNum = rs.getString("studentNum");
			System.out.print("[학생부] 나이: "+student.getAge()+"\t"+"이름: "+student.getName() +"\t"+"학번: "+student.getStudentNum()+"\n");
		}
	}

	public void ProfessorListExecute() throws SQLException {
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			no = rs.getInt("no");
			professor.age = rs.getString("age");
			professor.name = rs.getString("name");
			professor.subject = rs.getString("subject");
			System.out.print("[교수진] 나이: "+professor.getAge()+"\t"+"이름: "+professor.getName()+"\t"+"담당과목: "+professor.getSubject()+"\n");
		}
	}

	public void ManageListExecute() throws SQLException {
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			no = rs.getInt("no");
			manage.age = rs.getString("age");
			manage.name = rs.getString("name");
			manage.part = rs.getString("part");
			System.out.print("[관리자] 나이: "+manage.getAge()+"\t"+"이름: "+manage.getName()+"\t"+"담당부서: "+manage.getPart()+"\n");
		}
	}
	@Override
	public void list() {
		try {
			conn=Register.getConnection();
			listStudent();
			StudentListExecute();
			listProfessor() ;
			ProfessorListExecute();
			listManage();
			ManageListExecute();
			close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
