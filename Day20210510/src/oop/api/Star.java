package oop.api;

public class Star {

		 
		//str *을 계속 더해넣는다(크기만큼 size)
		
		public static String star(int size) {
			String str = "";
			for(int i=0; i<size; i++) {
				str+="*";
			}
			return str;
		}
}
