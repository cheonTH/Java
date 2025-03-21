package Ex01_if;
import java.util.Scanner;
public class Exam1_20250321 {
	public static void main(String[] args) {
		//농구공을 담기 위한 박스 개수
		
		Scanner scanf = new Scanner(System.in);
		
		int ball = scanf.nextInt();
		int count = 5;
		int box = (int)ball / count;
		
		if(ball % count ==0) {
			System.out.println("공 " + ball + "개는 " + box + "개에 담을 수 있습니다.");
		}else {
			System.out.println("공 " + ball + "개는 " + (box+1) + "개에 담을 수 있습니다.");
		}
		
		
	}
}
