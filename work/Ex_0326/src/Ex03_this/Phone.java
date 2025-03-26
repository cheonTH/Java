package Ex03_this;

public class Phone {
	String brand;
	int series;
	String color = "검정색";
	
	//this()
	//같은 클래스 안에 있는 생성자 중 매개변수의 개수, 자료형, 순서에 맞는 다른 생성자를 호출하는 메서드로 생성자 내부에서만 사용할 수 있음
	
	public Phone(String brand, int series) {
		this.brand = brand;
		this.series = series;
	}
	
	
	public Phone(String brand, int series, String color) {
		this(brand, series); // 첫줄에서만 호출할 수 있음
		this.color = color;
	}
	
	public void phonnInfo() {
		System.out.println(color + " " + brand + " " + series);
	}
	
}
