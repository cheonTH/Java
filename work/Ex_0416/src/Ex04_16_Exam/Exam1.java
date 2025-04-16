package Ex04_16_Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		
		// 이름과 나이 출력
		Student s = new Student("홍길동", 20);
		
		s.printInfo();
		
		
		//이름 출력
		Person p1 = new Person();
        p1.name = "Alice";

        Person p2 = p1;
        p2.name = "Bob";

        System.out.println(p1.name);
        
        //11번 출력
        String_word words = x -> x.toUpperCase();
        
        String str = "hello";
        str = words.word(str);
        
        System.out.println(str);
        
        //코드 출력
        T2 t = new T2();
        t.function(1);
        t.function();
        System.out.println();
        
        //15번 코드 출력
        Vehicle obj = new Car("Spark");
        System.out.print(obj.getName());
        System.out.println();
        
        //16번
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 72);
        scores.put("Charlie", 90);
        
        for(Map.Entry<String, Integer> entryScore : scores.entrySet()) {
        	if(entryScore.getValue() >= 80) {
        		System.out.println("이름 : " + entryScore.getKey() + ", 점수 : " + entryScore.getValue());
        	}
        }
        
        //17번
        Map<String, Double> studentMap = new HashMap<>();
        
        Scanner scanf = new Scanner(System.in);
        String name = null;
        int kor = 0;
        int eng = 0;
        int math = 0;
        
        boolean check = false;
        
        int sum = 0;
        double avg = 0.0;
        
        while(!check) {
        	StudentScore stu = new StudentScore();
        	System.out.println("이름 입력(exit는 종료): ");
        	name = scanf.next();
        	if(name.equalsIgnoreCase("exit")) {
        		System.out.println("프로그램을 종료합니다");
        		break;
        	}
        	System.out.print("국어점수: ");
        	kor = scanf.nextInt();
        	stu.setKor(kor);
        	
        	System.out.print("수학점수: ");
        	math = scanf.nextInt();
        	stu.setMath(math);
        	
        	System.out.print("영어점수: ");
        	eng = scanf.nextInt();
        	stu.setEng(eng);
        	
        	sum = stu.getKor() + stu.getEng() + stu.getMath();
        	avg = sum/3;
        	
        	studentMap.put(name, avg);
        }
        
        Iterator<String> itor = studentMap.keySet().iterator();
		while (itor.hasNext()) {
			String key   = itor.next();
			Double value = studentMap.get(key);
			
			System.out.println(key + " - " + value);
		}
        
        for(Map.Entry<String, Double> entry : studentMap.entrySet()) {
        	if(entry.getValue() >= 80.0) {
        		System.out.println("이름 : " + entry.getKey() + ", 평균 점수 : "  + entry.getValue());;
        	}
        }
	}
}
