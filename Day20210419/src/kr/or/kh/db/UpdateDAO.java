package kr.or.kh.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDAO {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	private String sql;
	private int cnt;
	private String nameUpdate;
	private StudentDTO student;
	private ProfessorDTO professor;
	private ManageDTO manage;
	private String nameDB;
	
	public UpdateDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			student = new StudentDTO();
			professor = new ProfessorDTO();
			manage = new ManageDTO();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	//학생시작
		public void studentUpdate(String nameUpdate) throws SQLException {
			conn= RegisterDAO.getConnection();
			sql = "select name from student where name='"+nameUpdate+"'";
			stmt=conn.createStatement();
		}
		
		public void studentUpdateView(String nameUpdate) throws SQLException {
			
			sql = "select no,age,name,studentNum from student where name='"+nameUpdate+"'";
			stmt = conn.createStatement();
		}
		
		public StudentDTO studentExecute() throws SQLException {
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				student.setName(rs.getString("name"));
			}
			return student;
		}
		
		public void studentExecuteView() throws SQLException {
			rs= stmt.executeQuery(sql);
			while(rs.next()) {
				student.setNo(rs.getInt("no")); 
				student.setAge(rs.getString("age")); 
				student.setName(rs.getString("name")) ;
				student.setStudentNum(rs.getString("studentNum"));
			}
		}
		
		public void updateStudentFinal(StudentDTO student,String nameUpdate) throws SQLException {
			sql ="update student set age='"+student.getAge()+"', name='"+student.getName()+"',studentNum='"+student.getStudentNum()+"' where name='"+nameUpdate+"'";
			stmt=conn.createStatement();
		}
		public int updateStudentExecute() throws SQLException {
			cnt=stmt.executeUpdate(sql);
			return cnt;
		}
		
		
		
		
		public void ProfessorUpdate(String nameUpdate) throws SQLException {
			conn=RegisterDAO.getConnection();
			sql ="select name from professor where name='"+nameUpdate+"'";
			stmt= conn.createStatement();
		}
		public void professorUpdateView(String nameUpdate) throws SQLException {
			sql ="select no,age,name,subject from professor where name='"+nameUpdate+"'";
			stmt =conn.createStatement();
		}
		public void professorExecute() throws SQLException {
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				nameDB = rs.getString("name");
			}
		}
		public void professorExecuteView() throws SQLException {
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				professor.setNo(rs.getInt("no")); 
				professor.setAge(rs.getString("age")); 
				professor.setName(rs.getString("name")) ;
				professor.setSubject(rs.getString("subjcet"));
			}
		}
		public void updateProfessorFinal(ProfessorDTO professor,String nameUpdate) throws SQLException {
			sql ="update professor set age='"+professor.getAge()+"', name='"+nameDB+"',subject='"+professor.getSubject()+"' where name='"+nameUpdate+"'";
			stmt=conn.createStatement();
		}
		public int updateProfessorExecute() throws SQLException {
			cnt=stmt.executeUpdate(sql);
			return cnt;
		}
		
		
		
		
		public void manageUpdate() throws SQLException {
			conn=RegisterDAO.getConnection();
			sql ="select name from manage where name='"+nameUpdate+"'";
			stmt= conn.createStatement();
		}
		public void manageExecute() throws SQLException {
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				nameDB = rs.getString("name");
			}
		}
		public void manageUpdateView() throws SQLException {
			sql ="select no,age,name,part from manage where name='"+nameUpdate+"'";
			stmt =conn.createStatement();
		}
		public void manageExecuteView() throws SQLException {
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				manage.setNo(rs.getInt("no")); 
				manage.setAge(rs.getString("age")); 
				manage.setName(rs.getString("name")) ;
				manage.setPart(rs.getString("part"));
			}
		}
		
		public void updateManageFinal(ManageDTO manage,String nameUpdate) throws SQLException {
			sql ="update manage set age='"+manage.getAge()+"', name='"+nameDB+"',part='"+manage.getPart()+"' where name='"+nameUpdate+"'";
			stmt=conn.createStatement();
		}
		public int updateManageExecute() throws SQLException {
			cnt=stmt.executeUpdate(sql);
			return cnt;
		}
		
		
}
