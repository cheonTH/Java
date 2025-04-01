package Ex01_Set;

import java.util.HashSet;
import java.util.Scanner;

public class Word {
	public static void main(String[] args) {
		//사용자가 입력한 문장에서 단어가 중복되었는지 검사하기
		//중복이 되었으면 true 중복이 안됬으면 false
		
		Scanner scanf = new Scanner(System.in);
		
		HashSet<String> set = new HashSet<String>();
		
		System.out.print("문장 입력 : ");
		String str = scanf.nextLine();
		
		String[] str_arr = str.split(" ");
		boolean hasDeuplicate = false;
		for(int i = 0; i < str_arr.length; i++) {
			System.out.println(str_arr[i]);
		}
		
		for(String x : str_arr) {
			if(!set.add(x)) {
				hasDeuplicate = true;
				break;
			}
		}
		if(hasDeuplicate) {
			System.out.println("중복 단어 있음");
		}else {
			System.out.println("중복 단어 없음");
		}
		
	}
}
