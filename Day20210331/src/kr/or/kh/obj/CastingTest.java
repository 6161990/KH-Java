package kr.or.kh.obj;

public class CastingTest {

	public static void main(String[] args) {
		//Person = 부모 , President/Student = 자식

		
		President president1 = new President();
	
		
	//	* *부모객체가 아직 생성되지 않은 상태면 다른 타입 참조가능하다. * *
		Person person1 = president1; 
    //	=>president1 객체를 상위클래스인 Person 클래스 레퍼런스 변수에 참조시킴.
	//	=> 자식(president1)이 가지고 있는 변수 , 메소드는 사라진다. (축소, 자식이 부모타입으로 up)
	//	=> persident1 객체가 자동으로 Person 타입으로 UpCasting 되면서 참조된다.
		
		
		President president2 = (President)person1; 
	//	=> person1 레퍼런스 변수의 참조값을 President 타입의 레퍼런스 변수에 할당한다. (확장, 부모가 자식타입으로 down)
	//	=> person1이 객체가 생성되지 않았기 때문에 가능하다.(heap에 메모리공간이 아직 만들어지지 않았기 때문에)
	//	=> 부모 클래스 타입의 참조값을 자식 클래스 타입의 참조변수에 할당하므로 **(명시적 캐스팅)**
		
		
		
		Person person2 = new Person();
	//	=> 객체생성
		
		President president3 = new President();
  //error  president3 = (President)person2; 
	//	=> Person의 객체를 President 타입의 레퍼런스 변수에 참조시킨다.
	//	=> 이미 person2 의 메모리 공간이 만들어졌기때문에 불가능하다. 위의 person(객체를 생성하지않은)과 대조적.
		
		
	// error Student student = (Student) president2;
	//	=> 같은 부모클래스를 상속받는 클래스 타입끼리 캐스팅시도
	//	=> 불가. 같은 층위에서 업다운 캐스팅불가.
	//	=> 상속관계에서만 업다운 캐스팅이 가능하다. 
	//	=> 객체끼리는 상속이 불가능하다. 
		
		
	}

}

