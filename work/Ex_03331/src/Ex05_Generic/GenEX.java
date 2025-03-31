package Ex05_Generic;

public class GenEX<T> {
	T value;
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
}
