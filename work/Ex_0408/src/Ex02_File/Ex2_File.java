package Ex02_File;

import java.io.File;
import java.util.Arrays;

public class Ex2_File {
	public static void main(String[] args) {
		String path = "D:\\fullstack\\Java";
		
		File f = new File(path);
		
		//isDirectory() : 경로가 폴더인지 판별
		if(f.isDirectory()) {
			//list() : 디렉토리 안에 있는 하위 요소들의 이름을 반환함
			String[] names = f.list();
			System.out.println(Arrays.toString(names));
		}
	}
}
