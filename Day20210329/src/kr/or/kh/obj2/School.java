package kr.or.kh.obj2;

public class School {
	protected int kor;
	protected int eng;
	protected int math;
	
	public School() {   //생성자 함수는 상속이 되지 않는다. 하위 클래스에서 super()키워드로 생성자 함수를 상속받아야한다.
		this(0,0,0);
		/*kor=0;
		eng=0;
		math=0;*/
	}
	
	public School(int kor, int eng, int math) {  
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "School [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}

}
