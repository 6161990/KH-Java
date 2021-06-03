package selftest.kh;

public class test3 {
	
	
	public static void main(String[] args) {
		//스쿼트 열흘동안 할거야 첫날엔 이미 15개 했고 이틀부터 3개씩 할거야
		//열흘 째 되는 날 몇개?
		int sq=15;
	
		for(int i=2; i<=10; i++) {
			sq+=3;
		}
		System.out.println(sq);

	}


}
