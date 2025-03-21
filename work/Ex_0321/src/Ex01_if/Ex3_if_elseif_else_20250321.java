package Ex01_if;

public class Ex3_if_elseif_else_20250321 {
	public static void main(String[] args) {
		//비교해야할 조건이 여러개 있는 경우 사용하는 문법
		//if문 안에 두개 이상의 조건식과 논리 연산자를 사용할 수 있지만 더욱 코드를 간결하게 하고 가독성을 높이기 위한 방법으로 if - else if문을 구현
		
		//if(조건식1){
		//	조건식1이 참일때 실행할 문장;
		//}else if(조건식2){
		//	조건식1이 거짓이고 조건식2가 참일 때 실행할 문장;
		//}...else{
		//	위의 조건이 모두 거짓일 때 실행할 명령
		//}
		
		//else-if문의 개수에는 제한이 없지만 너무 많이 사용된다면 프로그램 실행 속도가 현저히 느려질 수 있기 때문에 다른방법을 함께 고려해야함
		//else문은 필요 없다면 생략이 가능
		
		int favorite = 7;
		if(favorite > 5) {
			System.out.println("좋아하는 숫자가 5보다 큽니다");
		}else if(favorite == 7) {
			System.out.println("좋아하는 숫자는 7입니다.");
		}
		//효율적인 흐름으로 제어하기 위해 if문과 else if문의 조건문의 위치를 잘 고려해야 함.
		
		
		
	}
}
