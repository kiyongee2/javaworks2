package inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws IOException {
		//데이터가 test1.db인 바이트 기반 파일 입력 스트림 생성
		InputStream is = new FileInputStream("C:/file/test1.db");
		
		/*int data;
		while((data = is.read()) != -1) { //1byte 씩 읽어 파일 끝에 도달하면
			System.out.println(data);
		}*/
		
		//while ~ break문
		while(true) {
			int data = is.read();
			if(data == -1) break;
			System.out.println(data);
		}
		
		is.close();
	}
}
