package oop.exception02;

public class Run {

	public static void main(String[] args) {
		try {
			Cal.div(3,4);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
