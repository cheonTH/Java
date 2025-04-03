package Ex04_Interface;

public class Kitchen implements Menu1, Menu2{
	
	//여러개의 인터페이스를 구현할 수 있음
	
	//인터페이스를 구현한 클래스는 반드시 추상메서드를 오버라이드 해야함

	//메서드의 재정의
	//컴파일러에게 메서드가 재정의 되었다는 것을 알려줌
	//@ -> 어노테이션
	@Override
	public String JJamBBong() {
		return "면 + 해물 + 육수";
	}

	@Override
	public String jajang() {
		return "면 + 춘장 + 완두콩";
	}
	
}
