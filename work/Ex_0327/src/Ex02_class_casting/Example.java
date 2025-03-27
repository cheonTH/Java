package Ex02_class_casting;

class Parent{
	
}

class Child extends Parent{
	
}



public class Example {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		Parent p2 = new Child(); //자동 타입 변환
		Parent p3 = c1; //이미 만들어진 자식객체에 대한 타입 변경
		//Child c2 =  p1; //자동 타입 변환이 되지 않음 => 자식클래스에서 부모 클래스를 받으면 안되기 때문 
		
		
		//기본 자료형끼리 비교를 할때 == 연산자 값이 같은지 비교하지만
		//객체끼리 비교할때 == 연산자는 주소값을 비교
		if(p3 == c1) {
			System.out.println("p3와 c1은 같은 객체를 참조함");
		}
	}
}
