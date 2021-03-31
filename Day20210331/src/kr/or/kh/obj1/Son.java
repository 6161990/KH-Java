package kr.or.kh.obj1;

public class Son extends Father {//클래스에서는 다운캐스팅만 일어난다. 
	protected double gudu;
	
	public void display() {
		System.out.println("아들구두:"+gudu);
		//super.gudu =350.0;
		System.out.println("아버지구두:"+super.gudu);  //아버지에 있는 클래스의 변수를 재사용 
	}
	public static void main(String[] args) {  //객체에서는 업, 다운 캐스팅 둘 다 일어난다.
		Son son = new Son();
		son.gudu=250.5;	
		
		Father father = new Father(); //생성자 함수는 상속이 안되기 때문에 이건 불가능
		son.display(); //아버지는 0.0으로 나옴. 
		//해결방법 1. son display에서 super.gudu로 값을 넣어버려야가능해짐. 
		//super.gudu =350.0;
		
		//해결방법 2. 자식 타입으로 생성자를 만들어주고, 거기에 직접 값을 넣는다. 
		Father father_s = new Son();
		father_s.gudu=270;
		son.display();
		System.out.println(son.gudu);
		System.out.println(father_s.gudu);
	}

}
