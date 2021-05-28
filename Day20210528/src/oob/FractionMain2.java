package oob;

public class FractionMain2 {

	public static void main(String[] args) {
		Fraction2 f = new Fraction2();
		System.out.println("f= "+f.numerator+"/"+f.denominator);
		
		f.add(2);
		System.out.println("f= "+f.numerator+"/"+f.denominator);
	}

}
