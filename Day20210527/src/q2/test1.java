package q2;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print(">");
			String input = sc.nextLine();
			if(input.length()==0) {
				System.out.println("error: input is Empty");
			}else if(input.equals("EXIT")||input.equals("exit")){
				System.exit(0);
			} else {
				System.out.println(input);
				continue;
			}
		}
		

	}

}
