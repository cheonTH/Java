package Ex03_FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex2_FileInputStream {
	public static void main(String[] args) {
		//경로를 저장
		String path = "D:\\fullstack\\Java\\test.txt";
		
		//File 객체에 경로 알려주기
		File f = new File(path);
		
		//length()를 통해 내용 크기만큼만 만듬
		byte[] b_read = new byte[(int)f.length()];
		
		FileInputStream fis = null;
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				//파일에서 읽어온 내용을 바이트 배열에 담음
				//read(): 1바이트씩 읽어옴
				//read(byte[] b): 한번에 읽어와서 배열에 담음
				fis.read(b_read);
				
				//문자열 객체의 생성자에 바이트배열을 전달함을써 문자열로 변환이 가능
				String res = new String(b_read, "UTF-8");
				
				System.out.println(res);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
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
