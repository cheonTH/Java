package Ex05_enum;

//추상메서드를 가진다고 해서 추상클래스가 되는 것은 아님
//enum자체는 추상메서드를 정의할수가 있고, 상수들이 드 메서드를 구현을 해야함
public enum Transportation {
	BUS(100) {
		@Override
		int totalFare(int distance) {
			return distance * fare;
		}
	},TRAIN(150) {
		@Override
		int totalFare(int distance) {
			return distance * fare;
		}
	},SHIP(200) {
		@Override
		int totalFare(int distance) {
			return distance * fare;
		}
	},AIRPLANE(250) {
		@Override
		int totalFare(int distance) {
			return distance * fare;
		}
	};
	
	int fare;

	private Transportation(int fare) {
		this.fare = fare;
	}
	
	//추상메서드를 정의하면
	//직접 구현을 해야한다며 오류
	abstract int totalFare(int distance);
}
