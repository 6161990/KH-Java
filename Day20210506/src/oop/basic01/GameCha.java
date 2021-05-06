package oop.basic01;

public class GameCha {
	
	private String id;
	private String job;
	private int level;
	private int money;
	private int engage;
	
	
	public GameCha(String id, String job) {
		//this(id,job,1,0);
		this.id = id;
		this.setJob(job);
	}


	public GameCha(String id, String job, int level, int money) {
		this.id=id;
		this.setJob(job);
		this.setLevel(level);
		this.setMoney(money);
//		this.level = level;
//		this.money = money;
	}

	

/*	public GameCha(String id, String job, int level, int money, int engage) {
		this.id = id;
		this.setJob(job);
		this.setLevel(level);
		this.setMoney(money);
		this.setEngage(engage);
	}

*/

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		
		switch(job) {
		case "전사": case "마법사": case "궁수": case "도적":
			this.job = job;
			break;
		default :
			System.out.println("[입력한 직업 "+job+" : 직업은 전사, 마법사, 궁수, 도적 중 선택하시오.]");
			return;
		}
		
/*		
		if(job=="마법사") {
			this.job = job;
		}else if(job=="전사") {
			this.job = job;
		}else if(job=="궁수") {
			this.job = job;
		}else if(job=="도적") {
			this.job = job;
		}else {
			System.out.println("[직업 전사, 마법사, 궁수, 도적 중 선택하시오.]");
			return;
		}*/
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		if(level<0) {
			this.level = 1;
			System.out.println("[입력한 레벨 "+level +".lv : 레벨은 1 이상부터 시작합니다.]");
			return;
		}else {
			this.level =level;
		}
		
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		if(money < 0) {
			this.money=0;
			System.out.println("[입력한 소지금 "+money +"원 : 첫 소지금은 0원 이상입니다.]");
			return;
		}else {
			this.money = money;
		}
		
	}
	
	
	public int getEngage() {
		return engage;
	}


	public void setEngage(int engage) {
		
		if(engage > 100) {
			System.out.println("[오류: 게이지는 100까지만 채우면 자동 레벨업됩니다.]");
			return;
		}else if(engage == 100 ) {
			System.out.println("[게이지 "+engage +"을 채워 Level Up!]");
			this.lvUp();
			this.engage=0; //레벨업 후 게이지 초기화
			return;
		}else if(engage < 0) {
			System.out.println("[게이지는 0부터 존재합니다]");
			this.engage=0; 
			return;
		}
		else {
			this.engage = engage;
		}
	}


	private void lvUp() {
		this.level++;
	}
	
	
	public void print() {
		System.out.println(id+"님의 캐릭터 정보 \n "+ job +", "+ level+ ".lv, "+ money +"원, "+engage+".Eng \n");
	}

}
