package Ex03_FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1_FileInputStream {
	public static void main(String[] args) {
		String path = "D:\\fullstack\\Java\\test.txt";
		File f = new File(path);
		FileInputStream fis = null;
		if(f.exists()) {
			//exists()로 경로를 탐색을 미리 했지만 읽어올 때 경로가 없어질수도 있기 때문에 예외처리를 해야함
			try {
				fis = new FileInputStream(f);
				
				int code = 0;
				
				while((code = fis.read()) != -1) {
					System.out.print((char)code);
					
				}
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				//예외가 발생하던 발생하지 않던 InputStream의 사용이 끝나게 되면 close를 통해 닫아주는 것이 좋음
				try {
					if(fis != null) {
						fis.close();
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		
	}
}
