package kr.or.kh;

public class ArrayTest5 {

	public static void main(String[] args) {
		//초기화와 대입은 다르다. 전자는 공간을 만드는 즉시 값 넣고, 대입은 만들어놓고 나중에 값 대입
		String[] cities = {"시드니","상하이","삿뽀로","워싱턴","서울"}; //이건 한 공간 stack // 공간 만들고 바로 초기화.
 		String[] nations = new String[] {"러시아","미국","중국","한국","방글라데시"}; //new로하면 메모리 공간을 나뉘는 형태로 처리 //공간을 new해서 만드는 즉시, 초기화됨.
		for(int i=0; i<cities.length; i++) {
			System.out.println("cities["+i+"] = "+cities[i]);
		}
		
		System.out.println("===================");
		
		for(int i=0; i<nations.length; i++) {
			System.out.println("nations["+i+"] = "+nations[i]);
		}
	}

}
