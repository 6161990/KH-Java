package oop.abstract02;

public class DollTest {

	public static void main(String[] args) {
		Woody woody = new Woody("우디",990000,"AMERICA");
		woody.setName("사랑"); //이게 전달됨
		woody.saying();
		woody.acting();
		woody.toString(); //클래스에 구현했는데 안나옴
		woody.print(); 
		
		System.out.println("====================");
		buzz buzz = new buzz("버즈",940000,"AMERICA");
		buzz.saying();
		buzz.acting();
		buzz.perfuming();
		buzz.toString(); //클래스 구현 안하고 불렀는데 안나옴
	}

}
