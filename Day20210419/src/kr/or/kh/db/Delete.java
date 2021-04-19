package kr.or.kh.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	private Connection conn;
	private String object;
	private String nameDelete;
	private DeleteDAO deleteDAO;
	private int cnt;
	
	public Delete() {
			deleteDAO = new DeleteDAO();
	}
	public void deleteName() {
		System.out.println("삭제할 이름을 입력하세요.");
		nameDelete = Register.input.next();

		if(nameDelete==""| nameDelete==null) {
			System.out.println("에러");
		}
	}
	public void deleteObject() {
		System.out.println("학생, 교수, 관리자 중 해당사항을 입력하세요.");
		object = Register.input.next();
		if(object==""| object==null) {
			System.out.println("에러");
		}
	}

	public void studentDisplay(int cnt) {
		if(cnt == 1) {
			System.out.println(cnt+"건의 학생 정보가 삭제되었습니다.");
		}else {
			System.out.println("정보를 삭제하지 못했습니다.");
		}
	}
	public void professorDisplay(int cnt) {
		if(cnt == 1) {
			System.out.println(cnt+"건의 교수정보가 삭제되었습니다.");
		}else {
			System.out.println("정보를 삭제하지 못했습니다.");
		}
	}
	public void manageDisplay(int cnt) {
		if(cnt == 1) {
			System.out.println(cnt+"건의 관리자 정보가 삭제되었습니다.");
		}else {
			System.out.println("정보를 삭제하지 못했습니다.");
		}
	}
	
	
	public void delete() {
		deleteName();
		 deleteObject();
		if(object.equals("학생")) {//학생삭제
			try {
				deleteDAO.deleteStudent(nameDelete);
				cnt=deleteDAO.studentExecute();
				studentDisplay(cnt);
				deleteDAO.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//학생삭제
		else if(object.equals("교수")) {//교수삭제
			try {
				
				deleteDAO.deleteProfessor(nameDelete);
				cnt=deleteDAO.professorExecute();
				professorDisplay(cnt);
				deleteDAO.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//교수삭제
		else if(object.equals("관리자")) {//관리자 삭제
			try {
				
				deleteDAO.deleteManage(nameDelete);
				cnt=deleteDAO.manageExecute();
				manageDisplay(cnt);
				deleteDAO.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//관리자 삭제 
	
	}
	

	
}
