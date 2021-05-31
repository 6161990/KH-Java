package ch1;

import java.util.HashSet;
import java.util.Set;

class SetExam {

	public static void main(String[] args) {
		Set<String> winUser = new HashSet<String>();
        Set<String> macUser = new HashSet<String>();

        winUser.add("홍길동");
        winUser.add("이순신");
        winUser.add("사임당");
        winUser.add("이이");

        macUser.add("김제이슨");
        macUser.add("하하");
        macUser.add("유재석");

        System.out.println("Windows User: " + winUser);
        System.out.println("Mac User: " + macUser);

        Set<String> winOrMacUser = new HashSet<String>(winUser);
        winOrMacUser.addAll(macUser);
        System.out.println("Windows or Mac User: " + winOrMacUser);

        Set<String> winAndMacUser = new HashSet<String>(winUser);
        winAndMacUser.retainAll(macUser);
        System.out.println("Windows or Mac User: " + winAndMacUser);
	}

}
