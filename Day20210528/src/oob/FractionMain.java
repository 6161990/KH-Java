package oob;

public class FractionMain {
	
	public static void main(String[] args) {
		Fraction3 f1 = new Fraction3();
		Fraction3 f2 = new Fraction3(1,2);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println("f1= "+ f1.numerator+"/"+f1.denominator);
		System.out.println("f2= "+ f2.numerator+"/"+f2.denominator);
	}

}
