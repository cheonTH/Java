package Ex04_16_Exam;

public class Car extends Vehicle{
	public Car(String val) {
        setName(val);
    }

    @Override
    public String getName(String val) {
        return "Car name: " + val;
    }

    public String getName(byte val[]) {
        return "Car name: " + val;
    }
}
