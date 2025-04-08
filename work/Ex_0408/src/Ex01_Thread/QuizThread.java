package Ex01_Thread;

import java.util.Random;
import java.util.Scanner;

//QuizThread클래스를 만들어 스레드를 상속
//startGame()메서드를 만들어 그 안에서 1~100사이의 난수 두래를 더하는 문제를 출제
//키보드에서 답을 입력하여 5문제가 정답처리 될 때까지 로직을 반복
//모든 문제를 맞추는데 몇초가 걸렸는지를 화면에 출력하며 프로그램을 종료하기
public class QuizThread extends Thread{
	Random rand = new Random();
	Scanner scanf = new Scanner(System.in);
	
	private int x;
	private int y;
	private int answer;
	private int count = 0;
	private boolean check = false;
	private int sec;
	
	public void startGame() {
		try {
			for(int i = 1; i <= 5; i++) {
				x = rand.nextInt(100)+1;
				y = rand.nextInt(100)+1;
				System.out.print(x + " + " + y + " = ");
				answer = scanf.nextInt();
				if(x+y == answer) {
					System.out.println("정답입니다");
				}else {
					System.out.println("오답입니다");
					i--;
				}
			}
			check = true;
		} catch (Exception e) {
			System.out.println("정답은 정수로 입력해주세요");
		}
		
	}
	
	@Override
	public void run() {
		try {
			while(!check) {
				Thread.sleep(1000);
				count += 1;
			}
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("걸린시간 : " + count + "초");
	}
}
