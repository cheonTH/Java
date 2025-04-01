package Ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		
		Scanner scanf = new Scanner(System.in);
		
		out:while(true) {
			UserInfo user1 = new UserInfo();
			
			System.out.println("프로그램 종료를 원하시면 exit를 입력해주세요.");
			System.out.print("아이디 : ");
			String id = scanf.next();
			
			
			if(id.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			user1.setId(id);
			System.out.println("비밀번호 입력: ");
			user1.setPw(scanf.next());
			
			//중복체크
			for(UserInfo x : list) {
				if (x.getId().equals(user1.getId())) {  // 아이디를 비교합니다.
                    System.out.println("중복된 아이디");
                    continue out;  // 중복된 아이디가 있으면 새 사용자 추가를 건너뜁니다.
                }
			}
			
			list.add(user1);
			
			for(UserInfo y : list) {
				System.out.println(y.getId());
				System.out.println(y.getPw());
				System.out.println("----------------");
			}
			
		}
	}
}
