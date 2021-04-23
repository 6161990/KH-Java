package kr.or.kh.obj1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class List {
	private Statement stmt;
	private String sql;
	private Connection conn;
	private int cnt;
	private ResultSet rs;
	private String author;
	private String nal;
	private String content;
	private String title;
	private String readcount;
	
	public void setListTitle() {
		System.out.println("=====전체출력=====");
		System.out.print("제목\t내용\t작성자\t날짜\t조회수\n");
	}
	public void statementSqlList() throws SQLException {
		stmt=conn.createStatement();
		sql="select no,title,content,author,nal,readcount from board";
	}
	public void close() throws SQLException {
		if(conn != null) {conn.close();}
		if(stmt != null) {stmt.close();}
		if(rs != null) {rs.close();}
	}

	public void list() {
		setListTitle();
		try {
			conn = Register.getConnection();
			statementSqlList();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				cnt=rs.getInt("no");
				title=rs.getString("title");
				content=rs.getString("content");
				author=rs.getString("author");
				nal =rs.getString("nal");
				readcount=rs.getString("readcount");
				System.out.print(title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
			}
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		}
	
	}
		
}

