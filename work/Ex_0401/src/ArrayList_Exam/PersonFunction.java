package ArrayList_Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonFunction extends Person{
	
	
	public void personFunc() {
		ArrayList<Person> personList = new ArrayList<Person>();
		
		Scanner scanf = new Scanner(System.in);
		boolean running = true;
		Person p;
		
		while(running) {
			System.out.println("1. 정보추가");
			System.out.println("2. 정보삭제");
			System.out.println("3. 전체정보");
			System.out.println("4. 종   료");
			System.out.print("항목 선택 ->   ");
			int num = scanf.nextInt();
			
			switch(num) {
				case 1:
					p = new Person();
					System.out.println("정보를 추가해주세요");
					System.out.print("이름: ");
					p.setName(scanf.next());
					System.out.print("나이: ");
					p.setAge(scanf.nextInt());
					System.out.print("전화번호: ");
					p.setTel(scanf.next());
					
					
					
					personList.add(p);
					
					for(int i = 0; i < personList.size(); i++) {
						System.out.println("이름: " + personList.get(i).getName());
						System.out.println("나이: " + personList.get(i).getAge());
						System.out.println("전화번호: " + personList.get(i).getTel());
					}
					break;
				case 2:
					int i = 1;
					System.out.println("--- 정보 삭제 ---");
					System.out.println("=== 정보 ===");
					for(Person pe : personList) {
						System.out.println("--------------------");
						System.out.println((i++) + "번 정보");
						System.out.println("이름: " + pe.getName());
						System.out.println("나이: " + pe.getAge());
						System.out.println("전화번호: " + pe.getTel());
						System.out.println("--------------------");
					}
					System.out.print("삭제할 정보를 선택해주세요: ");
					num = scanf.nextInt();
					
					if(num <= 0 || num > personList.size()) {
						System.out.println("삭제할 정보를 다시 입력해주세요");
					}else {
						System.out.println(personList.get(num-1).getName() + "님의 정보가 삭제되었습니다");
						personList.remove(num-1);
					}
					
					//for(int i = 0; i < personList.size(); i++){
					//	if((personList.get(i).getName()).equals(name)){
					//		personList.remove(i);
					//		sysout(name + "의 정보를 삭제했습니다");
					//		break;
					//	}else{
							//for문을 돌다가 마지막에 들어올 수 있게 하는 조건
					//		if(i + 1 == personList.size()){
					//			sysout(name + "이 존재하지 않습니다");
					//		}
					//	}
					//}
					break;
				case 3:
					System.out.println("--- 전체 정보 ---");
					System.out.println("등록 인원 : " + personList.size() + "명");
					for(Person per : personList) {
						System.out.println("---------------");
						System.out.println("이름: " + per.getName());
						System.out.println("나이: " + per.getAge());
						System.out.println("전화번호: " + per.getTel());
						System.out.println("---------------");
					}
					break;
				case 4:
					System.out.println("프로그램을 종료합니다.");
					running = false;
					break;
				default:
					System.out.println("잘못된 항목 번호 입니다.");
			}
		}
	}

	
}
