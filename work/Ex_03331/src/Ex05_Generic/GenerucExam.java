package Ex05_Generic;

import java.util.ArrayList;
import java.util.List;

class Gen<T>{
	List<T> list = new ArrayList<>();
	public<T> void printArr(T[] arr) {
		for(T x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
public class GenerucExam {
	//Gen클래스를 만들어 제네릭타입 T를 가지는 printArr메서드를 생성
	//PrintArr메서드 내부에서 배열을 순차적으로 출력하는 코드를 작성
	//main에서 Integer, Double, Charcter배열을 각각 만든 뒤 Gen클래스의 printArr메서드를 각각 호출하여 내용을 출력
	public static void main(String[] args) {
		Integer[] iArr = {1, 2, 3, 4, 5};
		Double[] dArr = {1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] cArr = {'A', 'B', 'C', 'D', 'E'};
		
		Gen g1 = new Gen();
		
		//컴파일러가 전달된 인자의 타입을 보고 타입을 추론함
		g1.printArr(iArr);
		g1.printArr(dArr);
		g1.printArr(cArr);
		
		//타입의 명시
		g1.<Integer>printArr(iArr);
		g1.<Double>printArr(dArr);
		g1.<Character>printArr(cArr);
	}
}
