package Ex02_switch;

public class Ex2_switch_20250321 {
	public static void main(String[] args) {
		//switch문에 break가 없는 경우
		
		int num = 1;
		switch(num) {
		case 1:
			System.out.println("num은 1입니다");
		case 7:
			System.out.println("num은 7입니다");
		default :
			System.out.println("num은 1도 7도 아닙니다");
		}
		
		//int 형 변수 x가 10보다 크고 20보다 작을때 true인 조건식
		//x>10 && x<20
		
		//char형 변수가 ch 대문자 또는 소문자일때 조건식
		char ch = 'a';
		
		if(ch >= 'A' && ch <='Z' || ch>='a' && ch<='z') {
			
		}
	}
}
