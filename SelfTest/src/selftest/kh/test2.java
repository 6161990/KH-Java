package selftest.kh;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int age;
//		int age = sc.nextInt();
	
//		
//		while(true) {
//			System.out.println("나이를 입력해주세요");
//			if(age >= 80) {
//				System.out.println("초고령");
//				break;
//			}else if(age >=60) {
//				System.out.println("노인");
//				break;
//			}else if(age >=40) {
//				System.out.println("꽃보다 청춘");
//				break;
//			}else if(age >=20) {
//				System.out.println("젊으니 좋다 ");
//				break;
//			}else if(age < 1 || age > 120) {
//				System.out.println("나이를 잘못 입력하셨습니다.");
//			}
//		}
		
		do {
			System.out.println("나이를 입력해주세요");
			age = sc.nextInt();
			System.out.println("입력한 나이는 "+age+"입니다");
			if(age < 1 || age > 120) {
				System.out.println("나이를 잘못 입력하셧습니다.");
			}
		}while(true);
	
	}
}
