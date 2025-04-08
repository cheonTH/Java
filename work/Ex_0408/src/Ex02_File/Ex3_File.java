package Ex02_File;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
		String path = "D:\\fullstack\\Java\\aaa\\bbb";
		File f = new File(path);
		
		//exists(): 목적지까지의 경로가 존재하면 true
		if(!f.exists()) {
			System.out.println("폴더 생성");
			//mkdirs(): 복수의 폴더를 생성해줌
			f.mkdirs();
		}
		
		//File클래스의 역할
		//폴더를 만들어준다거나 목적지까지의 검증(파일, 폴더, 존재 등)
		//폴더일 때 목록의 반환
		//목적지의 크기도 반환(파일 폴더 상관없음)
		
		//내용을 읽거나 쓰는 기능은 없음
		
	}
}
