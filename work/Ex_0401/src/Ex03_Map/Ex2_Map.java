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
		
		if(id != map.containsKey("kim")) {
			
		}
		
	}
}
