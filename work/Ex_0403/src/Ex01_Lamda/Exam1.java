package Ex01_Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class P_lamda{
	//리스트의 필터 메서드를 만듬
	//숫자 리스트에서 조건을 결합한 결과만 필터링
	//Predicate<Integer>를 사용해 다음 조건을 구현
	//짝수, 100이상, 200미만
	
	public List<Integer> filter(List<Integer> list , Predicate<Integer> condition){
		List<Integer> result = new ArrayList<>();
		for(Integer num : list) {
			if(condition.test(num)) {
				result.add(num);
			}
		}
		
		return result;
	}
}

public class Exam1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(50,80,120,150,180,210,250,300);
		
		//조건(람다식)
		Predicate<Integer> even = t -> t % 2 ==0;
		Predicate<Integer> x = t -> t > 100;
		Predicate<Integer> y = t -> t < 200;
		
		Predicate<Integer> all = even.and(x).and(y);
		//메서드 호출해서 리스트와 조건을 넘김
		P_lamda p = new P_lamda();
		
		List<Integer> list = p.filter(numbers, all);
		
		System.out.println(list);
		
	}
}
