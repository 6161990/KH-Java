package kr.or.kh.obj2;

import java.util.StringTokenizer;

public class StringTokenizerTest2 {

	public static void main(String[] args) {
		String source1 = "미국 중국 한국 이탈리아 프랑스";
		StringTokenizer st1 = new StringTokenizer(source1," "); //공백으로 split
		while(st1.hasMoreTokens()) {
			System.out.println("st1 token: "+st1.nextToken());
		}
		/*
		 * 	st1 token: 미국
			st1 token: 중국
			st1 token: 한국
			st1 token: 이탈리아
			st1 token: 프랑스*/
		
		System.out.println();
		System.out.println();
		String source2 = "푸들 삽살개 풍산개 진돗개,냥냥이펀치";
		StringTokenizer st2 = new StringTokenizer(source2,",");
		while(st2.hasMoreTokens()) {
			System.out.println("st2 token: "+st2.nextToken());
		}
		/*
		 * 
			st2 token: 푸들 삽살개 풍산개 진돗개
			st2 token: 냥냥이펀치*/
		
		System.out.println();
		System.out.println();
		StringTokenizer st3 = new StringTokenizer(source2,",",true);
		while(st3.hasMoreTokens()) {
			System.out.println("st2 token: "+st3.nextToken());
		}
		/*
		 *
			st2 token: 푸들 삽살개 풍산개 진돗개
			st2 token: ,
			st2 token: 냥냥이펀치 */
	}

}
