package Ex01_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex1_Collections {
	public static void main(String[] args) {
		//Collections
		//Java에서 컬렉션을 다룰 때 유용한 기능들을 제공하는 클래스
		//java.util.Collections패키지에 포함되어 있으먀
		//모든 메서드는 정적 메서드
		
		//sort()
		//리스트의 요소를 오름차순으로 정렬
		List<Integer> numbers = Arrays.asList(4,2,9,3,6,7,1,8);

		System.out.println("정렬 전 : " + numbers);
		Collections.sort(numbers);
		System.out.println("정렬 후 : " + numbers);
		
		//reverse(list)
		//리스트 요소의 순서를 내림차순으로 정렬
		Collections.reverse(numbers);
		System.out.println("내림차순 정렬 후 : " + numbers);
		
		//shuffle(list)
		//리스트 요소를 무작위로 섞음
		Collections.shuffle(numbers);
		System.out.println("shuffle 후 : " + numbers);
		
		//min(Collection C)
		//컬렉션에서 최소값은 찾음
		int min = Collections.min(numbers);
		System.out.println("최소값 : " + min);
		
		//max(Collection C)
		//컬렉션에서 최대값은 찾음
		int max = Collections.max(numbers);
		System.out.println("최대값 : " + max);
		
		//set이나 map은 list로 변환한 다음 사용해야 함
		
		
		
		
	}
}
