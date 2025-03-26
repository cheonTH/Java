package Ex06_inheritance;

public class CarMain {
	public static void main(String[] args) {
		SchoolBus sb = new SchoolBus(10);
		
		sb.takePerson(); //Bus클래스 오버라이딩
		sb.ride(); //Car클래스 오버라이딩
	}
}
