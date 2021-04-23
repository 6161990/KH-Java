package kr.or.kh.obj1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	private String titleUpdate;
	private Statement stmt;
	private String sql;
	private Connection conn;
	private int cnt;
	private ResultSet rs;
	private String titledb;
	private String contentdb;
	private String authordb;
	private String naldb;
	private String readcountdb;
	private String commit;
	private int indexI;
	private String titleContent;
	private String titleUpdateFinal;
	private String contentUpdateFinal;
	private String result;
	
	public Update() {
		
	}
	public void setUpdateTitle() {
		System.out.println("수정할 게시글 제목: ");
		titleUpdate=Register.input.next();
	}
	public void getReadyConnectionUpdate() throws SQLException {
		stmt=conn.createStatement();
		sql="select no,title,content,author,nal,readcount from board where title='"+titleUpdate+"'";
	}

	public void setUpdateCommit() {
		System.out.println("===수정 전 게시글 입니다===");
		System.out.println("제목\t내용\t작성자\t날짜\t조회수\n");
		System.out.println(titledb+"\t"+contentdb+"\t"+authordb+"\t"+naldb+"\t"+readcountdb+"\n");
		System.out.println("정말로 수정하시겠습니까?");
		System.out.println("yes/no");
		commit = Register.input.next();
	}
	public void setUpdateTitleContent() {
		System.out.println("수정할 제목|내용입력:");
		titleContent = Register.input.next();
		setUpdateTitleContent(titleContent);
	}
	public void setUpdateTitleContent(String titleContent) {
		indexI = titleContent.indexOf("|");
		titleUpdateFinal = titleContent.substring(0,indexI);
		contentUpdateFinal = titleContent.substring(indexI+1);
	}
	public void getReadyConnectionUpdateFinal() throws SQLException {
		stmt = conn.createStatement();
		sql ="update board set title='"+titleUpdateFinal+"', content='"+contentUpdateFinal+"' where title='"+titleUpdate+"'";
	}
	public void updateDisplay(int cnt) {
		if(cnt==1) {
			System.out.println("게시글이 수정되었습니다.");
		}else {
			System.out.println("게시글 수정을 실패했습니다.");
		}
	}
	public void close() throws SQLException {
		if(conn != null) {conn.close();}
		if(stmt != null) {stmt.close();}
		if(rs != null) {rs.close();}
	}
	
	public String update() {
		setUpdateTitle();
		try {
			conn = Register.getConnection();
			getReadyConnectionUpdate();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				cnt=rs.getInt("no");
				titledb=rs.getString("title");
				contentdb=rs.getString("content");
				authordb=rs.getString("author");
				naldb=rs.getString("nal");
				readcountdb=rs.getString("readcount");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		setUpdateCommit();
		if(commit.equals("yes")||commit.equals("YES")) {
			setUpdateTitleContent();
			try {
				getReadyConnectionUpdateFinal();
				cnt=stmt.executeUpdate(sql);
				updateDisplay(cnt);
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			result="ok";
		}else {
			result="continue";
		}
		return result;
		
	}
	
}
