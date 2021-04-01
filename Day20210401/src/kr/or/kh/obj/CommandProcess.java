package kr.or.kh.obj;

public class CommandProcess {
	public void process(Command command) {  //인터페이스를 매개변수로 (매개변수의 다형성)
		command.execute();
	}
}
