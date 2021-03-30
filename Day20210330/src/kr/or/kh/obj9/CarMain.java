package kr.or.kh.obj9;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HyundaCar hc1= new HyundaCar();
		GMCar gmc1 = new GMCar();
		while(true) {
			System.out.println("1.현대 자동차 2. 대우 자동차");
			int number = input.nextInt();
			if(number==1) {
				hc1.engine.kind="현대엔진";
				hc1.radio.kind="주파수 3";
				hc1.carName="소나타";
				hc1.airCon.kind="현대 에어컨";
				hc1.door.window=5;
				System.out.println(hc1.toString());
				
			}else if (number==2){
				gmc1.engine.kind="대우엔진";
				gmc1.radio.kind="주파수45";
				gmc1.carName="스파크";
				gmc1.airCon.kind="대우 에어컨";
				gmc1.door.window=4;
				System.out.println(gmc1.toString());
				
			}
		}

	}

}
