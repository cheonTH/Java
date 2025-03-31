package Ex05_Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex4_Generic {
	public static void main(String[] args) {
		List<Integer> lists = new ArrayList<Integer>(Arrays.asList(1,2,3));
		List<String> strList = Arrays.asList("apple", "banana");
		print(lists);
//		print(strList);
	}
	
	//와일드카드의 경우는 메서드의 매개변수의 타입으로 사용하는 것이 일반적임
//	public static void print(List<?> list) {
//		for(Object e : list) {
//			System.out.println(e);
//		}
//		
//	}
	
	//Number와 자식클래스까지만 허용
//	public static void print(List<? extends Number> list) {
//		for(Object e : list) {
//			System.out.println(e);
//		}
//		
//	}
	
	//Integer를 포함한 부모타입까지만 허용
	public static void print(List<? super Integer> list) {
		for(Object e : list) {
			System.out.println(e);
		}
		
	}
}
