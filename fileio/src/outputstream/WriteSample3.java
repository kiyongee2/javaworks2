package outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteSample3 {

	public static void main(String[] args) throws IOException {
		
		//데이터가 test3.db인 바이트 기반 파일 출력 스트림 생성
		OutputStream os = new FileOutputStream("C:/File/test3.db");
		
		byte[] array = new byte[] {10, 20, 30, 40, 50};
		
		os.write(array, 1, 3);
		
		os.flush();
		os.close();
	}
}
