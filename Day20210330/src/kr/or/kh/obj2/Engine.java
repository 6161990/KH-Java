package kr.or.kh.obj2;

//Has-a 관계 (소유, 포함의 관계)
public class Engine {
	
	public String kind; //엔진의이름

	public Engine() {
		super();
		kind="삼성엔진";
	}

	@Override
	public String toString() {
		return "Engine [kind=" + kind + "]";
	}
		
	
	

}
