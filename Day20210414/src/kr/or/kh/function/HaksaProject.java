package kr.or.kh.function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

import kr.or.kh.function.HaksaFunction;



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
				HaksaFunction.Register(cnt, input, conn, stmt);
			}//등록
			
			else if(cnt==2) {//찾기
				HaksaFunction.Search(cnt, input, conn, stmt, rs);
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
					HaksaFunction.Delete(cnt, input, conn, stmt);
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
				HaksaFunction.List(cnt, input, conn, stmt, rs);
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
				String result=HaksaFunction.Update(cnt, input, conn, stmt, rs);
				if(result.equals(result)) {
					continue;
				}
			}//수정
			
		}
	
	}

}
