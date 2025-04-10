package Ex05_enum;

public enum Weekday {
	//main메서드에서 오늘요일이 sunday면 쉬는날입니다 출력 그 외에는 출근하는 날입니다.
	
	MONDAY("출근하는 날입니다."),
	TUESDAY("출근하는 날입니다."),
	WEDNESDAY("출근하는 날입니다."),
	THURSDAY("출근하는 날입니다."),
	FRIDAY("출근하는 날입니다."),
	SATURDAY("출근하는 날입니다."),
	SUNDAY("쉬는 날입니다");
	
	String visit;

	private Weekday(String visit) {
		this.visit = visit;
	}
	
	
}
