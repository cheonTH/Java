package Ex04_while;

import java.util.Random;
import java.util.Scanner;

public class Ex1_while_20250321 {
	public static void main(String[] args) {
		//while문은 반복횟수가 정해져있을 때 할 수 있지만 반복 횟수를 정확히 모를때 유용
		
		//초기식;
		//while(조건식){
		//	반복하고자 하는 문장;
		//	증감식;
		//}
		
		int i = 1;
		
		while(i < 4) {
			System.out.println(i);
			i++;
		}
		
		//반복 횟수가 정해져 있지 않을 때
		Random rnd = new Random();
		int random = rnd.nextInt(10)+1; // 1~10까지의 난수가 대입
		Scanner scanf = new Scanner(System.in);
		int answer = 0;
		boolean isAnswer = true;
		//키보드에서 값을 입력 받음
//		while(isAnswer) {
//			System.out.println("정답 : ");
//			answer = scanf.nextInt();
//			if(answer == random) {
//				System.out.println("정답!");
//				isAnswer = false;
//			}
//		}
		
		//int타입 변수 num에 정수를 입력받고 각 자리수의 합을 더한 결과를 출력
		System.out.print("정수 입력: ");
		int num = scanf.nextInt();
		int sum = 0;
		while(num > 0) {
			sum += num%10;
			num /= 10;
		}
		System.out.printf("%d", sum);
		
		
	}
}
