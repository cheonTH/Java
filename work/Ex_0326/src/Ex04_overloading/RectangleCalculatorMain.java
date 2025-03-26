package Ex04_overloading;

import java.util.Scanner;

public class RectangleCalculatorMain {
	public static void main(String[] args) {
		RectangleCalculator rc = new RectangleCalculator();
		
		System.out.println(rc.area(4));
		System.out.println(rc.area(4, 2));
		System.out.println(rc.area(4.5, 2.5));
	}
}
