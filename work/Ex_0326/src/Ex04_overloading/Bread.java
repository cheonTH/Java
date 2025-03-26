package Ex04_overloading;

public class Bread {
	//각기 다른 기능을 하는 makeBread()메서드를 세개 만드는데 메인 클래스에서 각각의 메서드를 호출 했을 때의 결과를 보고 로직으로 구현
	
	//빵을 만들었습니다 <---------------method1을 호출해서 나온 결과
	
	//빵을 만들었습니다 <---------------method2을 호출해서 나온 결과
	//빵을 만들었습니다
	//요청하신 n개의 빵을 만들었습니다
	
	//크림빵을 만들었습니다 <------------method3를 호출해서 나온 결과
	//크림빵을 만들었습니다
	//요청하신 n개의 빵을 만들었습니다.
	
	public void makeBread(){
		System.out.println("빵을 만들었습니다");
		System.out.println("------------------------");
	}
	
	public void makeBread(int n){
		for(int i = 0; i < n; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.println("------------------------");
	}
	
	public void makeBread(String bread, int n){
		for(int i = 0; i < n; i++) {
			System.out.println(bread + "빵을 만들었습니다");
		}
		System.out.println("요청하신 " + n + "개의 빵을 만들었습니다.");
		System.out.println("------------------------");
	}
}
