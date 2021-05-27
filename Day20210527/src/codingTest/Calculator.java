package codingTest;

public class Calculator {
	double tax;

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public int Calc(int price) {
		return (int)(this.tax*price)+price;
		//return (int) (price * (1+tax));
	}
}
