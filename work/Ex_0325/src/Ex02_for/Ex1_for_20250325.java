package Ex02_for;

public class Ex1_for_20250325 {
	public static void main(String[] args) {
		//향상된 for문
		//jdk1.5부터 새롭게 추가된 기능으로 배열과 컬렉션의 모든 요소를 참조하기 위한 반복문
		
		//for(변수 : 배열){
		//	반복하고 싶은 명령;
		//}
		
		//일반적인 for문
		int[] ar = {1, 2, 3, 4, 5};
		for(int  i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("------------------------------");
		//향상된 for문
		//반복 대상의 요소를 하나씩 꺼내어 변수에 대입하면서 진행하고, 반복 대상의 길이만큼 꺼내어 반복
		for(int i : ar) {  // ar의 index값을 i에 대입
			System.out.println(i); //i값을 출력하면 ar[index]값을 확인 가능
		}
		
		
	}
}
