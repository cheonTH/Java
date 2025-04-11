package Ex02_DB;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
	public static void main(String[] args) {
		PersonMethod pm = new PersonMethod();
		
		pm.add(4, "김길동", 40);
		
		List<Person> list = PersonMethod.find();
		
		for(Person p : list) {
			System.out.printf("ID : %d , Name : %s , Age : %d \n", p.getId(), p.getName(), p.getAge());
		}
		
		
	}
}
