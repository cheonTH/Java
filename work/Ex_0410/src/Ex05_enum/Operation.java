package Ex05_enum;

public enum Operation {
	PLUS {
		@Override
		int apply(int x, int y) {
			int result = x + y;
			return result;
		}
	},
	MINUS {
		@Override
		int apply(int x, int y) {
			int result = x - y;
			return result;
		}
	},
	MULTI {
		@Override
		int apply(int x, int y) {
			int result = x * y;
			return result;
		}
	},
	DIV {
		@Override
		int apply(int x, int y) {
			int result = x / y;
			return result;
		}
	};
	
	abstract int apply(int x, int y);
}
