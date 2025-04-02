package Ex02_lamda;


public class Ex1_Function {
	public static void main(String[] args) {
		Iadd add = (x,y) -> x + y;
		int res = result(add);
		
		Iadd minus = (x,y) -> x - y;
		int res_mi = result(minus);
		
		System.out.println("res : " + res + " res_mi : " + res_mi);
	}
	
	public static int result(Iadd lamda){
		return lamda.add(1, 2);
	}
}
