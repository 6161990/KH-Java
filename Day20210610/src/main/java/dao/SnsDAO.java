package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SnsDAO {
	
	private final String DSN = "jdbc:mysql://localhost:3306/sns?useSSL=false";
	private final String USER = "root"; //study
	private final String PASSWORD = "dkdlel"; //1234

	// 데이터베이스 연결정보 
		public Connection getConnection() {
			Connection conn = null;

			try {
				// JDBC드라이버 로드 
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // 데이터베이스 연결 
	            conn = DriverManager.getConnection(DSN, USER, PASSWORD);
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}catch(SQLException e){
				e.printStackTrace();
			}

			return conn;
		}

		// Connection형 변수가 있는 데이터베이스와 JDBC리소스 닫기 
		public void close(Connection conn) {
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		// Statement형 변수가 있는 데이터베이스와 JDBC리소스 닫기 
		public void close(Statement stmt) {
			if(stmt != null){
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		// ResultSet형 변수가 있는 데이터베이스와 JDBC리소스 닫기 
		public void close(ResultSet rset) {
			if(rset != null){
				try {
					rset.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
}
