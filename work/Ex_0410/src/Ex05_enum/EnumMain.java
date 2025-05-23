package Ex05_enum;

import java.util.Arrays;

public class EnumMain {
	public static void main(String[] args) {
		//열거형은 직접 객체를 생성할 수 없음
		//enum의 생성자는 암묵적으로 private로 만들어져 있음
		//JVM이 각 상수를 단 한번만 생성하고 공유함
		
		Item i1 = Item.START;
		System.out.println(i1);
		//모든 열거형이 상속하는 Enum클래스에 toString()메서드에서 이름을 반환하기 때문에 이름이 출력됨
		
		Item[] items = Item.values();
		System.out.println(Arrays.toString(items));
		
		//열거형 상수에 들어있는 순서 보기
		for(Item item : items) {
			System.out.println("name = " + item.name() + ", ordinal = " + item.ordinal());
		}
		
		Item i2 = Item.valueOf("START");
		System.out.println(i2);
		
		System.out.println(i1 == i2);
		
		Item i3 = Item.EXIT;
		
		//열거형끼리는 '=='을 제외하고 비교연사자는 사용할 수 없음
		//compareTo()는 사용이 가능함
		//System.out.println(i1 > i3);//사용 불가
		System.out.println(i1.compareTo(i3));
		//a.compareTo(b)
		//a가 b보다 앞서면 -> 음수
		//a와 b가  같으면 -> 0
		//a가 b보다 뒤면 -> 양수
		
		//열거형과 switch문
		//열거형 상수를 switch의 case에 쓸 수 있음
		
		switch(i1) {
		case START: //Item.START앞의 타입은 생략해도 됨
			System.out.println("시작");
			break;
		case STOP:
			System.out.println("정지");
			break;
		case EXIT:
			System.out.println("종료");
			break;
		}
		
		
		for(Item item : items) {
			System.out.println(item.getItmeStr());
		}
		
		for(Item item : items) {
			System.out.println(item.getSymbol());
		}
		
		//왜 enum을 쓰는가?
		//1. 코드의 가독성을 증가
		//int status = 1; -> 나중에 무슨 의미 인지 모를 수 있음
		//ㄴ>Status status = Status.SUCCESS;
		
		//2. 타입 안정성 보장
		//정해진 값 이외에 다른 값을 넣을 수 없음
		//열거형을 안쓸 때 : int color = 999999;//문법적으로 틀린것이 아니라 에러가 안남 // 단 우리가 설정한 색의 범주가 아님
		//Color color = Color.RED; //Color타입만 들어올 수 있음
		
		//3. 기능 확장에 유리
		//enum은 단순 상수 집합이 아니라 필드, 생성자, 메서드도 가질 수 있기 때문에 상태값에 따라 동작을 다르게 만들 수 있음
		
	}
}
