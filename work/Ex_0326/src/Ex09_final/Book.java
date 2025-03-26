package Ex09_final;

public class Book {
	String title = "홍길동전";
	final int PRICE = 25000; //상수   다른값을 대입할 수 없음
	
	
	//final메서드
	//자식 클래스에서 오버라이드 할 수 없음
	public final void info_title() {
		System.out.println("책의 제목은 : " + title + "가격은 : " + PRICE);
	}
}
