package Ex02_constructer;

public class Phone {
	String brand;
	int series;
	String color = "검정색";
	
	//자바에서는 외부에서 제공할 수 있는 데이터만큼만 매개변수로 전달하여 객체를 생성할 수 있음
	//생성자를 다양한 형태로 선언하는 것을 '생성자 오버로딩'이라고 함
	
	//오버로딩 규칙
	//1. 매개변수의 개수가 다를때
	//2. 매개변수의 개수가 같아도 자료형이 다를 때
	//3. 생성자나 메서드의 이름은 그대로 사용
	
	public Phone(String brand, int series) {
		this.brand = brand;
		this.series = series;
	}
	
	
	public Phone(String brand, int series, String color) {
		this.brand = brand;
		this.series = series;
		this.color = color;
	}
	
	public void phonnInfo() {
		System.out.println(color + " " + brand + " " + series);
	}
	
}
