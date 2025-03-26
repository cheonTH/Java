package Ex04_exam;

import java.util.Random;
import java.util.Scanner;

public class MethodTest {
	//배열의 최대값을 찾는 maxFinder메서드
	//임의의 배열은 매개변수로
	
	
	void maxFinder(int[] arr) {
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("최대값: " + max);
	}
	
	
	//원의 넓이와 둘레
	//함수로 호출하면서 반지름을 입력받음
	//원의 넓이를 구하는 circleArea
	//원의 둘레를 구하는 circleRound
	//circleArea는 결과 출력
	//circleRound는 결과 반환
	//원의 넓이 : 3.14 * r * r
	//원의 둘레 : 2 * 3.14 * r
	
	void circleArea() {
		Scanner scanf = new Scanner(System.in);
		System.out.print("반지름을 입력해주세요: ");
		int radius = scanf.nextInt();
		double area = (double)3.14 * radius * radius;
		
		System.out.println("반지름 " + radius + "의 원의 넓이 : " + area);
	}
	
	double circleRound() {
		Scanner scanf = new Scanner(System.in);
		System.out.print("반지름을 입력해주세요: ");
		int radius = scanf.nextInt();
		double round = (double)3.14 * 2 * radius;
		return round;
	}
	
	//계산기 만들기
	//사칙연산을 할 수 있는 calculator메서드
	//두 수와 연산자를 매개변수로 받음
	void calculator(int a, int b, String s) {
		if(s == "+") {
			System.out.printf("%d + %d = %d \n", a, b, a + b);
		}else if(s == "-") {
			System.out.printf("%d - %d = %d \n", a, b, a - b);
		}else if(s == "*") {
			System.out.printf("%d X %d = %d \n", a, b, a * b);
		}else if(s == "/") {
			System.out.printf("%d / %d = %d \n", a, b, a / b);
		}
	}
	
	//1~50사이의 난수를 생성
	//main쪽에서 키보드를 통해 정수를 입력받음
	//check()메서드를 만들어서 사용자가 입력한 숫자를 판단
	//발생한 난수보다 크다면 down 작다면 up을 출력 사용자가 입력한 숫자와 발생한 난수가 같은 경우에 프로그램 종료
	void check(int num) {
		Scanner scanf = new Scanner(System.in);
		Random rand = new Random();
		int a =  rand.nextInt(50) + 1;
		boolean check = false;
		int count = 0;
		do {
			System.out.print("숫자를 입력해주세요: ");
			num = scanf.nextInt();
			count++;
			if(num == a) {
				System.out.println("정답입니다!!! " + count+"회 만에 맞췄습니다");
				check = true;
			}else if(num > a) {
				System.out.println("입력한 숫자가 더 큽니다.");
				check = false;
			}else if(num < a) {
				System.out.println("입력한 숫자가 더 작습니다.");
				check = false;
			}
		}while(check != true);
		
		
	}
	
	
	void printGraph(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
            int count = 1; 
            boolean check = false;

            // 이미 출력한 숫자라면 넘어감
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    check = true;
                    break;
                }
            }

            if (!check) {
                // 중복된 개수 세기
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                // 해당 숫자에 대해 중복된 개수만큼 별을 찍음
                System.out.print(arr[i] + ": ");
                for (int k = 0; k < count; k++) {
                    System.out.print("*");
                }
                System.out.println(); // 줄 바꿈
            }
        }
    }
}
	
	
	
	

