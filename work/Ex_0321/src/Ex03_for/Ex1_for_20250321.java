package Ex03_for;
import java.util.Scanner;
public class Ex1_for_20250321 {
	public static void main(String[] args) {
		//반복문
		//특정 명령을 원하는 만큼 반복하여 실행하는 제어문
		
		//for, while
		
		//for
		//주로 반복 횟수가 정해져 있을때 사용하는 문법
		
		//for(초기식;조건식;증감식){
		//	반복하고자 하는 문장;
		//}
		
		//초기식 : 반복을 하기 위한 시작값으로 변수를 하나 초기화 함
		//조건식 : 반복을 위한 종료값으로 비교연산자를 많이 사용
		//증감식 : 초기식에 있는 변수의 값을 증감시켜주는 역할을 함
		
		for(int i = 0; i <= 3; i++) {
			System.out.println(i);
		}
		int i = 0;// 초기값을 밖에다 쓸 수 있음
		for(; i <= 3; i++) { //대신 자리는 만들어야함
			System.out.println(i);
		}
		
		for(; i <= 3;) {
			System.out.println(i);
			i++; // 증감값도 밖에서 쓸 수 있음
		}
		
		//초기식에 들어가는 변수 i를 무조건 사용할 필요는 없음
		//사용하는게 좋을 거 같을때 쓰면 됨
		
		//1~10까지 출력하는 for문 가로로
		for(int a = 1; a <= 10; a++) {
				System.out.print(a + " ");
		}
		
		System.out.println("");
		//10~1까지
		for(int a = 10; a > 0; a--) {
			System.out.println(a + " ");
		}
		
		//1~10까지 3의 배수
		for(int a = 1; a <= 10; a++) {
			if(a % 3 == 0) {
				System.out.println(a);
			}
		}
		int result = 0;
		//1~10까지 총합
		for(int a = 1; a <= 10; a++) {
			result += a;
		}
		System.out.println(result);
		
		//키보드에서 정수를 하나 입력받아 해당 단의 구구단 출력
		Scanner scanf = new Scanner(System.in);
//		int dan = scanf.nextInt();
//		int mul;
//		for(int a = 1; a <= 9; a++) {
//			mul = dan * a;
//			System.out.printf("%d X %d = %d \n", dan, a, mul);
//		}
		
		//1~n까지의 총합을 계산하여 출력
//		int n = scanf.nextInt();
//		int result_2 = 0;
//		for(int a = 1; a <= n; a++) {
//			result_2 += a; 
//		}
//		System.out.printf("1~%d까지의 합: %d \n", n, result_2);
//		
//		//10개의 정수를 입력받아 그중 짝수가 몇개인지 구하기
//		int count = 0;
//		for(int a = 1; a <=10; a++) {
//			System.out.printf("숫자 %d입력: ", a);
//			int b = scanf.nextInt();
//			
//			if(b % 2 == 0) {
//				count++;
//			}
//		}
//		System.out.printf("10개의 값중 짝수는 %d개 입니다 \n", count);
//	
		//1+(1+2)+(1+2+3)...(1+2+3+...+10)
		int result_3 = 0;
		int sum = 0;
		for(int a = 1; a <= 10; a++) {
			sum += a;
			result_3 += sum;
		}
		System.out.println(result_3);
		
		//양의 정수 x를 입력받고 x가 홀수 이면 x이하의 홀수인 양의 정수의 합
		//x가 짝수이면 x이하의 짝수인 정수의 제곱의 합
		//x가 7이라면 1+3+5+7
		//x가 10이면 2^2 + 4^2 + 6^2 + 8^2 + 10^2
		
		int result_4 = 0;
		int x = scanf.nextInt();
		if(x % 2 == 0) {
			for(int a = 1; a <= x; a++) {
				if(a % 2 == 0) {
					result_4 += a * a;
				}
			}
		}else {
			for(int a = 1; a <= x; a++) {
				if(a % 2 == 1) {
					result_4 += a;
				}
			}
		}
		System.out.printf("%d : %d", x, result_4);
	}
	
	
}

