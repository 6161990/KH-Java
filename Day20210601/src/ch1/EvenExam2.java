package ch1;


    class EvenException extends Exception {}
    class OddException extends Exception {}
    
    class EvenExam2 {
	
		static void isEven(int n) throws EvenException, OddException{
			if (n % 2 == 0) {
				throw new EvenException();
			}else {
				throw new OddException();
			}
	}
	
	public static void main(String[] args) {
		int a=3;
		
		try {
			isEven(a);
		} catch (EvenException e) {
		 	System.out.println("짝수!");
		} catch (OddException e) {
			System.out.println("홀수!");
		}
	}

}
