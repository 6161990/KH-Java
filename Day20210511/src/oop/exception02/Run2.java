package oop.exception02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Run2 {

	public static void main(String[] args) {
			Score score = new Score();
			
		try (Scanner sc = new Scanner(System.in)){
			System.out.println("이름을 입력하세요");
			String name = sc.next();
			score.setName(name);
			
			System.out.println("국어점수 : ");
			int kor = sc.nextInt();
			score.setKor(kor);
			
			System.out.println("영어점수 : ");
			int eng = sc.nextInt();
			score.setEng(eng);
			
			System.out.println("수학점수 : ");
			int math = sc.nextInt();
			score.setMath(math);
			
			System.out.println("이름 : "+ score.getName());
			System.out.println("국어 점수 : "+ score.getKor());
			System.out.println("영어 점수 : "+ score.getEng());
			System.out.println("수학 점수 : "+ score.getMath());
			
			try {
				System.out.println("총점 : "+score.total());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				System.out.println("평균 : "+score.avg());
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		}catch(InputMismatchException e) {
			e.printStackTrace();
			System.out.println("예외처리완료");
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("예외처리완료");
		} 
//		finally {
//			sc.close();
//		}
	}

}
