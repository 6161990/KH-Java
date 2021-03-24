package kr.or.kh;

public class VariableExample {

	public static void main(String[] args) {
		int var1=1;
		{
			int var2=2; //var2의 제한적 영역
			System.out.println(var1+":"+var2);  
			{
				int var2_1 = 21;
				System.out.println(var2+":"+var2_1);  
			}
		}
		int var3=3;
		//var1과 var3 사용가능
		System.out.println(var1+":"+var3);
		
		//var2와 var2_1 사용불가
		//System.out.println(var2); error!!!!!
	}

}
