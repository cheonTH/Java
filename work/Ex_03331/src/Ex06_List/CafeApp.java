package Ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeApp {
	public static void main(String[] args) {
		ArrayList<MenuItem> menuList = new ArrayList<MenuItem>();
		ArrayList<MenuItem> orderList = new ArrayList<MenuItem>();
		
		MenuItem menu1 = new MenuItem();
		menu1.menu_name = "아메리카노";
		menu1.price = 3000;
		
		MenuItem menu2 = new MenuItem();
		menu2.menu_name = "라떼";
		menu2.price = 3500;
		
		MenuItem menu3 = new MenuItem();
		menu3.menu_name = "카푸치노";
		menu3.price = 4000;
		
		menuList.add(menu1);
		menuList.add(menu2);
		menuList.add(menu3);
		
		Scanner scanf = new Scanner(System.in);
		
		boolean running = true;
		
		int num;
		do {
			System.out.println("=== 카페 주문 시스템 ===");
			System.out.println("1. 메뉴 보기");
			System.out.println("2. 주문 추가");
			System.out.println("3. 결제 하기");
			System.out.println("4. 종료 하기");
			System.out.println("5. 취소 하기");

			System.out.print("번호 입력:		");
			num = scanf.nextInt();
			
			if(num == 1) {
				for(int i = 0; i < menuList.size(); i++) {
					System.out.print((i+1) + ". " + menuList.get(i).menu_name);
					System.out.print("   가격: " + menuList.get(i).price + "원");
					System.out.println();
				}
			}
			
			if(num == 2) {
				int menu_num;
				
				do {
					System.out.println("주문할 메뉴의 번호를 입력해주세요(0번은 선택 종료)");
					System.out.print("번호 입력:		");
					menu_num = scanf.nextInt();
					
					if(menu_num == 1) {
						System.out.println("아메리카노를 추가했습니다");
						orderList.add(menu1);
						System.out.println("주문 내역");
						for(int i = 0; i < orderList.size(); i++) {
							System.out.print((i+1) + ". " + orderList.get(i).menu_name);
							System.out.print("   가격: " + orderList.get(i).price + "원");
							System.out.println();
						}
					}else if(menu_num == 2) {
						System.out.println("라떼를 추가했습니다");
						orderList.add(menu2);
						System.out.println("주문 내역");
						for(int i = 0; i < orderList.size(); i++) {
							System.out.print((i+1) + ". " + orderList.get(i).menu_name);
							System.out.print("   가격: " + orderList.get(i).price + "원");
							System.out.println();
						}
					}else if(menu_num == 3) {
						System.out.println("카푸치노를 추가했습니다");
						orderList.add(menu3);
						System.out.println("주문 내역");
						for(int i = 0; i < orderList.size(); i++) {
							System.out.print((i+1) + ". " + orderList.get(i).menu_name);
							System.out.print("   가격: " + orderList.get(i).price + "원");
							System.out.println();
						}
					}else if(menu_num == 0) {
						System.out.println("선택을 종료합니다");
						break;
					}else{
						System.out.println("잘못된 번호를 입력했습니다.");
					}
				}while(menu_num != 4);
			}
			
			if(num == 3) {
				int price_sum = 0;
				if(orderList.size() < 1) {
					System.out.println("결제할 주문이 없습니다.");
				}else {
					System.out.println("결제 내역");
					for(int i = 0; i < orderList.size(); i++) {
						System.out.println((i+1) + ". " + orderList.get(i).menu_name);
						
						price_sum += orderList.get(i).price; 
					}
					System.out.println("총 결제 금액 : " + price_sum);
					System.out.println("결제가 완료되었습니다.");
				}
			}
			
			if(num == 4) {
				if(orderList.size()>0) {
					System.out.println("메뉴가 주문내역에 있습니다 정말 종료하겠습니까?    y/n");
					String yOrN = scanf.next();
					if(yOrN.equals("y") ) {
						System.out.println("프로그램을 종료합니다.");
						running = false;
					}else {
						System.out.println("초기화면으로 돌아갑니다.");
					}
				}else {
					System.out.println("프로그램을 종료합니다.");
					running = false;
				}
			}
			
			if(num == 5) {
				if(orderList.size() < 1) {
					System.out.println("취소할 주문이 없습니다.");
				}else {
					for(int i = 0; i < orderList.size(); i++) {
						System.out.print((i+1) + ". " + orderList.get(i).menu_name);
						System.out.print("   가격: " + orderList.get(i).price + "원");
						System.out.println();
					}
					System.out.print("취소할 메뉴를 선택해주세요:	");
					String cancel = scanf.next();
					
					if(cancel.equals("아메리카노")) {
						System.out.println("아메리카노가 취소되었습니다.");
						orderList.remove(menu1);
					}else if(cancel.equals("라떼")) {
						System.out.println("라떼가 취소되었습니다.");
						orderList.remove(menu2);
					}else if(cancel.equals("카푸치노")) {
						System.out.println("카푸치노가 취소되었습니다.");
						orderList.remove(menu3);
					}else {
						System.out.println("취소할 메뉴가 잘못입력되었습니다.");
					}
				}
			}
		}while(running);
	}
}
