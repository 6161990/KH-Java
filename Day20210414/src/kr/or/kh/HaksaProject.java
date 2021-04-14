package kr.or.kh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class HaksaProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<HashMap<String,String>> haksaList = new ArrayList<HashMap<String,String>>();
		
		while(true) {
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
			if(cnt < 0 || cnt > 5) {
				System.out.println("에러");
			}
			Connection conn = null;
	    	Statement stmt= null;
	    	ResultSet rs =null;
			if(cnt==1) {
				 System.out.println("등록");
				 System.out.println("=======메뉴 선택======");
				    System.out.println("1.학생");
				    System.out.println("2.교수");
				    System.out.println("3.관리자");
				    System.out.println("4.이전메뉴");
				    System.out.println("번호를 선택해 주세요..");
				    cnt = input.nextInt();
				    if(cnt < 0 || cnt > 5) {
						System.out.println("에러");
					}
				    if(cnt == 1) {
				    	System.out.println("나이 : ");
				    	String age = input.next();
				    	if(age==null || age=="") {
							System.out.println("에러");
						}
				    	System.out.println("이름 : ");
				    	String name = input.next();
				    	if(name==null || name=="") {
							System.out.println("에러");
						}
				    	System.out.println("학번 : ");
				    	String studentNum = input.next();
				    	if(studentNum==null || studentNum=="") {
							System.out.println("에러");
						}
				    	
				    	//데이터베이스
				    	//1. 로드 (load) 내가 자바언어에게 데이터 베이스를 사용할거야 인식
				    
				    	try {
							Class.forName("com.mysql.jdbc.Driver");
							//2. 연결(Connection DriverManager.getConnection(url,id,password); 패스워드는 지정안함.
							conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf8","root", "");
							//request.setCharacterEncoding("UTF-8");
							//3. 준비 3-1 문장준비 
							//		 3-2 공간준비
							String sql = "insert into student(age,name,studentNum) values('"+age+"', '"+name+"','"+studentNum+"')";
							stmt = conn.createStatement();
							//4. 실행 execute
							cnt = stmt.executeUpdate(sql);
							if(cnt==1) {
								System.out.println("전학생이 등록되었습니다.");
							}else {
								System.out.println("학생등록이 실패하였습니다.");
							}
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						} catch (SQLException e) {
							e.printStackTrace();
						} finally {
							try {
							//5. 종료	
								if(conn != null) {conn.close();}
								if(stmt != null) {stmt.close();}
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
				    	
				    }//학생등록
				    else if(cnt==2) {//교수등록
				    	System.out.println("나이 : ");
				    	String age = input.next();
				    	if(age==null || age=="") {
							System.out.println("에러");
						}
				    	System.out.println("이름 : ");
				    	String name = input.next();
				    	if(name==null || name=="") {
							System.out.println("에러");
						}
				    	System.out.println("담당과목 : ");
				    	String subject = input.next();
				    	if(subject==null || subject=="") {
							System.out.println("에러");
						}
				    	//1. 로드 : 자바에게 mysql데이터베이스사용을 알림
				    	try {
							Class.forName("com.mysql.jdbc.Driver"); 
							// 2. 연결 Connection
							conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?characterEncoding=utf8","root", "");
							// 3. 준비 공간, 쿼리 준비
							String sql="insert into professor(age,name,subject) values ('"+ age +"', '"+ name +"', '"+ subject +"')";
							stmt = conn.createStatement();
							cnt = stmt.executeUpdate(sql);
							if(cnt==1) {
								System.out.println("교수가 등록되었습니다.");
							}else {
								System.out.println("교수 등록이 실패하였습니다.");
							}
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						} catch (SQLException e) {
							e.printStackTrace();
						}finally {
							try {
								if(conn != null) {conn.close();}
								if(stmt != null) {stmt.close();}
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
				    	
				    }//교수등록
				    else if(cnt==3) { //관리자
				      	System.out.println("나이 : ");
				    	String age = input.next();
				    	if(age==null || age=="") {
							System.out.println("에러");
						}
				    	System.out.println("이름 : ");
				    	String name = input.next();
				    	if(name==null || name=="") {
							System.out.println("에러");
						}
				    	System.out.println("담당부서 : ");
				    	String part = input.next();
				    	if(part==null || part=="") {
							System.out.println("에러");
						}
				    	try {
							Class.forName("com.mysql.jdbc.Driver");
							conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?characterEncoding=utf8", "root", "");
							String sql ="insert into manage(age,name,part) values('"+ age +"', '"+ name +"', '"+ part +"')";
							stmt = conn.createStatement();
							cnt = stmt.executeUpdate(sql);
							if(cnt==1) {
								System.out.println("매니저가 등록되었습니다.");
							}else {
								System.out.println("매니저 등록이 실패하였습니다.");
							}
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
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
				    }//관리자
			}//등록
			else if(cnt==2) {//찾기
				System.out.println("찾을 이름을 입력 : ");
				String nameSearch = input.next();
				if(nameSearch==null || nameSearch=="") {
					System.out.println("에러");
				}
				System.out.println("학생, 교수, 관리자 중 입력하세요");
				String object = input.next(); 
				if(object==null || object=="") {
					System.out.println("에러");
				}
				String age = null;
				String name = null;
				String studentNum = null;
				String subject = null;
				String part = null;
				
				if(object.equals("학생")) { //학생 찾기 
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?characterEncoding=utf8", "root", "");
					String sql = "select no,age,name,studentNum from student where name='"+nameSearch+"'";
					stmt =conn.createStatement();
					rs =stmt.executeQuery(sql); //insert,update, delete => executeUpdate(), search => executeQuery()
					while(rs.next()) { //메모리에서는 for문을 쓰는데 db는 while문으로 돌린ㄷㅏ.
						int no=rs.getInt("no");
						age = rs.getString("age");
						name = rs.getString("name");
						studentNum = rs.getString("studentNum");
					}
					System.out.print("나이: "+age+"\t"+"이름: "+name+"\t"+"학번: "+studentNum+"\n");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
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
				else if(object.equals("교수")) {//교수찾기
					try {
						Class.forName("com.mysql.jdbc.Driver");
						conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?characterEncoding=utf8", "root", "");
						String sql = "select no,age,name,subject from professor where name='"+nameSearch+"'";
						stmt=conn.createStatement();
						rs =stmt.executeQuery(sql);
						while(rs.next()) {
							int no = rs.getInt("no");
							age =rs.getString("age");
							name = rs.getString("name");
							subject = rs.getString("subject");
						}
						System.out.print("나이: "+age+"\t"+"이름: "+name+"\t"+"담당과목: "+subject+"\n");
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
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
				}//교수찾기
				else if(object.equals("관리자")) {
					try {
						Class.forName("com.mysql.jdbc.Driver");
						conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?characterEncoding=utf8", "root", "");
						String sql = "select no,age,name,part from manage where name='"+nameSearch+"'";
						stmt= conn.createStatement();
						rs=stmt.executeQuery(sql);
						while(rs.next()) {
							int no = rs.getInt("no");
							age =rs.getString("age");
							name =rs.getString("name");
							part =rs.getString("part");
						}
						System.out.print("나이: "+age+"\t"+"이름: "+name+"\t"+"담당부서: "+part+"\n");
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
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
				}
				System.out.println("계속하시려면 1, 종료하시려면 0을 입력하세요.");
				int number = input.nextInt();
				if(number <0 || number>5) {
					System.out.println("에러");
				}
				if(number==1) {
					continue;
				}else {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
			}//찾기
			else if(cnt==3) {//삭제
				System.out.println("삭제할 이름을 입력하세요.");
				String nameDelete= input.next();
				if(nameDelete==""| nameDelete==null) {
					System.out.println("에러");
				}
				System.out.println("학생, 교수, 관리자 중 해당사항을 입력하세요.");
				String object = input.next();
				if(object==""| object==null) {
					System.out.println("에러");
				}
					if(object.equals("학생")) { //학생삭제
					try {
						Class.forName("com.mysql.jdbc.Driver");
						conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?characterEncoding=utf8", "root", "");
						String sql = "delete from student where name='"+nameDelete+"'";
						stmt = conn.createStatement();
						cnt = stmt.executeUpdate(sql);
						if(cnt == 1) {
							System.out.println("학생이 삭제되었습니다.");
						}else {
							System.out.println("정보를 삭제하지 못했습니다.");
						}
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
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
				}//학생삭제 
					else if(object.equals("교수")) {//교수삭제
						try {
							Class.forName("com.mysql.jdbc.Driver");
							conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?characterEncoding=utf8", "root", "");
							String sql = "delete from professor where name='"+nameDelete+"'";
							stmt = conn.createStatement();
							cnt = stmt.executeUpdate(sql);
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
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
						if(cnt==1) {
							System.out.println("교수님이 삭제되었습니다.");
						}else {
							System.out.println("정보를 삭제하지 못했습니다.");
						}
					}//교수삭제
					else if(object.equals("관리자")) { //관리자 삭제 
						try {
							Class.forName("com.mysql.jdbc.Driver");
							conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?characterEncoding=utf8", "root", "");
							String sql = "delete from manage where name='"+nameDelete+"'";
							stmt =conn.createStatement();
							cnt =stmt.executeUpdate(sql);
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
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
						if(cnt==1) {
							System.out.println("관리자 님이 삭제되었습니다.");
						}else {
							System.out.println("정보를 삭제하지 못했습니다.");
						}
					}//관리자 삭제 
					System.out.println("계속하시려면1, 종료하시려면 0을 입력해주세요.");
					int number = input.nextInt();
					if(number<0 ||number>1) {
						System.out.println("에러");
					}
					if(number == 1) {
						continue;
					}else {
						System.out.println("프로그램 종료");
						System.exit(0);
					}
			}//삭제
			else if(cnt==4) {//전체출력
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?characterEncoding=utf8", "root", "");
					String sql ="select no,age,name,studentNum from student";
					stmt=conn.createStatement();
					rs = stmt.executeQuery(sql);
					String name = null;
					String age = null;
					String studentNum = null;
					String subject = null;
					String part = null;
					while(rs.next()) {
						int no = rs.getInt("no");
						age = rs.getString("age");
						name = rs.getString("name");
						studentNum = rs.getString("studentNum");
						System.out.print("[학생부] 나이: "+age+"\t"+"이름: "+name+"\t"+"학번: "+studentNum+"\n");
					}
					sql ="select no,age,name,subject from professor";
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					while(rs.next()) {
						int no = rs.getInt("no");
						age = rs.getString("age");
						name = rs.getString("name");
						subject = rs.getString("subject");
						System.out.print("[교수진] 나이: "+age+"\t"+"이름: "+name+"\t"+"담당과목: "+subject+"\n");
					}
					sql ="select no,age,name,part from manage";
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					while(rs.next()) {
						int no = rs.getInt("no");
						age = rs.getString("age");
						name = rs.getString("name");
						part = rs.getString("part");
						System.out.print("[관리자] 나이: "+age+"\t"+"이름: "+name+"\t"+"담당부서: "+part+"\n");
					}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
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
				System.out.println("계속하시려면1, 종료하시려면 0을 입력해주세요.");
				int number = input.nextInt();
				if(number<0 ||number>1) {
					System.out.println("에러");
				}
				if(number == 1) {
					continue;
				}else {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
			}//전체출력
			else if(cnt==0) {//종료
				System.out.println("프로그램 종료");
				System.exit(0);
			}//종료
			else if(cnt==5) {//수정
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?characterEncoding=utf8", "root", "");
					System.out.println("수정할 이름을 입력하세요");
					String nameUpdate=input.next();
					if(nameUpdate==null ||nameUpdate=="") {
						System.out.println("에러");
					}
					System.out.println("학생, 교수, 관리자 중 입력");
					String object = input.next();
					if(object==null ||object=="") {
						System.out.println("에러");
					}
					String nameDB = null;
					String age = null;
					String studentNum = null;
					String subject = null;
					String part = null;
					if(object.equals("학생")) {//학생수정
						String sql = "select name from student where name='"+nameUpdate+"'";
						stmt=conn.createStatement();
						rs=stmt.executeQuery(sql);
						while(rs.next()) {
							nameDB = rs.getString("name");
						}
						if(nameUpdate.equals(nameDB)) {
							sql = "select no,age,name,studentNum from student where name='"+nameUpdate+"'";
							stmt = conn.createStatement();
							rs= stmt.executeQuery(sql);
							while(rs.next()) {
								int no = rs.getInt("no");
								age = rs.getString("age");
								nameDB = rs.getString("name");
								studentNum = rs.getString("studentNum");
							}
							System.out.print("[학생부] 나이: "+age+"\t"+"이름: "+nameDB+"\t"+"학번: "+studentNum+"\n");
							System.out.println("기존 입력한 정보입니다. 변경하십니까? yes/no");
							String commit = input.next();
							if(commit.equals("yes")||commit.equals("YES")) {
								System.out.println("수정할 나이입력");
								String ageUpdate = input.next();
								if(ageUpdate==null ||ageUpdate=="") {
									System.out.println("에러");
								}
								System.out.println("수정할 이름입력");
								nameDB = input.next();
								if(nameDB==null ||nameDB=="") {
									System.out.println("에러");
								}
								System.out.println("수정할 학번입력");
								String studentNumUpdate = input.next();
								if(studentNumUpdate==null ||studentNumUpdate=="") {
									System.out.println("에러");
								}
								sql ="update student set age='"+ageUpdate+"', name='"+nameDB+"',studentNum='"+studentNumUpdate+"' where name='"+nameUpdate+"'";
								stmt=conn.createStatement();
								cnt=stmt.executeUpdate(sql);
								if(cnt==1) {
									System.out.println(nameDB+"님의 정보가 수정되었습니다.");
								}else {
									System.out.println(" 학생 정보 변경을 실패하였습니다.");
								} 
							}else {
								continue;
							}
						}

					}//학생수정
					else if(object.equals("교수")) {//교수수정
						String sql ="select name from professor where name='"+nameUpdate+"'";
						stmt= conn.createStatement();
						rs=stmt.executeQuery(sql);
						while(rs.next()) {
							nameDB = rs.getString("name");
						}
						if(nameUpdate.equals(nameDB)) {
							sql ="select no,age,name,subject from professor where name='"+nameUpdate+"'";
							stmt =conn.createStatement();
							rs=stmt.executeQuery(sql);
							while(rs.next()) {
								int no = rs.getInt("no");
								age = rs.getString("age");
								nameDB = rs.getString("name");
								subject = rs.getString("subject");
							}
							System.out.print("[교수진] 나이: "+age+"\t"+"이름: "+nameDB+"\t"+"담당과목: "+subject+"\n");
							System.out.println("기존 입력한 정보입니다. 변경하십니까? yes/no");
							String commit = input.next();
							if(commit.equals("yes")||commit.equals("YES")) {
								System.out.println("수정할 나이입력");
								String ageUpdate = input.next();
								if(ageUpdate==null ||ageUpdate=="") {
									System.out.println("에러");
								}
								System.out.println("수정할 이름입력");
								nameDB = input.next();
								if(nameDB==null ||nameDB=="") {
									System.out.println("에러");
								}
								System.out.println("수정할 담당과목입력");
								String subjectUpdate = input.next();
								if(subjectUpdate==null ||subjectUpdate=="") {
									System.out.println("에러");
								}
								sql ="update professor set age='"+ageUpdate+"', name='"+nameDB+"',subject='"+subjectUpdate+"' where name='"+nameUpdate+"'";
								stmt=conn.createStatement();
								cnt=stmt.executeUpdate(sql);
								if(cnt==1) {
									System.out.println(nameDB+"님의 정보가 수정되었습니다.");
								}else {
									System.out.println(" 교수 정보 변경을 실패하였습니다.");
								} 
							}else {
								continue;
							}
						}
					}//교수수정
					else if(object.equals("관리자")) {//관리자수정
						String sql ="select name from manage where name='"+nameUpdate+"'";
						stmt= conn.createStatement();
						rs=stmt.executeQuery(sql);
						while(rs.next()) {
							nameDB = rs.getString("name");
						}
						if(nameUpdate.equals(nameDB)) {
							sql ="select no,age,name,part from manage where name='"+nameUpdate+"'";
							stmt =conn.createStatement();
							rs=stmt.executeQuery(sql);
							while(rs.next()) {
								int no = rs.getInt("no");
								age = rs.getString("age");
								nameDB = rs.getString("name");
								part = rs.getString("part");
							}
							System.out.print("[교수진] 나이: "+age+"\t"+"이름: "+nameDB+"\t"+"담당부서: "+part+"\n");
							System.out.println("기존 입력한 정보입니다. 변경하십니까? yes/no");
							String commit = input.next();
							if(commit.equals("yes")||commit.equals("YES")) {
								System.out.println("수정할 나이입력");
								String ageUpdate = input.next();
								if(ageUpdate==null ||ageUpdate=="") {
									System.out.println("에러");
								}
								System.out.println("수정할 이름입력");
								nameDB = input.next();
								if(nameDB==null ||nameDB=="") {
									System.out.println("에러");
								}
								System.out.println("수정할 담당부서입력");
								String partUpdate = input.next();
								if(partUpdate==null ||partUpdate=="") {
									System.out.println("에러");
								}
								sql ="update manage set age='"+ageUpdate+"', name='"+nameDB+"',part='"+partUpdate+"' where name='"+nameUpdate+"'";
								stmt=conn.createStatement();
								cnt=stmt.executeUpdate(sql);
								if(cnt==1) {
									System.out.println(nameDB+"님의 정보가 수정되었습니다.");
								}else {
									System.out.println(" 관리자 정보 변경을 실패하였습니다.");
								} 
							}else {
								continue;
							}
						}
					}//관리자수정
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
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
			}//수정
			
		}
	
	}

}
