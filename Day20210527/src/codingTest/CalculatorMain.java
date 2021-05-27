package codingTest;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator();
		
		c1.setTax(0.05);
		c2.setTax(0.1);
		
		System.out.println("세금 (5%) " + c1.Calc(1000));
		System.out.println("세금 (10%) " + c2.Calc(1000));
	}

}
