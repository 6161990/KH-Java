package kr.or.kh.obj1;

public class ManSchool extends School {

	protected int gisul;
	
	
	@Override
	public void total() {
		total = kor + eng + math +gisul;
		System.out.println("남중 통합");
		System.out.println(total);
		
	}


	public static void main(String[] args) {
		ManSchool manSchool = new ManSchool();
		manSchool.kor=90;
		manSchool.eng=90;
		manSchool.math=90;
		manSchool.gisul=90;
		manSchool.total();

	}

}
