package Ex03_Polymorphism;

public class ComMain {
	public static void main(String[] args) {
		ComputerRoom cr = new ComputerRoom();
		
		
		//Computer com1 = new Samsung();;
		cr.com1 = new Samsung();
		//Computer com2 = new LZ();
		cr.com2 = new LZ();
		
		cr.allPowerOn();
		cr.allPowerOff();
		
		System.out.println(cr.com1);
	}
}	
