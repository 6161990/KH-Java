package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import dto.SnsDTO;
import dto.UserDTO;

public class DataManager extends SnsDAO{

		//로그인ID와 비밀번호를 받고 등록된 사용자 목록에 일치하는 것이 있는지 체크
		public UserDTO getLoginUser(String loginId, String password) {
			Connection conn = null;            // 데이터베이스 연결정보 
			PreparedStatement pstmt = null;    // SQL 관리정보 
			ResultSet rset = null;             // 검색결과 
			
			String sql = "SELECT * FROM users WHERE loginId=? AND password=?";
			UserDTO user = null;
			
			try {
				// 데이터베이스 접속정보얻기 
				conn = getConnection();

				// SELECT문 등록 및 실행
				pstmt = conn.prepareStatement(sql); //SELECT 구문등록
				pstmt.setString(1, loginId);
				pstmt.setString(2, password);
				rset = pstmt.executeQuery();
				
				//검색 결과 있다면
				if(rset.next()) {
					//필요한 열에서 값을 꺼내 사용자 정보 객체를 생성
					user = new UserDTO();
					user.setLoginId(rset.getString(2));
					user.setPassword(rset.getString(3));
					user.setUserName(rset.getString(4));
					user.setIcon(rset.getString(5));
					user.setProfile(rset.getString(6));
				}
			} catch(SQLException e) {
				e.printStackTrace();
			} finally {
				//데이터 베이스 종료
				close(rset);
				close(pstmt);
				close(conn);
			}
			return user;
		}
		
		
		//쓰기 내용 목록 getter
		public ArrayList<SnsDTO> getSnsList(){
			Connection conn = null;
			Statement pstmt = null;
			ResultSet rset = null;
			
			ArrayList<SnsDTO> list = new ArrayList<SnsDTO>();
			
			try {
				//SnsDAO 클래스 메소드 호출
				conn = getConnection();
				pstmt = conn.createStatement();
				
				//SELECT 문 실행
				String sql = "SELECT * FROM shouts ORDER BY date DESC";
				rset = pstmt.executeQuery(sql);
				
				//검색 결과 수 만큼 반복
				while(rset.next()) {
					//필요한 열에서 값을 꺼내서 쓰기 내용 객체 생성
					SnsDTO shout = new SnsDTO();
					shout.setUserName(rset.getString(2));
					shout.setIcon(rset.getString(3));
					shout.setDate(rset.getString(4));
					shout.setWriting(rset.getString(5));
					
					//쓰기 내용 목록에 추가
					list.add(shout);
				}
			} catch(SQLException e) {
				e.printStackTrace();
			} finally {
				//데이터 베이스 닫기
				close(rset);
				close(pstmt);
				close(conn);
			}
			return list;
		}
		
		//로그인 사용자 정보와 기록 내용을 받아 목록에 추가
		public boolean setWriting(UserDTO user, String writing) {
			Connection conn = null;
			PreparedStatement pstmt = null;

			boolean result = false;
			try {
				conn = getConnection();
				
				//INSERT 문 등록 및 시행
				String sql = "INSERT INTO shouts(userName, icon, date, writing) VALUES(?,?,?,?)";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, user.getUserName());
				pstmt.setString(2, user.getIcon());
				Calendar calendar = Calendar.getInstance();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				pstmt.setString(3, sdf.format(calendar.getTime()));
				pstmt.setString(4, writing);
				
				int cnt = pstmt.executeUpdate();
				if(cnt == 1 ) {
					//INSERT문 실행결과 1이면 등록 성공
					result = true;
				}
			}catch (SQLException e) {
				e.printStackTrace();
			} finally {
				// 데이터베이스 닫기 
				close(pstmt);
				close(conn);
			}

			return result;
		}
		
		
}
