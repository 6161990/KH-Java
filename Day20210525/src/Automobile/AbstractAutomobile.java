package Automobile;

public abstract class AbstractAutomobile {

	protected enum CarType{
		LIGHT_CAR,
		STANDERD_CAR,
		MEDIUM_CAR,
		LARGE_CAR,
		OVERSIZE
	};
	
	protected AbstractAutomobile () {}
	
	protected AbstractAutomobile (CarType carType) {
		this.setCarType(carType);
	}
	
	private CarType carType;
	
	
	public CarType getCarType() {
		return carType;
	}
	public void setCarType(CarType carType) {
		this.carType = carType;
	}
	
	public abstract int getCapacity();
	
	public abstract String getCarModel();

	public String getCarTypeString() {
		String typeName = "";
		if(this.carType.equals(carType.LIGHT_CAR)) {
			typeName="경차";
		} else if(this.carType.equals(carType.STANDERD_CAR)) {
			typeName="소형차";
		}else if(this.carType.equals(carType.MEDIUM_CAR)) {
			typeName="중형차";
		}else if(this.carType.equals(carType.LARGE_CAR)) {
			typeName="대형차";
		}else if(this.carType.equals(carType.OVERSIZE)) {
			typeName="트럭";
		}
		return typeName;
	}
	
	

	
	
}
