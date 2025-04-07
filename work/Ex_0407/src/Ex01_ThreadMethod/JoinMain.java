package Ex01_ThreadMethod;

public class JoinMain {
	public static void main(String[] args) {
		JoinExample je = new JoinExample();
		
		je.start();
		
		try {
			je.join();//main스레드는 worker스레드가 끝날때까지 기다림
		} catch (Exception e) {
			
		}
		System.out.println("메인 스레드 종료");
	}
}
