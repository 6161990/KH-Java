package kr.or.kh.obj8;

import kr.or.kh.obj7.ProtectedData;

//상속받으면 다른 패키지에서 사용가능 //같은 패키지라면 상속안받아도 괜찮.
public class ProtectedAccess2 extends ProtectedData {  
	public void printVar() {
		System.out.println("protectedVar="+protectedVar);
	}
	public static void main(String[] args) {
		ProtectedAccess2 pa = new ProtectedAccess2();
		System.out.println(pa.protectedVar);
		pa.printVar();
	}
		
	

}
