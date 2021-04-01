package kr.or.kh;


interface Interface1{
	public static int interVar=10;  
	public abstract void interface1Method();
}
class Interface1Impl implements Interface1{

	@Override
	public void interface1Method() {
		System.out.println("interface1Method 구현 ");
	}
	
}


public class InterfaceTest1 {

	public static void main(String[] args) {
		Interface1Impl in1Impl = new Interface1Impl();
		System.out.println("in1Impl.interVar="+in1Impl.interVar);
		System.out.println("dddd="+Interface1.interVar);
		// => static 메모리 공간 클래스 이름 인터페이스 이름으로 접근을 해서 사용할 수 있다. 
		// => 한편, 인스턴스변수는  new 연산자로 객체 만들어질 때 사용
		
		in1Impl.interface1Method();
	}

}
