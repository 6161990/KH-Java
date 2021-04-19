package kr.or.kh.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class List {
	private Connection conn;
	private ListDAO listDAO;
	
	public List() {
			listDAO = new ListDAO();
	}

	
	public void list() {
		try {
			//conn=RegisterDAO.getConnection();
			listDAO.listStudent();
			listDAO.studentExecute();
			listDAO.listProfessor() ;
			listDAO.professorExecute();
			listDAO.listManage();
			listDAO.manageExecute();
			listDAO.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	

	
}
