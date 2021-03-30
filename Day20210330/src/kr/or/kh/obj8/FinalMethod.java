package kr.or.kh.obj8;

//final 변수와 메소드는 조금 다르다. 

class MethodSuper{
	 /*final*/ void superMethod() {   //상속불가 final메소드 
		System.out.println("super method");
	}
}
class MethodChild extends MethodSuper{ //상속불가 
	void superMethod() {   
		super.superMethod();
		System.out.println("child method");
	}
}

public class FinalMethod {

	public static void main(String[] args) {
		MethodChild mc = new MethodChild();
		mc.superMethod();
	}

}
