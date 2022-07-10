package inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws IOException {
		
		//데이터가 test3.db인 바이트 기반 파일 입력 스트림 생성
		InputStream is = new FileInputStream("C:/file/test3.db");
		
		byte[] buffer = new byte[5];
		
		int data;
		while((data = is.read(buffer, 2, 3)) != -1) { 
			//3byte를 읽고 buffer[2], buffer[3], buffer[4]에 저장
			for(int i = 0; i < buffer.length; i++) {  //배열의 전체를 반복
				System.out.println(buffer[i]);
			}
		}
		is.close();
	}
}
