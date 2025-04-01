package Ex01_Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Bingo {
	public static void main(String[] args) {
		//Hashset을 이용한 5 * 5 랜덤 빙고판 만들기
		
		HashSet<Integer> hs = new HashSet<Integer>();
		int[][] board = new int[5][5];
		
		while(hs.size() != 25) {
			hs.add(new Random().nextInt(50) + 1);
		}
		
		//shuffle(List)
		List<Integer> list = new ArrayList<Integer>(hs);
		Collections.shuffle(list);
		//set으로 랜덤값을 넣었기 때문에 중복값은 어차피 들어가 있지 않음
		
		//hs는 index가 없기 때문에 하나씩 꺼낼 수 없음
		//그렇게 때문에 interator를 통해서 꺼냄
		Iterator<Integer> iter = list.iterator();
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = iter.next();
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
