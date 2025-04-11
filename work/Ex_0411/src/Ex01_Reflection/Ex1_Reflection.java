package Ex01_Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Ex1_Reflection {
	public static void main(String[] args) {
		//User클래스에 대한 정보가 clazz에 담김
		//필드의 목록, 메서드의 목록 ...
		Class<?> clazz = User.class;
		
		//필드의 개수
		Field[] fields = clazz.getDeclaredFields();//모든 필드(private포함)
		
		System.out.println("필드의 개수 : " + fields.length);
		
		//필드의 목록을 출력
		//getName(): 필드의 이름을 출력
		//getType(): 필드의 타입을 출력
		for(Field f : fields) {
			System.out.println("- " + f.getType() + " " + f.getName());
		}
		
		//메서드 목록 가져오기
		Method[] methods = clazz.getDeclaredMethods();;
		
		System.out.println("메서드의 개수 : " + methods.length);
		
		for(Method method : methods) {
			String name = method.getName();
			Class<?> returnType = method.getReturnType();
			Parameter[] parameters = method.getParameters();
			
			System.out.print("- " + returnType.getSimpleName() + " " + name + "(");
			
			for(Parameter parameter : parameters) {
				System.out.print(parameter.getName());
				System.out.print(", ");
			}
			System.out.println(")");
		}
	}
}
