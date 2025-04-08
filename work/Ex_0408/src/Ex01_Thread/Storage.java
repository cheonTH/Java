package Ex01_Thread;

public class Storage {
	
	//재고
	private int stackCount = 10;
	
	public synchronized void addStack(int stackCount) {
		this.stackCount += stackCount;
		if(this.stackCount >= 10) {
			System.out.println("== 스레드 깨우기 ==");
			notify(); //스레드를 깨워서 물건을 날라라
		}
	}
	public synchronized void popStack(int leaveCount) {
		if(leaveCount > stackCount) {
			stackCount = 0;
		}else {
			stackCount  -= leaveCount;
		}
		
		if(stackCount == 0) {
			System.out.println("== 짐 없음 대기 ==");
			try {
				wait(); //스레드가 진행중에 wait을 만나면 일시적으로 정지
				//스레드가 구동되고 있을 때 일시적으로 대기상태에 보내고 다른 스레드에게 제어권을 넘김
				System.out.println("== 대기 끝 일 시작 ==");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	//재고 개수 확인 getter
	public int getStackCount() {
		return stackCount;
	}
	
}
