package Ex02_File;

import java.io.File;

public class Ex4_File {
	public static void main(String[] args) {
		String path = "D:\\fullstack\\Java\\test.txt";
		File f = new File(path);
		
		if(f.exists()) {
			System.out.println("파일 이름 : " + f.getName());
			System.out.println("절대 경로 : " + f.getAbsolutePath());
		}
	}
}
