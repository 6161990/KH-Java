package oop.collection01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test02 {
	public static void main(String[] args) {
		Map<String, Integer> singer = new HashMap<>(); 
		singer.put("차정원", 0);
		singer.put("이센스", 0);
		singer.put("새소년", 0);
		singer.put("마마무", 0);
		singer.put("유라", 0);
		

		
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====경연 투표=====");
		Set<String> set = singer.keySet();
		for(String name : set) {
			System.out.println("-"+name);
		}
		System.out.println("투표할 가수를 입력하세요");
		String input = sc.next();
		
		//만약에 공백이 들어간걸 무시하고 투표가 될 수 있도록 작업
		input = input.trim();
		
		if(singer.containsKey(input)) {
				int count = singer.get(input);
				count++;
				singer.put(input, count);
				System.out.println(input+"님에게 투표가 완료되었습니다.");
				System.out.println(input+"님의 현재투표수는 "+count);
				System.out.println();
				//3.출력
				System.out.println("=====경연 투표=====");
				for(String name : set) {
					System.out.println("-"+name);
				}
				System.out.println("투표를 계속하시겠습니까? yes/no");
				String no = sc.next();
				if(no.equals("no")) {
					System.out.println("최종 투표수");
					for(String name : set) {
						System.out.println("-"+name+" : "+singer.get(name));
					}
					break;
				}else {
					continue;
				}
			}else {
				System.out.println("해당 가수에게는 투표하실 수 없습니다.");
			}
		}
		
		
		
	}
}
