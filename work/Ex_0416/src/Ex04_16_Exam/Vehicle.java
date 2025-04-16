package Ex04_16_Exam;

abstract class Vehicle {
	private String name;

    public abstract String getName(String val);

    public String getName() {
        return "Vehicle name: " + name;
    }

    public void setName(String val) {
        name = val;
    }
}
