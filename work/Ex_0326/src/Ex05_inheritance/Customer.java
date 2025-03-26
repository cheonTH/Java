package Ex05_inheritance;

public class Customer extends Person{
	int memberID;

	public Customer(String name, int age, int memberID) { //부모의 생성자에 매개변수가 담기면 super() 생략 불가능
		super(name, age); //부모 생성자의 호출
		this.memberID = memberID;
	}
	
	void enter() {
		System.out.printf("회원번호 : %d (%s, %d세)님이 입장하셨습니다. \n", memberID, name, age );
	}
	
}
