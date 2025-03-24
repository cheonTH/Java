package Ex02_break;

import java.util.Random;
import java.util.Scanner;

public class Exam1_20250324 {
	public static void main(String[] args) {
		//1~50 사이의 난수를 생성 난수를 맞추는 프로그램 만들기
		//적은 값이 난수 보다 작으면 맞춰야할 숫자보다 더 큽니다
		//적은 값이 난수보다 크면 "맞춰야할 숫자가 더 작습니다
		
		Random rand = new Random();
		Scanner scanf = new Scanner(System.in);
		
		int rand_num = rand.nextInt(50) + 1;
		int num = 0;
		int i = 0;
//		 do{
//			System.out.print("숫자를 입력해 주세요: ");
//			num = scanf.nextInt();
//			i++;
//			if(num < rand_num) {
//				System.out.println("맞춰야 할 숫자보다 더 작습니다");
//				continue;
//			}
//			if(num > rand_num) {
//				System.out.println("맞춰야 할 숫자보다 더 큽니다");
//				continue;
//			}
//			
//			if(num == rand_num) {
//				System.out.printf("정답입니다\n맞친 횟수: %d회", i);
//				break;
//			}
//		}while(rand_num != num);
		 
		 while(rand_num != num){
				System.out.print("숫자를 입력해 주세요: ");
				num = scanf.nextInt();
				i++;
				if(num < rand_num) {
					System.out.println("입력한 숫자가 더 작습니다");
					continue;
				}
				if(num > rand_num) {
					System.out.println("입력한 숫자가 더 큽니다");
					continue;
				}
				
				System.out.printf("정답입니다\n맞히는데 걸린 횟수: %d회", i);
			}
		 
//		 for(i = 0; ;) {
//			 System.out.print("숫자를 입력해 주세요: ");
//				num = scanf.nextInt();
//				i++;
//				if(num < rand_num) {
//					System.out.println("입력한 숫자가 더 작습니다");
//					continue;
//				}
//				if(num > rand_num) {
//					System.out.println("입력한 숫자가 더 큽니다");
//					continue;
//				}
//				
//				System.out.printf("정답입니다\n맞히는데 걸린 횟수: %d회", i);
//				break;
//		 }
		 
	}
}
