package kr.or.kh.obj4;

public class HyundaCar extends Car{
	protected String carName;

	public HyundaCar() {
		super();
		this.engine = new Engine("현대엔진1");
		this.door = new Door(2);
	}

	public HyundaCar(Engine engine, Door door, String carName) {
		super(engine, door);
		this.carName = carName;
	}

	@Override
	public String toString() {
		return super.toString()+" + HyundaCar [carName=" + carName + "]";
	}
	
	/*public static void main(String[] args) {
		Engine engine = new Engine("현대엔진2");
		Door door = new Door(4);
		HyundaCar sonata = new HyundaCar(engine, door, "소나타");
		System.out.println(sonata.toString());
		//System.out.println(sonata); //toString재정의 했기 때문에 결과는 같음
		
		HyundaCar avante = new HyundaCar();
		System.out.println(avante.toString());
		
	}*/
	

}
