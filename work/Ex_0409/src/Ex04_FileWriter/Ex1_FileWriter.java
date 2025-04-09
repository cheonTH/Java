package Ex04_FileWriter;

import java.io.FileWriter;

public class Ex1_FileWriter {
	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			//파일을 정해주고 파일이 없으면 생성
			fw = new FileWriter("D:\\fullstack\\Java\\fileWriter예제.txt");
			
			//파일에 내용 작성
			fw.write("첫번째 줄 작성합니다 \n");
			fw.write("두번째 줄 작성합니다 \n");
			fw.write("""
					1
					2
					3
					""");
			
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
