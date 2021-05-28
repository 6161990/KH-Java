package oob;

public class Fraction2 {
	int numerator;
	int denominator;
	
	Fraction2(){
		numerator=0;
		denominator=1;
	}
	
	Fraction2(int numerator, int denominator){
		this.numerator=numerator;
		this.denominator=denominator;
	}
	
	void add(Fraction f) {
		this.numerator= (this.numerator*f.denominator) + (this.denominator*f.numerator);
		this.denominator = this.denominator * f.denominator;
	}
	
	void add(int n) {
		numerator = numerator + denominator*n;
	}
	
	void add(int numerator, int denominator) {
		this.numerator= (this.numerator* denominator) + (this.denominator*numerator);
		this.denominator = this.denominator * denominator;
	}
}
