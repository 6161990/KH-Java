package Automobile;


public class MyCar extends AbstractAutomobile {

	public MyCar(CarType carType) {
		super(carType);
	}

	@Override
	public int getCapacity() {
		return 5;
	}

	@Override
	public String getCarModel() {
		return "MINI Cooper";
	}

	public static void main(String[] args) {
		MyCar car = new MyCar(CarType.STANDERD_CAR);
		//car.setCarType(CarType.STANDERD_CAR);
		System.out.println("차종은 "+ car.getCarModel() +"입니다.");
		System.out.println("승차정원은 "+ car.getCapacity() +"입니다.");
		System.out.println("차종구분은 "+car.getCarTypeString()+"입니다.");
	
	}

}
