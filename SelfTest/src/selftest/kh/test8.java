package selftest.kh;

public class test8 {
	public static void main(String[] args) {
		String[][] fruit = {{"딸기", "포도","아보카도"},{"수박", "복숭아","키위","참외","메론"}};
		for(int i=0; i<fruit.length; i++) {
			for(int j=0; j<fruit[i].length; j++) {
				System.out.print(fruit[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("===============");
		
		
		int[][] multi= new int[8][9];
		
		for(int i=0, dan=2; i<multi.length; i++, dan++) {
			for(int j=0, count=1; j<multi[i].length; j++, count++) {
				multi[i][j]=dan*count;
				System.out.println(dan+"x"+count+"="+multi[i][j]);
			}
			System.out.println();
		}
		
	}
}
