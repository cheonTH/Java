package Ex02_class_casting;

class Car{}
class Bus extends Car{}
class SchoolBus extends Bus{};

class OpenCar extends Car{};
class SportCar extends OpenCar{};

public class Example2 {
	public static void main(String[] args) {
		//1차 상속관계가 아니더라도 자동으로 타입 변환이 됨
		Car c1 = new SchoolBus();
		Bus b1 = new Bus();
		Bus b2 = new SchoolBus();
		
		Car c2 = new OpenCar();
		OpenCar oc = new SportCar();
		
		
		//버스와 오픈카 스포츠카는 상속관계가 아니기 때문에 타입 변환을 할 수 없음
		//Bus b3 = new OpenCar(); //상속관계가 맺어져 있지 않아 안됨
		//Bus b4 = new SportCar();
	}
}
