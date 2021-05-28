package extend;

public class Fraction {
	int numerator;
	int denominator;
	
	Fraction(){
		numerator=0;
		denominator=1;
	}
	
	Fraction(int numerator, int denominator){
		this.numerator=numerator;
		this.denominator=denominator;
	}
	
	void add(Fraction f) {
		numerator= (numerator*f.denominator) + (denominator*f.numerator);
		denominator = denominator * f.denominator;
	}
	
	void add(int n) {
		numerator = numerator + denominator*n;
	}
	
	void add(int numerator, int denominator) {
		this.numerator= (this.numerator* denominator) + (this.denominator*numerator);
		this.denominator = this.denominator * denominator;
	}
	
	public String toString() {
		return numerator+"/"+denominator;
	}
}
