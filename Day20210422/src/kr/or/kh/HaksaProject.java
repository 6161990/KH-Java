package kr.or.kh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HaksaProject {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Connection conn =null;
		Statement stmt =null;
		ResultSet rs=null;
		
		//1. 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","daegu","dkdlel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		while(true) { //반복문
			System.out.println("======메뉴 선택======");
			System.out.println("1. 등록");
			System.out.println("2. 찾기");
			System.out.println("3. 삭제");
			System.out.println("4. 전체출력");
			System.out.println("5. 등록된 정보 수정");
			System.out.println("-------------------");
			System.out.println("0.종료");
			System.out.println("번호를 선택해주세요...");
			int cnt = input.nextInt();
			if(cnt==1) {//등록
				System.out.println("등록");
				System.out.println("======메뉴 선택======");
				System.out.println("1. 학생");
				System.out.println("2. 교수");
				System.out.println("3. 관리자");
				System.out.println("4. 이전메뉴");
				System.out.println("번호를 선택해주세요...");
				cnt=input.nextInt();
				if(cnt==1) { //학생
					System.out.println("나이: ");
					String age = input.next();
					System.out.println("이름: ");
					String name = input.next();
					System.out.println("학번: ");
					String studentNum = input.next();
					//1. 쿼리 준비 2. 공간 준비
					try {
						String sql ="insert into student(no,age,name,studentNum) values(student_seq.nextval,'"+age+"','"+name+"','"+studentNum+"')";            
						stmt = conn.createStatement();
						//실행
						cnt=stmt.executeUpdate(sql);
						if(cnt==1) {
							System.out.println("학생이 등록되었습니다.");
						}else {
							System.out.println("학생 등록이 실패되었습니다.");
						}
					} catch (SQLException e) {
						e.printStackTrace();
					} finally {
						//종료
						try {
							if(conn != null) {conn.close();}
							if(stmt != null) {stmt.close();}
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}//학생
				else if(cnt==2) {//교수
					System.out.println("나이: ");
					String age = input.next();
					System.out.println("이름: ");
					String name = input.next();
					System.out.println("담당 과목: ");
					String subject = input.next();
					try {
						String sql ="insert into professor(no,age,name,subject) values(professor_seq.nextval,'"+age+"','"+name+"','"+subject+"')";            
						stmt = conn.createStatement();
						cnt=stmt.executeUpdate(sql);
						if(cnt==1) {
							System.out.println("교수가 등록되었습니다.");
						}else {
							System.out.println("교수 등록이 실패되었습니다.");
						}
					} catch (SQLException e) {
						e.printStackTrace();
					} finally {
						try {
							if(conn != null) {conn.close();}
							if(stmt != null) {stmt.close();}
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}//교수
				else if(cnt==3) {//매니저
					System.out.println("나이: ");
					String age = input.next();
					System.out.println("이름: ");
					String name = input.next();
					System.out.println("담당 부서: ");
					String part = input.next();
					try {
						String sql="insert into manage(no,age,name,part) values(manage_seq.nextval,'"+age+"','"+name+"','"+part+"')";
						stmt=conn.createStatement();
						cnt=stmt.executeUpdate(sql);
						if(cnt==1) {
							System.out.println("관리자가 등록되었습니다.");
						}else {
							System.out.println("관리자등록이 실패되었습니다.");
						}
					} catch (SQLException e) {
						e.printStackTrace();
					} finally {
						try {
							if(conn != null) {conn.close();}
							if(stmt != null) {stmt.close();}
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}//매니저
			}//등록
			else if(cnt==2) {//찾기
				String age=null;
				String name=null;
				String studentNum=null;
				String subject=null;
				String part=null;
				System.out.println("찾을 이름을 입력해주세요.");
				String nameSearch = input.next();
				System.out.println("1.학생 2.교수 3.관리자 중 선택하세요");
				cnt=input.nextInt();
				if(cnt==1) { //학생찾기
					try {
						conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","daegu","dkdlel");
						stmt=conn.createStatement();
						String sql="select no,age,name,studentNum from student where name='"+nameSearch+"'";
						rs=stmt.executeQuery(sql);
						while(rs.next()) {
							cnt=rs.getInt("no");
							age=rs.getString("age");
							name=rs.getString("name");
							studentNum=rs.getString("studentNum");
						}
						System.out.println("나이:"+age+"\t"+"이름:"+name+"\t"+"학번:"+studentNum+"\n");
					} catch (SQLException e) {
						e.printStackTrace();
					} finally {
						try {
							if(conn != null) {conn.close();}
							if(stmt != null) {stmt.close();}
							if(rs != null) {rs.close();}
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}//학생찾기
				else if(cnt==2) {//교수 찾기
					try {
						conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","daegu","dkdlel");
						stmt=conn.createStatement();
						String sql="select no,age,name,subject from professor where name='"+nameSearch+"'";
						rs=stmt.executeQuery(sql);
						while(rs.next()) {
							cnt=rs.getInt("no");
							age=rs.getString("age");
							name=rs.getString("name");
							subject=rs.getString("subject");
						}
						System.out.println("나이:"+age+"\t"+"이름:"+name+"\t"+"담당과목:"+subject+"\n");
					} catch (SQLException e) {
						e.printStackTrace();
					} finally {
						try {
							if(conn != null) {conn.close();}
							if(stmt != null) {stmt.close();}
							if(rs != null) {rs.close();}
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}//교수 찾기
				else if(cnt==3) {//관리자 찾기
					try {
						conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","daegu","dkdlel");
						stmt=conn.createStatement();
						String sql ="select no,age,name,part from manage where name='"+nameSearch+"'";
						rs=stmt.executeQuery(sql);
						while(rs.next()) {
							cnt=rs.getInt("no");
							age=rs.getString("age");
							name=rs.getString("name");
							part=rs.getString("part");
						}
						System.out.println("나이:"+age+"\t"+"이름:"+name+"\t"+"담당부서:"+part+"\n");
					} catch (SQLException e) {
						e.printStackTrace();
					} finally {
						try {
							if(conn != null) {conn.close();}
							if(stmt != null) {stmt.close();}
							if(rs != null) {rs.close();}
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					
				}//관리자찾기
				System.out.println("계속하시려면1, 종료하시려면 0");
				cnt=input.nextInt();
				if(cnt==1) {
					continue;
				}else {
					System.out.println("프로그램종료");
					System.exit(0);
				}
			}//찾기
			else if(cnt==3) {//삭제
				System.out.println("삭제할 이름을 입력하세요");
				String nameDelete=input.next();
				System.out.println("1.학생 2.교수 3.관리자 중 선택하세요");
				cnt=input.nextInt();
				if(cnt==1) { //학생삭제
					try {
						conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","daegu","dkdlel");
						//3 준비, 실행 
						stmt=conn.createStatement();
						String sql="delete from student where name='"+nameDelete+"'";
						cnt=stmt.executeUpdate(sql);
						if(cnt==1) {
							System.out.println("학생이 삭제되었습니다.");
						}else {
							System.out.println("학생 삭제가 실패했습니다.");
						}
					} catch (SQLException e) {
						e.printStackTrace();
					} finally {
						try {
							if(conn != null) {conn.close();}
							if(stmt != null) {stmt.close();}
						} catch (SQLException e) {
							e.printStackTrace();
						}
					} 
					
				}else if(cnt==2) { //교수삭제
					try {
						conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","daegu","dkdlel");
						stmt = conn.createStatement();
						String sql = "delete from professor where name='"+nameDelete+"'";
						cnt=stmt.executeUpdate(sql);
						if(cnt==1) {
							System.out.println("교수가 삭제되었습니다.");
						}else {
							System.out.println("교수 삭제를 실패하였습니다.");
						}
					} catch (SQLException e) {
						e.printStackTrace();
					} finally {
						try {
							if(conn != null) {conn.close();}
							if(stmt != null) {stmt.close();}
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}else if(cnt==3) { //관리자삭제
					try {
						conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","daegu","dkdlel");
						stmt=conn.createStatement();
						String sql="delete from manage where name='"+nameDelete+"'";
						cnt=stmt.executeUpdate(sql);
						if(cnt==1) {
							System.out.println("관리자가 삭제되었습니다.");
						}else {
							System.out.println("관리자 삭제를 실패하였습니다.");
						}
					} catch (SQLException e) {
						e.printStackTrace();
					} finally {
						try {
							if(conn != null) {conn.close();}
							if(stmt != null) {stmt.close();}
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}//관리자 삭제
				System.out.println("게속하시려면1, 종료하시려면 0");
				cnt=input.nextInt();
				if(cnt==1) {
					continue;
				}else {
					System.out.println("프로그램종료");
					System.exit(0);
				}
			}//삭제
			else if(cnt==4) {//전체출력
				//3. 준비(쿼리와공간) , 3.실행
				String sql="select no,age,name,studentNum from student";
				try {
					conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","daegu","dkdlel");
					stmt = conn.createStatement();
					rs=stmt.executeQuery(sql);
					while(rs.next()) {
						cnt = rs.getInt("no");
						String age = rs.getString("age");
						String name = rs.getString("name");
						String studentNum=rs.getString("studentNum");
						System.out.println("이름: "+name+"\t"+"나이: "+age+"\t"+"학번:"+studentNum+"\n");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						if(conn != null) {conn.close();}
						if(stmt != null) {stmt.close();}
						if(rs != null) {rs.close();}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
				sql ="select no,age,name,subject from professor";
				try {
					conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","daegu","dkdlel");
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					while(rs.next()) {
						cnt = rs.getInt("no");
						String age = rs.getString("age");
						String name = rs.getString("name");
						String subject=rs.getString("subject");
						System.out.println("이름: "+name+"\t"+"나이: "+age+"\t"+"담당과목: "+subject+"\n");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						if(conn != null) {conn.close();}
						if(stmt != null) {stmt.close();}
						if(rs != null) {rs.close();}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
				sql="select no,age,name,part from manage";
				
				try {
					conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","daegu","dkdlel");
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					while(rs.next()) {
						cnt = rs.getInt("no");
						String age = rs.getString("age");
						String name = rs.getString("name");
						String part=rs.getString("part");
						System.out.println("이름: "+name+"\t"+"나이: "+age+"\t"+"담당부서: "+part+"\n");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						if(conn != null) {conn.close();}
						if(stmt != null) {stmt.close();}
						if(rs != null) {rs.close();}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				System.out.println("계속하시려면 1, 종료하시려면 0을 입력해주세요");
				cnt= input.nextInt();
				if(cnt==1) {
					continue;
				}else {
					System.out.println("프로그램종료");
					System.exit(0);
				}
			}//전체출력
			else if(cnt==5) {//수정
				String age =null;
				String name =null;
				String studentNum=null;
				String commit =null;
				String subject =null;
				String part =null;
				System.out.println("수정할 이름을 입력하세요");
				String nameUpdate=input.next();
				System.out.println("1.학생 2.교수 3.관리자 중 선택하세요");
				cnt=input.nextInt();
				if(cnt==1) {//학생수정
					try {
						conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","daegu","dkdlel");
						stmt=conn.createStatement();
						String sql="select no,age,name,studentNum from student where name='"+nameUpdate+"'";
						rs=stmt.executeQuery(sql);
						while(rs.next()) {
							cnt= rs.getInt("no");
							age = rs.getString("age");
							name = rs.getString("name");
							studentNum=rs.getString("studentNum");
						}
						System.out.println("이름: "+name+"\t"+"나이: "+age+"\t"+"학번:"+studentNum+"\n");
						System.out.println("기존에 입력한 정보입니다.");
						System.out.println("수정하시겠습니까? yes/no");
						commit=input.next();
						if(commit.equals("yes")||commit.equals("YES")) {
							System.out.println("나이: ");
							String ageUpdate =input.next();
							System.out.println("이름: ");
							String nameUpdateFinal=input.next();
							System.out.println("학번: ");
							String studentNumUpdate =input.next();
							stmt=conn.createStatement();
							//sql="update student  set ('"+ageUpdate+"',name='"+nameUpdateFinal+"',studentNum='"+studentNumUpdate+"') = ( age,name,studentNum where name='"+nameUpdate+"'";
							//sql="update student set (age,name,studentNum) = (SELECT '"+ageUpdate+"','"+nameUpdateFinal+"','"+studentNumUpdate+"') where name='"+nameUpdate+"'";
							//sql="update student set age='"+ageUpdate+"',name='"+nameUpdateFinal+"',studentNum='"+studentNumUpdate+"' where name='"+nameUpdate+"'";
							sql="update student set age='"+ageUpdate+"',name='"+nameUpdateFinal+"',studentNum='"+studentNumUpdate+"' where name='"+nameUpdate+"'";
							cnt=stmt.executeUpdate(sql);
							if(cnt==1) {
								System.out.println("학생 정보가 수정되었습니다.");
							}else {
								System.out.println("정보 수정을 실패하였습니다.");
							}
						}else {
							continue;
						}
					} catch (SQLException e) {
						e.printStackTrace();
					} finally {
						try {
							if(conn != null) {conn.close();}
							if(stmt != null) {stmt.close();}
							if(rs != null) {rs.close();}
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}//학생수정
				else if(cnt==2){//교수수정
					try {
						conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","daegu","dkdlel");
						stmt=conn.createStatement();
						String sql="select no,age,name,subject from professor where name='"+nameUpdate+"'";
						rs=stmt.executeQuery(sql);
						while(rs.next()) {
							cnt= rs.getInt("no");
							age = rs.getString("age");
							name = rs.getString("name");
							subject=rs.getString("subject");
						}
						System.out.println("이름: "+name+"\t"+"나이: "+age+"\t"+"담당과목:"+subject+"\n");
						System.out.println("기존에 입력한 정보입니다.");
						System.out.println("수정하시겠습니까? yes/no");
						commit=input.next();
						if(commit.equals("yes")||commit.equals("YES")) {
							System.out.println("나이: ");
							String ageUpdate =input.next();
							System.out.println("이름: ");
							String nameUpdateFinal=input.next();
							System.out.println("담당과목: ");
							String subjectUpdate =input.next();
							stmt=conn.createStatement();
							sql="update professor set age='"+ageUpdate+"',name='"+nameUpdateFinal+"',subject='"+subjectUpdate+"' where name='"+nameUpdate+"'";
							cnt=stmt.executeUpdate(sql);
							if(cnt==1) {
								System.out.println("교수 정보가 수정되었습니다.");
							}else {
								System.out.println("정보 수정을 실패하였습니다.");
							}
						}else {
							continue;
						}
					} catch (SQLException e) {
						e.printStackTrace();
					} finally {
						try {
							if(conn != null) {conn.close();}
							if(stmt != null) {stmt.close();}
							if(rs != null) {rs.close();}
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}//교수수정
				else if(cnt==3) {//관리자수정
					try {
						conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","daegu","dkdlel");
						stmt=conn.createStatement();
						String sql="select no,age,name,part from manage where name='"+nameUpdate+"'";
						rs=stmt.executeQuery(sql);
						while(rs.next()) {
							cnt= rs.getInt("no");
							age = rs.getString("age");
							name = rs.getString("name");
							part=rs.getString("part");
						}
						System.out.println("이름: "+name+"\t"+"나이: "+age+"\t"+"담당부서:"+part+"\n");
						System.out.println("기존에 입력한 정보입니다.");
						System.out.println("수정하시겠습니까? yes/no");
						commit=input.next();
						if(commit.equals("yes")||commit.equals("YES")) {
							System.out.println("나이: ");
							String ageUpdate =input.next();
							System.out.println("이름: ");
							String nameUpdateFinal=input.next();
							System.out.println("담당부서: ");
							String partUpdate =input.next();
							stmt=conn.createStatement();
							sql="update manage set age='"+ageUpdate+"',name='"+nameUpdateFinal+"',part='"+partUpdate+"' where name='"+nameUpdate+"'";
							cnt=stmt.executeUpdate(sql);
							if(cnt==1) {
								System.out.println("관리자 정보가 수정되었습니다.");
							}else {
								System.out.println("정보 수정을 실패하였습니다.");
							}
						}else {
							continue;
						}
					} catch (SQLException e) {
						e.printStackTrace();
					} finally {
						try {
							if(conn != null) {conn.close();}
							if(stmt != null) {stmt.close();}
							if(rs != null) {rs.close();}
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}//관리자수정
			}//수정
		}//while 반복문
		
	}

}
