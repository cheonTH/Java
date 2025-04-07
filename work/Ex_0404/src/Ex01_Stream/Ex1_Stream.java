package Ex01_Stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex1_Stream {
	public static void main(String[] args) {
		//무한스트림
		//Stream.generate()
		//무한하게 값을 만들어내는 스트림
		//무한스트림은 반드시 limit()으로 개수를 제한하는 것이 좋음 
		Stream<String> stream = Stream.generate(() -> "hello").limit(3);
		stream.forEach(System.out::println);
		
		//Stream.iterate()
		Stream<Integer> stream_2 = Stream.iterate(1, n -> n +2).limit(5);
		stream_2.forEach(System.out::println);
		System.out.println("----------------");
		
		//기본 자료형 스트림
		//int => IntStream
		//long => LongStream
		//double => DoubleStream
		
		IntStream intStream = IntStream.of(1,2,3,4,5);
		IntStream.range(1, 5).filter(x -> x % 2 == 0).forEach(System.out::println);; // 1 ~ 4 범위
		IntStream.rangeClosed(1, 5); // 1 ~ 5 범위
		System.out.println("----------------");
		
		//Random클래스를 통한 스트림 생성
		//ints(): IntStream을 생성
		//ints(개수, 시작값, 종료값) 만약 45까지 받고 싶으면 종료값을 46
		Random rand = new Random();
		rand.ints(10,1,45).forEach(System.out::println);;
	}
}
