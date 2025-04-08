package Ex01_Thread;

import java.util.Scanner;

//스캐너를 이용하여 키보드에서 숫자를 입력받고
//스레드에서 입력받은 숫자 부터 1씩 감소하다가 0이 되었을 때 "종료"메시지와 함께 프로그램이 종료되도록
//Thread는 ThreadCount에서 작성


class ThreadCount extends Thread{
	private int num;
	public ThreadCount(int num) {
		this.num = num;
	}
	
	
	@Override
	public void run() {
		for(int i = num; i >= 0; i--) {

			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("종료");
		
	}
	
}

public class Exam1 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = scanf.nextInt();
		ThreadCount tc = new ThreadCount(num);
		
		
		tc.start();
	}
}
