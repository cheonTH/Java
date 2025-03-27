package Ex02_class_casting;

public class CalenderMain {
	public static void main(String[] args) {
		DeskCalender dc = new DeskCalender("보라색", 6);
		
		dc.info(); //자식클래스에 오버라이드된 메서드
		dc.hanging(); //부모클래스에 선언된 메서드
		dc.onTheDesk(); //자식 클래스에 선언된 메서드
		
		System.out.println();
		
		Calender c = new DeskCalender("검은색", 12);
		
		c.info();
		c.hanging();
		
		//c.onTheDesk();
		//DeskCalender객체임에도 Calender타입을 가졌기 때문에 DeskCalender의 멤버에는 접근할 수 없음
	}
}
