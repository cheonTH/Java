package Ex02_Thread;

// 스레드를 생성하는 방법
//1. Thread를 상속 받음
public class ThreadTest extends Thread{
	
	@Override
	public void run() {
		//작업할 내용
		for(int i = 0; i < 10; i ++) {
			System.out.println("스레드 진행중 " + i);
		}
	}
}
