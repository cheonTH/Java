package Ex02_lamda;

public class Ex2_Function2 {
	public static void main(String[] args) {
		FunctionExam fe = new FunctionExam();
		
		Iminus im = fe.makeFunction(); //  (x,y) -> x - y;
		int res = im.sub(3, 1);
		
		System.out.println("res : " + res);
		
	}
}
