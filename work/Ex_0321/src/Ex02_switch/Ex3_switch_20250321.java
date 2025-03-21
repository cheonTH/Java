package Ex02_switch;

public class Ex3_switch_20250321 {
	public static void main(String[] args) {
		//java 12이상으로 업데이트 되면서 switch의 문법이 새롭게 만들어짐
		//조건절에 복수개의 값을 사용하는 것이 가능해짐
		//화살표 표현식을 이용하는게 가능해짐
		
		String day = "saturday";
		
		switch(day) {
		case "monday":
		case "tuesday":
		case "wendsday":
		case "thursday":
		case "friday":
			System.out.println("평일");
			break;
		case "saturday":
		case "sunday":
			System.out.println("주말");
			break;
		default:
			System.out.println("잘못된 입력");
		}
		
		//기존의 switch문과는 달리 case에 해당하는 절만 실행되고 그 후의 case는 실행되지 않음
		switch(day) {
		case "monday", "tuesday", "wendsday", "thursday", "friday"
			-> System.out.println("평일");
			
		case "saturday", "sunday"
			-> System.out.println("주말");
		default
			-> System.out.println("잘못된 입력");
		}
	}
}
