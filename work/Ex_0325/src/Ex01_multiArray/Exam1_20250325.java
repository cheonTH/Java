package Ex01_multiArray;

import java.util.Scanner;

public class Exam1_20250325 {
	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3, 4, 5},{6, 7, 8, 9, 10},{11, 12, 13, 14, 15},{16, 17, 18, 19, 20}};
		
		//배열 arr의 총합과 평균
		int sum = 0;
		double avg = 0;
		int count = 0;
		
		for(int i = 0; i  < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j]; 
				count ++;
			}
			
		}
		avg = (double)sum / count;
		System.out.println("총합: " + sum);
		System.out.println("평균: " + avg);
		
		System.out.println("------------------------------");
		
		//학생들의 정보를 입력하고 출력하는 프로그램
		//학생들의 수학과 영어 성적을 등록하는 프로그램
		//프로그램 실행 -> 몇명의 정보를 저장할 것인지 입력받음
		//입력받은 수 만큼 학생 이름, 수학, 영어 성적을 입력받는 프로그램 작성
		
		Scanner scanf = new Scanner(System.in);
		System.out.print("학생 수:   ");
		int a = scanf.nextInt();
		String[][] strArr = new String[a][3];
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				if(j == 0) {
					System.out.print("이름: ");
					strArr[i][j] = scanf.next();
				}
				if(j == 1) {
					System.out.print("수학: ");
					strArr[i][j] = scanf.next();
				}
				if(j == 2) {
					System.out.print("영어: ");
					strArr[i][j] = scanf.next();
				}
			}
			
		}
		for(int i = 0; i < a; i++) {
			System.out.println("strArr["+i+"]["+0+"] 이름 : " + strArr[i][0]);
			System.out.println("strArr["+i+"]["+1+"] 수학 : " + strArr[i][1] + "점");
			System.out.println("strArr["+i+"]["+2+"] 영어 : " + strArr[i][2] + "점");
			System.out.println("-------------------------------");
		}
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				if(j == 0) {
					System.out.println("strArr["+i+"]["+j+"] 이름 : " + strArr[i][j]);
				}else if(j == 1) {
					System.out.println("strArr["+i+"]["+j+"] 수학 : " + strArr[i][j] + "점");
				}else if(j == 2){
					System.out.println("strArr["+i+"]["+j+"] 영어 : " + strArr[i][j] + "점");
				}
			
			}
			System.out.println("-------------------------------");	
		}
		
	}
}
