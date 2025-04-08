package Ex02_File;

import java.io.File;

public class Ex5_File {
	public static void main(String[] args) {
		String path = "D:\\fullstack\\Java\\aaa";
		File f = new File(path);
		
		if(f.exists()) {
			if(f.isDirectory()) {
				//delete(): 파일과 폴더를 삭제할 수 있음
				//폴더는 비어있어야 삭제할 수 있음
				if(f.delete()) {
					System.out.println("디렉토리가 삭제되었습니다.");
				}else {
					System.out.println("디렉토리 삭제 실패(디렉토리가 비어있는지 확인)");
				}
			}else {
				System.out.println("이 경로는 디렉토리가 아닙니다");
			}
		}else {
			System.out.println("삭제할 디렉토리가 존재하지 않습니다");
		}
		
		//폴더는 생성이 되지만 파일을 만들거나 파일을 읽는것은 불가능함
	}
}
