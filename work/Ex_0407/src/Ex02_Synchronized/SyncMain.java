package Ex02_Synchronized;

public class SyncMain {
	public static void main(String[] args) {
		SynchronizedEx atm = new SynchronizedEx();
		//runnable 인터페이스로 구현한 스레드는 start()메서드가 없기 때문에
		//Thread객체를 만들어 생성자에 전달을 하고 start() 메서드로 실행
		Thread mom = new Thread(atm, "엄마");
		
		Thread son  = new Thread(atm, "아들");
		
		mom.start();
		son.start();
	}
}
