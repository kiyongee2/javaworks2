package outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteSample3 {

	public static void main(String[] args) throws IOException {
		
		//�����Ͱ� test3.db�� ����Ʈ ��� ���� ��� ��Ʈ�� ����
		OutputStream os = new FileOutputStream("C:/File/test3.db");
		
		byte[] array = new byte[] {10, 20, 30, 40, 50};
		
		os.write(array, 1, 3);
		
		os.flush();
		os.close();
	}
}
