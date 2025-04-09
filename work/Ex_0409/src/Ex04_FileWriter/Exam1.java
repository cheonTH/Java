package Ex04_FileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		//메모장 프로그램 만들기
	//사용자가 키보드로 입력한 내용을 memo.txt에 저장한 후 
	//입력이 종료되면 해당 파일의 내용을 다시 읽어서 화면에 출력
	//사용자로부터 여러 줄의 텍스트를 입력받음
	Scanner scanf = new Scanner(System.in);
	FileWriter fw =  null;
	FileReader fr = null;
	boolean check = true;
	String str;
	while(check) {
		try {
			fw = new FileWriter("D:\\fullstack\\Java\\memo.txt",true);
			System.out.println("메모 입력 (exit입력시 종료) : ");
			str = scanf.next();
			
			if(str.equalsIgnoreCase("exit")) {
				System.out.println("프로그램을 종료합니다");
				try {
					fr = new FileReader("D:\\fullstack\\Java\\memo.txt");
					System.out.println("메모 내용");
					int code = 0;
					while((code = fr.read()) != -1) {
					System.out.print((char)code);
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;
			}else {
				String memo = str + "\n";
				fw.write(memo);
				
				fw.close();
			}
		} catch (Exception e) {
		// TODO: handle exception
		}
	}
	
	
			
	}
	
}
