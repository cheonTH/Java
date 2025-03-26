package Ex04_exam;

import java.util.Arrays;
import java.util.Random;

public class GraphMain {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] arr = new int[100];
		int [] count = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int a = rand.nextInt(10);
			arr[i] = a;
		}
		
		for(int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		System.out.println(Arrays.toString(count));
		Graph g = new Graph();
		
		g.printGraph(arr);
		
		for(int i = 0; i < count.length; i++) {
			System.out.printf("%d의 개수 : %s %d \n" , i, g.print('#', count[i]), count[i]);
		}
		System.out.println(Arrays.toString(count));
	}
}
