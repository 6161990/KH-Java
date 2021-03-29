package kr.or.kh;

public class House {
	//this? 자기 자신의 클래스 내부에 있는 변수, 메서드, 생성자함수를 재사용하기 위해 사용
	
	public int price;  //가격
	public String dong;  //아파트 (동)
	public int size;  //평수 
	public String kind;  //빌라, 아파트 
	
	public House() {
		//this() : 생성자 함수 
		//생성자 함수 내에서 자신의 클래스 내에 있는 다른 생성자 함수를 재사용하겠다. 
		this(100,32,"동판교","오피스텔");  
//		price = 100;
//		size =32;
//		dong = "동판교";
//		kind = "아파트";
	}
	
	public House(int price) {
		//지역변수가 우선순위가 높기 때문에 자기 자신 클래스의 변수를 가리키는 this를 명시해주어야한다.
		//this.price=price; //but 이것은 효율이 떨어짐
		this(price,32,"동판교","빌라");  //thid()함수를 사용
	}
	
	public House(int price, int size) {
		this(price, size, "동판교", "주상복합");
	}
	public House(int price, int size, String dong) {
		this(price, size, dong, "아파트");
	}
	
	public House (int price, int size, String dong, String kind) {
		//this. : 변수, 메소드
		this.price = price;
		this.size = size;
		this.dong = dong;
		this.kind = kind;
	}
	
	

}
