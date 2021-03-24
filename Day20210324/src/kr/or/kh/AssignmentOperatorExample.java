package kr.or.kh;

public class AssignmentOperatorExample { 
   
	public static void main(String[] args) {
		//대입연산자
		// 오른쪽 피연산자의 값을 좌측 피연산자인 변수에 저장.
		// 오른쪽 피연산자는 리터럴 및 변수 그리고 다른 연산식이 옴
		// 단순히 오른쪽 피연산자의 값을 변수에 저장하는 단순 대입 연산자가 있고 정해진 연산을 수행한 후 
		// 변화를 변수에 저장하는 복합 대입 연산자도 있다.
		int result =0;
		result += 10;
		System.out.println("result="+result);
		result -=5;
		System.out.println("result="+result);
		result *=3;
		System.out.println("result="+result);
		result /=5;
		System.out.println("result="+result);
		result %=3;
		System.out.println("result="+result);
		
		//모든 연산자들 중에서 가장 낮은 연산순위를 가지고 있음. 제일 마지막 수행
		//연산방향 오른쪽에서 왼쪽
		//a=b=c=5 는 뒤에서부터 앞으로 a가 가장 마지막에 b가 대입됨
		
		
		
		
		
	}

}
