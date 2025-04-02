package Ex01_Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exam1 {
	public static void main(String[] args) {
		//가장 많이 주문된 상품 구하기
				// 각 사용자는 여러 상품을 주문할 수 있으며.
				//주문 내역은 ArrayList에 문자열 형태로 저장
				//사용자 이름:상품이름 형태로 저장
				//가장 많이 주문된 상품 이름과 주문 수량을 출력
				List<String> order = Arrays.asList(
						"Alice:TV", "Bob:TV", "Alice:Phone", 
						"Charlie:TV", "David:Tablet", "Eve:Phone", 
						"Frank:Phone", "Alice:Phone"
						);
				int count = 0;
				Map<String, Integer> orderMap = new HashMap<>();
				
				for(String value : order) {
					String[] part = value.split(":");
					String product = part[1];
					
					orderMap.put(product, orderMap.getOrDefault(product, 0)+1);
				}
				//가장 많이 주문된 상품
				String maxProduct = null;
				int maxCount = 0;
				
				for(Map.Entry<String, Integer> entry : orderMap.entrySet()) {
					if(entry.getValue() > maxCount) {
						maxProduct = entry.getKey();
						maxCount = entry.getValue();
					}
				}
				System.out.println(maxProduct + " => " +maxCount);
				
				
	}
}
