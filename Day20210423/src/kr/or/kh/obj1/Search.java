package kr.or.kh.obj1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Search {
	private String titleSearch;
	private Statement stmt;
	private String sql;
	private String readcount;
	private Connection conn;
	private int cnt;
	private String author;
	private String nal;
	private String content;
	private String title;
	private ResultSet rs;
	private int readcountUpdate;
	
	public Search() {
		
	}
	public void setSearchTitle() {
		System.out.println("검색할 게시글 제목 : ");
		titleSearch = Register.input.next();
	}
	public void getReadyConnectionSearch() throws SQLException {
		stmt = conn.createStatement();
		sql = "select no,title,content,author,nal,readcount from board where title='"+titleSearch+"'";
	}
	public void statementSqlReadcount() throws SQLException {
		stmt = conn.createStatement();
		sql = "update board set readcount='"+readcount+"' where title='"+titleSearch+"'";
	}
	public void searchDisplay(int cnt) {
		if(cnt==1) {
			System.out.println("검색결과: ");
			System.out.println("제목\t내용\t작성자\t날짜\t조회수");
			System.out.println(title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
		}else {
			System.out.println("검색 실패하였습니다.");
		}
	}
	public void close() throws SQLException {
		if(conn != null) {conn.close();}
		if(stmt != null) {stmt.close();}
		if(rs != null) {rs.close();}
	}
	public void search() {
		setSearchTitle();
		try {
			conn = Register.getConnection();
			getReadyConnectionSearch();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				cnt=rs.getInt("no");
				title = rs.getString("title");
				content = rs.getString("content");
				author = rs.getString("author");
				nal=rs.getString("nal");
				readcount=rs.getString("readcount");
			}
			readcountUpdate=Integer.parseInt(readcount);//조회수 증가위해 가져오기 
			readcountUpdate++;
			readcount=String.valueOf(readcountUpdate);
			statementSqlReadcount();
			cnt=stmt.executeUpdate(sql);
			searchDisplay(cnt);
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
