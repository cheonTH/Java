package Ex01_StringBuilder;

public class Ex01_StringBuilder {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello");
		
		//append(): 기존 문자여르이 뒤에 삽입
		str.append(" World");
		System.out.println(str);
		System.out.println("문자열의 길이 : " + str.length());
		
		//delete(int start , int end): 시작지점부터 끝지점 전까지 문자열 삭제
		str.delete(0, 6); //실질적으로는 0 ~ 5 까지 삭제
		System.out.println(str);
		System.out.println(str.length());
		
		//insert(): 원하는 위치에 문자열 삽입
		str.insert(0, "Hello ");
		System.out.println(str);
		System.out.println(str.length());
		
		//reverse(): 문자열을 뒤집에서 출력
		str.reverse();
		System.out.println(str);
	}
}
