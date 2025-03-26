package Access;


public class PublicB {
	public static void main(String[] args) {
		//Default클래스가 default 제한이라서 다른 패키지에서 만들어지지 않음
		
		DefaultA a = new DefaultA();
		a.variableC = 10;
	}		
}
