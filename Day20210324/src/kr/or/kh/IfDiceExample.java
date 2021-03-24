package kr.or.kh;

public class IfDiceExample {

	public static void main(String[] args) {
		for(int i=0; i<3; i++) { //랜덤을 리셋해 돌리는 것이기 때문에 같은 숫자가 또 나올 수 있음. 주사위는 중복 허용되니까. case처럼 break가 없으니 for로 대체할 수 있음 .
			int num = (int) (Math.random()*6)+1;
			if(num==1) {
				System.out.println("1번이 나왔다");
			}else if(num==2) {
				System.out.println("2번");
			}else if(num==3) {
				System.out.println("3번");
			}else if(num==4) {
				System.out.println("4번");
			}else if(num==5) {
				System.out.println("5번");
			}else {
				System.out.println("6번");
		    }
		}
	}

}
