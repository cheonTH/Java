package Ex02_Thread;

public class MainThread {
	public static void main(String[] args) {
		ThreadName tn = new ThreadName();
		tn.start();
		
		//main도 하나의 Thread
		System.out.println("현재 실행되고 있는 스레드의 이름 : " + Thread.currentThread().getName());
		System.out.println("현재 실행되고 있는 스레드의 상태 : " + Thread.currentThread().getState()); //Runnable -> 실행될수있는 상태
		System.out.println("현재 실행되고 있는 스레드의 우선순위 : " + Thread.currentThread().getPriority()); //1 ~ 10 // 기본값 5 // 10이 우선순위가 가장 높음
	}
}
