package Exception;

public class ExamException {
	public static void main(String[] args) {
		try {
			Exam.Loop();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("오류가 발생했습니다");
		}
	}
}
