package kr.or.kh;

public class JuExecuter2 {

	public static void main(String[] args) {
		System.out.println("May I take your order?");
		String ju = args[0];
		if(ju.equals("yes") || ju.equals("YES")){
			System.out.println("yes, please");
			System.out.println("Menu : 1. beef stew 2. pork with basil 3. Japanese-style Grilled Chicken");
			int menu = Integer.parseInt(args[1]);
			switch(menu) {
			case 1: 
				System.out.println("beef stew, please.");
				System.out.println("medium?");
				String medium = args[2];
				if(medium.equals("medium") || medium.equals("Medium")) {
					System.out.println("yeap, medium");
				}else {
					System.out.println("no. i'd like Well-done");
				}
				break;
			case 2:
				System.out.println("What does basil taste like? ");
				System.out.println("so nice, it is popular menu in here with basil soda");
				String soda = args[2];
				if(soda.equals("soda") || soda.equals("Soda")) {
					System.out.println("soda please, too");
				}else {
					System.out.println("i don't like soda");
				}
				break;
			case 3: 
				System.out.println("I'd really like Japanese-style.");
				System.out.println("Anything else?");
				String addMenu = args[2];
				if(addMenu.equals("soda") || addMenu.equals("Soda")) {
					System.out.println("soda please, too");
				}else {
					System.out.println("nothing, thx");
				}
				break;
			default:
				System.out.println("Nothing. on Menu");
			}
		
		} else {
			System.out.println("not yet.");
		}
	}

}
