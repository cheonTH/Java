package Ex01_Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

class Greeting{
	private String name;

	public Greeting(String name) {
		this.name = name;
	}
	
	public String sayHello() {
		return "Hello" + name;
	}
}

class Student{
	private int score;

	public Student(int score) {
		this.score = score;
	}
	
	public boolean isPassed(int cutLine) {
		return score > cutLine;
	}
	
}
public class Exam2 {
	public static void main(String[] args) {
		//Greeting 메서드를 참조하여 sayHello()호출
		Function<Greeting, String> hello = Greeting::sayHello;
		
		Greeting g = new Greeting("홍길동");
		
		System.out.println(hello.apply(g));
		
		//학생이 특정 점수 이상인지 확인하는 메서드를 메서드 참조로 구하기
//		Function<Student, Boolean> check = a -> a.isPassed(70);
//		
//		Student s = new Student(50);
//		
//		if(check.apply(s)) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}
		
		BiPredicate<Student, Integer> passChecker = Student::isPassed;
		
		Student s2 = new Student(85);
		System.out.println(passChecker.test(s2, 70));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//조건에 맞으면 삭제
		list.removeIf(x -> x%2 == 0);
		
		System.out.println(list);
	}
}
