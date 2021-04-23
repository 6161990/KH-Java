package kr.or.kh.obj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	private String titleDelete;
	private Connection conn;
	private Statement stmt;
	private String sql;
	private int cnt;
	public Delete() {
		
	}
	
	public void setDeleteTitle() {
		System.out.println("삭제할 제목:");
		titleDelete =Register.input.next();
	}
	public void statementSqlDelete() throws SQLException {
		stmt= conn.createStatement();
		sql="delete board where title='"+titleDelete+"'";
	}
	public void deleteDisplay(int cnt) {
		if(cnt==1) {
			System.out.println("게시글이 삭제되었습니다.");
		} else {
			System.out.println("게시글 삭제를 실패하였습니다.");
		}
	}
	public void close() throws SQLException {
		if(conn != null) {conn.close();}
		if(stmt != null) {stmt.close();}
	}

public void delete() {
	setDeleteTitle();
	try {
		conn = Register.getConnection();
		statementSqlDelete();
		cnt=stmt.executeUpdate(sql);
		deleteDisplay(cnt);
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
}



