package Ex02_FileOutputStream;

import java.io.FileOutputStream;
import java.util.Scanner;

//학생의 이름과 점수를 저장하는 프로그램
//이름과 점수를 fileOutputStream을 이용하여 scores.txt파일에 저장

//요구사항
//1. 사용자로 부터 이름과 점수를 입력 받음(scanner)
//2. 입력받은 데이터를 "이름 : 점수 : \n"형식으로 문자열로 만들어 파일에 씀 ex) 김철수 : 84
//3. 이름에 exit를 입력하면 프로그램 종료
//4. 파일은 scores.txt로 저장되며 기존 내용은 덮어씀
//이름 : 점수의 문자열의 각 문자의 char값을 +3을 해 암호화

public class Exam1 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		FileOutputStream fos = null;
		boolean check = false;
		
		while(!check) {
			System.out.print("이름을 입력해주세요(종료를 원하시면 exit입력) : ");
			String name = scanf.next();
			//대문자 무시하고 값을 검증
			if(name.equalsIgnoreCase("exit")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				System.out.print("점수를 입력해주세요 : ");
				int score = scanf.nextInt();
			
				String msg = name + " : " + score + "\n";
				char[] char_msg = msg.toCharArray();
				
				for(int i = 0; i < char_msg.length; i++) {
					char_msg[i] += 3;
				}
				
				String new_msg = new String(char_msg);
				
				try {
					fos = new FileOutputStream("D:\\fullstack\\Java\\scores.txt");
					fos.write(new_msg.getBytes());
					System.out.println("학생 정보가 저장되었습니다.");
				} catch (Exception e) {
					// TODO: handle exception
				}finally {
					try {
						if(fos != null) {
							fos.close();
						}
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
		
			}
		}
	
		
	}
}
