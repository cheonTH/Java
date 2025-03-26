package Ex04_exam;

public class Graph {

	void printGraph(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
            int count = 1; 
            boolean check = false;

            // 이미 출력한 숫자라면 넘어감
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    check = true;
                    break;
                }
            }

            if (!check) {
                // 중복된 개수 세기
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                // 해당 숫자에 대해 중복된 개수만큼 별을 찍음
                System.out.print(arr[i] + ": ");
                for (int k = 0; k < count; k++) {
                    System.out.print("*");
                }
                System.out.println(); // 줄 바꿈
            }
        }
    }
	
	public String print(char ch, int num) {
		String str = "";
		for(int i = 0; i < num; i++) {
			str += ch;
		}
		return str;
	}
}
