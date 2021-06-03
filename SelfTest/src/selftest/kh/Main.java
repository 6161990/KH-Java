package selftest.kh;
import java.util.*;

public class Main {

	

	public static void main(String[] args) {
		
		JDBCTest1 jdbc = new JDBCTest1();
		
		ArrayList<HashMap<String,Object>> memoList = null;
		memoList=jdbc.testSelect();
		
		System.out.println("==================================");
		
		System.out.println("no \t name \t msg \t writeday");
		
		System.out.println("==================================");
			
		if(memoList != null) {
		
				for(HashMap<String,Object> memo : memoList) {
					
					System.out.println(memo.get("NO")+"\t"+memo.get("NAME")+"\t"+memo.get("MSG")+"\t"+memo.get("WRITEDAY"));
				
				}
		
		}else
		
		System.out.println("== 입력된 데이터가 없습니다 ==");
		
		}

}