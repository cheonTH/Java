package Ex05_Generic;

public class GenMain {
	public static void main(String[] args) {
		GenEX<Integer> v1 = new GenEX<>();
		v1.setValue(100);
		
		System.out.println(v1.getValue());
		
		GenEX<String> v2 = new GenEX<String>();
		
		v2.setValue("홍길동");
		System.out.println(v2.getValue());
	}
}
