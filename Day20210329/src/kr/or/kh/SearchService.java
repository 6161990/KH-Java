package kr.or.kh;

public class SearchService {
	private MemberTest[] members;
	public SearchService() {
		members = new MemberTest[5];
		members[0] = new MemberTest("jenny",167,50,"대한민국");
		members[1] = new MemberTest("rose",171,49,"뉴질랜드");
		members[2] = new MemberTest("lisa",173,52,"태국");
		members[3] = new MemberTest("jisu",164,49,"대한민국");
		members[4] = new MemberTest("jineon",181,77,"호주");
	}
	boolean searchMember(String name) {
		boolean searchResult = false;
		for(int i=0; i<members.length; i++) {
			if(members[i].getName().equals(name)) {
				printInfo(members[i]);
				searchResult=true;
			}
		}
		return searchResult;
	}
	private void printInfo(MemberTest member) {
		System.out.println(member.getName()+"으로 찾은 결과");
		System.out.println("이름 : "+ member.getName());
		System.out.println("키 : "+ member.getHeight());
		System.out.println("몸무게 : "+ member.getWeight());
		System.out.println("국가 : "+ member.getNation());
	}

}
