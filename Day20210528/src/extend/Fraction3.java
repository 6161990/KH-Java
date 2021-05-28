package extend;

public class Fraction3 extends Fraction{

	
	public Fraction3() {
		super();
	}

	public Fraction3(int numerator, int denominator) {
		super(numerator, denominator);
	}

	void add(Fraction2 f) {
		numerator= (numerator*f.denominator) + (denominator*f.numerator);
		denominator = denominator * f.denominator;
	}
	
	void add(int n) {
		numerator = numerator + denominator * n;
	}

}
