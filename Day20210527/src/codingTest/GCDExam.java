package codingTest;


//최대 공약수 : Greatest Common Divisor 두 자연수의 공통된 약수 중 가장 큰 수
//최소 공배수 : Least Common Multiple 두 자연수의 공통된 배수 중 가장 작은 수
public class GCDExam {
	static int gcd(int x, int y) {
		if(y==0) {
			return x;
		} else{
			return gcd(y,x%y);
		}
	}
	public static void main(String[] args) {
		int x = 30;
		int y = 10;
		System.out.println("최대 공약수는 "+gcd(x,y)+"입니다.");
	}

}
