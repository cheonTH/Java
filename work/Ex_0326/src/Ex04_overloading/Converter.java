package Ex04_overloading;

public class Converter {
	//cm -> m로 변환하는 convert
	//m, inch -> cm로 변환하는 convert
	//inch -> cm => inch * 2.54
	public double convert(double cm) {
		double m = (double)(cm /100);
		return m;
	}
	
	public double convert(double num, String type) {
		double cm = 0.0;
		if(type.equals("m")) {
			cm = num * 100.0;	
		}else if(type.equals("inch")) {
			cm = num * 2.54;
		}
		return cm;
	}
}
