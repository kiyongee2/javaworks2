package inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws IOException {
		
		//�����Ͱ� test1.db�� ����Ʈ ��� ���� �Է� ��Ʈ�� ����
		InputStream is = new FileInputStream("C:/file/test1.db");
		
		int data;
		while((data = is.read()) != -1) { //1byte �� �о� ���� ���� �����ϸ�
			System.out.println(data);
		}
		is.close();
	}
}
