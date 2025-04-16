package Ex04_16_Exam;

public class Student {
	String name;
	int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
	
	
}
