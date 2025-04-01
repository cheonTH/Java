package Ex01_Set;

import java.util.HashSet;
import java.util.Random;

public class Ex1_Set {
	public static void main(String[] args) {
		//Set은 객체의 저장 순서를 저장하지 않음
		//수학의 집합과 유사한 개념을 지니고 있음
		//중복을 허용하지 않음
		//index를 부여하지 않기 때문에 데이터가 입력된 순서대로 출력된다는 보장이 없음
		
		//HashSet
		//Set 인터페이스에서 가장 많이 사용되는 클래스
		
		HashSet<String> hs1 = new HashSet<String>();
		
		//add(E e)
		//데이터의 추가
		hs1.add("apple");
		hs1.add("banana");
		hs1.add("orange");
		hs1.add("apple"); //중복되는 데이터는 추가되지 않음
		
		System.out.println(hs1); //입력한 순서대로 출력되지는 않음
		
		hs1.add(null); //null도 한 번 저장이 가능
		
		System.out.println(hs1);
		
		//HashSet이 중복되는 요소를 어떻게 체크하는지?
		//1. hashcode()로 같은 주소를 가지고 있는지 비교
		//2. 해시값이 같으면 equals()로 실제값을 비교
		//ㄴ>둘다 같으면 삭제
		
		//remove()
		//삭제
		hs1.remove("apple");
		System.out.println(hs1);
		
		//size()
		//들어있는 요소의 개수
		System.out.println(hs1.size());
		
		//contains(Object o)
		//요소가 포함되어있는지 판별
		System.out.println(hs1.contains("banana"));
		
		//HashSet을 쓰기 좋을 때?
		//1. 중복되는 데이터가 없이 뽑을 때
		//2. 순서나 정렬이 중요하지 않을 때
		
		//HashSet객체를 이용하여 로또번호 뽑기
		HashSet<Integer> hs2 = new HashSet<Integer>();
		
		while(hs2.size() != 6) {
			Random rand = new Random();
			int rand_num = rand.nextInt(45) + 1;
			hs2.add(rand_num);
		}
		System.out.println(hs2);
		//인덱스가 없기 때문에 하나만 고를 수 없음
		
		//HashSet을 배열형태로 변환
		//Object[] arr = hs2.toArray();
		//형변환이 필요 => 타입안정성이 떨어짐
		//toArray(T a)
		Integer[] arr = hs2.toArray(new Integer[0]);
		//Integer[0]을 쓰는 이유
		//적절한 크기의 새 배열을 만들어서 반환을 해줌
		
		for(Integer x : arr) {
			System.out.print(x + " ");
		}
		
		
		
		
	}
}
