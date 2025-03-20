package Ex03_variable;

public class Ex1_variable_20250320 {
	public static void main(String[] args) {
		//변수
		//프로그램을 만들고 실행하는데 필요한 값들을 메모리에 저장해두고, 필요할때마다 꺼내서 사용
		
		//메모리에 무질서하게 저장되는 것이 아니라, 메모리 규칙속에서 일부 공간을 할당받아야 함
		//메모리의 값을 저장하기 위해 할당해 놓은 특정 공간을 변수라고 함
		
		//1. 변수의 선언
		//변수를 사용하기 위해서는 선언을 우선 해야함
		//자료형 변수명;
		
		//변수명을 짓는 규칙
		//1. 숫자 특수문자($,_ 제외)가 첫글자로 올 수 없음
		//2. 대소문자 구별
		//3. 일반적으로 영어 소문자로 시작
		//4. 특수문자가 포함될 수 없음
		//5. 예약어 금지(if, switch, for, while 등)
		//6. 한글 사용 X
		
		//표기법
		//카멜 표기법
		//두번째 단어부터 첫글자를 대문자로 표기
		//userName, homeAdress
		
		//스네이크 표기법
		//모든 단어를 소문자로 시작하고 단어와 단어 사이는 _로 연결하는 방식
		//user_name, home_adress
		
		//변수의 데이터 입력하기
		//데이터를 직접 사용하는 대신, 변수에 저장하고 변수명을 사용하여 값을 사용
		
		int studentAge;
		studentAge = 20;
		
		System.out.println(studentAge);
		
		boolean b = false;
		
		System.out.println("b의 값: " + b);
		//자바는 변수의 타입을 엄격하게 지켜야함
		
		//문자형
		char ch = 'a';
		
		System.out.println(ch);
		
		char ch2 = 65; //아스키 코드로 65 = A
		System.out.println(ch2);
		
		//정수형
		byte by = 127;
		
		short s = 32767;
		int n = 550;
		System.out.println("by의 값: "+ by + " s의 값: " + s + " n의 값: " + n);
		
		//실수형
		float f1, f2;
		//자바에서는 실수의 타입을 double로 인식하기 때문에 데이터가 float타입이라는 것을 명시해줘야 함
		f1 = 3.14f;
		f2 = 150;
		
		System.out.println("f1의 값: "+ f1 + " f2의 값: " + f2);
		
		int myAge = 20;
		int yourAge = myAge;
		
		myAge= 21;
		
		System.out.println("myAge = " + myAge + "yourAge = " + yourAge);
		
		//두 변수의 들어있는 값을 교환하려면 어떻게 해야할까?
		int su1 = 20, su2 = 30;
		System.out.println("변경전");
		System.out.println("su1의 값: "+ su1 + " su2의 값: " + su2);
		
		int su3;
		su3 = su1;
		su1 = su2;
		su2 = su3;
		System.out.println("변경후");
		System.out.println("su1의 값: "+ su1 + " su2의 값: " + su2);
	}
}
