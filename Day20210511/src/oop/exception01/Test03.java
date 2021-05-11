package oop.exception01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Student s = new Student();
		int kor,eng,math;
		String name;
		
		try (Scanner sc = new Scanner(System.in)){
	
		//이름은 2~5글자 이내로 입력합니다
		System.out.println("이름을 입력하세요: ");
		name= sc.next();
		s.setName(name);
		
		System.out.println("국어점수");
		kor = sc.nextInt();
		s.setKor(kor);
		
		System.out.println("영어점수");
		eng = sc.nextInt();
		s.setEng(eng);
	
		System.out.println("수학점수");
		math = sc.nextInt();
		s.setMath(math);
		
		System.out.println("이름: "+s.getName());
		System.out.println("국어점수: "+s.getKor());
		System.out.println("영어점수: "+s.getEng());
		System.out.println("수학점수: "+s.getMath());
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}finally {
			System.out.println("프로그램 종료");
		}
	}

}
