package Access;

import Ex05_inheritance.Parent;

public class NotChild {
	void accessTest() {
		super.accessProtected();
		Parent p2 = new Parent();
		p2.accessProtected();
	}
}
