package Ex05_enum;

public class OrderStatusMain {
	public static void main(String[] args) {
		OrderStatus status = OrderStatus.ORDERED;
		
		try {
			System.out.println("현재상태 : " + status);
			status = status.next();
			System.out.println("현재상태 : " + status);
			status = status.next();
			System.out.println("현재상태 : " + status);
			status = status.next();
			
		} catch (Exception e) {
			System.out.println("예외 발생: " + e.getMessage());
		}
	}
}
