package Exam2;

//입력한 숫자의 합, 차 평균 구하기
//Calc클래스를 만들어 상속받기
public abstract class Calculator {
	
	public abstract int add(int a, int b);
	
	public abstract int substract(int a, int b);
	
	public abstract double averge(int[] a);
}
