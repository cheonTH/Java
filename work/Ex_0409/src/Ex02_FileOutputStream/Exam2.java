package Ex02_FileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//학생의 이름과 점수를 입력받아 scores.txt저장
//이어쓰기
//마지막에는 파일 내용을 읽어 콘솔에 출력
public class Exam2 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		FileOutputStream fos = null;
		boolean check = true;
		
		
		while(check) {
			System.out.print("이름 : ");
			String name = scanf.next();
			FileInputStream fis = null;
			if(name.equalsIgnoreCase("exit")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				try {
					System.out.print("점수 : ");
					int score = scanf.nextInt();
					fos = new FileOutputStream("D:\\fullstack\\Java\\scores.txt",true);
					
					String msg = name + " : " + score + "\n";
					char[] char_msg = msg.toCharArray();
					
					for(int i = 0; i < char_msg.length; i++) {
						char_msg[i] += 3;
					}
					
					String new_msg = new String(char_msg);
					fos.write(new_msg.getBytes());
					System.out.println("파일이 저장되었습니다");
					
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
				finally {
					try {
						if(fis !=null) {
						fis.close();
							}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						}
				
					
				}
			}
			
				//파일 내용 읽어오기
				try {
					File f = new File("D:\\fullstack\\Java\\scores.txt");
					fis = new FileInputStream(f);
					;
					byte[] buffer = new byte[(int)f.length()];
					
					fis.read(buffer);
					String content = new String(buffer,"UTF-8");
					System.out.println(content);
				} catch (Exception e) {
					// TODO: handle exception
				}
		}
		
		
		}
	}
}
