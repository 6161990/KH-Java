package kr.or.kh;

public class LotteriaProcess {
	Lotteria[] lotteria;
	public LotteriaProcess() {
		lotteria = new Lotteria[5];
		lotteria[0] = new Lotteria("감자튀김",500,2,1000);
		lotteria[1] = new Lotteria("제로콜라",2000,2,4000);
		lotteria[2] = new Lotteria("햄버거",4000,2,8000);
		lotteria[3] = new Lotteria("롱스틱",2400,2,4800);
		lotteria[4] = new Lotteria("아이스크림",1000,2,2000);
	}
	boolean searchMember(String name) {
		boolean searchResult = false;
		for(int i=0; i<lotteria.length; i++) {
			if(lotteria[i].getSangpumName().equals(name)) {
				printInfo(lotteria[i]);
				searchResult=true;
			}
		}
		return searchResult;
	}
	private void printInfo(Lotteria lotteria) {
		System.out.println(lotteria.getSangpumName()+"으로 찾은 결과");
		System.out.println("상품 이름 : "+ lotteria.getSangpumName());
		System.out.println("상품 단가 : "+ lotteria.getSangpumDan());
		System.out.println("상품 수량 : "+ lotteria.getSangpumSu());
		System.out.println("가격 : "+ lotteria.getSangpumMoney());

	}

}
