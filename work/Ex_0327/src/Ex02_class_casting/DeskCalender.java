package Ex02_class_casting;

public class DeskCalender extends Calender{
	
	
	
	public DeskCalender(String color, int months) {
		super(color, months);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void info() {
		System.out.println(color + " 달력은 벽에 걸기위해 고리를 달아야합니다");
	}

	public void onTheDesk() {
		System.out.println(color+ "달력을 책상에 세울 수 있습니다");
	}
}
