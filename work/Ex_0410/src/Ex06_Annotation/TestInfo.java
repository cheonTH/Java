package Ex06_Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//선언 키워드는 @interface
//어노테이션을 적용할 타겟
@Target(ElementType.TYPE)
//어노테이션이 적용될 시간
@Retention(RetentionPolicy.RUNTIME)
public @interface TestInfo {
	String name();
	int career() default 1;
	String[] skills();
	//어노테이션의 속성은 메서드 형태로 정의함
	
	
	//어노테이션 속성의 반환형은 제한적임
	//기본타입
	//String
	//Class
	//enum
	//다른 어노테이션
	//배열
	
	//속성에 기본값을 지정할 수 있음
	//예외를 던질 수 없음
	//String value() throw Exception; // 에러
	
	//속성은 매개변수를 가질 수 없음
	//String name(String input); // 에러
	
	
	String value() default "홍길동"; //추상메서드로 선언해야 함
}
