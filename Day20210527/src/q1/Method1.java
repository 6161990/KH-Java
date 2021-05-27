package q1;

public class Method1 {
	static void msg() {
		System.out.println("Helloooo~~~~~");
		msg2();
	}
	static void msg2() {
		System.out.println("Gooood Morning, How R U Today?");
	}
	public static void main(String[] args) {
		System.out.println("***기본인사와 아침인사***");
		msg();
	}

}
