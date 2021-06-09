package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SnsDAO {
	
	private final String DSN ="jdbc:mysql://localhost:3306/sns?useSSL=false";
	private final String USER ="root";
	private final String PASSWORD ="dkdlel";
	
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DSN, USER, PASSWORD);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//Connection 리소스 해제
	public void close(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	

	// PreparedStatement형 변수가 있는 데이터베이스와 JDBC리소스 해제 
	public void close(Statement stmt) {
		if(stmt != null) {
			try {
				stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// ResultSet형 변수가 있는 데이터베이스와 JDBC리소스 해제
	public void close(ResultSet rset) {
		if(rset != null) {
			try {
				rset.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	

}
