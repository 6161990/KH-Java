package kr.or.kh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BoardExecuter {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
		System.out.println("=====게시판작성=====");
		System.out.println("R 등록, S 검색, D 삭제, U 수정, L 목록");
		String protocol = input.next();
		Connection conn=null;
		Statement stmt =null;
		ResultSet rs=null;
		String sql=null;
		int cnt=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","daegu","dkdlel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(protocol.equals("R")||protocol.equals("r")) {//등록
			//					0 1234
			System.out.println("제목|내용입력:");
			String titleContent = input.next();
			int indexI = titleContent.indexOf("|");
			//System.out.println(indexI);
			String title = titleContent.substring(0,indexI);
			String content = titleContent.substring(indexI+1);
			//System.out.println(title);
			//System.out.println(content);
			System.out.println("작성자 : ");
			String author=input.next();
			System.out.println("날짜 : ");
			String nal = input.next();
			System.out.println("조회수 : ");
			String readcount = input.next();
			try {
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
					conn.close();
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}//등록
		else if(protocol.equals("S")||protocol.equals("s")) {//검색
			String title=null;
			String content=null;
			String author=null;
			String nal=null;
			String readcount=null;
			System.out.println("검색할 게시글 제목 : ");
			String titleSearch = input.next();
			try {
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
				System.out.println("검색결과: ");
				System.out.println("제목\t내용\t작성자\t날짜\t조회수");
				System.out.println(title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					rs.close();
					conn.close();
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}//검색
		else if(protocol.equals("D")||protocol.equals("d")) {//삭제
			System.out.println("삭제할 제목:");
			String titleDelete =input.next();
			try {
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
					stmt.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}//삭제
		else if(protocol.equals("U")||protocol.equals("u")) {//수정
			String titledb=null;
			String contentdb=null;
			String authordb=null;
			String naldb=null;
			String readcountdb=null;
			System.out.println("수정할 게시글 제목: ");
			String titleUpdate=input.next();
			try {
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
			System.out.print("===수정 전 게시글 입니다===");
			System.out.println("제목\t내용\t작성자\t날짜\t조회수");
			System.out.println(titledb+"\t"+contentdb+"\t"+authordb+"\t"+naldb+"\t"+readcountdb+"\n");
			System.out.println("정말로 수정하시겠습니까?");
			System.out.println("yes/no");
			String commit = input.next();
			if(commit.equals("yes")||commit.equals("YES")) {
				System.out.println("제목|내용입력:");
				String titleContentUpdate = input.next();
				int indexI = titleContentUpdate.indexOf("|");
				String titleUpdateFinal = titleContentUpdate.substring(0,indexI);
				String contentUpdate = titleContentUpdate.substring(indexI+1);
				System.out.println("작성자 : ");
				String authorUpdate=input.next();
				System.out.println("날짜 : ");
				String nalUpdate = input.next();
				System.out.println("조회수 : ");
				String readcountUpdate = input.next();
				try {
					stmt = conn.createStatement();
					sql ="insert into board (no,title,content,author,nal,readcount) values(board_seq.nextval,'"+titleUpdateFinal+"','"+contentUpdate+"','"+authorUpdate+"','"+nalUpdate+"','"+readcountUpdate+"')";
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
						conn.close();
						stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}else {
				continue;
			}
		}//수정
		else if(protocol.equals("L")||protocol.equals("l")) {//목록
			System.out.println("=====전체출력=====");
			System.out.print("제목\t내용\t작성자\t날짜\t조회수\n");
			try {
				stmt=conn.createStatement();
				sql="select no,title,content,author,nal,readcount from board";
				rs=stmt.executeQuery(sql);
				while(rs.next()) {
					cnt=rs.getInt("no");
					String title=rs.getString("title");
					String content=rs.getString("content");
					String author=rs.getString("author");
					String nal =rs.getString("nal");
					String readcount=rs.getString("readcount");
					System.out.print(title+"\t"+content+"\t"+author+"\t"+nal+"\t"+readcount+"\n");
				}
				System.out.println();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					rs.close();
					conn.close();
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}//목록
		
	  }//반복문
	}

}
