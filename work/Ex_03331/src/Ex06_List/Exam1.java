package Ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		//ArrayList를 만든 후 
		//아이디 생성 : abc
		//abc
		//아이디 생성: abc2
		//abc abc2
		//아이디 생성 : abc3
		//중복된 아이디
		
		Scanner scanf = new Scanner(System.in);
		
		ArrayList<String> arr = new ArrayList<String>();
		
//		for(int i = 0; i < 5; i++) {
//			System.out.print("아이디 생성 : ");
//			String id = scanf.next();
//			arr.add(id);
//			System.out.println(arr);
//		}
		
		out:while(true) {
			System.out.print("아이디 생성 : ");
			String id = scanf.next();
			
			
			for(String x : arr) {
				if(arr.contains(id)) {
					System.out.println("중복된 아이디");
					arr.remove(id);
					continue out;
				}
			}
			arr.add(0, id);
			for(String userId : arr) {
				System.out.print(userId + " ");
			}
			System.out.println();
			
			if(arr.size() == 5) {
				break;
			}
		}
		
		
	}
}
