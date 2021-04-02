package kr.or.kh;

public class ExceptionTest5 {
	//예외 던지기 
	
	public void exceptionMethod() throws ClassNotFoundException {
		//throw /*Anonymous anoymous = */ new NullPointerException();
		throw new ClassNotFoundException();
	}
	
	public static void main(String[] args) {
		ExceptionTest5 et5 = new ExceptionTest5();
		try {
			et5.exceptionMethod();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
