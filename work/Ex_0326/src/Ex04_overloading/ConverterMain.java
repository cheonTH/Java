package Ex04_overloading;

public class ConverterMain {
	public static void main(String[] args) {
		Converter c = new Converter();
		
		System.out.println(c.convert(5));
		System.out.println(c.convert(10, "m"));
	}
}
