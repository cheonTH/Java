package Exam2;

public class CalculatorMain {
	public static void main(String[] args) {
		Calc c = new Calc();
		
		int[] arr = {1, 2, 3, 4, 5};
		
		System.out.println("두 수의 합: " + c.add(5, 4));
		System.out.println("두 수의 차: " + c.substract(5, 4));
		System.out.println("평균: " + c.averge(arr));
	}
}
