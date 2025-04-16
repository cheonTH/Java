package Ex04_16_Exam;

import java.util.Arrays;
import java.util.List;

public class Words_length {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "dog", "banana", "cat", "grape");
		
		words.stream()
			.filter(x -> x.length() >= 4)
			.sorted()
			.forEach(System.out::println);
	}
}
