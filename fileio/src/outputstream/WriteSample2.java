package outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteSample2 {

	public static void main(String[] args) throws IOException {
		
		//�����Ͱ� test2.db�� ����Ʈ ��� ���� ��� ��Ʈ�� ����
		OutputStream os = new FileOutputStream("C:/File/test2.db");
		
		byte[] array = new byte[] {10, 20, 30};
		
		os.write(array);
		
		os.flush();
		os.close();
	}
}
