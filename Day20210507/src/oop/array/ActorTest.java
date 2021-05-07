package oop.array;

public class ActorTest {
	
	public static void main(String[] args) {
		Actor[] actor = new Actor[5];
		actor[0]= new Actor("엄태구",34,"낙원의밤");
		actor[1]= new Actor("최우식",38,"기생충");
		actor[2]= new Actor("차승원",52,"하이힐");
		actor[3]= new Actor("마동석",45,"악인전");
		actor[4]= new Actor("케이트블란쳇",53,"캐롤");
		
		for(int i=0; i<actor.length; i++) {
			System.out.println(actor[i].getName()+", "+actor[i].getAge()+", "+actor[i].getMovie());
		}
		
	}

}
