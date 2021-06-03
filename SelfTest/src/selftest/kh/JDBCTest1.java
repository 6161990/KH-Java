package selftest.kh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JDBCTest1 {
	   private Connection conn = null;
	   private PreparedStatement pstmt = null;
	   private ResultSet rs = null;
	   
	   private void close() {
	      try {
	      if(rs != null) {rs.close(); rs=null;}
	      if(pstmt != null) {pstmt.close(); pstmt=null;}
	      if(conn != null) {conn.close(); conn=null;}
	      } catch (SQLException e) { e.printStackTrace(); }
	      }
	   
	   
	   public ArrayList<HashMap<String,Object>> testSelect() {

		   ArrayList<HashMap<String,Object>> memoList = new ArrayList<HashMap<String,Object>>(); 
	   try {
	   Class.forName("oracle.jdbc.driver.OracleDriver");
	   conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "daegu", "dkdlel"); 
	   String sql = " select no, name, msg, writeday "
	   + " from tbl_memo "
	   + " order by no asc ";
	   pstmt = conn.prepareStatement(sql);
	   rs = pstmt.executeQuery();
	   int count = 0;
	   while(rs.next()) {
	   count++;
	   if(count==1) {
	   memoList = new ArrayList<HashMap<String,Object>>(); 
	   }
	   HashMap<String,Object> memo = new HashMap<String,Object>();
	   memo.put("NO", rs.getInt(1)); 
	   memo.put("NAME", rs.getString(2)); 
	   memo.put("MSG", rs.getString(3)); 
	   memo.put("WRITEDAY", rs.getDate(4)); 
	   memoList.add(memo);
	   
	   }
	   } catch (Exception e) {
	   e.printStackTrace();
	   } finally { 
	   close(); 
	   }
	   return memoList; 

	   }
	}