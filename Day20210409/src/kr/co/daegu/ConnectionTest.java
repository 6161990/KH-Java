package kr.co.daegu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	
		Connection conn;
	
		static {
			try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		public void connect() {
			try {
				conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","daegu","dkdlel");
			if(conn==null) {
				System.out.println("DB연결실패");
			}else {
				System.out.println("DB연결성공");
			 }
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		public static void main(String[] args) {
			ConnectionTest ct = new ConnectionTest();
			ct.connect();
		}
}
