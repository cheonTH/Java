package Ex02_Stream;

public class Student implements Comparable<Student>{
	String name;
	int ban;
	int totalScore;
	
	public Student(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	@Override
	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, totalScore).toString();
	}
	
	public int getBan() {
		return ban;
	}
	
	public String getName() {
		return name;
	}
	
	public int getTotalScore() {
		return totalScore;
	}
	
	//compareTo()
	//객체를 서로 비교할 때 사용하는 메서드
	//주로 정렬이나 비교연산에 사용됨
	
	//int result = a.compareTo(b);
	
	//반환값이 0이면 두 객체가 같음
	//반환값이 0보다 작으면 a가 b보다 작음
	//반환값이 0보다 크면 a가 b보다 큼
	
	@Override
	public int compareTo(Student s) { //성적이 높은순으로 정렬
		//매개변수로 전달한 객체의 총점 - 메서드로 호출한 객체의 총점
		return s.totalScore - this.totalScore;
	}
	
	
	
}
