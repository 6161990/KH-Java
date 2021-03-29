package kr.or.kh;

public class HouseConstructorTest {

	public static void main(String[] args) {
		House house1 = new House();
		System.out.println(house1.price+":"+house1.size+":"+house1.dong+":"+house1.kind);
	
		House house2 = new House(300);
		System.out.println(house2.price+":"+house2.size+":"+house2.dong+":"+house2.kind);
		
		House house3 = new House(600,40);
		System.out.println(house3.price+":"+house3.size+":"+house3.dong+":"+house3.kind);

		House house4 = new House(800,50,"서초동");
		System.out.println(house4.price+":"+house4.size+":"+house4.dong+":"+house4.kind);
		
		
		House house5 = new House(10000,50,"서초동","펜트하우스");
		System.out.println(house5.price+":"+house5.size+":"+house5.dong+":"+house5.kind);
	}

}
