package Ex02_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex2_CopyTest {
	public static void main(String[] args) {
		//read()와 write를 이용하여 복사
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("D:\\fullstack\\Java\\pic.jpg");
			fos = new FileOutputStream("D:\\fullstack\\Java\\pic_copy.jpg");
			
			//현재 시간은 m/s단위로 나타냄
			long start  = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			int read = 0;
			//read를 통해 읽음
			while((read = fis.read()) != -1){
				//읽어온 내용을 write로 씀
				fos.write(read);
			}
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			//종료시간 - 시작시간 = 총 소요시간
			long time = (end - start)/1000;
			System.out.println(time + "초");
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(fos != null) {
					fos.close();
				}
				if(fis != null) {
					fis.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
