package Ex03_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex2_Map {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Scanner scanf = new Scanner(System.in);
		
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);
		
		System.out.print("ID : ");
		String id  = scanf.next();
		
		System.out.println();
		
		System.out.print("PW : ");
		int pw = scanf.nextInt();
		
		if(map.containsKey(id) == false) {
			System.out.println("아이디가 존재하지 않습니다");
		}else if(map.containsValue(pw) == false) {
				System.out.println("비밀번호 불일치");
		}else {
			System.out.println("로그인 성공");
		}
		
		
	}
}
