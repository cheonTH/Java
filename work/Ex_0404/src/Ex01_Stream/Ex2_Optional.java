package Ex01_Stream;

import java.util.Optional;
import java.util.OptionalInt;

public class Ex2_Optional {
	public static void main(String[] args) {
		//스트림의 최종결과를 Optional로 반환하는 것들이 있었음
		//제네릭클래스로 T타입의 객체를 감싸는 Wrapper클래스임
		
		Optional<String>  optStr = Optional.of("abcde");
		//optStr에 들어있는 글자의 수를 반환받기
		Optional<Integer> optInt = optStr.map(String::length);
		System.out.println("optStr = " +optStr.get());
		System.out.println("optInt = " +optInt.get());
		
		//autoBox, unbox
		int result = Optional.of("123")
				.filter(x -> x.length() > 0)
				.map(Integer::parseInt)
				.get();
		
		System.out.println("result = " + result);
		
//		OptionalInt  optInt_2 = OptionalInt.empty();
//		System.out.println(optInt_2.getAsInt()); //에러
		
		Optional<String> opt = Optional.ofNullable(null);
		System.out.println("opt: " + opt);
	}
}
