package Ex01_continue;

public class Ex1_continue_20250324 {
	public static void main(String[] args) {
		//기타제어문
		//반복문은 각각 정해진 횟수 또는 조건에 의해 반복을 진행함.
		//하지만 숫자가 표시된 100개의 공에서 특정 숫자가 적힌 공을 찾는데, 10번마에 찾았다면 더 이상 반복을 할 필요가 없음
		//기타제어문은 반복문의 횟수도 제어할 수 있음
		
		//1. continue
		//반복문 안에서 continue를 만나면 이후의 실행 코드는 수행되지 않고, 반복문의 처음으로 돌아가 반복문을 진행
		//for문은 증감식으로 이동하며, while문과 do-while문의 경우 조건식을 이동
		
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("홀수의 합: " + sum);
		
		int s = 0;
		sum = 0;
		while(s < 10) {
			s++;
			if(s % 2 == 0) {
				continue;
			}
			sum += s;
		}
		System.out.println("홀수의 합: " + sum);
		
	}
}
