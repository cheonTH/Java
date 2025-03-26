package Ex04_overloading;

import java.util.Scanner;

public class RectangleCalculator {
	//다양한 방식으로 사각형의 넓이 구하기
	//메서드 명 area
	//정사각형의 한변의 길이를 받아 넓이 반환
	//가로 세로 길이를 받아 직사각혀의 넓이 반환
	//실수형 가로, 세로를 받아 실수 결과 반환
	Scanner scanf = new Scanner(System.in);
	public int area(int n) {
		System.out.print("정사각형의 한변의 길이:	" + n);
		System.out.println("");
		return n * n;
	}
	
	public int area (int x, int y) {
		System.out.print("직사각형의 가로의 길이:	" + x);
		System.out.print("직사각형의 세로의 길이:	" + y);
		System.out.println("");
		return x * y;
	}
	
	public double area(double x, double y) {
		System.out.print("직사각형의 가로의 길이:	" + x);
		System.out.print("직사각형의 세로의 길이:	" + y);
		System.out.println("");
		return x * y;
	}
}
