package Ex02_Synchronized;

class Counter {
	private int count = 0;
	
	//이 메서드에 두개의 스레드가 동시에 접근할 때 에러가 발생할 수 있음
	//synchronized를 사용하여 동기화 메서드로 만들어줌
	public synchronized void  increment() {
		count++;
		System.out.println(Thread.currentThread().getName() + " - count : " + count);
	}
	
	public int getCount() {
		return count;
	}
	
}

public class SychronizedExample  {
	public static void main(String[] args) throws InterruptedException{
		Counter counter = new Counter();
		Thread t1= new Thread(() -> {
			for(int i = 0; i < 15; i++) {
				counter.increment();
			}
		},"Thread - 1");
		
		Thread t2= new Thread(() -> {
			for(int i = 0; i < 15; i++) {
				counter.increment();
			}
		},"Thread - 2");
		
		t1.start();
		t2.start();
		
		//t1과 t2가 끝날 때까지 main은 기다림
		t1.join();
		t2.join();
		
		System.out.println("최종 count : " + counter.getCount());
	}
}
