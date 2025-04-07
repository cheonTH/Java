package Ex01_ThreadMethod;

public class SleepThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("카운트 다운 5초");
		for(int i = 5; i >= 0; i--) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {  //InterruptedException - 스레드가 해야할 일을 처리하지 못할 때
				e.printStackTrace();
			}
		}
		
		System.out.println("시스템 종료");
	}
}
