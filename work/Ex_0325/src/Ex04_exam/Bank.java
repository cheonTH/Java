package Ex04_exam;

import java.util.Scanner;

public class Bank {
	
	public static void bank() {
		
		Scanner scanf = new Scanner(System.in);
		UserInfo user = new UserInfo();
		boolean program = true;
		
		
		do {
			System.out.println("------------------------");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 잔액확인");
			System.out.println("4. 프로그램 종료");
			System.out.print("번호를 입력해주세요:    ");
			int select = scanf.nextInt();
			System.out.println("------------------------");
			
			
			if(select == 1) {
				System.out.println("------------------------");
				System.out.println("입금");
				System.out.print("입금할 금액을 입력해주세요:	");
				int inMoney = scanf.nextInt();
				user.deopsit(inMoney);
				
				System.out.println("현재 잔액은 : " + user.money +"원");
				program = false;
				System.out.println("------------------------");
			}
			
			if(select == 2) {
				System.out.println("------------------------");
				System.out.println("출금");
				System.out.print("출금할 금액을 입력해주세요:	");
				int outMoney = scanf.nextInt();
				user.withdraw(outMoney);
				
				System.out.println("현재 잔액은 : " + user.money +"원");
				program = false;
				System.out.println("------------------------");
			}
			
			if(select == 3) {
				System.out.println("------------------------");
				System.out.println("잔액확인");
				System.out.println("현재 잔액은 : " + user.showMoney() +"원");
				program = false;
				System.out.println("------------------------");
			}
			
			if(select == 4) {
				System.out.println("------------------------");
				System.out.println("프로그램을 종료합니다.");
				program = true;
				System.out.println("------------------------");
			}
			
		}while(program != true);
		
	}
}
