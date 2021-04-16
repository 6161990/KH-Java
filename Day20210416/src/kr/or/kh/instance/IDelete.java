package kr.or.kh.instance;

import java.sql.SQLException;

public interface IDelete {
	public abstract void deleteStudent() throws SQLException;
	public abstract void deleteProfessor() throws SQLException;
	public abstract void deleteManage() throws SQLException;
	public abstract void delete();
}
