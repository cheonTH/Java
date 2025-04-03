package Ex01_Lamda;

import java.util.function.Predicate;

public class Ex3_Function {
	public static void main(String[] args) {
		//Predicate의 결합
		//boolean test(T t)
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i % 2 == 0;

		int x = 150;
		//and() p and r (100미만이면서 짝수이면 참)
		//Predicate<Integer> and = p.and(r);
		boolean result = p.and(r).test(x); // => and.test(x)  >>위의 식이 같이 와야함
		System.out.println("x < 100 and 짝수인가? : " + result);
		//or()  p or q (100미만이거나 또는 200 미만이면 참)
		result = p.or(q).test(x);
		System.out.println("x < 100 또는 x < 200 : " + result);
		//negate() not p (100 이상이면 참)
		result = p.negate().test(x);
		System.out.println("x >= 100 ? : " + result);
	}
}
