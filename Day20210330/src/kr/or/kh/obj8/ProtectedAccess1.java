package kr.or.kh.obj8;

import kr.or.kh.obj7.ProtectedData;

//상속받으면 다른 패키지에서 사용가능 //같은 패키지라면 상속안받아도 괜찮.
public class ProtectedAccess1 {

	public static void main(String[] args) {
		ProtectedData pd = new ProtectedData();
		//System.out.println(pd.protectedVar); protectedVar는 같은 패키지에서 접근 가능
	

	}

}
