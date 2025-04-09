package Ex03_FileReader;

import java.io.FileReader;

public class Exam1 {
	public static void main(String[] args) {
		//text.txt파일을 만들고 한글 영어(대,소문자) 섞어서 작성
		//text.txt파일의 내용을 읽어와
		//영어 대문자의 개수, 소문자의 개수를 판별하여 출력
		//대문자 x개 , 소문자 x개
		
		FileReader fr = null;
		int s_count = 0;
		int b_count = 0;
		
		try {
			fr = new FileReader("D:\\fullstack\\Java\\text.txt");
			int code = 0;
			System.out.print("text.txt 내용: ");
			while((code = fr.read()) != -1) {
				if((char)code >= 65 && (char)code <= 90) {
					b_count++;
				}else if(code >= 97 && code <= 122) {
					s_count++;
				}
				System.out.print((char)code);
			}
			System.out.println();
			System.out.println("대문자 : " + b_count + "개, 소문자 : " + s_count + "개");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
