package Ex03_FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exam1 {
	public static void main(String[] args) {
		//file.txt를 만들고 문장을 입력하고 저장
		//FileInputStream으로 읽어온 뒤, 회문인지 아닌지 검증
		
		String path = "D:\\fullstack\\Java\\file.txt";
		File f = new File(path);
		FileInputStream fis = null;
		byte[] b_byte = new byte[(int)f.length()];
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				fis.read(b_byte);
				
				String res = new String(b_byte);
				String res_2 = new StringBuilder(res).reverse().toString();
				
				System.out.println(res);
				
				if(res.equals(res_2)) {
					System.out.println("이 파일의 문장은 회문입니다.");
				}else {
					System.out.println("이 파일의 문장은 회문이 아닙니다.");
				}
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				try {
					if(fis != null) {
					fis.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}
}
