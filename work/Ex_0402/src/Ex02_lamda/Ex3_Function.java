package Ex02_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Ex3_Function {
	public static void main(String[] args) {
		//컬렉션 프레임워크의 인터페이스에 일부는 함수형 인터페이스를 사용함
		ArrayList<String> list = new ArrayList<String>();
		list.add("이름1");
		list.add("이름2");
		list.add("이름3");
		list.add("이름4");
		list.add("이름5");
		list.add("이름6");
		
		
		//void accept(T t)
		
		//list에 들어있는 요소를 하나씩 꺼내서 출력
		//forEach는 출력할 때 자주 쓰임
		list.forEach(System.out::println); // 매개변수가 하나이고 조건식이 하나이면 줄일 수 있음 x -> System.out.println(x) == System.out::println
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		
		hs.forEach(System.out::println);
		
	}
}
