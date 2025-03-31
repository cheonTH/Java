package Ex04_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		//products라는 이름의 arrayList를 만들고
		ArrayList<String> products = new ArrayList<String>();
		viewProduct()		
	}
	
	//viewProduct
	
	//키보드로 값ㅇ르 입력받아 상품을 추가(조회)
	//상품이 중복되면 제거
	//최근조회한 상품 목록이 가장 앞에 나오도록 함
	public static void ViewProduct(List<String> list, String product) {
		Scanner scanf = new Scanner(System.in);
		list.remove(product);
		
		list.add(0, product);
		System.out.println("상품 클릭: " + product + " -> " + list);
	}
}	
//out:while(true) {
//			System.out.print("상품 : ");
//			String input = scanf.next();
//			
//			if(input.equals("exit")) {
//				break;
//			}
//			
//			for(String x : list) {
//				if(list.contains(product)) {
//					System.out.println("중복된 아이디");
//					list.remove(product);
//					continue out;
//				}
//			}
//			list.add(0, product);
//			for(String product_name : list) {
//				System.out.print(product_name + " ");
//			}
//			System.out.println();
//			
//			
//		}