package question3;

public class StudentMain {

	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("홍길동",80,75,90);
		students[1] = new Student("이순신",90,70,80);
		students[2] = new Student("홍길동");
		
		System.out.println("=====성적표=====");
		for(int i=0; i<students.length; i++) {
			students[i].show();
		}
	}

}
