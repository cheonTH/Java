package Ex01_if;

public class Ex2_if_else_20250321 {
	public static void main(String[] args) {
		//if문만 사용하면 조건이 참일때만 흐름을 제어할 수 있음
		//조건이 거짓일 때도 흐름을 제어하고 싶다면 if~else문을 사용
		
		//if(조건식){
		//	조건이 참일때 실행할 문장;
		//}else{
		//	조건이 거짓일 때 실행할 문장;
		//}
		
		int num = 5;
		
		if(num > 4) {
			System.out.println(num + "은 4보다 큽니다.");
		}else{
			System.out.println(num + "은 4보다 작습니다.");
		}
		
		int a= 4, b = 10;
		
		if(a>b) {
			System.out.println(a + "가 " + b + "보다 큽니다.");
		}else{
			System.out.println(a + "가 " + b + "보다 작거나 같습니다.");
		}
	}
}
