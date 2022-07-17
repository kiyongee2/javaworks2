package inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadTryWith {

	public static void main(String[] args) throws IOException {
		//try ~ with 구문 사용
		try(InputStream is = new FileInputStream("C:/file/test3.db")){
		
			byte[] buffer = new byte[5];
			
			/*int data;
			while((data = is.read(buffer, 2, 3)) != -1) { 
				//3byte를 읽고 buffer[2], buffer[3], buffer[4]에 저장
				for(int i = 0; i < buffer.length; i++) {  //배열의 전체를 반복
					System.out.println(buffer[i]);
				}
			}*/
			while(true) {
				int data = is.read(buffer, 2, 3);
				if(data == -1) break;
				for(int i = 0; i < buffer.length; i++) {  //배열의 전체를 반복
					System.out.println(buffer[i]);
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
