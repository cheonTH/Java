package ex01_innerClass;

interface buttonClickListner{
	public void click();
}

public class AnonymousExample {
	//buttonClickListener타입의 변수를 가짐
	//인터페이스의 구현체는 다 들어올 수 있음
	public class Button{
		private buttonClickListner listener;
		
		//멤버변수는 private로 지정하는 일이 많기 때문에 직접 접근하는 것이 불가능
		//public으로 된 메서드를 통해서 접근하는 일이 많음
		//setter & getter
		public void setListener(buttonClickListner listener) {
			this.listener = listener;
		}
		
		public void click() {
			if(listener != null) {
				this.listener.click();
			}
		}
	}
	
	public static void main(String[] args) {
		AnonymousExample exam = new AnonymousExample();
		AnonymousExample.Button button = exam.new Button();
		button.setListener(new buttonClickListner() {
			@Override
			public void click() {
				System.out.println("버튼 클릭됨");
			}
		});
		
		button.click();
	}
	
	
	
	
	
	
}






