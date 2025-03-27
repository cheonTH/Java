package Exam1;

public class CalMain {
	public static void main(String[] args) {
		CalPlus c_plus = new CalPlus();
		CalMinus c_minus = new CalMinus();
		
		System.out.println("CalPlus : " + c_plus.getResult(15, 15));
		System.out.println("CalMinus : " + c_minus.getResult(30, 15));
	}
}
