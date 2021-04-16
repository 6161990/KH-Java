package kr.or.kh.instance;

import java.sql.SQLException;

public interface IRegister {
	public abstract void setStudentSql() throws SQLException;
	public abstract void setProfessorSql() throws SQLException;
	public abstract void setManageSql() throws SQLException;
	public abstract void setAgeName(String object);
	public abstract void setStudentNum();
	public abstract void setSubject();
	public abstract void setPart();
	public abstract void register();
	
}
