package Ex04_while;

import java.util.Scanner;

public class Ex2_do_while_20250321 {
	public static void main(String[] args) {
		//while문과 같이 조건을 만족할 때까지 반복함
		//다만, while문과 다른점은 먼저 루프를 한 번 실행 한 후 조건식을 검사함
		//즉, 조건식의 결과와 상관없이 무조건 한번은 실행함
		
		//do{
		//	반복하고자 하는 문장;
		//while(조건식)
		
		int i =11;
		
		do {
			System.out.println(i);
			i++;
		}while(i <= 10);
		
		// 1~10까지 총합
		
		int a = 1;
		int hap = 0;
		do {
			hap += a;
			a++;
		}while(a<=10);
		System.out.printf("1~10까지의 총합: %d \n", hap);
		
		//비밀번호 확인 프로그램 
	//사용자로 부터 비밀번호를 입력 받아 올바른 비밀번호가 입력 될때 까지 계속 입력
	//비밀번호는 9486
		Scanner scanf = new Scanner(System.in);
//		System.out.print("비밀번호를 입력해주세요");
//		int pw = scanf.nextInt();
//		int pw_check;
//		boolean pw_true = false;
//		do {
//			System.out.print("비밀번호를 입력해주세요");
//			pw_check = scanf.nextInt();
//			if(pw_check == pw) {
//				System.out.println("비밀번호 확인 완료!");
//				pw_true = false;
//			}else {
//				System.out.println("비밀번호를 다시 입력해주세요.");
//				pw_true = true;
//			}
//			
//		}while(pw_true == true);
		
		//국어 영어 수학 점수를 입력 받음
		//단 각 과목은 40점 이상이어야 함
		//40점 미만일 경우 점수를 다시 입력
		
		
		boolean check = true;
		do {
			System.out.print("국어:  ");
			int kor = scanf.nextInt();
			System.out.print("수학:  ");
			int math = scanf.nextInt();
			System.out.print("영어:  ");
			int eng = scanf.nextInt();
			
			if(kor >= 40 && math >= 40 && eng >= 40) {
				System.out.printf("국어: %d 수학: %d 영어: %d", kor, math, eng);
				check = false;
			}else {
				System.out.println("각 점수는 40점 이상이어야 합니다.");
				check = true;
			}
		}while(check);
	
	}
}
