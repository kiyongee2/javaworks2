package outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteSample2 {

	public static void main(String[] args) throws IOException {
		
		//데이터가 test2.db인 바이트 기반 파일 출력 스트림 생성
		OutputStream os = new FileOutputStream("C:/File/test2.db");
		
		byte[] array = new byte[] {10, 20, 30};
		
		os.write(array);
		
		os.flush();
		os.close();
	}
}
