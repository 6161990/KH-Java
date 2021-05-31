package ch1;


	class StaticClasses {
	  static class Inner1 {
		    static final String greet = "안녕하세요";
		    static void sayHello() {
		      System.out.println(greet);
		    }
	   }

		  class Inner2 {
		    String greet = "Hello";
		    void sayHello() {
		      System.out.println(greet);
		   }
		 }

	}
	class StaticClassesExam {
		  public static void main(String[] args) {
		    StaticClasses sc = new StaticClasses();

		    StaticClasses.Inner1 si1 = new StaticClasses.Inner1();
		    si1.sayHello();
		    
		   
		    StaticClasses.Inner2 si2 = sc.new Inner2();
		    si2.sayHello();
		  }
	}

