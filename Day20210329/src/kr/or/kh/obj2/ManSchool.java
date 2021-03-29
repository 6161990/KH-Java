package kr.or.kh.obj2;

public class ManSchool extends School {
	//국어 영어 수학에 대한 것은 부모로부터 상속 받음
	protected int gisul;  //man school 특수 기술 과목 추가. 총 4과목 

	public ManSchool() {  //매개변수 없는 생성자
		super(); //this. super. 둘 다 재사용. this자기 자신 클래스 내부의 변수 메소드 생성자함수 재사용, super는 부모 클래스의 변수, 메소드, 생성자함수 재사용
	}

	public ManSchool(int kor, int eng, int math, int gisul) {  //매개변수 있는 생성자
		super(kor, eng, math);  //함수나 기능들을 수행하고 돌아가야함. 생성자 함수는 저절로 상속이 되지않으니까 그걸 가져오겟다라는 의미로 super!!!
		this.gisul=gisul;
	}
	
	
	public int getGisul() {  //나가는 것
		return gisul;
	}

	public void setGisul(int gisul) {  //들어오는 것
		this.gisul = gisul;
	}

	@Override
	public String toString() {
		return super.toString()+ " ManSchool [gisul=" + gisul + "]"; //부모의 toString과 함께 출력 
	}

	public static void main(String[] args) {
		ManSchool manSchool = new ManSchool(80,70,60,80); //(초기화)
		//manSchool.setGisul(80); //(대입)
		//System.out.println(manSchool+"+"+manSchool.gisul);  //toString 해놓았기 때문에 주소값이 아니라 재정의한 toString이 출력된다.
		System.out.println(manSchool); //(manSchool(+toString))이 숨어있다. 
		System.out.println(manSchool.getKor()); //하나씩 꺼내기도 가능. 근데 넘 불편 그래서 toString이 존재.
	}
}
