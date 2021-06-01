package Exception;

public class q1 {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
