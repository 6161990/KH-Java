package kr.or.kh.obj;

public class InterfacePloyTest {

	public static void main(String[] args) {
		CommandProcess cp = new CommandProcess();
		WriteCommand wc = new WriteCommand();
		ListCommand lc = new ListCommand();
		cp.process(lc);
		cp.process(wc);
	}

}
