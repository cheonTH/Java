package Ex03_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex4_Map {
	public static void main(String[] args) {
		//학생별 국어 영어 수학 점수 저장 및 평균 계산
		//학생 이름을 입력 받고 해당 학생의 국어 영어 수학 점수를 입력 받음
		//3명의 학생정보를 입력받은 후 각 학생의 평균점수를 계산
		
//		HashMap<String, Double> scoreMap = new HashMap<String, Double>();
		
		Scanner scanf = new Scanner(System.in);
//		
//		int[] score = new int[3];
//		int kor;
//		int eng;
//		int math;
//		double avg = 0;
//		
//		for(int i = 0; i < score.length; i++) {
//				System.out.print("학생 이름 : ");
//				String name = scanf.next();
//				System.out.print("국어 점수 : ");
//				kor = scanf.nextInt();
//				System.out.print("영어 점수 : ");
//				eng = scanf.nextInt();
//				System.out.print("수학 점수 : ");
//				math = scanf.nextInt();
//				
//				avg = (double)(kor + eng + math) / 3;
//				scoreMap.put(name, avg);
//		}
//		
//		System.out.println("--- 학생별 평균 점수 ---");
//		for(String  key : scoreMap.keySet()) {
//			System.out.println("이름 : " + key + " : 평균 점수 : " + scoreMap.get(key));
//		}
		
		Map<String, List<Integer>> studentMap = new HashMap<>();
		
		System.out.println("3명의 학생 정보를 입력하세요");
		for(int i = 0; i < 3; i++) {
			System.out.print("학생 이름 : ");
			String name = scanf.next();
			System.out.print("국어 점수 : ");
			int kor = scanf.nextInt();
			System.out.print("영어 점수 : ");
			int eng = scanf.nextInt();
			System.out.print("수학 점수 : ");
			int math = scanf.nextInt();
			
			List<Integer> scores = Arrays.asList(kor, eng, math);
			studentMap.put(name, scores);
		}
		//학생별 평균
		for(String name : studentMap.keySet()) {
			List<Integer> scores = studentMap.get(name);
			int total = 0;
			for(int s : scores) {
				total +=s;
			}
			double avg = total / (double)3;
			System.out.println(name + ": 평균: " + avg);
		}
		
//		for(Map.Entry<String, List<Integer>> entry : studentMap.entrySet()) {
//			String name = entry.getKey();
//			List<Integer> scores = entry.getValue();
//			double avg = (scores.get(0) + scores.get(1) + scores.get(2)) / 3;
//			System.out.println(name + ": 국어: " + scores.get(0) + " 영어: " + scores.get(1) + " 수학: " + scores.get(2) + " 평균: " + avg);
//		}
		
	}
}
