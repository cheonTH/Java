package Ex04_casting;

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
		
		
	}
}
