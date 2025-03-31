package Ex03_Wrapper;

public class Ex1_Wrapper {
	public static void main(String[] args) {
		//Wrapper클래스
		//프로그램에 따라 기본타입의 데이터를 객체형으로 표시해야하는 경우가 있음
		//이를 위해서 자바에서는 기본자료형을 객체로 다루기 위한 클래스를 제공함
		//이를 Wrapper클래스라고 부르는데 기본형의 데이터타입을 클래스로 포장했기 때문
		
		//int => Integer
		//char => Character
		//float => Float
		//double => Double
		
		//생성자를 통한 선언은 jdk 1.9부터 사용하지 않는 것을 권장
		Integer num1 = new Integer(10);
		
		Integer num2 = Integer.valueOf(10);
		
		Double d = Double.valueOf(30.11);
	}
}
