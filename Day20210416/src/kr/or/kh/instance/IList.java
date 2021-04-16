package kr.or.kh.instance;

import java.sql.SQLException;

public interface IList {
	public abstract void listStudent() throws SQLException;
	public abstract void listProfessor() throws SQLException;
	public abstract void listManage() throws SQLException;
	public abstract void list();
}
