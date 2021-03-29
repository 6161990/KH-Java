package kr.or.kh;

public class MethodTest4 {

	//return
	//규칙 2. 반환값이 있는 메서드는 모든 경우에 return 문이 있어야한다.
	/*public static int max(int a, int b) {
		if(a>b) 
			return a;
		else 
			return b;
	}*/
	
	
	// 규칙 3. return 갯수는 최소화한다. (반드시 하나만 있어야 하는 것은 아니다.) 
	public static int max (int a, int b) {
		int result =0;
		if(a>b) {
			result =a;
		}else {
			result = b;
		}
		return result;
	}


}
