package kr.or.kh;

public class JazzangProcess {
	Jazzang[] jazzang;
	
	public JazzangProcess(){
		jazzang = new Jazzang[5];
		jazzang[0] = new Jazzang("자장면",5000,2,10000);
		jazzang[1] = new Jazzang("짬뽕",5500,2,11000);
		jazzang[2] = new Jazzang("탕수육",11000,1,11000);
		jazzang[3] = new Jazzang("군만두",5000,1,5000);
		jazzang[4] = new Jazzang("누룽지탕",22000,1,2200);
	}
	boolean searchMember(String name) {
		boolean searchResult = false;
		for(int i=0; i<jazzang.length; i++) {
			if(jazzang[i].getSangpumName().equals(name)) {
				printInfo(jazzang[i]);
				searchResult=true;
			}
		}
		return searchResult;
	}
	private void printInfo(Jazzang jazzang) {
		System.out.println(jazzang.getSangpumName()+"으로 찾은 결과");
		System.out.println("상품 이름 : "+ jazzang.getSangpumName());
		System.out.println("상품 단가 : "+ jazzang.getSangpumDan());
		System.out.println("상품 수량 : "+ jazzang.getSangpumSu());
		System.out.println("가격 : "+ jazzang.getSangpumMoney());

	}

}
