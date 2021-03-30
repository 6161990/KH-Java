package kr.or.kh.obj4;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HyundaCar hc1 = new HyundaCar();
		//HyundaCar hc2 = new HyundaCar(engine, door, "소나타");
		GMCar gmc = new GMCar();
		while(true) {
		System.out.println("1. 대우자동차 2. 현대 자동차 ");
		int number = input.nextInt();
		if(number==1) {
			//객체 생성 할 때 초기값을 넣을 꺼냐 안넣을 꺼냐
			gmc.engine.kind="대우엔진";
			gmc.door.window=4;
			gmc.carName="스파크";
			System.out.println(gmc.toString());
		}else if(number==2){
			hc1.engine.kind="현대엔진";
			hc1.door.window=5;
			hc1.carName="소나타";
			System.out.println(hc1);
			
		   // System.out.println(hc2);
		}
	  }
	}
		

}
