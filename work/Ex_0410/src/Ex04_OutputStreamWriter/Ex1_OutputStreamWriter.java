package Ex04_OutputStreamWriter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Ex1_OutputStreamWriter {
	public static void main(String[] args) {
		//바이트 기반의 스트림은 문자열을 바이트 배열로 변환한 후에 작성을 했어야 했음
		//OutputStreamWriter의 경우 문자열을 바이트로 쉽게 변경을 해주는 보주 스트림임
		FileOutputStream out =  null;
		OutputStreamWriter os = null;
		
		try {
			out = new FileOutputStream("test.txt");
			os = new OutputStreamWriter(out);
			
			System.out.println("파일 생성 시작");
			String[] strArray = {
					"OutPutStreamWriter에 대해서 배웁니다.",
					"We are learning about OutputStreamWriter"
			};
			
			for(String str : strArray) {
				os.write(str + "\n");
			}
			
			System.out.println("파일 생성 완료");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(os != null) {
					os.close();
				}
				if(out != null) {
					out.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
