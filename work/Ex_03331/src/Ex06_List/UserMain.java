package Ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		
		Scanner scanf = new Scanner(System.in);
		
		while(true) {
			UserInfo user1 = new UserInfo();
			
			System.out.print("아이디 생성 : ");
			user1.setId(scanf.next());
			System.out.println("비밀번호 입력: ");
			user1.setPw(scanf.next());
			
			list.add(user1);
			
			//중복체크
			
			for(UserInfo x : list) {
				System.out.println();
			}
		}
	}
}
