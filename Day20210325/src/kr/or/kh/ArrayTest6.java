package kr.or.kh;

import java.util.Scanner;

public class ArrayTest6 {

	public static void main(String[] args) {
		String names[] = new String[] {"제니","로제","리사","태연","이지금","이현재","박나래","장도연"};
		Scanner input = new Scanner(System.in);
		int index= -1;
		do {
			System.out.println("로그인 할 이름을 입력하세요");
			System.out.println("이름");
			String name = input.next();
			for(int i=0; i<names.length; i++) {
				if(name.equals(names[i])) {
					index=i;
				}
			}
			if(index!=-1) {
				System.out.println(name+"은(는) 배열의 "+index+" 번째 인덱스 목록에 있습니다.");
				break;
			}
			System.out.println("해당하는 이름이 존재하지 않습니다.");
		}while(true);
	}

 }

