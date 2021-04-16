package kr.or.kh.instance;

import java.sql.SQLException;

public interface IUpdate {
	public abstract void studentUpdateSearch() throws SQLException ;
	public abstract void studentUpdateView() throws SQLException;
	public abstract void studentUpdateExecute() throws SQLException;
	public abstract void studentExecuteView() throws SQLException ;
	public abstract void studentViewDisplay();
	public abstract void commitFinal() ;
	public abstract void updateReAgeName();  
	public abstract void updateReStudentNum() throws SQLException; 
	public abstract void updateStudentFinal() throws SQLException ;
	
	public abstract void ProfessorUpdateSearch() throws SQLException;
	public abstract void professorUpdateView() throws SQLException;
	public abstract void professorUpdateExecute() throws SQLException;
	public abstract void professorExecuteView() throws SQLException;
	public abstract void professorViewDisplay();
	public abstract void updateReSubject();
	public abstract void updateProfessorFinal() throws SQLException;
	
	public abstract void manageUpdateSearch() throws SQLException;
	public abstract void manageUpdateExecute() throws SQLException;
	public abstract void manageUpdateView() throws SQLException;
	public abstract void manageExecuteView() throws SQLException;
	public abstract void manageViewDisplay();
	public abstract void updateRePart() ;
	public abstract void updateManageFinal()throws SQLException;
	
	public abstract String update();
}
