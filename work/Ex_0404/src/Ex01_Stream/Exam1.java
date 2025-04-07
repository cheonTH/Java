package Ex01_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
}

public class Exam1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//짝수만 출력
		Stream<Integer> stream = numbers.stream()
				.filter((x -> x % 2 == 0));
		stream.forEach(System.out::println);
		
		//kim으로 식작하는 이름만 골라서 대문자로 변환
		//알파벳 순으로 정렬하여 출력하는 코드 작성
		List<String> names = Arrays.asList("kim chulsoo", "lee younghee", "park minsue", "kim younghee", "choi gildong");
		
		names.stream()
			.filter(x -> x.startsWith("kim"))
			.map(t -> t.toUpperCase())
			.forEach(System.out::println);
		
		List<String> num = Arrays.asList("1","2","3","4","5","6");
		//짝수의 제곱값만 모아서 리스트로 반환
		
		List<Integer> even_num = num.stream()
				.map(Integer::parseInt)
				.filter(x -> x % 2 == 0).map(n -> n*n)
				.collect(Collectors.toList());
		System.out.println(even_num);
		
		//점수가 가장 높은 학생의 이름 출력
		 List<Student> students = Arrays.asList(
		            new Student("Alice", 85),
		            new Student("Bob", 92),
		            new Student("Charlie", 78)
		        );
		 
		 //ifPresent()
		 //Optional클래스에서 제공하는 메서드로
		 //값이 존재할 경우에만 어떤 동작을 수행하고 싶을때 사용하는 메서드
		 //Optional안에 값이 있으면 Consumer<T>를 실행하고 값이 없으면 아무 일도 하지 않음
		 Stream<Student> stream2 = students.stream();
		 stream2.max(Comparator.comparing(Student::getScore)).ifPresent(t -> System.out.println(t.getName()));;
//		 Optional<Student> opt =stream2.max(Comparator.comparing(Student::getScore));
//		 System.out.println(opt.get().getName());
		 
		 //orElse(default)
		 //값이 없으면 기본값을 반환
		 //ifPresentOrElse(value, default)
		 //값이 있으면 value, 값이 없으면 default
	}
}
