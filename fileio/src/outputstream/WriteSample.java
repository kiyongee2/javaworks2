package outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteSample {

	public static void main(String[] args) throws IOException {
		
		//�����Ͱ� test1.db�� ����Ʈ ��� ���� ��� ��Ʈ�� ����
		OutputStream os = new FileOutputStream("C:/File/test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a); //���� ����
		os.write(b); 
		os.write(c);
		
		os.flush();  //��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ���
		os.close();
	}
}
