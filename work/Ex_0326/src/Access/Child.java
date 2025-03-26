package Access;

import Ex05_inheritance.Parent;

public class Child extends Parent{
	
	void accessTest() {
		//protected 키워드가 붙은 메서드도 이런식으로 접근이 가능
		super.accessProtected();
	}
	
	Parent p1 = new Parent();
	p1.accessProtected();
}
