package Ex04_overloading;

public class OverloadMain {
	public static void main(String[] args) {
		Overload ol = new Overload();
		
		//같은 이름이지만 인자에 따라 다른 기능을 하는 메서드를 만들 수 있음
		ol.result();
		ol.result(20);
		ol.result('a');
		ol.result("문자열", 100);
		ol.result(100, "문자열");
	}
}
