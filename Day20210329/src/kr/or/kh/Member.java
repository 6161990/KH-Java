package kr.or.kh;

public class Member {
	
	private String name;
	private int height;
	private int weight;
	private String nation;
	
	public Member() {
		//컴파일러가 초기화하는 것들 
		this(null, 0, 0, null); //첫번째줄에!!!
		
		//위의 this는 아래의 네 줄과 같다. 
/*		name= null;
		height = 0;
		weight = 0;
		nation = null;*/
	}
	
	public Member(String name, int height, int weight, String nation) {
		this.name=name;
		this.height=height;
		this.weight=weight;
		this.nation=nation;
	}
	
	public static void main(String[] args) {
		//매개변수 있는 생성자를 만들었을 경우 , 컴파일러가 기본 생성자를 만들어주지 않는다. 기본 생성자역시 직접 만들어야한다.
		Member member = new Member(); 
		System.out.println(member.height+","+member.weight+","+member.name+","+member.nation);
		
		Member member1 = new Member("jenny",167,49,"korea");
		System.out.println(member1);  //참조하는 주소가 출력
		System.out.println(member1.height+","+member1.weight+","+member1.name+","+member1.nation);
//		System.out.println(member1.height+","+member1.weight+","+member1.name);

	}
	

}
