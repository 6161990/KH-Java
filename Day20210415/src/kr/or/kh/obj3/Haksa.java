package kr.or.kh.obj3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Scanner;


public abstract class Haksa {
	protected int no;
	protected int cnt;
	protected String age;
	protected String name;
	protected String studentNum;
	protected String subject;
	protected String part;
	protected String object;
	protected String commit;
	protected Statement stmt;
	protected String sql;
	protected ResultSet rs;
	
	public static Scanner input;
	public static Connection conn;
	static {
		input = new Scanner(System.in);
	}
	
	public Haksa() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf8","root", "");
		return conn;
	}

	//학생
	public void displayAll(String str,int cnt) {
		if(str.equals("학생")) {
			System.out.println("전학생으로 등록되었습니다.");
			if(cnt==0) {
				System.out.println("학생등록이 실패되었습니다.");
			}
		}else if(str.equals("교수")) {
			System.out.println("교수로 등록되었습니다.");
			if(cnt==0) {
				System.out.println("교수등록이 실패되었습니다.");
			}
		}else if(str.equals("관리자")) {
			System.out.println("관리자로 등록되었습니다.");
			if(cnt==0) {
				System.out.println("관리자등록이 실패되었습니다.");
			}
		}
	}
	
	public int studentExecute() throws SQLException {
		cnt = stmt.executeUpdate(sql);
		return cnt;
	}
	public int professorExecute() throws SQLException {
		cnt = stmt.executeUpdate(sql);
		return cnt;
	}
	public int manageExecute() throws SQLException {
		cnt = stmt.executeUpdate(sql);
 		return cnt;
	}
	//학생
	
	
	//검색
	public void close() throws SQLException {
		if(conn != null) {conn.close();}
		if(stmt != null) {stmt.close();}
		if(rs != null) {rs.close();}
	}
	
	//삭제
	public void studentDisplay() {
		if(cnt == 1) {
			System.out.println(cnt+"건의 학생 정보가 삭제되었습니다.");
		}else {
			System.out.println("정보를 삭제하지 못했습니다.");
		}
	}
	public void professorDisplay() {
		if(cnt == 1) {
			System.out.println(cnt+"건의 교수정보가 삭제되었습니다.");
		}else {
			System.out.println("정보를 삭제하지 못했습니다.");
		}
	}
	public void manageDisplay() {
		if(cnt == 1) {
			System.out.println(cnt+"건의 관리자 정보가 삭제되었습니다.");
		}else {
			System.out.println("정보를 삭제하지 못했습니다.");
		}
	}
	
	//수정
	public void updateStudentDisplay(int cnt) {
		if(cnt==1) {
			System.out.println(cnt+"건의 [학생] 정보가 수정되었습니다.");
		}else {
			System.out.println(" 교수 정보 변경을 실패하였습니다.");
		} 
	}
	public void updateProfessorDisplay(int cnt) {
		if(cnt==1) {
			System.out.println(cnt+"건의 [교수] 정보가 수정되었습니다.");
		}else {
			System.out.println(" 교수 정보 변경을 실패하였습니다.");
			
		} 
	}

	public void updateManageDisplay(int cnt) {
		if(cnt==1) {
			System.out.println(cnt+"건의 [관리자] 정보가 수정되었습니다.");
		}else {
			System.out.println(" 관리자 정보 변경을 실패하였습니다.");
		} 
	}
	public int updateStudentExecute() throws SQLException {
		cnt=stmt.executeUpdate(sql);
		return cnt;
	}
	public int updateProfessorExecute() throws SQLException {
		cnt=stmt.executeUpdate(sql);
		return cnt;
	}
	public int updateManageExecute() throws SQLException {
		cnt=stmt.executeUpdate(sql);
		return cnt;
	}
	
	
	//등록 
	public abstract void setStudentSql() throws SQLException;
	public abstract void setProfessorSql() throws SQLException;
	public abstract void setManageSql() throws SQLException;
	public abstract void setAgeName(String object);
	public abstract void setStudentNum();
	public abstract void setSubject();
	public abstract void setPart();
	public abstract void register();
	
	//검색
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

	
	//삭제
	public abstract void deleteStudent() throws SQLException;
	public abstract void deleteProfessor() throws SQLException;
	public abstract void deleteManage() throws SQLException;
	public abstract void delete();
	
	//전체출력
	public abstract void listStudent() throws SQLException;
	public abstract void listProfessor() throws SQLException;
	public abstract void listManage() throws SQLException;
	public abstract void list();

	//수정
	public abstract void studentUpdateSearch() throws SQLException ;
	public abstract void studentUpdateView() throws SQLException;
	public abstract void studentUpdateExecute() throws SQLException;
	public abstract void studentExecuteView() throws SQLException ;
	public abstract void studentViewDisplay();
	public abstract void commitFinal() ;
	public abstract void updateReAgeName();  
	public abstract void updateReStudentNum() throws SQLException; 
	public abstract void updateStudentFinal() throws SQLException ;
//	public abstract int updateStudentExecute() throws SQLException ;

	public abstract void ProfessorUpdateSearch() throws SQLException;
	public abstract void professorUpdateView() throws SQLException;
	public abstract void professorUpdateExecute() throws SQLException;
	public abstract void professorExecuteView() throws SQLException;
	public abstract void professorViewDisplay();
	public abstract void updateReSubject();
	public abstract void updateProfessorFinal() throws SQLException;
//	public abstract int updateProfessorExecute() throws SQLException;
	
	public abstract void manageUpdateSearch() throws SQLException;
	public abstract void manageUpdateExecute() throws SQLException;
	public abstract void manageUpdateView() throws SQLException;
	public abstract void manageExecuteView() throws SQLException;
	public abstract void manageViewDisplay();
	public abstract void updateRePart() ;
	public abstract void updateManageFinal()throws SQLException;
//	public abstract int updateManageExecute();
	public abstract String update();
}
