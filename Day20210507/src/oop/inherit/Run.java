package oop.inherit;

public class Run {
	
	public static void main(String[] args) {
		Galaxy a = new Galaxy();
		Iphone b = new Iphone();
		
		System.out.println("갤럭시의 기능 출력");
		a.call();
		a.camera();
		a.sms();
		a.record();
		
		System.out.println("----------------------");
		System.out.println("아이폰의 기능 출력");
		b.call();
		b.camera();
		b.sms();
		b.airDrop();
	}

}
