package Ex03_variable;

public class Ex2_variable_20250320 {
	public static void main(String[] args) {
		//변수의 유효범위(scope)
		//모든 변수는 만들어진 중괄호 안에서만 사용할 수 있음
		String favorite_food;
		favorite_food = "제육";
		
		System.out.println("변경전");
		System.out.println("favorite_food: "+ favorite_food);
	}
}
