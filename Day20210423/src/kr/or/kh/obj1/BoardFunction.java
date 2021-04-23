package kr.or.kh.obj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BoardFunction {
	public static Scanner input;
	private Statement stmt;
	public Connection conn;
	private ResultSet rs;
	private String sql;
	private int cnt;
	private String titleContent;
	private int indexI;
	private String title;
	private String content;
	private String author;
	private String nal;
	private String readcount;
	private String titleSearch;
	private String titleDelete;
	private String titledb;
	private String contentdb;
	private String authordb;
	private String naldb;
	private String readcountdb;
	private String result;
	private String titleUpdate;
	private String commit;
	private String titleUpdateFinal;
	private String contentUpdateFinal;

	public BoardFunction() {
		
	}
 	public void register() {
 		System.out.println("제목|내용입력:");
		titleContent = input.next();
		indexI = titleContent.indexOf("|");
		title = titleContent.substring(0,indexI);
		content = titleContent.substring(indexI+1);
		System.out.println("작성자 : ");
		author=input.next();
		System.out.println("날짜 : ");
		nal = input.next();
		System.out.println("조회수 : ");
		readcount = input.next();
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","daegu","dkdlel");
			stmt = conn.createStatement();
			sql ="insert into board (no,title,content,author,nal,readcount) values(board_seq.nextval,'"+title+"','"+content+"','"+author+"','"+nal+"','"+readcount+"')";
			cnt=stmt.executeUpdate(sql);
			if(cnt==1) {
				System.out.println("게시글이 등록되었습니다.");
			}else {
				System.out.println("게시글 등록을 실패했습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {conn.close();}
				if(stmt != null) {stmt.close();}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void search() {
		System.out.println("검색할 게시글 제목 : ");
		titleSearch = input.next();
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","daegu","dkdlel");
			stmt = conn.createStatement();
			sql = "select no,title,content,author,nal,readcount from board where title='"+titleSearch+"'";
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				cnt=rs.getInt("no");
				title = rs.getString("title");
				content = rs.getString("content");
				author = rs.getString("author");
				nal=rs.getString("nal");
				readcount=rs.getString("readcount");
			}
			int readcountUpdate=Integer.parseInt(readcount);//조회수 증가위해 가져오기 
			readcountUpdate++;
			readcount=String.valueOf(readcountUpdate);
			stmt = conn.createStatement();
			sql = "update board set readcount='"+readcount+"' where title='"+titleSearch+"'";
			cnt=stmt.executeUpdate(sql);
			System.out.println("검색결과: ");
			System.out.println("제목\t내용\t작성자\t날짜\t조회수");
			System.out.println(title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {conn.close();}
				if(stmt != null) {stmt.close();}
				if(rs != null) {rs.close();}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void delete() {
		System.out.println("삭제할 제목:");
		titleDelete =input.next();
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","daegu","dkdlel");
			stmt=conn.createStatement();
			sql="delete board where title='"+titleDelete+"'";
			cnt=stmt.executeUpdate(sql);
			if(cnt==1) {
				System.out.println("게시글이 삭제되었습니다.");
			} else {
				System.out.println("게시글 삭제를 실패하였습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {conn.close();}
				if(stmt != null) {stmt.close();}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	public String update() {
		System.out.println("수정할 게시글 제목: ");
		titleUpdate=input.next();
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","daegu","dkdlel");
			stmt=conn.createStatement();
			sql="select no,title,content,author,nal,readcount from board where title='"+titleUpdate+"'";
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
		System.out.println("===수정 전 게시글 입니다===");
		System.out.println("제목\t내용\t작성자\t날짜\t조회수\n");
		System.out.println(titledb+"\t"+contentdb+"\t"+authordb+"\t"+naldb+"\t"+readcountdb+"\n");
		System.out.println("정말로 수정하시겠습니까?");
		System.out.println("yes/no");
		commit = input.next();
		if(commit.equals("yes")||commit.equals("YES")) {
			System.out.println("수정할 제목|내용 :");
			titleContent = input.next();
			indexI = titleContent.indexOf("|");
			try {
				titleUpdateFinal = titleContent.substring(0,indexI);
				contentUpdateFinal = titleContent.substring(indexI+1);
				stmt = conn.createStatement();
				sql ="update board set title='"+titleUpdateFinal+"', content='"+contentUpdateFinal+"' where title='"+titleUpdate+"'";
				cnt=stmt.executeUpdate(sql);
				if(cnt==1) {
					System.out.println("게시글이 수정되었습니다.");
				}else {
					System.out.println("게시글 수정을 실패했습니다.");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if(conn != null) {conn.close();}
					if(stmt != null) {stmt.close();}
					if(rs != null) {rs.close();}
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
	
	public void list() {
		System.out.println("=====전체출력=====");
		System.out.print("제목\t내용\t작성자\t날짜\t조회수\n");
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","daegu","dkdlel");
			stmt=conn.createStatement();
			sql="select no,title,content,author,nal,readcount from board";
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
				if(conn != null) {conn.close();}
				if(stmt != null) {stmt.close();}
				if(rs != null) {rs.close();}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	}

	}
	
	
}
