package Exception;

public class Person {
	
	static void Set(int a) throws IllegalAccessException {
		if( a < 0) {
			throw new IllegalAccessException("양수가 없습니다.");
		}
	}
	public static void main(String[] args) {
		try {
			Set(-2);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
