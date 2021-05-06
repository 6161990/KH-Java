package oop.basic01;

public class Test02 {
	
	public static void main(String[] args) {
		Subject lee = new Subject();
		Subject kim = new Subject("김진영",100,30,50);
		
		
		
/*		getters and setters
 * 		lee.studentName="이효리";
		lee.kor=70;
		lee.math=30;
		lee.eng=90;
*/
		lee.setStudentName("이효리");
		lee.setKor(75);
		lee.setMath(66);
		lee.setEng(87);
		lee.printScore("이효리");
		System.out.println(lee.getStudentName()+"님의 국어 점수는"+(double)lee.getKor());
		
		System.out.println("=======================");
		kim.printScore("김진영");
	}
}
