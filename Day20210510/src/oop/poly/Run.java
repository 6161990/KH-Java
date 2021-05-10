package oop.poly;

public class Run {
	public static void main(String[] args) {
		Phone i1 = new IPhone("퍼플",2029,"아이폰1","apple");
		Phone g1 = new Galaxy("블랙",1020,"갤럭시1","samsung");
		
		i1.call();
		i1.sms();
		i1.camera();
		((IPhone)i1).HeySiri("콩시리");//.도 연산자라서 괄호로 우선묶음 해줘야함
		((IPhone)i1).phoneInfo();
		
		System.out.println();
		System.out.println("=================================");
		System.out.println();
		
		g1.call();
		g1.sms();
		g1.camera();
		((Galaxy)g1).Hellobixbi("범블비");
		((Galaxy)g1).phoneInfo();
		
		
		
		Phone[] arr = new Phone[10];
		
		for(int i=0; i<arr.length; i++) {
			
			if(i%2==0) {
				arr[i]=new IPhone();
			}
			else {
				arr[i]=new Galaxy();
			}
		}
		
		
		Phone p;
		for(int i=0; i<arr.length; i++) {
			p=arr[i];
			if(p instanceof IPhone) {
				((IPhone) p).HeySiri("시리콩콩");
			}
			else if(p instanceof Galaxy) {
				((Galaxy) p).Hellobixbi("허니비");
			}
		}
		
	}
}
