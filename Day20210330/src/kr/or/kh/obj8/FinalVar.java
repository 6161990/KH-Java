package kr.or.kh.obj8;

class VarClass{
	final int x;  //처음 초기화한 값에서 변경되지 않음
	static final int y; //상수임 
	public VarClass(int x) {
		this.x=x;
	}
	static{
		y=100;
	}
}
public class FinalVar {
	

	public static void main(String[] args) {
		//VarClass.y=30;  //final 마지막 최종, 이미 값이 100으로 들어가있기 때문에 변경불가.
		VarClass vc1 = new VarClass(20); //여기서 x의 값이 20으로 고정
		System.out.println(vc1.x);  //20
		System.out.println(VarClass.y);  //100
		
		//final이기때문에 다른 값으로 수정불가.
		//vc1.x=90;  
		//vc1.y=30;
		
		VarClass vc2 = new VarClass(30);  //여기서 x의 값이 30으로 고정
		System.out.println(vc2.x);	//30
		System.out.println(VarClass.y);	//100
		//vc2.y=70;
		//vc2.x=80;
	}

}
