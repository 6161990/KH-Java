package kr.or.kh.instance;

import java.sql.SQLException;

public interface ISearch {
	public abstract void nameSearch();
	public abstract void objectSearch();
	public abstract void searchStudent() throws SQLException;
	public abstract void searchProfessor() throws SQLException;
	public abstract void searchManage() throws SQLException;
	public abstract void studentSearchExecute() throws SQLException;
	public abstract void professorSearchExecute() throws SQLException;
	public abstract void manageSearchExecute() throws SQLException;
//	public abstract void studentDisplay() ; 부모에도 있으므로 상속 받아 오버라이딩(재정의)
//	public abstract void professorDisplay();
//	public abstract void manageDisplay();
	public abstract void search();
}
