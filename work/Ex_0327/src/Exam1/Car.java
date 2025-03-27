package Exam1;

public class Car {

	int gasGauge;
	
	
	
	public Car(int gasGauge) {
		super();
		this.gasGauge = gasGauge;
	}



	public void showCurrentGauge() {
		System.out.println("잔여 가스량 : " + gasGauge);
	}
}
