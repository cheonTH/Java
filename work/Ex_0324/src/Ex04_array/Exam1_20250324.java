package Ex04_array;

import java.util.Random;
import java.util.Scanner;

public class Exam1_20250324 {
	public static void main(String[] args) {
		int[] iArr = new int[10];
		//배열에 각각의 index에 1~10를 할당하고 총 합을 구하여 출력
		int sum = 0;
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = i+1;
			sum += iArr[i];
			System.out.println("iArr["+ i +"] : " + iArr[i]);
		}
		System.out.println("iArr[1~10] 총합: " + sum);
		
		Random rand = new Random();
		//r.nextInt(30) + 1
		//iArr에 각 index에 난수를 넣고 배열의 짝수 요소들의 총합 구하기
		
		
		int sum_2 = 0;
		
		for(int i = 0; i < iArr.length; i++) {
			int rand_num = rand.nextInt(30) + 1;
			iArr[i] = rand_num;
			System.out.println("iArr["+ i +"] : " + iArr[i]);
			
			if(iArr[i] % 2 == 0) {
				sum_2 += iArr[i];
			}
		}
		System.out.println("iArr[]의 짝수의 합 : " + sum_2);
		
		int[] nums = {5, 7, 2, 9, 4, 10, 3};
		int[] max_num = new int[1];
		int[] min_num = new int[1];
		
		max_num[0] = nums[0];
		min_num[0] = nums[0];
		
		//배열에서 최대값과 최소값을 출력하는 프로그램
		for(int i = 1; i < nums.length; i++) {
				if(nums[i] > max_num[0]) {
					max_num[0] = nums[i];
				}
				
				if(nums[i] < min_num[0]) {
					min_num[0] = nums[i];
				}
		}
		System.out.println("nums[]의 최대값: " + max_num[0] + " nums[]의 최소값: " + min_num[0]);
		
		System.out.println("---------------------------------------------------------");
		
		int[] nums2 = {1, 2, 1, 3, 2, 1, 4};
		int[] count = new int[5];
		int count_1 = 0;
		int count_2 = 0;
		int count_3 = 0;
		int count_4 = 0;
		
		for(int i = 0; i < nums2.length; i++) {
			if(nums2[i] == 1) {
				count_1++;
			}
			if(nums2[i] == 2) {
				count_2++;
			}
			if(nums2[i] == 3) {
				count_3++;
			}
			if(nums2[i] == 4) {
				count_4++;
			}
		}
		System.out.println("1 : " + count_1 + "번");
		System.out.println("2 : " + count_2 + "번");
		System.out.println("3 : " + count_3 + "번");
		System.out.println("4 : " + count_4 + "번");
		
		for(int i = 0; i < nums2.length; i++) {
			count[nums2[i]]++;
		}
		
		for(int i = 1; i <= 4; i++) {
			System.out.printf("%d : %d번 \n", i, count[i]);
		}
		
		int[] nums3 = {5,3,8,4,2};
		//오름차 순
		int nums_sub = 0;
	
		
		for(int i = 0; i < nums3.length - 1; i++) {
			for(int j = 0; j < nums3.length-1 - i; j++) {
				if(nums3[j] > nums3[j+1]) {
					nums_sub = nums3[j];
					nums3[j] = nums3[j+1];
					nums3[j+1] = nums_sub;
				}
			}
		}
		for(int i = 0; i< nums3.length; i++) {
			System.out.println(nums3[i]);
		}
		
		char[] cards = {'1', 'L', 'O', '2', 'V', '3', 'E'};
		String myWord = "";
		//배열에서 영문자만 추출하여 이어붙여 출력
		for(int i = 0; i < cards.length; i++) {
			if(cards[i] >= 'A' && cards[i] <= 'z') {
				myWord += cards[i];
			}
		}
		System.out.println(myWord);
		
		//키보드에서 배열의 길이를 입력받음
		//입력받은 배열의 길이만큼 알파벳을 넣고 출력
		//배열의 길이 : 5
		//ABCDE
		
		Scanner scanf = new Scanner(System.in);
//		System.out.print("배열의 길이:    ");
//		int num = scanf.nextInt();
//		char[] wordArr = new char[num];
//		char word = 'A';
//		for(int i = 0; i < wordArr.length; i++) {
//			wordArr[i] = word;
//			System.out.println("wordArr[" + i + "] : " + wordArr[i]);
//			word++;
//		}
		
		//동전의 개수 구하기
		//10 ~ 5000사이의 난수를 변수
		//1의 자리는 반드시 0이 되도록함
		//발생된 난수를 각 동전으로 바꿀 때 몇개씩 필요한지 판단하여 작성
		Random rand_2 = new Random();
		int rand_coin = (rand_2.nextInt(500)+10) * 10;
		int[] coin = {500, 100 , 50, 10};
		System.out.println(rand_coin);
		
		for(int i = 0; i < coin.length; i++) {
			int res = rand_coin / coin[i];
			System.out.printf("%d원 : %d \n", coin[i], res);
			rand_coin %= coin[i];
		}
		
		//로또번호 출력
		Random rand1 = new Random();
		int[] lottoArr = new int[6];
				
		for(int i = 0; i < lottoArr.length; i++) {
			int lotto = rand1.nextInt(45) + 1;
			lottoArr[i] = lotto;
					
			for(int j = 0; j < i; j++) {
				if(lottoArr[i] == lottoArr[j]) {
					i--;
				}
			}
			System.out.println("로또번호" + (i + 1) + ": " + lottoArr[i]);
		}
		
	}
}
