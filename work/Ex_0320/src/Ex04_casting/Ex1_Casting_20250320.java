package Ex04_casting;
import java.util.Scanner;
public class Ex1_Casting_20250320 {
	public static void main(String[] args) {
		//형 변환(casting)
		//데이터를 다른 자료형의 데이터로 변환하는 것을 의미
		//모든 연산은 기본적으로 같은 자료형들끼리만 가능
		//따라서 서로 다른 자료형의 연산을 수행하기 위해서는 같은 자료형으로 변환해야 함
		
		int num = 11;
		double num2 = 3.14;
		
		//형 변환을 할때 -> (자료형)데이터;
		double numChange = (double)11;
		
		System.out.println("num의 값: "+ num + " num2의 값: " + num2 + " numChange의 값: " + numChange);
		System.out.println("변경전");
		System.out.println((int)1.23);
		
		Scanner scanf = new Scanner(System.in);
		
//		int a = scanf.nextInt();
//		int b = scanf.nextInt();
//		int c = scanf.nextInt();
//		
//		int sum = a+b+c;
//		double avg = sum / 3;

//		String result = (a>= 40 && b>=40 && c>=40) ? "합격" : "불합격";
//		if(avg < 0 || avg > 100) {
//			System.out.println("값이 올바르지 않습니다 다시 입력해주세요");
//		}else if(avg >= 60) {
//			System.out.println("과목의 총합: " + sum + " 과목의 평균: " + avg + "   축하합니다 합격입니다.");
//		}else {
//			System.out.println("과목의 총합: " + sum + " 과목의 평균: " + avg + "   불합격입니다.");
//		}
//		
		//상자 하나에는 농구공이 5개 들어감 x개의 농구공을 담기 위한 박스의 개수를 구하라
		
//		int ball = scanf.nextInt();
//		int count = 5;
//		double box = (ball%count) == 0 ? ball/count : (int)ball/count + 1;
//		
//		System.out.println("공" + ball+"개가 들어갈 박스의 개수: "+box + "개");
		
		//배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5, 7, 5개
		//하루에 생산되는 총 개수를 출력하고 시간당 전체 과일의 평균 생산 갯수를 출력
		
		int pear = 5, apple = 7, orange = 5 ;
		int fruit = pear + apple + orange;
		float h_avg = (float)(fruit/24.0);
		
		System.out.println("하루의 생산되는 총 개수: " + fruit + " 시간당 전체 과일의 평균 생산 갯수: " + h_avg);
	}
}
