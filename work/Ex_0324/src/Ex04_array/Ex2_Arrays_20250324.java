package Ex04_array;

import java.util.Arrays;
import java.util.Comparator;

public class Ex2_Arrays_20250324 {
	public static void main(String[] args) {
		//Arrays클래스는 배열의 복사, 항목의 정렬, 항목 검색 등 배열을 다루기 위한 다양한 메서드를 제공
		//Arrays클래스를 이용하면 배열의 기능을 더욱 쉽게 사용할 수 있음.
		
		//scanner, random 클래스의 경우 객체를 먼저 생성 후 메서드를 사용
		//Array.함수명()으로 작성하여 기능을 호출
		
		//1. 배열의 출력
		//toString()
		//반복문의 도움 없이 배열을 출력할 수 있도록 도와줌
		//배열의 정의된 값을 문자열 형태로 변환하여 출력
		
		int[] arr = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};
		System.out.println(Arrays.toString(arr));
		
		//2. 배열의 정렬
		//sort()
		//기본적으로 오름차순으로 정렬해줌
		System.out.println("정렬 전");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); //반환값이 없음
		System.out.println("정렬 후");
		System.out.println(Arrays.toString(arr));
		
		//Comparator.reverseOrder()를 통해 내림차순으로 정렬이 가능하지만 기본자료형 배열로는 불가능
		//기본자료형의 클래스타입인 Wrapper클래스를 이용함
		Integer[] iArr = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};
		Arrays.sort(iArr, Comparator.reverseOrder());
		System.out.println(Arrays.toString(iArr));
		
		//3. 배열의 복사
		//자바에서 배열은 한 번 생성하면 그 길이를 변경할 수 없음
		//따라서 더 많은 데이터를 저장하거나 기존의 배열과 똑같은 배열을 새로 만드려면 배열을 복사해야함
		//배열을 복사하는 방법에는 얕은 복사와 깊은 복사 두가지가 있음
		
		//얕은 복사(Shallow Copy): 복사된 배열이나 원본배열이 변경될 때 서로간의 값이 함께 변경됨
		
		//깊은복사(deep copy): 복사된 배열이나 원본배열이 변경될 때 서로간의 값은 바뀌지 않음
		
		//얕은 복사
		int[] arr01 = {1, 2, 3};
		//arr01은 배연 {1, 2, 3}의 주소값을 가지고 있음
		
		System.out.println(arr01);
		
		int[] arr02 = arr01;
		//배열 arr02의 값 변경
		arr02[1] = 10;
		//arr02가 arr01의 주소를 참조하므로 arr02[1]이 바뀌면 arr01[1]도 바뀌게 됨
		System.out.println("arr01 배열: " + Arrays.toString(arr01));
		System.out.println("arr02 배열: " + Arrays.toString(arr02));
		
		//깊은 복사
		//배열의 깊은 복사는 반복문을 이용해 새로운 배열에 값을 직접 넣어주거나 Arrays 클래스 또는 System클래스가 가진 기능을 이용
		int[] cards = {1, 6, 4, 5, 3, 2};
		int[] newCards = new int[cards.length];
		
		//1. Arrays클래스를 이용한 깊은복사
		int[] newCards2 = Arrays.copyOf(cards, cards.length);
		System.out.println(cards);
		System.out.println(newCards2);
		System.out.println(Arrays.toString(newCards2));
 		
		//2. 반복문을 이용한 깊은 복사
		for(int i = 0; i < cards.length; i++) {
			newCards[i] = cards[i];
		}
		System.out.println(cards);
		System.out.println(newCards);
		System.out.println(Arrays.toString(newCards));
		
		//3.System클래스를 이용한 깊은 복사
		int[] newCards3 = new int[cards.length];
		System.arraycopy(cards, 0, newCards3, 0, cards.length);
		
		System.out.println(cards);
		System.out.println(newCards3);
		System.out.println(Arrays.toString(newCards3));
		
		newCards[1] = 100;
		
		System.out.println("cards 배열 : " + Arrays.toString(cards));
		System.out.println("newCards 배열 : " + Arrays.toString(newCards));
		System.out.println("newCards2 배열 : " + Arrays.toString(newCards2));
		System.out.println("newCards3 배열 : " + Arrays.toString(newCards3));
		
		//다차원 배열
		//2차원 이상의 배열을 의미하며, 배열의 요소로 또 다른 배열을 가지는 것을 의미
		//2차원 배열은 요소로서 1차원 배열을 가짐
		
		//int [] [] arr = new int[2차원 배열의 크기][2차원 배열이 갖는 1차원 배열의 크기];
		
		int[][] arr_3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		System.out.println(arr_3[0][0]);
		
		//요소로 들어가는 1차원 배열의 크기를 지정하지 않고 생성할 수 있음
		int[][] arr_4 = new int[3][];
		
		//각 배열의 크기를 각각 선언하여 사용할 수 있음
		
		arr_4[0] = new int [2];
		arr_4[1] = new int [3];
		arr_4[2] = new int [1];
		
		int [][]iArr_2 = new int[2][3];
		iArr_2[0][0] = 1;
		iArr_2[0][1] = 2;
		iArr_2[0][2] = 3;
		iArr_2[1][0] = 4;
		iArr_2[1][1] = 5;
		iArr_2[1][2] = 6;
		
		System.out.println(iArr_2[0]);
		
	}
}
