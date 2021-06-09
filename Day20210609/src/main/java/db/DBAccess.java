package db;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/dba")
public class DBAccess extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		//useSSL=false 서버시큐어라이선스? 보안을 해놓는다, 안한다
		final String DSN ="jdbc:mysql://localhost:3306/sns?useSSL=false";
		final String USER ="root";
		final String PASSWORD="dkdlel";
		
		Connection conn = null;
		
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		PreparedStatement pstmt3 = null;
		
		ResultSet rset1 = null;
		ResultSet rset2 = null;
		
		PrintWriter out = response.getWriter();
		
		out.println("<html lang='ko'>");
		out.println("<head>");
		out.println("<title>DB연동 </title>");
		out.println("</head>");
		out.println("<body>");
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); // JDBC 드라이버
			conn = DriverManager.getConnection(DSN, USER, PASSWORD); // DB 연결
			String sql = "SELECT * FROM users WHERE userId=?";  // SQ문 생성 및 실행 
			pstmt1 = conn.prepareStatement(sql);
			pstmt1.setInt(1, 1);
			
			rset1 = pstmt1.executeQuery();
			
			out.println("<p>１건검색 </p>");
	        out.println("<pre>");
	         
		         //검색 결과가 있는지
		         if(rset1.next()) {
		        	 out.print(rset1.getString(2)+":");
		        	 out.print(rset1.getString(3)+":");
		        	 out.print(rset1.getString(4)+":");
		        	 out.print(rset1.getString(5)+":");
		        	 out.println(rset1.getString(6));
		         }
	         
	         out.println("</pre>");
	         out.println("<hr>");
	         
	         //SQL 문 생성 및 실행
	         sql = "INSERT INTO users(loginId,password,userName,icon,profile) VALUES(?,?,?,?,?)";
	         pstmt2 = conn.prepareStatement(sql);
	         pstmt2.setString(1, "black");
	         pstmt2.setString(2, "pink");
	         pstmt2.setString(3, "jenny");
	         pstmt2.setString(4, "icon-user");
	         pstmt2.setString(5, "서울시 용산구");
	         pstmt2.executeUpdate();
	         
	         //SQL문 생성 및 실행
	         sql = "SELECT * FROM users";
	         pstmt3 = conn.prepareStatement(sql);
	         rset2 = pstmt3.executeQuery();
	         out.println("<p>전체 검색</p>");
	         out.println("<pre>");
	         
		         //쿼리 결과 행 몇 분간 반복
		         while(rset2.next()) {
		        	 out.print(rset2.getString(2)+ ":");
		        	 out.print(rset2.getString(3)+ ":");
		        	 out.print(rset2.getString(4)+ ":");
		        	 out.print(rset2.getString(5)+ ":");
		        	 out.println(rset2.getString(6));
		         }
	         out.println("</pre>");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rset1.close();
				rset2.close();
				pstmt1.close();
				pstmt2.close();
				pstmt3.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		  out.println("</body>");
		  out.println("</html>");	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
