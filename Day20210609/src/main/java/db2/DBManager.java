package db2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBManager extends SnsDAO{
	
	//로그인 ID와 비밀번호를 받고 등록된 사용자 목록에서 일치한 사용자가 있는지 검색함
	public UserDTO getLoginUser(String loginId, String password) {
		Connection conn = null; // 데이터베이스 연결정보
		PreparedStatement  pstmt = null;  // SQL관리정보
		ResultSet rset = null;  // 검색결과
		
		String sql = "SELECT * FROM users WHERE loginId=? AND password=?";
		UserDTO user = null;
		
		try {
			conn = getConnection();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,loginId);
			pstmt.setString(2, password);
			rset = pstmt.executeQuery();
			
			//검색결과가 있는 경우
			if(rset.next()) {
				//필요한 열에서 값을 꺼내 사용자 정보 객체 생성함
				user = new UserDTO();
				user.setLoginId(rset.getString(2));
				user.setPassword(rset.getString(3));
				user.setUserName(rset.getString(4));
				user.setIcon(rset.getString(5));
				user.setProfile(rset.getString(6));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			//데이터 베이스 종료 처리
			close(rset);
			close(pstmt);
			close(conn);
		}
		return user;
	}

}
