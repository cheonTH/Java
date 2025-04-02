package Ex01_Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exam2 {
	public static void main(String[] args) {
		List<String> scores = Arrays.asList(
			    "Alice:Math:85", "Alice:English:78",
			    "Bob:Math:90", "Bob:English:92", "Bob:Science:88",
			    "Charlie:Math:70", "Charlie:English:60"
			);
//		Map<String, Integer> bestStudentMap = new HashMap<>();
//		Student student;
//		
//		String name = null;
//		for(String value : scores) {
//			String[] str = value.split(":");
//			student = new Student();
//			
//			student.setName(str[0]);
//			
//			name = student.getName();
//			int score = Integer.parseInt(str[2]);
//			
//			student.addScore(score);
//			
//			int count = student.subjectCount;
//			
//			count = bestStudentMap.getOrDefault(name, 0)+1;
//				
////			bestStudentMap.put(value, );
//			
//			System.out.println(count);
//		}
		
		Map<String, Student> studentMap = new HashMap<>();
		for(String value : scores) {
			String[] part = value.split(":");
			String name = part[0];
			int score = Integer.parseInt(part[2]);
			
			//값이 없을 때만 넣음(이미 키가 있으면 무시)
			studentMap.putIfAbsent(name, new Student(name));
			//name을 통해서 얻어온 Student객체를 통해 addScore메서드를 호출하고 점수를 전달
			studentMap.get(name).addScore(score);
		}
		
		Student topStudent = null;
		double highAvg = 0;
		
		for (Student student : studentMap.values()) {
			double avg = student.getAverage();
			if(avg > highAvg) {
				highAvg = avg;
				topStudent = student;
			}
		}
		
		if(topStudent != null) {
			System.out.println(topStudent.getName() + " => " + highAvg);
		}
	}
}
