package kr.or.kh;

public class ArgsException extends Exception {
	//직접 예외 만들기 Exception 상속
	
	private int argsNumber;
	
	public ArgsException(String msg) {
		super(msg);
	}
	
	
	public int getArgsNumber() {
		return argsNumber;
	}

	public void setArgsNumber(int argsNumber) {
		this.argsNumber = argsNumber;
	}
	
	
}
