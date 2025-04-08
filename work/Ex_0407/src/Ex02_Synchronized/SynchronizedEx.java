package Ex02_Synchronized;

//특정 스레드들이 공유하는 한개의 자운을 사용중일때 형제 자원을 사용중이지 않은 다른 스레드가 접근하지 못하게 하는 것을 동기화(Synchronized)라고 함
public class SynchronizedEx implements Runnable{

	private long money = 10000;
	
	
	@Override
	public void run() {
		//SynchronizedEx.class : SynchronizedEx 클래스 자체
		//SynchronizedEx클래스에 락을 걸겠다는 의미
		//하나의 스레드가 이미 점유중이라면 다른 스레드가 사용할 수 없음
		
		//sychronized블록
		//필요한 부분만 선택적으로 동기화를 할 수 있어 조금 더 성능을 최적화할 수 있음
		synchronized (SynchronizedEx.class) {
			for(int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(getMoney() <= 0) {
					break;
				}
				outMoney(1000);
			}
		}
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}
	
	
	//출금
	public void outMoney(long money) {
		//조점근한 스레드의 이름을 저장
		String threadName = Thread.currentThread().getName();
		//잔고가 0보다 크면
		if(getMoney() > 0) {
			this.money -= money;
			System.out.println(threadName + " - 잔액 : " + getMoney() + "원");
		}else {
			System.out.println("잔액이 부족합니다");
		}
		
	}
}
