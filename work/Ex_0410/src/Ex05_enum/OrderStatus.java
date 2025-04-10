package Ex05_enum;

//ORDER
public enum OrderStatus {
	ORDERED {
		@Override
		OrderStatus next() {
			// TODO Auto-generated method stub
			return SHIPPED;
		}
	},
	SHIPPED {
		@Override
		OrderStatus next() {
			// TODO Auto-generated method stub
			return DELIVERD;
		}
	},
	DELIVERD {
		@Override
		OrderStatus next() throws Exception {
			throw new Exception("더 이상 상태를 전환할 수 없습니다");
		}
	};
	
	abstract OrderStatus next() throws Exception;
	
}
