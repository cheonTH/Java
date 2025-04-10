package Ex05_enum;

public class OperationMain {
	public static void main(String[] args) {
		Operation[] oper = Operation.values();
		
		for(Operation op : oper) {
			System.out.println(op.name() + "의 결과 : " + op.apply(20, 5));
		}
	}
}
