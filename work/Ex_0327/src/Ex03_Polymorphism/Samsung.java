package Ex03_Polymorphism;

public class Samsung extends Computer{

	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("아이 러브 삼송");
	}

	@Override
	public void powerOff() {
		super.powerOff();
	}
	
}
