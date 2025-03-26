package Ex04_exam;

import java.lang.reflect.Method;
import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		//최대값 구하기
		MethodTest m  = new MethodTest();
		
		int[] arr = {1, 5, 3, 4, 6};
		m.maxFinder(arr);
		
		//원의 넓이와 둘레
//		m.circleArea();
//		System.out.println(m.circleRound());
		
		
		//계산기
		m.calculator(10, 2, "/");
		
		//1~50까지 난수 맞추기
		int num = 0;
		m.check(num);
		
		//if(m.check(answer).equals("정답!")) 문자열 비교
	}
}
