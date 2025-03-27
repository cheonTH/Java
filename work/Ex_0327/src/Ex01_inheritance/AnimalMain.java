package Ex01_inheritance;

public class AnimalMain {
	public static void main(String[] args) {
		Cat c = new Cat();
		
		System.out.println("고양이의 눈 개수 : " + c.eye);
		System.out.println("고양이의 다리 개수 : " + c.leg);
		System.out.println("고양이의 특징 : " + c.cute);
	}
}
