package q1;

public class Method6 {
	static void max(int a, int b) {
		if(a>b) {
			System.out.println(a+"가 "+b+"보다 큼");
		}else {
			System.out.println(b+"가 "+a+"보다 큼");
		}
	}
	public static void main(String[] args) {
		max(1,4);
		max(-5 ,-2);
//		max(0.3,0.31);
	}

}
