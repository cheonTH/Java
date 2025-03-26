package Ex04_exam;

public class UserInfo {
	
	//userinfo 클래스 deposit(int money를 만들어 유저가 돈을 입금했을 때를 처리
	//withdraw(int money 메서드를 만들어 유저가 돈을 출금했을경우를 처리
	//단 이 메서드에서는 출금하고자 하는 돈보다 잔액이 적을 경우 잔액이 부족하다는 메시지를 출력
	//show money 메서드를 만들어 현재 잔액을 반환하도록 함
	static int money = 0;
	
	public static int deopsit(int money1) {
		money += money1;
		return money;
	}
	
	public static int withdraw(int money2) {
		
			if(money  < money2) {
				System.out.println("잔액이 부족합니다");
			}else
				money -= money2;
		return money;
	}
	
	public static int showMoney() {
		return money;
	}
}
