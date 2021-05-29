package Automobile;

public abstract class AbstractAutomobile {

	//차종구분
	protected enum CarType{ 
		LIGHT_CAR, //경차
		STANDERD_CAR,  //소형차
		MEDIUM_CAR, //중형차
		LARGE_CAR, //대형차
		OVERSIZE  //트럭
	};
	
	//생성자
	protected AbstractAutomobile () {}
	
	//생성자 (차종구분)
	protected AbstractAutomobile (CarType carType) {
		this.setCarType(carType);
	}
	
	//차종구분
	private CarType carType;
	
	//차종구분 return
	public CarType getCarType() {
		return carType;
	}
	
	//차종구분 set
	public void setCarType(CarType carType) {
		this.carType = carType;
	}
	
	//승차정원
	public abstract int getCapacity();
	
	//차종모델
	public abstract String getCarModel();

	//차종 구분 (return 문자열)
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
