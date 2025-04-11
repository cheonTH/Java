package Ex06_Annotation;

import java.lang.annotation.Annotation;

@TestInfo(name = "홍길동", skills = {"Java", "Spring"})
public class Ex2_Annotation {
	public static void main(String[] args) {
		Annotation[] anotaions = Ex2_Annotation.class.getAnnotations();
		
		for(Annotation annotation : anotaions) {
			System.out.println(annotation);
		}
		
		TestInfo testInfo = (TestInfo)Ex2_Annotation.class.getAnnotation(TestInfo.class);
		System.out.println(testInfo.name());
	}
}
