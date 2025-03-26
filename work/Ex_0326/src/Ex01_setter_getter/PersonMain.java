package Ex01_setter_getter;

public class PersonMain {
	public static void main(String[] args) {
		//필드를 private로 선언하면 외부에서 직접사용할 수 없음
		Person p = new Person();
		
		//setter메서드를 통해서 필드에 값을 세팅
		p.setAge(30);
		
		System.out.println(p.getAge());
	}
}
