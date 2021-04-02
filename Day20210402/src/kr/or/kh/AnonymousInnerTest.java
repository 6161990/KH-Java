package kr.or.kh;

import java.util.Scanner;

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CommandProcess cp = new CommandProcess();
		while(true) {
		System.out.println("1.글쓰기 2. 전체목록");
		int number = input.nextInt();
		if(number==1) {
		cp.process(
				/*
				 * 컴파일러가 여기부터 
				class Anonymous implements Command 
				{

					@Override
					public void execute() {
						// TODO Auto-generated method stub
						
					}
					
				}
				Anonymous anonymous = new Anonymous();
				anonymous.execute();
				
				여기까지 알아서 코딩.(개발자 눈에 보이지 않음. 지워보자.)*/
				new Command() {
				
			@Override
			public void execute() {
				System.out.println("글쓰기");
			}
		}); 
		}
		else if(number == 2) {
		cp.process(new Command() {

			@Override
			public void execute() {
				System.out.println("전체목록");
			}
			
			
		});
		}
		}	
		// Command 같은 인터페이스나 추상클래스는 객체 생성이 불가한데 new로 Command를 어떻게 만들어?
		 	// 무명클래스로 가능. (단 한번만 사용하고 버려지는 클래스)
			// class Anonymous는 컴파일러가 가지고 있는 내장 클래스 
			// **상속없이 인터페이스나 추상클래스를 사용하기위해 Anonymous 클래스 이용한다.
	}

}
