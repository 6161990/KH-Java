package oop.api;

public class Test04 {
	public static void main(String[] args) {
		String naver = "https:www.naver.com";
		//https://www.naver.com/ 
	//1. 글자수는 얼마 입니까?
		System.out.println(naver.length());
	//2. http:로 시작합니가?
		System.out.println(naver.startsWith("http"));
	//3. .com으로 끝나나요?
		System.out.println(naver.endsWith(".com"));
	//4.naver라는 글자가 포함되어 있나요?
		System.out.println(naver.contains("naver"));
	//5. 그러면 naver 글자가 몇번째에 있나요?
		System.out.println(naver.indexOf("naver"));
	}

	
}
