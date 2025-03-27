package Exam2;

public class Calc extends Calculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double averge(int[] a) {
		// TODO Auto-generated method stub
		int sum = 0;
		double result;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return (sum / a.length);
	}
	
}
