package Ex03_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Ex3_Map {
	public static void main(String[] args) {
		//문장을 입력박고 단어별로 몇번 등장 했는지 출력
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("문장을 입력하세요: ");
		String str = scanf.nextLine();
		
		String[] str_arr = str.split(" ");
		
		System.out.println(Arrays.toString(str_arr));
		
		boolean check = false;
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int i = 1;
		for(String x : str_arr) {
			//map.put(x, i);
//			if(map.containsKey(x)) {
//				//이미 키가 존재한다면 값 1 증가
//				int count = map.get(x);
//				map.put(x, count+1);
//			}else {
//				//단어가 처음 나왔을 때
//				map.put(x, 1);
//			}
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		System.out.println("단어별 등장 횟수");
		
		for(String  key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		//Map 인터페이스에서 제공하는 메서드
		//V getOrDefault(K key, defaultValue)
		//키가 존재하면 Value를 반환
		//키가 존재하지 않으면 defaultValue를 반환
		
		//V replace(K key, V value)
		//put은 키가 없으면 추가가 됨
		//replace는 키가 없으면 추가가 안됨
		
		//V putIfAbsent(K key, V value)
		//키가 없을 경우에만 추가
		
		//키가 있을경우 put() -> 덮어쓰기
		//putIfAbsent() -> 아무 동작도 하지 않음
	}
}
